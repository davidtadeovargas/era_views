/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.dialogs;

import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class DialogsFactory {

    private static DialogsFactory DialogsManager;
    private OKDialog OKDialog;
    private ExceptionDialog ExceptionDialog;
    private YesNoDialog YesNoDialog;
    private ErrorOKDialog ErrorOKDialog;
    private QuestionDialog QuestionDialog;    
    
    
    
    
    public static DialogsFactory getSingleton(){
        if(DialogsManager==null){
            DialogsManager = new DialogsFactory();
        }
        return DialogsManager;
    }
    
    public OKDialog getOKDialog(final JFrame JFrame) throws Exception{
        if(OKDialog==null){
            OKDialog = new OKDialog(JFrame);
        }
        return OKDialog;
    }
    public void showOKDialog(final JFrame JFrame, final String propertyText) throws Exception{
        final OKDialog OKDialog_ = this.getOKDialog(JFrame);
        OKDialog_.setPropertyText(propertyText);
        OKDialog_.show();
    }
    
    public ExceptionDialog getExceptionDialog(final JFrame JFrame,Exception Exception) throws Exception{
        ExceptionDialog = new ExceptionDialog(JFrame,Exception);
        ExceptionDialog.setText(Exception.getMessage());
        return ExceptionDialog;
    }
    
    public YesNoDialog getYesNoDialog(final JFrame JFrame) throws Exception{
        if(YesNoDialog==null){
            YesNoDialog = new YesNoDialog(JFrame);
        }
        return YesNoDialog;
    }
    
    public QuestionDialog getQuestionDialog(final JFrame JFrame) throws Exception {
        if(QuestionDialog==null){
            QuestionDialog = new QuestionDialog(JFrame);
        }
        return QuestionDialog;
    }
    public void showQuestionContinueDialog(final JFrame JFrame, final com.era.views.dialogs.QuestionDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final QuestionDialog QuestionDialog_ = this.getQuestionDialog(JFrame);
        QuestionDialog_.setPropertyText("question_continue");
        QuestionDialog_.setOKDialogInterface(OKDialogInterface);
        QuestionDialog_.show();
    }    
    
    public ErrorOKDialog getErrorOKDialog(final JFrame JFrame) throws Exception {
        if(ErrorOKDialog==null){
            ErrorOKDialog = new ErrorOKDialog(JFrame);
        }
        return ErrorOKDialog;
    }    
    public void showErrorOKDialog(final JFrame JFrame, final String propertyText) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText(propertyText);
        ErrorOKDialog_.show();
    }
    
    public void getErrorDialogByIdTextJFrame(final  String idText, final ErrorDialogJFrame.OnOkButtonActionPerformed OnOkButtonActionPerformed) throws Exception{
        final ErrorDialogJFrame ErrorDialogJFrame = new ErrorDialogJFrame();
        ErrorDialogJFrame.setIdText(idText);
        ErrorDialogJFrame.setOnOkButtonActionPerformed(OnOkButtonActionPerformed);
        ErrorDialogJFrame.setVisible();
    }
    
    public void getErrorDialogByTextJFrame(final  String text, final ErrorDialogJFrame.OnOkButtonActionPerformed OnOkButtonActionPerformed) throws Exception{
        final ErrorDialogJFrame ErrorDialogJFrame = new ErrorDialogJFrame();
        ErrorDialogJFrame.setText(text);
        ErrorDialogJFrame.setOnOkButtonActionPerformed(OnOkButtonActionPerformed);
        ErrorDialogJFrame.setVisible();
    }
}

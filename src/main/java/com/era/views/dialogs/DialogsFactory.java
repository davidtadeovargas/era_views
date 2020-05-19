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
    public ErrorOKDialog getErrorOKDialog(final JFrame JFrame) throws Exception {
        if(ErrorOKDialog==null){
            ErrorOKDialog = new ErrorOKDialog(JFrame);
        }
        return ErrorOKDialog;
    }
    
    public void getErrorDialogJFrame(final  String text, final ErrorDialogJFrame.OnOkButtonActionPerformed OnOkButtonActionPerformed) throws Exception{
        final ErrorDialogJFrame ErrorDialogJFrame = new ErrorDialogJFrame();
        ErrorDialogJFrame.setText(text);
        ErrorDialogJFrame.setOnOkButtonActionPerformed(OnOkButtonActionPerformed);
        ErrorDialogJFrame.setVisible();
    }
}

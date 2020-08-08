/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.dialogs;

import com.era.views.viewscontrollers.ErrorDialogViewController;
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
    public void showOKCallbackDialog(final JFrame JFrame, final String propertyText, final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception{
        final OKDialog OKDialog_ = this.getOKDialog(JFrame);
        OKDialog_.setPropertyText(propertyText);
        OKDialog_.setOKDialogInterface(OKDialogInterface);
        OKDialog_.show();
    }
    public void showOKEmptyFieldCallbackDialog(final JFrame JFrame, final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception{
        final OKDialog OKDialog_ = this.getOKDialog(JFrame);
        OKDialog_.setPropertyText("empty_fields");
        OKDialog_.setOKDialogInterface(OKDialogInterface);
        OKDialog_.show();
    }    
    public void showOKOperationCompletedCallbackDialog(final JFrame JFrame, final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception{
        final OKDialog OKDialog_ = this.getOKDialog(JFrame);
        OKDialog_.setPropertyText("operation_completed");
        OKDialog_.setOKDialogInterface(OKDialogInterface);
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
    public void showQuestionDialogCallback(final JFrame JFrame, final String propertyText, final com.era.views.dialogs.QuestionDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final QuestionDialog QuestionDialog_ = this.getQuestionDialog(JFrame);
        QuestionDialog_.setPropertyText(propertyText);
        QuestionDialog_.setOKDialogInterface(OKDialogInterface);
        QuestionDialog_.show();
    }
    public void showQuestionExitDialog(final JFrame JFrame, final com.era.views.dialogs.QuestionDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final QuestionDialog QuestionDialog_ = this.getQuestionDialog(JFrame);
        QuestionDialog_.setPropertyText("question_exit");
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
    public void showErrorTextOKDialog(final JFrame JFrame, final String text) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setText(text);
        ErrorOKDialog_.show();
    }
    public void showErrorOKCallbackDialog(final JFrame JFrame, final String propertyText, final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText(propertyText);
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }   
    public void showErrorInvalidSelectionOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_invalid_selection");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorInvalidAmountOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_invalid_amount");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorCeroItemsOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_cero_items");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorSaleNotContinueByEstatusOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_sale_not_proceed_by_status");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorInvalidLoginOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("users_invalid_login");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }    
    public void showErrorStopByConfigOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_stop_by_config");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorRecordNotExistsOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_not_record_exists");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorFileNotExistsOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_file_not_exists");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorInvalidFileExtensionOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_invalid_file_extension");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
            
    public void showErrorRecordExistsOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_record_exists");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorUserNotExistsOKDialog(final JFrame JFrame,final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_user_not_exists");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorOKNoSelectionCallbackDialog(final JFrame JFrame, final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("selection_first");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorOKRecordNotExistsCallbackDialog(final JFrame JFrame, final com.era.views.dialogs.OKDialog.OKDialogInterface OKDialogInterface) throws Exception {
        final ErrorOKDialog ErrorOKDialog_ = this.getErrorOKDialog(JFrame);
        ErrorOKDialog_.setPropertyText("errors_record_doesnot_exists");
        ErrorOKDialog_.setOKDialogInterface(OKDialogInterface);
        ErrorOKDialog_.show();
    }
    public void showErrorDialogByIdTextJFrame(final  String idText, final ErrorDialogJFrame.OnOkButtonActionPerformed OnOkButtonActionPerformed) throws Exception{
        final ErrorDialogViewController ErrorDialogViewController = new ErrorDialogViewController();
        ErrorDialogViewController.setIdText(idText);
        ErrorDialogViewController.setOnOkButtonActionPerformed(OnOkButtonActionPerformed);
        ErrorDialogViewController.setVisible();
    }
    
    public void showErrorDialogByTextJFrame(final  String text, final ErrorDialogJFrame.OnOkButtonActionPerformed OnOkButtonActionPerformed) throws Exception{
        final ErrorDialogViewController ErrorDialogViewController = new ErrorDialogViewController();
        ErrorDialogViewController.setText(text);
        ErrorDialogViewController.setOnOkButtonActionPerformed(OnOkButtonActionPerformed);
        ErrorDialogViewController.setVisible();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

/**
 *
 * @author PC
 */
public class ViewsFactory {
    
    private static ViewsFactory RenderViewManager;
    
    private PremiumJFrame PremiumJFrame;
    private PushNotificationJFrame PushNotificationJFrame;
    private RegisterWebsiteJFrame RegisterWebsiteJFrame;
    private DialogJFrame DialogJFrame;
    private CreatingDatabaseWaitJFrame CreatingDatabaseWaitJFrame;
    
    
    
    private ViewsFactory(){        
    }

    public static ViewsFactory getSingleton(){
        if(RenderViewManager==null){
            RenderViewManager = new ViewsFactory();
        }
        return RenderViewManager;
    }
    
    public PremiumJFrame getPremiumJFrame(){
        if(PremiumJFrame==null){
            PremiumJFrame = new PremiumJFrame();
        }
        return PremiumJFrame;
    }
    
    public PushNotificationJFrame getPushNotificationJFrame(final String urlBanner, final String urlBannerAction) throws Exception{
        if(PushNotificationJFrame==null){
            PushNotificationJFrame = new PushNotificationJFrame(urlBanner,urlBannerAction);
        }
        return PushNotificationJFrame;
    }
    
    public RegisterWebsiteJFrame getRegisterWebsiteJFrame(){
        if(RegisterWebsiteJFrame==null){
            RegisterWebsiteJFrame = new RegisterWebsiteJFrame();
        }
        return RegisterWebsiteJFrame;
    }
    
    public DialogJFrame getDialogJFrame(final String message){
        if(DialogJFrame==null){
            DialogJFrame = new DialogJFrame(message);
        }
        return DialogJFrame;
    }
    
    public CreatingDatabaseWaitJFrame getCreatingDatabaseWaitJFrame(){
        if(CreatingDatabaseWaitJFrame==null){
            CreatingDatabaseWaitJFrame = new CreatingDatabaseWaitJFrame();
        }
        return CreatingDatabaseWaitJFrame;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }        
}

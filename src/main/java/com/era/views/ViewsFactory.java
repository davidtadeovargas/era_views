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
    private LoadingWaitJFrame LoadingWaitJFrame;
    
    
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
        return new PushNotificationJFrame(urlBanner,urlBannerAction);
    }
    
    public RegisterWebsiteJFrame getRegisterWebsiteJFrame(){
        return new RegisterWebsiteJFrame();
    }
    
    public DialogJFrame getDialogJFrame(final String message){
        return new DialogJFrame(message);
    }
    
    public LoadingWaitJFrame getLoadingWaitJFrame(){
        if(LoadingWaitJFrame == null){
            LoadingWaitJFrame = new LoadingWaitJFrame();
        }
        return LoadingWaitJFrame;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }        
}
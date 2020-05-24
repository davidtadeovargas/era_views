/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

import com.era.views.viewscontrollers.ErrorDialogViewController;
import com.era.views.viewscontrollers.PremiumViewController;
import com.era.views.viewscontrollers.LoadingWaitViewController;
import com.era.views.viewscontrollers.PushNotificationViewController;
import com.era.views.viewscontrollers.RegisterWebsiteViewController;

/**
 *
 * @author PC
 */
public class ViewsFactory {
    
    private static ViewsFactory RenderViewManager;
    
    private PremiumViewController PremiumViewController;    
    private LoadingWaitViewController LoadingWaitViewController;    
    
    
    private ViewsFactory(){        
    }

    public static ViewsFactory getSingleton(){
        if(RenderViewManager==null){
            RenderViewManager = new ViewsFactory();
        }
        return RenderViewManager;
    }
    
    public PremiumJFrame getPremiumJFrame(){
        if(PremiumViewController==null){
            PremiumViewController = new PremiumViewController();
        }
        return PremiumViewController;
    }
    
    public PushNotificationViewController getPushNotificationViewController(final String urlBanner, final String urlBannerAction) throws Exception{
        return new PushNotificationViewController(urlBanner,urlBannerAction);
    }
    
    public RegisterWebsiteJFrame getRegisterWebsiteJFrame(){
        return new RegisterWebsiteViewController();
    }
    
    public DialogJFrame getDialogJFrame(final String message){
        return new DialogJFrame(message);
    }
    
    public LoadingWaitViewController getLoadingWaitJFrame(){
        if(LoadingWaitViewController == null){
            LoadingWaitViewController = new LoadingWaitViewController();
        }
        return LoadingWaitViewController;
    }
        
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }        
}
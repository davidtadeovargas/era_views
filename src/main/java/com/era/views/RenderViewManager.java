/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views;

import com.era.views.DialogJFrame;
import com.era.views.PremiumJFrame;
import com.era.views.PushNotificationJFrame;
import com.era.views.RegisterWebsiteJFrame;

/**
 *
 * @author PC
 */
public class RenderViewManager {
    
    private static RenderViewManager RenderViewManager;
    
    private PremiumJFrame PremiumJFrame;
    private PushNotificationJFrame PushNotificationJFrame;
    private RegisterWebsiteJFrame RegisterWebsiteJFrame;
    private DialogJFrame DialogJFrame;
    
    
    
    private RenderViewManager(){        
    }

    public static RenderViewManager getSingleton(){
        if(RenderViewManager==null){
            RenderViewManager = new RenderViewManager();
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
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }        
}

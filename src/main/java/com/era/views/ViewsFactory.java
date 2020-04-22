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
        return new LoadingWaitJFrame();
    }
    
    public PrincipJFrame getPrincipJFrame(){
        return new PrincipJFrame();
    }
    
    public ProdsJFrame getProdsJFrame(){
        return new ProdsJFrame();
    }
    
    public MonsJFrame getMonsJFrame(){
        return new MonsJFrame();
    }
    
    public MaxsMinsJFrame getMaxsMinsJFrame(){
        return new MaxsMinsJFrame();
    }
    
    public CuentasContablesJFrame getCuentasContablesJFrame(){
        return new CuentasContablesJFrame();
    }
    
    public LotPedCatJFrame getLotPedCatJFrame(){
        return new LotPedCatJFrame();
    }
    
    public Impuestos_X_productos_nuevoJFrame getImpuestos_X_productos_nuevoJFrame(){
        return new Impuestos_X_productos_nuevoJFrame();
    }
    
    public ImpsJFrame getImpuestos_X_productos_nuevoImpsJFrame(){
        return new ImpsJFrame();
    }
    
    public CatalBancosJFrame getCatalBancosJFrame(){
        return new CatalBancosJFrame();
    }
    
    public ConceptosPagoJFrame getConceptosPagoJFrame(){
        return new ConceptosPagoJFrame();
    }
    
    public CompsJFrame getCompsJFrame(){
        return new CompsJFrame();
    }
    
    public ClientsJFrame getClientsJFrame(){
        return new ClientsJFrame();
    }
    
    public VerCtaContJFrame getVerCtaContJFrame(){
        return new VerCtaContJFrame();
    }
    
    public UsrsJFrame getUsrsJFrame(){
        return new UsrsJFrame();
    }
    
    public UnidadesJFrame getUnidadesJFrame(){        
        return new UnidadesJFrame();        
    }
    
    public TipsPagsJFrame getTipsPagsJFrame(){
        return new TipsPagsJFrame();
    }
    
    public SubramosJFrame getSubramosJFrame(){
        return new SubramosJFrame();
    }
    
    public SeriesJFrame getSeriesJFrame(){
        return new SeriesJFrame();        
    }
    
    public SectoresJFrame getSectoresJFrame(){        
        return new SectoresJFrame();               
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }        
}
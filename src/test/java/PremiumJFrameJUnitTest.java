import com.era.logger.LoggerUtility;
import com.era.views.LoadingWaitJFrame;
import com.era.views.PremiumJFrame;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PC
 */
@TestMethodOrder(OrderAnnotation.class)
public class PremiumJFrameJUnitTest  {
    
    @Test
    @Order(1)
    public void setVisibleCreatingDatabaseWaitJFrameTest() {
        
        try{
            
            final PremiumJFrame PremiumJFrame = new PremiumJFrame();
            PremiumJFrame.setVisible(true);
                        
            //Never ends this program
            Thread.currentThread().join();  
            
            assertTrue(true);
            
        }catch(Exception e){
            LoggerUtility.getSingleton().logError(CreatingDatabaseWaitJFrameJUnitTest.class, e);
            
            Assertions.fail();
        }
    }
}

import com.era.logger.LoggerUtility;
import com.era.views.CreatingDatabaseWaitJFrame;
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
public class CreatingDatabaseWaitJFrameJUnitTest  {
    
    @Test
    @Order(1)
    public void setVisibleCreatingDatabaseWaitJFrameTest() {
        
        try{
            
            final CreatingDatabaseWaitJFrame CreatingDatabaseWaitJFrame = new CreatingDatabaseWaitJFrame();
            CreatingDatabaseWaitJFrame.setVisible(true);
            
            new Thread(new Runnable() {
            public void run() {
              for (int i = 0; i <= 100; i++) {

                try {
                  java.lang.Thread.sleep(100000);
                }
                catch(Exception e) { }
              }
            }
          }).start();
            
            assertTrue(true);
            
        }catch(Exception e){
            LoggerUtility.getSingleton().logError(CreatingDatabaseWaitJFrameJUnitTest.class, e);
            
            Assertions.fail();
        }
    }
}

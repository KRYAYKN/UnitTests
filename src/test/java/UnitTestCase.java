import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestCase {
    private ExampleFunction unitTest;
@BeforeMethod
public void setUp(){
    unitTest = new ExampleFunction();
}
    @Test
    public void test(){

         assertEquals(6,unitTest.toplama(2,2,2));
    }
}

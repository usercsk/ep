import static org.junit.Assert.assertEquals;

import org.junit.Test;  
  
public class TestDemo{  
  
    @Test  
    public void testMethod1()
    {  
        assertEquals(1, PrimeTest.test(3));  
        //sample to upload to gib
    }  
    
    @Test  
    public void testMethod2()
    {  
        assertEquals(1, PrimeTest.test(4));
        //demo
    } 
}

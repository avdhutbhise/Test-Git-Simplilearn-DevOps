package selenium.MyFirstMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("Test 1");
        Assert.assertTrue( true );
    }
    
    @Test
    public void shouldAnswerWithFalse()
    {
    	System.out.println("Test 2");
    	Assert.assertTrue( true );
    }
}

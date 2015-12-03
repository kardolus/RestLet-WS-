package restful.restlet.pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.restlet.representation.Representation;

/**
 *
 * @author misterclipping
 */
public class PlainGetAllResourceTest {
    
    public PlainGetAllResourceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toPlain method, of class PlainGetAllResource.
     */
    @Test
    public void testToPlain() {
        System.out.println("toPlain");
        PlainGetAllResource instance = new PlainGetAllResource();
        instance.toPlain();
    }
    
}

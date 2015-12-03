package restful.restlet.pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Guillermo Kardolus
 */
public class XmlGetAllResourceTest {
    
    public XmlGetAllResourceTest() {
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
     * Test of toXml method, of class XmlGetAllResource.
     */
    @Test
    public void testToXml() {
        System.out.println("testing toXml");
        XmlGetAllResource instance = new XmlGetAllResource();
        instance.toXml();
    }
    
}

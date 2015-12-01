package restful.restlet.pojo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author misterclipping
 */
public class FileParserTest {
    
    public FileParserTest() {
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
     * Test of parse method, of class FileParser.
     */
    @Test
    public void testParse() {
        System.out.println("testing parse");
        FileParser instance = new FileParser();
        instance.parse();
        Scientists sc = new Scientists();
        if(Scientists.getScientistList().isEmpty()){
            fail("Unable to parse database file");
        }
        assertEquals(countLines(), Scientists.getScientistList().size()); // all lines parsed
        System.out.println(sc.toString());
        
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
    private int countLines() {
        LineNumberReader  lnr = null;
        try {
            lnr = new LineNumberReader(new FileReader(new File("/Users/misterclipping/NetBeansProjects/Restful Restlet POJO/data/scientists.db")));
            lnr.skip(Long.MAX_VALUE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileParserTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileParserTest.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        if(lnr != null)
            return lnr.getLineNumber() + 1;
        else
            return -1;
    }
    
}

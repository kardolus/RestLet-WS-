package restful.restlet.pojo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Guillermo Kardolus
 */
public class Scientists {
    /* Compared to the JAX-RS example, there are now multiple Resource files.
    *  Therefore a single static reference to the POJO-List is no longer 
    *  sufficient-- instead, the POJO-List class (this class) uses a static
    *  modifier for the object reference holding the list.
    *  Infact all methods must be static, just so there is no lock-mixup in
    *  the concurrent access.
    */
    private final static List<Scientist> scientistList = 
            new CopyOnWriteArrayList<>();
    private static AtomicInteger id = new AtomicInteger();
    
    public static List<Scientist> getScientistList(){
        return Scientists.scientistList;
    }
    
    @Override
    public String toString(){
        String result = "";
        for(Scientist s : scientistList){
            result += s.toString() + System.lineSeparator();
        }
        return result;
    }
    
    public static Scientist get(Integer id){
        for(Scientist s : scientistList){
            if(s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }
    public static Integer add(Scientist s){
        Integer identifier = id.getAndIncrement();
        s.setId(identifier);
        Scientists.scientistList.add(s);
        return identifier;
    }
}

package restful.restlet.pojo;

/**
 * @author misterclipping
 */
public class Scientist {
    public static enum Discipline { MATH, PHYSICS, BIOLOGY, 
                                    ECONOMY, PHILOSOPHY, MEDICINE };
    
    private Discipline field;
    private String name;
    private Integer birthYear;
    private Integer id;
    
    public Scientist(){
        
    }
    public Scientist(String name, Discipline field, Integer birthYear){
        this.name = name;
        this.field = field;
        this.birthYear = birthYear;
    }
    
    @Override
    public String toString(){
        return id + ": " + name + " " + field + " " + birthYear;
    }
    
    public void setField(Discipline field){
        this.field = field;
    }
    public Discipline getField(){
        return this.field;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBirthYear(Integer year){
        this.birthYear = year;
    }
    public Integer getBirthYear(){
        return this.birthYear;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }
}

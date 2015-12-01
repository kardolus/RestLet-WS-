package restful.restlet.pojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Guillermo Kardolus
 */
public class FileParser {
    public void parse(){
        File f = new File("/Users/misterclipping/NetBeansProjects/Restful Restlet POJO/data/scientists.db");
        String line;

        if(!f.exists()){
            System.out.println("No such file");
            return;
        }
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while((line = br.readLine()) != null){
                String[] fields = line.split(",");
                Scientist.Discipline d = Scientist.Discipline.MATH; // default
                if(fields[1].equals("PHYSICS")){
                    d = Scientist.Discipline.PHYSICS;
                }else if(fields[1].equals("MEDICINE")){
                    d = Scientist.Discipline.MEDICINE;
                }else if(fields[1].equals("BIOLOGY")){
                    d = Scientist.Discipline.BIOLOGY;
                }else if(fields[1].equals("PHILOSOPHY")){
                    d = Scientist.Discipline.PHILOSOPHY;
                }else if(fields[1].equals("ECONOMY")){
                    d = Scientist.Discipline.ECONOMY;
                }
                
                Scientist p = new Scientist(fields[0], d, 
                        Integer.valueOf(fields[2]));
                Scientists.add(p);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
                Logger.getLogger(FileParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

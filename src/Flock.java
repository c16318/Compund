import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author c16318
 */
public class Flock extends Quackable{
    private String name = "Flock";
    ArrayList<Quackable> quackers = new ArrayList();
  
    
    public String getName(){
        return name;
    }
    
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    
    public void quack(){
        for(Quackable s:quackers){
            s.quack();

        }
    }
    
}

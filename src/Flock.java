import java.util.ArrayList;

/**
 *
 * @author c16318
 */
public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList();
    
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    
    public void quack(){
        for(Quackable s:quackers)
            s.quack();
        }
}

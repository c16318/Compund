
import java.util.ArrayList;
import java.util.Iterator;


//ガーガー鳴く
/**
 *
 * @author c16318
 */
public abstract class Quackable {
    
    public abstract void quack();
    public abstract String getName();

    ArrayList<Quackable> quackers = new ArrayList();
    private ArrayList observers = new ArrayList();
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
   
    public void notifyobservers(){
        Iterator it = observers.iterator();
        while(it.hasNext()){
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
}

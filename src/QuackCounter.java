

/**
 *
 * @author c16318
 */
public class QuackCounter extends  Quackable{
    Quackable goose;
    static int count = 0;
    
    public QuackCounter(Quackable goose){
        this.goose = goose;
    }
    
    public String getName(){
        return goose.getName();
    }
    public void quack(){
        count++;
        goose.quack();
        notifyobservers();
    }
    public static int getQuacks(){
        return count;
    }
}



/**
 *
 * @author c16318
 */
public class QuackCounter implements  Quackable{
    Quackable goose;
    static int count = 0;
    
    public QuackCounter(Quackable goose){
        this.goose = goose;
    }
    
    public void quack(){
        count++;
        goose.quack();
    }
    public static int getQuacks(){
        return count;
    }
}

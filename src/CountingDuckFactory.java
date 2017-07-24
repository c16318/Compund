
/**
 *
 * @author c16318
 */
public class CountingDuckFactory extends AbstractDuckFactory{

    public Quackable createMallardDuck(){
        return new QuackCounter(new MallardDuck());
    }
    public Quackable createRedHeadDuck(){
        return new QuackCounter(new RedHeadDuck());
    }
    public Quackable createRubberDuck(){
        return new QuackCounter(new RubberDuck());
    }
    public Quackable createDuckCall(){
        return new QuackCounter(new DuckCall());
    }
       
}

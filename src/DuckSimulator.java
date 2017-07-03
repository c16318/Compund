
/**
 *
 * @author c16318
 */
public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    
    void simulate(AbstractDuckFactory factory){

        Quackable mallardDuck = factory.createMallardDuck(); //Decoratorパターン
        Quackable redheadDuck = factory.createRedHeadDuck();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable gooseDuck = new GooseAdapter(new Goose());//Adaptorパターン
        
        Flock flockOfDucks = new Flock();     //Compositeパターン
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(duckCall);
        
        System.out.println("鴨シュミレータ:オブザバー付き");   //鳴いたら知らせる
        Quackologsit quakologist = new Quackologist();
        flockOfDucks.registerObserver(quakologist);
        simulate(flockOfDucks);

        simulate(gooseDuck);
        
        System.out.println("鴨が泣いた回数：" + QuackCounter.getQuacks() + "回");
    }
    
    void simulate(Quackable duck){
        duck.quack();
    }
}

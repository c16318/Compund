
/**
 *
 * @author c16318
 */
public class DuckSimulator {
    public static void main(String[] args){
        
        DuckSimulator simulator = new DuckSimulator();
         //System.out.println("test");
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        
       
        simulator.simulate(duckFactory);
    }
    
    void simulate(AbstractDuckFactory factory){

        Quackable mallardDuck = factory.createMallardDuck(); //Decoratorパターン
        Quackable redheadDuck = factory.createRedHeadDuck();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable gooseDuck = new GooseAdapter(new Goose());//Adaptorパターン
        
        Observer observer1 = new QuackObserver();
      
        mallardDuck.addObserver(observer1);
        redheadDuck.addObserver(observer1);
        rubberDuck.addObserver(observer1);
        duckCall.addObserver(observer1);
        gooseDuck.addObserver(observer1);
        
        
        Flock flockOfDucks = new Flock();     //Compositeパターン
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(duckCall);
        
        System.out.println("鴨シュミレータ:オブザバー付き");   //鳴いたら知らせる
        //Quackologsit quakologist = new Quackologist();
       // flockOfDucks.registerObserver(quakologist);
        simulate(flockOfDucks);

        simulate(gooseDuck);
        
        System.out.println("鴨が泣いた回数：" + QuackCounter.getQuacks() + "回");
    }
    
    void simulate(Quackable duck){
        duck.quack();
    }
}

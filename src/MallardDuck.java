
/**
 *マガモ
 * @author c16318
 */
public class MallardDuck extends Quackable{
    private String name = "MallardDuck";
    
    public String getName(){
        return name;
    }
    public void quack(){
        System.out.println("ガーガー");
        //notifyobservers();
    }
}

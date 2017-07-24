/**
 *
 * @author c16318
 */
public class RubberDuck extends Quackable{
    private String name ="RubberDuck";
    
    
   
    public String getName(){
        return name;
    }
    public void quack(){
        System.out.println("キューキュー");
        //notifyobservers();
    }
}

import ch.aplu.turtle.*;
import java.util.Random;

public class RandomWalk {
    private final double MAX = 190;
    private Random zG;
    private Turtle laura;
    
    public RandomWalk(){
        zG = new Random();
        laura = new Turtle();
    }
    
    private double nextAngle(){
        return 180 * (zG.nextDouble()-0.5);
    }
    
    private double nextSteps(){
        return 100 * (zG.nextDouble()-0.5);
    }
    
    public void walk(){
        while (Math.abs(laura.getY())< MAX &&
               Math.abs(laura.getX())< MAX    ){
              
          laura.rt(nextAngle());
          laura.fd(nextSteps());
        }
    }
}

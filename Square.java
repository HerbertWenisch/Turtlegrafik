
import ch.aplu.turtle.*;

public class Square {
    private Turtle john;
    
    public Square(){
        john = new Turtle();
    }
    
    public void draw(){
        for(int i = 0; i < 4; i++){
            john.fd(100);  // forward
            john.lt(90);  // left
        }   
    }
}

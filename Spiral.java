import ch.aplu.turtle.*;

public class Spiral {
    Turtle laura;
    
    public Spiral(){
        laura = new Turtle();
    }

    
    public void draw(){
        int a = 5; 
        int da = 4;
        int n = 32;
        
        for(int i = 0; i < n; i++){
            laura.fd(a);
            laura.lt(90);
            a+= da;
        }
        
        laura.ht();
    }
}

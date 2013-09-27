package tp_ide;

/**
 *
 * @author paulyves
 */
import javax.imageio.*;
import java.awt.Image;

public class Tp_ide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        
    }
    
    public BufferedImage loadImage(){
        BufferedImage image;
        image = ImageIO.read(new File("lena.pmg"));
    }
}

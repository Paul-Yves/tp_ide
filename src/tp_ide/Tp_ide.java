package tp_ide;

import java.io.*;

/**
 *
 * @author paulyves, mjothy
 */


public class Tp_ide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        histo("C:\\Users\\Mario\\Desktop\\lena.pgm");
        
    }
    
    public static void histo(String path) throws IOException {
        FileReader fr = new FileReader(new File(path));
        BufferedReader file = new BufferedReader(fr);
        String a = "0";
        for(int i=0; i<4; i++){
            file.readLine();
        }
        int[] histo = new int[255];
        int b= file.read();
        while(b!=-1){
            histo[b] ++;
            b = file.read();
        }
        
    }
}

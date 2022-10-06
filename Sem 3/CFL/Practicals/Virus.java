/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Merin
 */
public class Virus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("D:/Git/Sem 3/CFL/Practicals/Logfile.log", true);
            while(true){
                fw.write("Virus has been activated");
        }
    }
        catch(IOException e){
            e.printStackTrace();
        }
    
}
}

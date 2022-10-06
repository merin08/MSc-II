/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfl2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Merin
 */
public class Cfl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Logger l = Logger.getLogger(Cfl2.class.getName());
        FileHandler fh;
        try{
            fh = FileHandler("D:/Git/Sem 3/CFL/Practicals/logfile.log", true);
            l.addHandler(fh);
            l.setLevel(Level.ALL);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            l.info("My first log");
        }
        catch(SecurityException e){
            e.printStackTrace();
        }
        l.info("Hi Hru");
    }

    private static FileHandler FileHandler(String dGitSem_3CFLPracticalslogfilelog, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

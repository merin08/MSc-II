/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfl3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Merin
 */
public class Cfl3 {
    public static void main(String[] args) throws IOException {
        String d = "";
        final String f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter directory name: ");
        d = br.readLine();
        System.out.println("Enter file name: ");
        f = br.readLine();
        File dir = new File(d);
        FilenameFilter filter = new FilenameFilter(){
        public boolean accept(File dir, String name){
            return name.startsWith(f);
        }
    };
String[] children=dir.list(filter);
if(children==null){
System.out.println("Either dir does not exist or is not a directory");
}
else
{
for(int i=0;i<children.length;i++){
String filename=children[i];
System.out.println(filename);
}
}

    }
    
}

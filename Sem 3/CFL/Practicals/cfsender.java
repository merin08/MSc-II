/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf1;
import java.io.*;
import java.net.Socket;
import java.util.*;
/**
 *
 * @author Merin
 */
public class cfsender {
    public static void main(String[] args) throws IOException {
        int i = 0, k = 0;
        String s = "";
        String ct = "";
        String key = "";
        Socket sc = new Socket("localhost", 3306);
        Random r = new Random();
        System.out.println("Enter the string: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
        s = br.readLine();
        int j[] = new int[s.length()];
        for(i = 0; i < s.length(); i++){
            j[k] = r.nextInt(50);
            key += Integer.valueOf(j[k]) + ",";
            System.out.print("j = " + j[k]);
            ct += (char)(s.charAt(i)+j[k]);
            System.out.print("key = "+key);
            System.out.print("Encrypted msg: "+ct);
            bw.write(ct + "," +key);
            bw.flush();
            bw.close();
        }
    }
        
}

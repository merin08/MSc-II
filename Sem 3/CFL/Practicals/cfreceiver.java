/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf1;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
/**
 *
 * @author Merin
 */
public class cfreceiver {
    public static void main(String[] args) throws IOException{
        int i = 0, k = 0;
        String pt = "";
        String ct = "";
        ServerSocket skt = new ServerSocket(3306);
        Socket sc = skt.accept();
        Random r = new Random();
        System.out.println("Enter the string: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
        ct = br.readLine();
        String[] s = new String[ct.length()];
        s = ct.split(",");
        int[] j = new int[s[0].length()];
        System.out.print("Msg: " + s[0]);
        for(i = 0; i < s[0].length(); i++){
            j[i] = Integer.parseInt(s[i + 1]);
            System.out.print("key" + j[i]);
        }
        for(i = 0; i < s[0].length(); i++){
            System.out.print("j = "+ j[i]);
            pt += (char)(s[0].charAt(1) - j[i]);
        }
        System.out.print("Msg from Sender: "+pt);
}
}
    


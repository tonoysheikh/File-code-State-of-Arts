
package com.mycompany.filework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fread {
    public static void main(String[] args) {
        File file = new File("D:/Sonargaon/tonoy.txt");
        
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

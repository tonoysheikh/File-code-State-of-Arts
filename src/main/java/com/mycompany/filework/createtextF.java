
package com.mycompany.filework;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class createtextF {
    public static void main(String[] args) {
        File file = new File("D:/Sonargaon/tonoy.txt");
        
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(createtextF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

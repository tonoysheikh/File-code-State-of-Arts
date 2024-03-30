
package com.mycompany.filework;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Fwrite {
    public static void main(String[] args) {
        try{
             FileWriter myWriter = new FileWriter("D:/Sonargaon/tonoy.txt");
             Scanner input =  new Scanner(System.in);
             System.out.println("Enter a num : ");
             int num = input.nextInt();
             for(int i = 0; i < num;i++)
             {
                 String name = input.next();
                 myWriter.write(name);
                 myWriter.write("\n");
             }
                myWriter.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}

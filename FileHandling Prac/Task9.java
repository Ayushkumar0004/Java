// Write a Java program that calculates the size of a file (in bytes, kilobytes, megabytes, etc.) and displays the result

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Task9 
{
     public static void main(String[] args) {
        File f = new File("Intro.txt");
        try{
        FileReader f1 = new FileReader(f);
        BufferedReader f2 = new BufferedReader(f1);
        int line;
        if((line=f2.read()) != -1)
        {
            System.out.println((char) line);
        }
        System.out.println("Size of file : " + f.length());
        f1.close();
        f2.close();
    }
    catch(Exception e)
    {
        System.out.println("Invalid");
    }
}
}

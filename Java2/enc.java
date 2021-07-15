/* File name : enc.java */
package Java2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

import java.awt.image.BufferedImage;
import java.io.IOException;


public class enc {
    public static String sdf;
   
    public static String main(String str, String key) {
           
//         Scanner in = new Scanner(System.in);
//                 
//         System.out.print("Ключ: ");
//         String key = in.nextLine();
//         
//         System.out.print("Значение: ");
//         String str = in.nextLine();
        
        
        char[] keyToArray = key.toCharArray(); // Преобразуем строку str в массив символов (char) с помощью метода toCharArray().
        ArrayList<Integer> keyBinary = new ArrayList<Integer>(); //Создаем пустой список
        // Вывод массива на экран с преобразованными буквами в двоичный код
        for(int i = 0; i < keyToArray.length; i++)
        {
            int ascii = (int) keyToArray[i]; //Перевод символов в ascii (десятичные цифры)
            keyBinary.add(ascii);
        }
        System.out.println(keyBinary);
  
  
        char[] strToArray = str.toCharArray(); // Преобразуем строку str в массив символов (char) с помощью метода toCharArray().
        ArrayList<Integer> strBinary = new ArrayList<Integer>(); //Создаем пустой список
        // Вывод массива на экран с преобразованными буквами в двоичный код
        for(int i = 0; i < strToArray.length; i++)
        {
            int ascii = (int) strToArray[i]; //Перевод символов в ascii (десятичные цифры)
            strBinary.add(ascii);
        }
        System.out.println(strBinary);

    
        ArrayList<Integer> qwe = new ArrayList<Integer>();
        for(int i = 0; i < strBinary.size(); i++)
            {
                Integer n = strBinary.get(i);
                Integer m = keyBinary.get(i);
                qwe.add((int) n ^ m);
            }
            
        System.out.println(qwe);
        
        String sdf = qwe.toString();
        return sdf;


        } 
}


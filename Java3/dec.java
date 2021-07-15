/* File name : dec.java */
package Java3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Arrays;

import java.awt.image.BufferedImage;
import java.io.IOException;


public class dec {
        public static String asd;
        
    public static String main(String key, String str) {

//         Scanner in = new Scanner(System.in);
//                 
//         System.out.print("Ключ: ");
//         String key = in.nextLine();
//         
//         System.out.print("Значение: ");
//         String str = in.nextLine();
        
        char[] keyToArray = key.toCharArray(); // Преобразуем строку str в массив символов (char) с помощью метода toCharArray().
        ArrayList<Integer> keyList = new ArrayList<Integer>(); //Создаем пустой список
        // Вывод массива на экран с преобразованными буквами в двоичный код
        for(int i = 0; i < keyToArray.length; i++)
        {
            int ascii = (int) keyToArray[i]; //Перевод символов в ascii (десятичные цифры)
            keyList.add(ascii); 
        }
        System.out.println(keyList);
        
        
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str.split(" ")));
        System.out.println(strList);
        
        ArrayList<Integer> xor = new ArrayList<Integer>();
        for(int i = 0; i < strList.size(); i++)
            {
                Integer n = Integer.parseInt(strList.get(i));
                Integer m = keyList.get(i);
                xor.add((int) n ^ m);
            }
        System.out.println(xor);
        

        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i < xor.size(); i++)
            {
                int z = xor.get(i);
                String n = Character.toString((char)z);
                result.add(n);
            }
        System.out.println(result);

        String asd = result.toString();
        return asd;

    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;


import java.util.Scanner;

/**
 *
 * @author M S I
 */

public class Input {
    public  static Scanner sc =new Scanner(System.in);
    //tao ham nhap phu hop voi cac bien duoc khai bao Transaction
    public static int inputInt(String content)
    {
        int result =0;
        System.out.println(content);
        result =sc.nextInt();
        return result;  
    }
    public static double inputDouble(String content)
    {
        double result =0;
        System.out.println(content);
        result =sc.nextDouble();
        return result;
    }
    
    public static String inputString(String content)
    {
        String result ="";
        System.out.println(content);
        sc.nextLine();
        result =sc.nextLine();
        
        return result;
    }
    public static String inputString()
    {
        
        String result ="";
        System.out.println();
        result =sc.nextLine();
        
        return result;
    }
    
    public static String inputStrings(String content)
    {
        String result ="";
        System.out.println(content);
        
        result =sc.nextLine();
        return result;
    }
     
    public static String inputDate()
    {
        String result ="";
        System.out.println("Nhập ngày (dd/MM/yyyy): ");
        result =sc.nextLine();
        
        return result;

    }
}


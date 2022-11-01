/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.util.Scanner;

/**
 *
 * @author elxan
 */
public class InputUtil {

    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        String answer = sc.nextLine();
        return answer;
    }
    
    public static double requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        double answer = sc.nextDouble();
        return answer;
    }
}

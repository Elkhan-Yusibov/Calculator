/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author elxan
 */
public class Calculate {

    public static void calculate() {

        double a = InputUtil.requireNumber("Enter first number");

        double b = InputUtil.requireNumber("Enter second number");

        System.out.println("Select operation"
                + "\n1.Sum"
                + "\n2.Minus"
                + "\n3.Multiplication"
                + "\n4.Division"
                + "\n5.Exit");
        int operation = (int) InputUtil.requireNumber("");
        double result = 0;

        switch (operation) {
            case 1 ->
                result = MathUtil.Sum(a, b);
            case 2 ->
                result = MathUtil.Minus(a, b);
            case 3 ->
                result = MathUtil.Multiplication(a, b);
            case 4 ->
                result = MathUtil.Division(a, b);
            case 5 ->
                System.exit(0);
            default ->
                System.out.println("The operation was not selected correctly");
        }

        System.out.println("result=" + result);
    }
}

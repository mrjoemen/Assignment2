package Chapter10;

import java.util.Scanner;

public class Calculator { // question 26

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Equation: ");
        String[] arr = input.nextLine().split("\\s+");
        //String[] arr = args[0].split("\\s+");
        int total = 0;


        switch (arr[1].charAt(0)) {
            case '+':
                total = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                System.out.println(arr[0] + " + " + arr[2] + " = " + total); break;
            case '-':
                total = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                System.out.println(arr[0] + " - " + arr[2] + " = " + total); break;
            case '*':
                total = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                System.out.println(arr[0] + " * " + arr[2] + " = " + total); break;
            case '/':
                total = Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]);
                System.out.println(arr[0] + " / " + arr[2] + " = " + total); break;
        }


    }


}

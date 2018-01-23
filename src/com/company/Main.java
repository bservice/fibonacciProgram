package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number to see if it is a Fibonacci number");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        String numbers = "";
        String numAsString;
        numAsString = String.valueOf(num);

        for (int i = 1; i <= num; i++) {
            int temp = fibonacci(i);
            numbers = numbers + temp + ",";
            if (temp >= num) {
                break;
            }
        }

        if (numbers.contains(numAsString)) {
            System.out.println(num + " is a Fibonacci number. Here is the list leading up to it: " + numbers);
        }
        else {
            System.out.println(num + " is not a Fibonacci number.");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}





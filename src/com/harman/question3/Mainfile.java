package com.harman.question3;

import java.util.Scanner;

public class Mainfile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer a, b,sum,diff,prod,avg;
        System.out.println("Enter 1st Number Greater than 10000");
        a = input.nextInt();
        System.out.println("Enter 2nd Number Greater than 10000");
        b = input.nextInt();

        Op obj=new Op();
        if(a>10000 && b>10000) {
            System.out.println("Sum of two Numbers");
            sum = obj.sum(a, b);
            System.out.println(sum);
            System.out.println("Difference of two Numbers");
            diff = obj.diff(a, b);
            System.out.println(diff);
            System.out.println("Product of two Numbers");
            prod = obj.prod(a, b);
            System.out.println(prod);
            System.out.println("Average of two Numbers");
            avg = obj.avg(a, b);
            System.out.println(avg);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}


package com.happy;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i =1; i<=100; i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

        for(int i =100; i>0; i--){
            System.out.println(i);
        }
        System.out.println("Enter positive number and zero when you done entering your numbers");
        int numbers = input.nextInt();
        int sum1 =0;
        int counter = 0;
        while(numbers !=0){
            sum1 = sum1+numbers;
            counter++;
            System.out.println("Enter positive number and zero when you done entering your numbers");
            numbers = input.nextInt();

        }
        System.out.println(sum1);
        System.out.println(sum1/counter);



    }



}




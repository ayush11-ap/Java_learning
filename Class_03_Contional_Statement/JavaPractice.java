package Class_03_Contional_Statement;

import java.util.Scanner;

public class JavaPractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Q1.
        // int number = sc.nextInt();
        // if(number > 0){
        //     System.out.println("Enter number is +ve : " + number);
        // }else if( number == 0){
        //     System.out.println("Enter number is Zero : " + number);
        // }else{
        //     System.out.println("Enter number is -ve : " + number);

        // }

        // Q2.
        // double temp = 103.5;
        // if(temp > 100){
        //     System.out.println("You have a fever");
        // }else{
        //     System.out.println("You don't have a fever");

        // }
        

        // Q3.
        // int week = sc.nextInt();
        // switch(week){
        //     case 1: System.out.println("Monday"); break;
        //     case 2: System.out.println("Tuesday"); break;
        //     case 3: System.out.println("Wednesday"); break;
        //     case 4: System.out.println("Thursday"); break;
        //     case 5: System.out.println("Friday"); break;
        //     case 6: System.out.println("Saturday"); break;
        //     case 7: System.out.println("Sunday"); break;
        //     default: System.out.println("Invalid Data");
        // }

        // Q4.
        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        // System.out.println(x);

        // int y = (a > b) ? a : b;
        // System.out.println(y);

        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y || z)){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

package Class_04_Loops;

import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in); 
        // System.out.print("Enter Range : ");
        // int n = sc.nextInt();
        // int i = 1;
        // while ( i <= n ){
        //     System.out.println("Sum -> " + i);
        //     i++;
        // }
        // System.out.println("Sum of N natural Number -> " + n*(n+1)/2);

        // int num = 5;
        // int sum = 0;
        // int j = 1;
        // while (j <= num){
        //     sum = sum + j;
        //     j++;
        // }
        // System.out.println("Sum of N Natural Numbers : " + sum);

        // for(int i = 0; i <= 10; i++){
        //     System.out.println("Hello World" + i++);
        // }

        // for(int row = 0; row <= 3; row++){
        //     for(int col = 0; col <=3; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int dob = 111105;

        // while(dob > 0){
        //     int lastDigit = dob % 10;
        //     System.err.print(lastDigit + " ");
        //     dob = dob / 10;
        // }
        // System.out.println(dob);

        // int n = 111105;
        // int rev = 0;

        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     rev = (rev*10) + lastDigit;
        //     n = n / 10;
        // }
        // System.out.print(rev);

        // for(int i = 0; i < 5; i++){
        //     if(i == 3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.err.println("i am out of hte loop");

        // Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter Any number : ");
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         break;
        //     }
        //     System.out.println("Entered Number is : " + n);

        // }while(true);

        // for(int i = 0; i <=50 ; i= i + 5){
        //      if( i % 10 == 0){
        //          continue;
        //      }
        //     System.out.println(i);
        // }

        //& Check if the number is Prime or not
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if(n == 2){
        //     System.out.println("n is Prime");
        // } else{
        //     boolean isPrime = true;
        // for(int i = 2; i <= Math.sqrt(n); i++){
        //     if(n % i == 0){
        //         isPrime = false;
        //     }
        // }
        // if(isPrime){
        //     System.out.println("n is Prime");
        // }else{
        //     System.out.println("n i not prime");
        // }
        // }

        // Questions
        // for(int i = 0; i < 5; i++){
        //     System.out.println("Hellow");
        //     i += 2;
        // }

        // Scanner sc = new Scanner(System.in);
        // int number;
        // int choice;
        // int evenSum = 0, oddSum = 0;

        // do {
        //     System.out.print("Enter the number : ");
        //     number = sc.nextInt();

        //     if(number % 2 == 0){
        //         evenSum += number;
        //     }else{
        //         oddSum += number;
        //     }

        //     System.out.print(
        //         "Do you want to continue? Press 1 or 0 to stop!"
        //     );

        //     choice  = sc.nextInt();
        // } while (choice==1);

        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddSum);

        // int num = sc.nextInt();
        
        // int fact = 1;
        
        // for(int i = 1; i <= num; i++){
            //     fact *= i;
            // }
            // System.out.println("Factorial : " + fact);
            
            
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            for(int i = 1; i <= num*10; i++){
                System.out.println(num + " x " + i + " = " + num*i);
            }

        }
}

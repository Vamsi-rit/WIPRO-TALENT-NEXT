// Write a program to accept a number N and print whether it is positive, negative or zero


import java.util.Scanner;

public class tx1 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number :");
    int a = sc.nextInt();
if (a>0)
    {
    System.out.print("positive");
    }
else if (a<0)
{
System.out.print("Negative");
}
else
System.out.print("zero");
}

}


// Write a program to accept two numbers and print the greater value of the two

import java.util.Scanner;

public class tx1 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
    System.out.print("Enter a value :");
    int a = sc.nextInt();
    System.out.print("Enter b value :");
    int b = sc.nextInt();
    
if (a>b)
    {
    System.out.print(a+"is greater than "+b);
    }
else {
    System.out.print(b+"is greater than "+a);
    }

}

}


// Write a program to accept a number N and print whether the number is EVEN or ODD

import java.util.Scanner;

public class tx1 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number :");
    int a = sc.nextInt();
if (a%2==0)
    {
    System.out.print("even");
    }
else 
{
System.out.print("odd");
}
}

}

//  Write a program to accept two numbers and print whether their sum is EVEN or ODD

import java.util.Scanner;

public class tx1 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
    System.out.print("Enter a value :");
    int a = sc.nextInt();
    System.out.print("Enter b value :");
    int b = sc.nextInt();
    
if ((a+b)%2==0)
    {
    System.out.print("sum of a and b is even ");
    }
else {
    System.out.print("sum of a and b is odd ");
    }

}

}

// Write a program to print all numbers from 1 to 100 i.e. 1 2 3 4 5 6 7 . . . 98 99 100

import java.util.Scanner;

public class tx1 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
    System.out.print("Enter the end value :");
    int a = sc.nextInt();
    int i;
    for(i=1;i<=a;i++){
        System.out.print(i+" ");
        }
 
}

}

// Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99

import java.util.Scanner;

public class tx1 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
    System.out.print("Enter the end value :");
    int a = sc.nextInt();
    int i;
    for(i=1;i<=a;i++){
        if(i%2!=0)
        {
        System.out.print(i+" ");
        }
        }
 
}

}

// Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0

import java.util.Scanner;

public class tx1 {

public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
    System.out.print("Enter the end value :");


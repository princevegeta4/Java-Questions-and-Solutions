package com.company;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Year: ");
        double year=sc.nextDouble();
        if(year%4==0&&(year%400)%4==0&&((year%400)/4)<25){
            System.out.println("Leap year!");
        }
        else if(year%400==0){
            System.out.println("Leap year!");
        }
        else if(year%400!=0){
            System.out.println("Not a leap year!");
        }
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.*;
public class App {
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int x, choice, weight, height;
        double BAC, r;
        System.out.print("Enter a 1 is you are a male or a 2 if you are a female: ");
        choice = n.nextInt();
        if(choice==1)
        {
            r = 0.73;
        }
        else
        {
            r = 0.66;
        }
        System.out.print("How many ounces of alcohol did you have? ");
        x = n.nextInt();
        System.out.print("What is your weight, in pounds? ");
        weight = n.nextInt();
        System.out.print("How many hours has it been since your last drunk? ");
        height = n.nextInt();
        BAC = x * 5.14 / weight*r - 0.015 * height;
        System.out.println();
        System.out.println("Your BAC is" +BAC);
        if(BAC<=0.08)
        {
            System.out.println("It is legal for you to drive.");
        }
        else
        {
            System.out.println("It is not legal for you to drive.");
        }



    }
}

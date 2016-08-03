package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base;
        int number;


        Scanner console = new Scanner(System.in);

        System.out.println("Please enter the base");
        base = console.nextInt();

        System.out.println("Please enter the number to be converted");
        number = console.nextInt();

        System.out.println(number + " in base " + base + " is " + formatToBase(number, base));
    }

    public static String formatToBase(int number, int base)
    {
        if (number < 0)
        {
            System.out.println("The number entered is negative.");
            return null;
        }

        if ( !((base == 2) || (base == 10) || (base == 16)) )
        {
            System.out.println("The base should be either 2 or 10 or 16.");
            return  null;
        }


        return Converter(number, base);


    }


    public static String Converter(int number, int base)  //recursion
    {
        int quotient = number / base;
        int remainder = number % base;

        if (quotient == 0) // base case
        {
            if (base == 16)
            {
                switch (remainder)
                {
                    case 10: return  "A";
                    case 11: return  "B";
                    case 12: return  "C";
                    case 13: return  "D";
                    case 14: return  "E";
                    case 15: return  "F";
                    default: return Integer.toString(remainder);

                }
            }
            else
                return Integer.toString(remainder);
        }
        else
        {
            if (base == 16)
            {
                switch (remainder)
                {
                    case 10: return Converter(quotient, base) + "A";
                    case 11: return Converter(quotient, base) + "B";
                    case 12: return Converter(quotient, base) + "C";
                    case 13: return Converter(quotient, base) + "D";
                    case 14: return Converter(quotient, base) + "E";
                    case 15: return Converter(quotient, base) + "F";
                    default: return Converter(quotient, base) + Integer.toString(remainder);

                }
            }
            else
                return Converter(quotient, base) + Integer.toString(remainder);
        }
    }

}

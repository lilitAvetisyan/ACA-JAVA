package com.company;

import com.company.Package1.Class1;
//import com.company.Package2.Class1;

public class Example
{
    public static void main(String[] args)
    {
        Class1 obj1 = new Class1();
        com.company.Package2.Class1 obj2 = new com.company.Package2.Class1();
        //this.printPackages();
        System.out.println(obj1.getPackageName());
        System.out.println(obj2.getPackageName());
    }
//    public void printPackages()
//    {
//        System.out.println(obj1.getPackageName());
//        System.out.println(obj2.getPackageName());
//    }
}

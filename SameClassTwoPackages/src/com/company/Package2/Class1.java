package com.company.Package2;

/**
 * Created by Lill on 8/4/16.
 */
public class Class1 {
    public String getPackageName()
    {
        Class c  = this.getClass();
        return c.getPackage().getName();
    }
}

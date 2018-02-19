package com.Ivlev.Stack.Tests;
import com.Ivlev.Stack.Iterator;


public class TestLexem {
    public static void main(String[] args) {
        String str_0 = "1 + 4 ";
        Iterator iterator = new Iterator(str_0);
        while(iterator.Empty() != true) {iterator.ToNext();}
    }
}

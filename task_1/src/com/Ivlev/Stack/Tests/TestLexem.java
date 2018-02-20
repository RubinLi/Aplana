package com.Ivlev.Stack.Tests;
import com.Ivlev.Stack.Iterator;


public class TestLexem {

    public static void main(String[] args) {

        String str_0 = "1 + 4 +3 +3 +4 + " +
                "+";
        Iterator iterator = new Iterator(str_0);
        System.out.println("Проверка определения типа лексем");
        while(iterator.Empty()) {
            /** Проверка парсинга на лексемы*/
       System.out.println("Проверка парсинга на лексемы");
          iterator.ToNext().GetString();
        }
        Iterator iterator_1 = new Iterator(str_0);
        System.out.println("Проверка определения типа лексем");
        while(iterator_1.Empty() ) {
            /**Проверка определения типа лексем*/
            iterator_1.ToNext().GetType();
        }
    }
}

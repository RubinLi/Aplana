package com.Ivlev.Stack;
import com.Ivlev.Stack.Lexem;

public class Iterator {
    private String string;
    private String[] subStr;
    private int count = 0;
    private String delimeter = " ";

    public Iterator(String string) {
        subStr = string.split(this.delimeter);
    }

    public Lexem ToNext() {
        /** Метод возвращающий следущию лексему*/
         Lexem lex = new Lexem(subStr[ this.count++]);
        System.err.println(this.count);

         return lex;}

     public  boolean Empty(){
        /** Метод проверяющий конец перебора лексем*/
         return(this.count  == subStr.length)? true :false;

     }
}




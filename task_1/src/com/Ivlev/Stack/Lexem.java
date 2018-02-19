package com.Ivlev.Stack;


public class Lexem {
    private String  string;
    private TypeLexem type;
    enum TypeLexem {
        sum, number
    }
    public Lexem(String string){
       this.string = string;}

     public void GetString(){
         System.err.println(this.string+'/');
        }

     public     void GetType(){
        switch (this.string){
            case "+": System.out.println("+");
                break;
            default:
                System.out.println(Double.parseDouble(this.string));
                break;
        }
     }
    }


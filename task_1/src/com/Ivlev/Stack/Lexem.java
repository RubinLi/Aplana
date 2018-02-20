package com.Ivlev.Stack;

enum   TypeLexem {
        operator, number
        }

public class Lexem {
    /**
     * Реализация Анализатора лексем                    !
     * date            -  храним значения числа
     * Type  - тип лексемы из словаря
     * TypeLexem
     */

    private double data;
    private String  string;
    private String sign;
    private TypeLexem type;

    public Lexem(String string){
       this.string = string;}

     public void GetString(){
         /**Проверочный метод,возвращает лексему.*/
         System.err.println(this.string);
        }
    public Double GetData(){
        /**метод,возвращает значение числа*/
        return this.data ;}

    public String  GetSign(){
        /**метод,возвращает значение числа*/
        return this.sign;}

     public TypeLexem  GetType(){
         /** Метод,возвращает тип лексемы.*/
        switch (this.string){
                case "+":  this.type = TypeLexem.operator ;
                this.sign = this.string;
                break;
            default:
                this.data  = Double.parseDouble(this.string);
                //без исключений только позитивные кейсы
                this.type = TypeLexem.number;
                break;
        }
        return this.type;
     }
    }


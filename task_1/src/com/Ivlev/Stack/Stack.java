package com.Ivlev.Stack;

public class Stack  implements SimpleStack {
    /**
     * Реализация простого стека
     * ограниченной длинны
     * (в текушей реализации).                       !
     * StackArray - стек
     * size             - размер стека
     */

    private Object[] stackArray;
    private int size =0;
    //Выделить в класс
    public String status;


    public  Stack(int stackSize) {
        //  Исключения
        if (stackSize  < 0 | stackSize > 1000)
            { System.err.println("Ошибка создания стека: размер неверен: "+stackSize);
            String status = "err";
            }
        else
           {this.stackArray = new Object[stackSize];
             this.size = 0;}
           }

    @Override
    public void Push(Object object) {
        this.stackArray[1] = object;
     //   this.size++;
    }
    //ush(Object elem){
    // stackArray.add(elem);
    ///** Метод добавляющий в стек элемент elem
    // */        }
   @Override
    public int Peek() {
        int a = 1;
        return a;
   }




}


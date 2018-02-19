package com.Ivlev.Stack;

public class Stack  implements SimpleStack {
    /**
     * Реализация простого стека
     * ограниченной длинны
     * (в текушей реализации).                       !
     * StackArray - стек
     * count            - размер стека
     */

    private Object[] stackArray;
    private int count =0;
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
             this.count = 0;}
           }

    @Override
    public void Push(Object object) {
        /** Метод добавляющий в стек элемент object*/
        this.stackArray[this.count++] = object;
    }

    @Override
   /** Метод удаляющий изстека верхний элемент */
    public Object Peek(){
       return stackArray[--this.count];
   }




}


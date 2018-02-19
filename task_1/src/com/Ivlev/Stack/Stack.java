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
    private int count        = 0;
    private int stackSize = 0;
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
             this.count = 0;
             this.stackSize =stackSize;}
           }

    @Override
    public void Push(Object object) {
        /** Метод добавляющий в стек элемент object*/
        if(this.count<=this.stackSize)
              {this.stackArray[this.count++] = object;}
        else
              {System.err.println("Ошибка добавления в стек: стек переолнен:" +stackSize);}
    }

    @Override
   /** Метод возвращающий из стека верхний элемент */
   public Object Peek() {
        return stackArray[this.count-1];
    }

    @Override
    /** Метод удаляющий из стека верхний элемент и возвращающий последний*/
    public Object Pop() {
        if (this.stackSize <= 1)
        { System.err.println("Ошибка удаления из стека: стек пуст:" + stackSize);
        //как быть без исключения...подумать                        !
        }
        return stackArray[--this.count];
    }

    @Override
    /** Метод определяющий пустоту стека*/
    public boolean Empty() {
        return(this.count ==0)? true :false;
    }
}


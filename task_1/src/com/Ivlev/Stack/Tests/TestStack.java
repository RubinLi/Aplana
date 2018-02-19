package com.Ivlev.Stack.Tests;

import com.Ivlev.Stack.Stack;
import com.Ivlev.Stack.SimpleStack;


public class TestStack {
        public static void main(String[] args) {
                //как-то оформить в класы c проверками                         !
                //Тест конструктора
                Stack TestStack0 = new Stack(60);
                Stack TestStack1 = new Stack(-50);
                Stack TestStack2 = new Stack(5000);
               //Тест добавления элемента в стек
                String str_0 = new String("1");
                TestStack0.Push(str_0);
               //Тест добавления удаления элемента из стека
                String str_1 = new String("0");
               TestStack0.Push(str_1);
               Object str_2 = TestStack0.Pop();
               System.out.println(str_2.toString());
               Object str_3 = TestStack0.Pop();
               System.out.println(str_3.toString());
             //Тест добавления возврата элемента из стека
               String str_4 = new String("2");
                TestStack0.Push(str_4);
               Object str_5 = TestStack0.Peek();
               System.out.println(str_5.toString());



        }
}


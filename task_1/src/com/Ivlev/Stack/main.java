package com.Ivlev.Stack;
import java.util.Scanner;


public class main {
    /**
     *    Главный класс
     *    обеспечивает запуск калькулаятора
     *    и взаимодействие с пользователем,
     */

    public static void main(String[] args) {
        Help  help=  new Help();
        System.out.print(help.getHelp());
        Scanner scan = new Scanner(System.in);
        String string ="";
        while(true){
            String current = scan.nextLine();
            if(current.equals("="))break;
            string= string.concat(current);
        }
        DropToStack  dropToStack = new DropToStack();
        System.out.println( dropToStack .ToStack(string));
    }
}

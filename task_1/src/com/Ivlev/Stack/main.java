package com.Ivlev.Stack;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
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

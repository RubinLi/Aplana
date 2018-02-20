package com.Ivlev.Stack;


public class DropToStack {
    public static void main(String[] args) {
        /**Заполняем стек значениями впроцессе вычесляя.*/
    System.out.print("===="+ ToStack("1 - 2 + 3 + 5"));
    }
        public static double ToStack (String string){
            Stack operators  = new Stack(100);
            Stack operands   = new Stack(100);
            Iterator iterator = new Iterator(string);
            while (iterator.Empty()) {
                Lexem lec = iterator.ToNext();
                switch (lec.GetType()) {
                    case number:
                        operands.Push( lec.GetData() );
                        System.out.print(lec.GetData());
                        break;
                    case operator:
                        System.out.println(lec.GetSign());
                        Calculate(operators,operands);
                        operators.Push( lec.GetSign());
                        break;
                }
            }
            Calculate(operators,operands);
            return (double) operands.Pop();
        }
        public static void Calculate(Stack operators,Stack operands){
            while (!operators.Empty()){
            double leftOperands=(double) operands.Pop();
            double rightOperands=(double) operands.Pop();
            String operator = (String) operators.Pop();
                switch (operator) {
                    case "+": operands.Push(leftOperands+rightOperands);
                                    break;
                    case "-": operands.Push(leftOperands-rightOperands);                }



           }
           }
        }





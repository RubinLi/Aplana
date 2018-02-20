package com.Ivlev.Stack;


public class DropToStack {
    public static void main(String[] args) {
    System.out.print("===="+ ToStack("1 + 2 + 3"));
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
                        operators.Push( lec.GetSign()); break;


                }
            }
            Calculate(operators,operands);
            return (double) operands.Pop();
        }
        public static void Calculate(Stack operators,Stack operands){
        while (!operators.Empty()){
            //System.err.println("operands.Pop()");
            //System.err.println(!operators.Empty());
            //System.err.println(operators.count);
            //System.err.println(operands.Pop());

           double leftOperands=(double) operands.Pop();
            double rightOperands=(double) operands.Pop();
         //   System.err.println(operands.count);
         String operator = (String) operators.Pop();
          //  System.err.println(operators.count);

           // String operator2 = (String) operators.Pop();
          operands.Push(leftOperands+rightOperands);
           }

        }
        }





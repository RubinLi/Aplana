package com.Ivlev.Stack;


public class DropToStack {

        public  String ToStack (String string){
            Stack operators  = new Stack(100);
            Stack operands   = new Stack(100);
            Iterator iterator = new Iterator(string);
            while (iterator.Empty()) {
                Lexem lec = iterator.ToNext();
                switch (lec.GetType()) {
                    case number:
                        operands.Push( lec.GetData() );
                    //    System.err.println( lec.GetData());
                        break;
                    case operator:
                        //System.err.println( Prior(lec.GetSign())+ " "+lec.GetSign());
                        Calculate(operators,operands,Prior(lec.GetSign()));
                        operators.Push( lec.GetSign());
                        break;
                }
            }
            Calculate(operators,operands,0);
            return String.format("%4f", operands.Pop());
        }

        public  void Calculate(Stack operators,Stack operands, int priory){
            while (!operators.Empty() && Prior( (String) operators.Peek()) >= priory){
            double leftOperands    = (double) operands.Pop();
            double rightOperands = (double) operands.Pop();
            String operator               = (String  ) operators.Pop();
                 switch (operator) {
                    case "+": operands.Push(leftOperands+rightOperands);
                                    break;
                    case "-": operands.Push(leftOperands-rightOperands);
                                   break;
                   case "*": operands.Push(leftOperands*rightOperands);
                                    break;
                   case "/": operands.Push(rightOperands/ leftOperands);       break;         }
            }
           }
           public  int Prior(String sign){
               int prior =0;
               switch (sign) {
                  case "+": prior =1;break;
                  case "-": prior =1;break;
                  case "*":prior =2;break;
                  case "/": prior =2;break;
                }
                return prior;
           }
       }





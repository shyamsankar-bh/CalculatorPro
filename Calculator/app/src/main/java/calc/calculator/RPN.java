package calc.calculator;

/**
 * Created by shyam on 12/12/2017.
 */
import java.util.*;

public class RPN {

    /**
     * Computes the outcome of a given expression in Reverse Polish Notation
     *
     * @param expr the expression to compute
     */
    public static Double compute(String expr) throws
            ArithmeticException {
        Stack<Double> stack = new Stack<>();

       /* System.out.println(expr);
        System.out.println("Input\tOperation\tStack after");
*/
        for (String token : expr.split("\\s+")) {
            ///System.out.print(token + "\t");
            switch (token) {
                case "+":
                  //  System.out.print("Operate\t\t");
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    //System.out.print("Operate\t\t");
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                 //   System.out.print("Operate\t\t");
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                 //   System.out.print("Operate\t\t");
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                case "%":
                //    System.out.print("Operate\t\t");
                    double dividend = stack.pop();
                    stack.push(stack.pop() % dividend);
                    break;
                case "^":
                 //   System.out.print("Operate\t\t");
                    double exponent = stack.pop();
                    stack.push(Math.pow(stack.pop(), exponent));
                    break;
                default:
                 //   System.out.print("Push\t\t");
                    stack.push(Double.parseDouble(token));
                    break;
            }

         //   System.out.println(stack);
        }

     //   System.out.println("Final Answer: " + stack.pop());
        return stack.pop();
    }
    public static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }
}
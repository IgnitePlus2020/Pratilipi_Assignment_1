/*
INFIX EVALUATION
Using in-built stack class with push(), pop(), peek(), empty() and search() methods.
Running a loop through the expression to read one token at a time. If the current token is a operand,
push into OpndStack. If it is an operator or left paranthesis, push into OptrStack. If it is right
paranthesis then pop from OptrStack until left paranthesis and for each operator popped, pop two operands
and push the result into OpndStack.
 */
import java.util.Scanner;
import java.util.Stack;

public class Exp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an expression:");
        String exp = in.nextLine();
        Exp i = new Exp();
        System.out.println("The value of expression is " + i.getValue(exp));
    }

    public int getValue(String expression) {
        if (expression == null || expression.length() == 0) return 0;
        Stack<Character> OptrStack = new Stack();
        Stack<Integer> OpndStack = new Stack<>();
        int digit = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == ' ') continue;
            else if (Character.isDigit(c)) {
                digit = c - '0';  //convert character c to integer
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    digit = digit * 10 + (expression.charAt(++i) - '0');    //If the value consists of more than one digit
                }
                OpndStack.push(digit);
            } else if (isOpeator(c)) {
                while (!OptrStack.isEmpty() && hasPrecedence(c, OptrStack.peek())) {
                    OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
                }
                OptrStack.push(c);
            } else if (c == '(') {
                OptrStack.push(c);
            } else if (c == ')') {
                while (OptrStack.peek() != '(') {
                    OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
                }
                OptrStack.pop();
            }
        }
        while (!OptrStack.isEmpty()) {
            OpndStack.push(applyOperation(OptrStack.pop(), OpndStack.pop(), OpndStack.pop()));
        }
        return OpndStack.pop();
    }

    public boolean isOpeator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    public int applyOperation(char optr, int a, int b) {
        switch (optr) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                return b / a;
        }
        return 0;
    }

    public boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
}

/*
Enter an expression:
5+5+(2*4)-(2/2)
The value of expression is 17
 */
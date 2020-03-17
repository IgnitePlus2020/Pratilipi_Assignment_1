import java.util.*;
public class Exp {
    static int top;
    static int size;
    static char[] stack;
    public Exp()
    {
        size = 30;
        stack = new char[size];
        top = -1;
    }
    public static void push(char value)
    {
        top += 1;
        stack[top] = value;
    }
    public static char pop()
    {
        return stack[top--];
    }
    public static String evaluate(String exp)
    {
        char ch, opt;
        int op1, op2;
        Exp optr = new Exp();
        Exp opnd = new Exp();
        optr.push('#');
        for( int i=0; i<exp.length(); i++)
        {
            ch = exp.charAt(i);
            switch(ch)
            {
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String exp;
        int i, value;
        System.out.println("Enter an expression:");
        exp = in.nextLine();
        System.out.println("Result:\t" + evaluate(exp));
    }
}

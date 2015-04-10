
package maincalc;
import java.io.IOException;

public class Calc {
    private static final String plus = "+";
    private static final String sub = "-";
    private static final String mult = "*";
    private static final String pow = "^";
    private static final String div = "/";
    private static final String sqrt = "sqrt";
    
    public void Calculation(int a, int b, String op) throws IOException 
    {
        switch(op) {
            case plus:
                System.out.println("Результат: ");
                System.out.println(Plus(a, b));
                break;
            case sub:
                System.out.println("Результат: ");
                System.out.println(Sub(a,b));
                break;
            case mult:
                System.out.println("Результат: ");
                System.out.println(Mult(a,b));
                break;
            case div:
                System.out.println("Результат: ");
                System.out.println(Div(a,b));
                break;
            case pow:
                System.out.println("Результат: ");
                System.out.println(Pow(a,b));
                break;
            default:
                throw new IOException("Invalid operation");

        }
    }
    public void Calculaton(int a, String op) throws IOException
    {
        switch (op) {
            case sqrt:
                System.out.println("Результат: ");
                System.out.println(Sqrt(a)); 
                break;
            default:
                throw new IOException("Invalid operation");
        }
    }
    
    public int Plus(int a, int b)
    {
        return a+b;
    }
    public int Sub (int a, int b)
    {
        return a-b;
    }
    public int Mult(int a, int b)
    {
        return a*b;
    }
    public double Div(int a, int b)
    {
        return a/b;
    }
    public double Pow(int a, int b)
    {
        return Math.pow(a, b);
    }
    public double Sqrt(int a)
    {
        return Math.sqrt(a);
    }
    
}


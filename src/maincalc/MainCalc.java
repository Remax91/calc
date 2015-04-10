package maincalc;
import java.io.IOException;
import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        Scanner opscan = new Scanner(System.in);
        
        System.out.println("Введите число");
        int a = scan.nextInt();
        
        System.out.println("Введите операцию");
        String operation = opscan.nextLine();
        
        Calc cl = new Calc();
        
        if (operation.equals("sqrt")) {
            cl.Calculaton(a, operation);
        }
        else {
            System.out.println("Введите второе число");
            int b = scan.nextInt();
            cl.Calculation(a, b, operation);
        }
        

        }


    }

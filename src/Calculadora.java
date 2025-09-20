

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el operador (+ - * /): ");
        char signo = sc.next().charAt(0);

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        

        double resultado = 0;

        switch (signo) {
            case '+': 
            	resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': 
                if (num2 != 0) {
                	resultado = num1 / num2;
                	
                }	
                else System.out.println("No se puede dividir entre 0");
                break;
            default: 
                System.out.println("Operador no válido");
                return;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}

import java.io.*;
import java.util.Scanner;

public class LanzarCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
         
            ProcessBuilder pb = new ProcessBuilder("java", "-jar", "CalculadoraXX.jar");
            Process proceso = pb.start();

            OutputStream os = proceso.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            InputStream is = proceso.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            InputStream es = proceso.getErrorStream();
            BufferedReader brErr = new BufferedReader(new InputStreamReader(es));

        
            System.out.print("Introduce el primer número: ");
            pw.println(sc.nextLine());

            System.out.print("Introduce el operador (+ - * /): ");
            pw.println(sc.nextLine());

            System.out.print("Introduce el segundo número: ");
            pw.println(sc.nextLine());

           
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

           
            String err;
            while ((err = brErr.readLine()) != null) {
                System.err.println(err);
            }

            proceso.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
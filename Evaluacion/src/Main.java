import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner s= new Scanner(System.in);
        Calculadora c= new Calculadora();
        for (int i=0; i<5; i++) {
            System.out.println("Ingrese primer valor: ");
            c.setNum_1(s.nextInt());
            System.out.println("Ingrese segundo valor: ");
            c.setNum_2(s.nextInt());
            System.out.println("Ingrese operacion (+ - * /): ");
            String x = s.next();
            c.validarOperacion(x);
        }

    }
}

public class Calculadora {
    public int num_1;
    public int num_2;

    public Calculadora() {
    }

    public int getNum_1() {
        return num_1;
    }

    public void setNum_1(int num_1) {
        this.num_1 = num_1;
    }

    public int getNum_2() {
        return num_2;
    }

    public void setNum_2(int num_2) {
        this.num_2 = num_2;
    }

    public void validarOperacion(String operador) {
        if (operador.equals("+")) {
            suma();
        } else if (operador.equals ("-")) {
            resta();
        } else if (operador.equals ("*")) {
            multiplicacion();
        } else if (operador.equals ("/")) {
            division();
        } else {
            System.out.println("Operación no válida");

        }
    }
    public void suma() {
        System.out.println("Resultado: " + (num_1 + num_2));
    }
    public void resta() {
        System.out.println("Resultado: " + (num_1 - num_2));
    }
    public void multiplicacion() {
        System.out.println("Resultado: " + (num_1 * num_2));
    }
    public void division() {
        System.out.println("Resultado: " + (num_1 / num_2));
    }
}

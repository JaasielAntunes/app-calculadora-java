package principal;

import br.edu.fafic.es.classes.Calculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(100, 100);
        System.out.print("Resultado da soma: " + calc.soma());
    }
}

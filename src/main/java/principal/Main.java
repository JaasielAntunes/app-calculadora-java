package principal;

import br.edu.fafic.es.classes.Calculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(100, 100);

        System.out.print("Resultado da soma: " + calc.soma());
        System.out.println();

        System.out.print("Resultado da divisão: " + calc.divisao());
        System.out.println();

        System.out.print("Resultado da subtração: " + calc.subtracao());
        System.out.println();

        System.out.print("Resultado da multiplicação: " + calc.multiplicacao());
    }
}

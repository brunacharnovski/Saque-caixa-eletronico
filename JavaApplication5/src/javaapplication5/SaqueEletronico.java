package javaapplication5;

/*
 * @author Bruna Charnovski
 */
public class SaqueEletronico {

    public static void main(String[] args) {
        int valor = 25;
        int[] notas = new int[]{2, 5, 10, 20, 50, 100};
        int[] notasUsadas;
        notasUsadas = new int[notas.length];
        int qtNotas = notas.length - 1;

        for (int i = qtNotas; i >= 0; i--) {
            if (valor % notas[i] == 0) {
                System.out.println(valor / notas[i] + " nota(s) de " + notas[i]);
            }

        }
    }

}

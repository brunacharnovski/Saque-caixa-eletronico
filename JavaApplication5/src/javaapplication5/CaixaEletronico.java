package javaapplication5;

/*
 * @author Bruna Charnovski
 */
public class SaqueEletronico {

    public static void calcular(int saque) {
        //Scanner valorSaque = new Scanner(System.in)
        int[] cedulas = {100, 50, 25, 10, 5, 2};
        //System.out.println("Digite o valor para saque");
        //int valorSaque = valorSaque.nextInt());
        int valorSaque = 12;

        for (int i = 0; i < cedulas.length; i++) {
            if (saque >= cedulas[i]) {
                System.out.println(saque / cedulas[i] + " notas de " + cedulas[i]);
                saque = saque % cedulas[i];
            }

        }
    }

    public static void main(String[] args) {
        calcular(12);

    }
}

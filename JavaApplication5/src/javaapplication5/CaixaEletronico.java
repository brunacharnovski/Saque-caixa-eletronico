package javaapplication5;

/*
 * @author Bruna Charnovski
 */
public class CaixaEletronico {

    static int[] notas = new int[]{2, 5, 10, 20, 50, 100};
    public static void main(String[] args) {

        int[] valor = funcao(19);
        imprimeVetor(notas);
        imprimeVetor(valor);

    }

    public static int[] funcao(int x) {
        
        int[] retorno = new int[]{0, 0, 0, 0, 0, 0};
        for (int j = notas.length - 1; j >= 0; j--) {
            int n = notas[j];
            if (n <= x) {
                int i = x / n;
                int r = x % n;
                retorno[j] = i;
                if (r == 1) {
                    System.out.println("Valor inválido");
                    break;
                } else if (r > 1) {
                    int[] fr = funcao(r);
                    retorno = somaVetor(retorno, fr);
                    break;
                }
            }

        }
        

        return retorno;
    }

    public static void imprimeVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {

            System.out.print(vet[i] + " ");
        }
        System.out.println("");
    }

    public static int[] somaVetor(int[] vetA, int[] vetB) {
        int[] vetResult = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < vetResult.length - 1; i++) {
            vetResult[i] = vetA[i] + vetB[i];

        }
        return vetResult;
    }

}

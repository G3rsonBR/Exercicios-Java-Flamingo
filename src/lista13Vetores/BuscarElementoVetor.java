package lista13Vetores;

public class BuscarElementoVetor {
    public static void main(String[] args) {
        int[] vetor = {3, 6, 9, 12, 15};
        int buscar = 9;
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == buscar) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println(buscar + " está presente no vetor.");
        } else {
            System.out.println(buscar + " não foi encontrado no vetor.");
        }
    }
}

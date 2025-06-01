package lista13Vetores;
import java.util.HashMap;
import java.util.Map;

public class FrequenciaElementosVetor {
    public static void main(String[] args) {
        int[] vetor = {2, 3, 2, 4, 3, 2, 5};
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int i = 0; i < vetor.length; i++) {
            frequencia.put(vetor[i], frequencia.getOrDefault(vetor[i], 0) + 1);
        }

        System.out.println("Frequência dos elementos:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

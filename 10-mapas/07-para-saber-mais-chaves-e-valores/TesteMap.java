import java.util.*;
import java.util.Map.Entry;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        nomesParaIdade.keySet()
            .forEach(System.out::println);

        nomesParaIdade.values()
            .forEach(System.out::println);

        nomesParaIdade.entrySet()
            .forEach(entrySet -> System.out.println(entrySet.getKey() + " - " + entrySet.getValue()));
    }
}
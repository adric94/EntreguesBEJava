package exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> llista = Arrays.asList("Hola", "Coding", "Java", "Lambda", "o2");

        List<String> result = llista.stream()
                .filter(str -> str.contains("o") && str.length() > 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}




package exercici6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> llista = new ArrayList<Object>();
        llista.add(3);
        llista.add("mot");
        llista.add("rat-penat");
        llista.add("superlarguíssim");
        llista.add("llarguíssim");

        Comparator<Object> comparador = (Object o1, Object o2) -> {
            if (o1 instanceof String && o2 instanceof String) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return Integer.compare(s1.length(), s2.length());
            } else {
                return 0;
            }
        };

        Collections.sort(llista, comparador);

        System.out.println(llista);
    }
}
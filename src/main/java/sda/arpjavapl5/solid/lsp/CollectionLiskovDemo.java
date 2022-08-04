package sda.arpjavapl5.solid.lsp;
import java.util.Collections;
import java.util.List;

public class CollectionLiskovDemo {
    public static void main(String[] args) {
        //Wydaje się, że naruszona jest zasada Liskov, ale w dokumentacji List jest
        //zgłaszanie wyjątku przez add!!!
        //Naruszona jest także zasada ISP, bo metody add, remove i set nie są implementowane!!!
        List<String> names = Collections.unmodifiableList(List.of("Ewa"));

        names.add("Adam");
        names.add("Karol");
        names.forEach(System.out::println);
    }
}

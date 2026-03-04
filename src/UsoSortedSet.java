import java.util.SortedSet;
import java.util.TreeSet;

public class UsoSortedSet {
    public static void main(String[] args) {

        SortedSet<String> tags = new TreeSet<>();

        tags.add("Eletrônicos");
        tags.add("Abajur");
        tags.add("Zigue-zague");
        tags.add("Moda");
        tags.add("Beleza");

        System.out.println("--- Filtro de Tags ---");
        System.out.println(tags);

        System.out.println("\nPrimeira tag do filtro: " + tags.first());
        System.out.println("Última tag do filtro: " +  tags.last());

    }
}

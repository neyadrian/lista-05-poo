import java.util.Scanner;
import java.util.Set;

public class UsoHashSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> listaIps = new java.util.HashSet<>();
        String ip;

        System.out.println("--- Sistema de Segurança ---");
        System.out.println("Digite 10 IPs:");

        for (int i = 0; i < 10; i++) {
            System.out.printf("IP %d: ", i + 1);
            ip = sc.nextLine();

            listaIps.add(ip);
        }

        System.out.println("\n--- Relatório Final ---");
        System.out.println("Total de IPs únicos detectados: " + listaIps.size());

        System.out.println("Lista de IPs que tentaram acesso:");
        for (String ips: listaIps) {
            System.out.println(ips);
        }

        sc.close();
    }
}

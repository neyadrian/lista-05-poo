import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class UsoSortedMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> historico = new TreeMap<>();

        historico.put(502, "Login do Adm");
        historico.put(101, "Falha na conexão com o Banco");
        historico.put(305, "Alteração de senha");
        historico.put(200, "Exportação de relatório mensal");
        historico.put(150, "Acesso negado");
        historico.put(600, "Backup concluído");

        System.out.println("--- Histórico Completo ---");
        for (Map.Entry<Integer, String> evento : historico.entrySet()) {
            System.out.println("ID: " + evento.getKey() + " | Evento: " + evento.getValue());
        }

        SortedMap<Integer, String> auditoria = historico.subMap(100, 400);

        System.out.println("\n--- Auditoria: Eventos entre ID 100 e 400 ---");
        for (Map.Entry<Integer, String> evento : auditoria.entrySet()) {
            System.out.println("ID: " + evento.getKey() + " | Descrição: " + evento.getValue());
        }
    }
}

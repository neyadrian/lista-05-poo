import java.util.Map;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> funcionarios = new java.util.HashMap<>();
        String cargo, cpf;

        System.out.println("--- Cadastro de funcionarios ---");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Funcionario %d\n", i + 1);
            System.out.print("CPF: ");
            cpf = sc.nextLine();
            System.out.print("Cargo: ");
            cargo = sc.nextLine();
            funcionarios.put(cpf, cargo);
        }

        System.out.println("--- Buca de Cargos ---");

        System.out.println("Digite o CPF do funcionario: ");
        String buscaCpf = sc.nextLine();

        String buscaCargo = funcionarios.get(buscaCpf);

        if (buscaCargo != null) {
            System.out.println("Cargo encontrado: " + buscaCargo);
        } else {
            System.out.println("Funcionário não encontrado.");
        }

        sc.close();
    }
}

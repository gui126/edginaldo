import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lista2 {
    public static void main(String[] args) {

        List<String> Nome = new ArrayList<>();
        List<Integer> Matricula = new ArrayList<>();
        List<Integer> DataDeNascimento = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome");
            Nome.add(sc.nextLine());
        }
        for (int j = 0; j < 3; j++) {
            Matricula.add(j);
        }
        for (int k = 0; k < 3; k++) {
            System.out.println("Digite a data de nascimento");
            DataDeNascimento.add(sc.nextInt());
        }
    }
}

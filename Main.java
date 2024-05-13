import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("segunda-feira");
        lista.add("terça-feira");
        lista.add("quarta-feira");
        lista.add("quinta-feira");

        System.out.println("A lista é:");

        System.out.println("lista");

        String Y = lista.remove(2);

        System.out.println("o elemento removido da lista foi " + Y);

        String x = lista.set(0,"sexta-feira");

        System.out.println("A lista atualizada é " + x);
        String elemento = lista.get(2);
        System.out.println("o último elemento da lista é: " + elemento);
        }
    }

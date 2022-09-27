import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("due");
        for (String nome : lista) {
            System.out.println(nome);
        }
    }
}
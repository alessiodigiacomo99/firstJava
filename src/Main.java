import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("due");
        for (String nome : lista) {
            System.out.println(nome);
        }
        String prova = "prova";
        char[] caratteri = prova.toCharArray();
        for (char carattere : caratteri) {
            System.out.println(carattere);
        }
        /*for (int i = 0; i < caratteri.length; i++) {
            System.out.println(caratteri[i]);
        }*/

        Drawable lambda = (String itemToPrint) -> {
            System.out.println(itemToPrint);
        };

        lambda.drawable(prova);

    }
}
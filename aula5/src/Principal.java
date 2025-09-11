
import java.util.ArrayList;



public class Principal {
    public static void main(String[] args) {
        ArrayList<String> disciplinas = new ArrayList<>();
        disciplinas.add("Cálculo II");
        disciplinas.add("Programação Orientada a Objetos");
        disciplinas.add("Banco de Dados II");
        disciplinas.add("Engenharia de Software");

        System.out.println(disciplinas);
        System.out.println(disciplinas.get(2));

        disciplinas.set(3, "Engenharia de Software II");
        System.out.println(disciplinas);

        disciplinas.remove(2);
        System.out.println(disciplinas);

        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println(disciplinas.get(i)); 
        }

    }
}
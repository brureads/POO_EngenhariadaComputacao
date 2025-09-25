
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class biblioteca {

    private String nome;
    private final ArrayList<livro> livros;

    public biblioteca(String n) {
        this.nome = n;
        this.livros = new ArrayList<>();
    }

    public biblioteca(String n, livro l) {
        this(n);
        adicionarLivro(l);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void adicionarLivro(livro l) {
        if (l == null) {
            throw new IllegalArgumentException("Livro não pode ser nulo");
        }
        livros.add(l);  
    }

    public boolean removerLivro(livro l) {
        return livros.remove(l);
    }

    public List<livro> getLivros() {
        return Collections.unmodifiableList(livros);
    }
}

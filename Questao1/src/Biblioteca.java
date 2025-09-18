public class Biblioteca {
    
    private String nome;
    private Livro livro;

    public Biblioteca(String n, Livro l) {
        nome = n;
        livro = l;
    }

    public String getNome() {
        return nome;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setLivro(Livro l) {
        livro = l;
    }
}
 
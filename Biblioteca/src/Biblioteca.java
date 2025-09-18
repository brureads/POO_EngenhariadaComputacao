public class Biblioteca {
    private String nome;
    private Livro livro; // agregação

    public Biblioteca(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public Livro getLivro() {
        return livro;
    }

    public void adicionarLivro(Livro l) {
        livro = l;
    }
}

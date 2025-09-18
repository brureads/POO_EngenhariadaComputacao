public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        Biblioteca b1 = new Biblioteca("Biblioteca Central");

        b1.adicionarLivro(l1);

        System.out.println("Biblioteca: " + b1.getNome());
        System.out.println("Livro: " + b1.getLivro().getTitulo());
        System.out.println("Autor: " + b1.getLivro().getAutor());
        System.out.println("Ano: " + b1.getLivro().getAnoPublicacao());
    }
}


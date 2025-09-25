public class principal {
    public static void main(String[] args) {
        livro l1 = new livro("O Senhor dos Aneis", "J. R. R. Tolkien", 1954);
        livro l2 = new livro("O Hobbit", "J. R. R. Tolkien", 1937);

        biblioteca b1 = new biblioteca("Biblioteca Central");
        b1.adicionarLivro(l1);
        b1.adicionarLivro(l2);

        System.out.println("Biblioteca: " + b1.getNome());
        for (livro livro : b1.getLivros()) {
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano: " + livro.getAnoPublicacao());
            System.out.println("---");
        }
    }
}

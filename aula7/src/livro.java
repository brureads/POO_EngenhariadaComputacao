public class livro {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public livro(String t, String a, int ano) {
        this.titulo = t;
        this.autor = a;
        this.anoPublicacao = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

}

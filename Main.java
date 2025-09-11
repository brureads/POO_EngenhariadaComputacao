import java.time.LocalDate;
import java.time.Month;

// ===== Classe abstrata (mãe) =====
abstract class Material {
    private final String titulo;
    private final int anoPublicacao;

    private boolean emprestado = false;
    private String emprestadoPara = null;
    private LocalDate dataEmprestimo = null;

    protected Material(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    // ---- Métodos "de negócio" (concretos) ----
    public final boolean emprestar(String para) {
        if (emprestado) return false; // já está emprestado
        this.emprestado = true;
        this.emprestadoPara = para;
        this.dataEmprestimo = LocalDate.now();
        onEmprestar(); // gancho opcional p/ as filhas
        return true;
    }

    public final boolean devolver() {
        if (!emprestado) return false; // não estava emprestado
        this.emprestado = false;
        this.emprestadoPara = null;
        this.dataEmprestimo = null;
        onDevolver(); // gancho opcional p/ as filhas
        return true;
    }

    // Ganchos opcionais (as filhas podem sobrescrever se quiserem)
    protected void onEmprestar() { }
    protected void onDevolver() { }

    // ---- Abstratos (cada filha implementa) ----
    public abstract String getTipo();
    protected abstract String getDetalhesEspecificos();

    // ---- Getters úteis ----
    public String getTitulo() { return titulo; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public boolean isEmprestado() { return emprestado; }
    public String getEmprestadoPara() { return emprestadoPara; }
    public LocalDate getDataEmprestimo() { return dataEmprestimo; }

    @Override
    public String toString() {
        String status = emprestado
                ? "EMPRESTADO para " + emprestadoPara + " em " + dataEmprestimo
                : "DISPONÍVEL";
        return String.format(
            "[%s] \"%s\" (%d) - %s | %s",
            getTipo(), titulo, anoPublicacao, getDetalhesEspecificos(), status
        );
    }
}

// ===== Subclasses =====
class Livro extends Material {
    private final String autor;
    private final int numeroPaginas;

    public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() { return autor; }
    public int getNumeroPaginas() { return numeroPaginas; }

    @Override
    public String getTipo() { return "Livro"; }

    @Override
    protected String getDetalhesEspecificos() {
        return "Autor: " + autor + ", Páginas: " + numeroPaginas;
    }
}

class Revista extends Material {
    private final int edicao;
    private final Month mesPublicacao;

    public Revista(String titulo, int anoPublicacao, int edicao, Month mesPublicacao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }

    public int getEdicao() { return edicao; }
    public Month getMesPublicacao() { return mesPublicacao; }

    @Override
    public String getTipo() { return "Revista"; }

    @Override
    protected String getDetalhesEspecificos() {
        return "Edição: " + edicao + ", Mês: " + mesPublicacao;
    }
}

class Tese extends Material {
    private final String autor;
    private final String cursoOrigem;

    public Tese(String titulo, int anoPublicacao, String autor, String cursoOrigem) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.cursoOrigem = cursoOrigem;
    }

    public String getAutor() { return autor; }
    public String getCursoOrigem() { return cursoOrigem; }

    @Override
    public String getTipo() { return "Tese"; }

    @Override
    protected String getDetalhesEspecificos() {
        return "Autor: " + autor + ", Curso: " + cursoOrigem;
    }
}

// ===== Main: simulação de empréstimos e devoluções =====
public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Engenharia de Software", 2010, "Ian Sommerville", 840);
        Revista r1 = new Revista("IEEE Spectrum", 2025, 9, Month.SEPTEMBER);
        Tese t1 = new Tese("Sistemas Distribuídos no Brasil", 2023, "Alice Santos", "Engenharia da Computação");

        System.out.println("=== Acervo inicial ===");
        System.out.println(l1);
        System.out.println(r1);
        System.out.println(t1);

        System.out.println("\n=== Empréstimos ===");
        System.out.println("Emprestar livro p/ Bru: " + l1.emprestar("Bru"));
        System.out.println("Emprestar revista p/ Artur: " + r1.emprestar("Artur"));
        System.out.println("Tentar emprestar o mesmo livro de novo (deve falhar): " + l1.emprestar("Outra pessoa"));

        System.out.println("\n=== Status após empréstimos ===");
        System.out.println(l1);
        System.out.println(r1);
        System.out.println(t1);

        System.out.println("\n=== Devoluções ===");
        System.out.println("Devolver revista: " + r1.devolver());
        System.out.println("Devolver tese (não estava emprestada, deve falhar): " + t1.devolver());

        System.out.println("\n=== Status final ===");
        System.out.println(l1);
        System.out.println(r1);
        System.out.println(t1);
    }
}

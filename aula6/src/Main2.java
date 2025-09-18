public class Main2 {
    
    public static void main(String[] args) {
   
        Endereco e2 = new Endereco();
        e2.setCep("70765-591");
        e2.setLogradouro("Av das Araucarias 4155");
        e2.setNumero(302);

        String nome = "Bruna Moura";
        String ra = "2201234567";

        Aluno a2 = new Aluno(nome,ra, e2);
    
        System.out.println(a2.getNome());
        System.out.println(a2.getEndereco().getLogradouro());
        System.out.println(a2.getRa());
}
}



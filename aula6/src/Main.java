public class Main {
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Artur Dornfeld");
        a1.setRa("12345");

        Endereco e1 = new Endereco();
        e1.setLogradouro("SQN 412 Bloco C");
        e1.setNumero(302);
        e1.setCep("70765-541");

        a1.setEndereco(e1);

        System.out.println("Nome: " + a1.getNome());
        System.out.println("RA: " + a1.getRa());
        System.out.println("Logradouro: " + a1.getEndereco().getLogradouro());
    }

  
    }

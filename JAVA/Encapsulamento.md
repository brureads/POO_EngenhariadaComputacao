# Encapsulamento

No paradigma de **Programação Orientada a Objetos (POO)**, encapsulamento é o conceito de **esconder os detalhes internos de uma classe** e **proteger os dados**, permitindo acesso apenas através de métodos controlados.


> É como uma **caixa**: você pode usar botões para interagir com ela, mas não vê nem altera diretamente como funciona por dentro.


### Principais pontos do Encapsulamento

1. **Atributos privados (`private`)**
    - Impedem acesso direto de fora da classe.
2. **Métodos públicos (`getters` e `setters`)**
    - Controlam como os atributos são lidos e modificados.
3. **Protege dados**
    - Garante que não sejam alterados de forma incorreta.
4. **Facilita manutenção**
    - Mudanças internas não afetam quem usa a classe.

```java
public class ContaBancaria {
    // Atributos privados (não acessíveis diretamente de fora da classe)
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter para titular
    public String getTitular() {
        return titular;
    }

    // Setter para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Método controlado para alterar o saldo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}

```

- uso da classe

```java
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Bruna", 1000);

        // Acesso indireto via métodos
        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
```
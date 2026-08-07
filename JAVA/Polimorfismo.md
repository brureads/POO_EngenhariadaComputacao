# Polimorfismo

### O que é polimorfismo?

A palavra vem do grego:

- *poly* = muitos
- *morphos* = formas

Ou seja, **“muitas formas”**.

Na prática, em POO significa que **um mesmo método pode ter comportamentos diferentes dependendo do objeto que o chama**.

### Tipos principais:

1. **Polimorfismo de sobrecarga (compile-time / estático):**
    
    Quando dois métodos têm **o mesmo nome**, mas mudam nos **parâmetros** (quantidade ou tipo).
    
    → Exemplo: `somar(int a, int b)` e `somar(double a, double b)`.
    
2. **Polimorfismo de sobrescrita (runtime / dinâmico):**
    
    Quando uma **subclasse reimplementa** um método da superclasse.
    
    → Exemplo:
    
    - Classe `Animal` tem método `falar()`.
    - Classe `Cachorro` sobrescreve para latir.
    - Classe `Gato` sobrescreve para miar.
        
        Assim, o mesmo método (`falar`) assume **formas diferentes**.
        

### Curiosidade prática:

É por causa do polimorfismo que conseguimos escrever código **mais genérico e flexível**.

Exemplo: um método pode receber uma lista de `Animal` e funcionar para `Cachorro`, `Gato`, `Passarinho`... sem precisar saber exatamente qual é qual.

Exemplo clássico com sobrescrita (polimorfismo dinâmico):

```java
// Superclasse
class Animal {
    void falar() {
        System.out.println("O animal faz um som...");
    }
}

// Subclasses sobrescrevendo o método
class Cachorro extends Animal {
    @Override
    void falar() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    @Override
    void falar() {
        System.out.println("Miau!");
    }
}
```

E no main:

```java
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro(); // polimorfismo
        Animal a2 = new Gato();

        a1.falar(); // Saída: "Au au!"
        a2.falar(); // Saída: "Miau!"
    }
}
```
Percebe? O mesmo método falar() tem formas diferentes dependendo do objeto.

- Exemplo com interface (contrato)

```java
interface Voador {
    void voar();
}

class Passaro implements Voador {
    public void voar() {
        System.out.println("O pássaro bate as asas.");
    }
}

class Aviao implements Voador {
    public void voar() {
        System.out.println("O avião acelera e decola.");
    }
}
```
No main:
```java
public class Teste {
    public static void main(String[] args) {
        Voador v1 = new Passaro();
        Voador v2 = new Aviao();

        v1.voar(); // "O pássaro bate as asas."
        v2.voar(); // "O avião acelera e decola."
    }
}
```
- Aqui, o polimorfismo funciona porque a interface garante o contrato: ambos são “Voador”.

> **Sobrecarga de métodos** = polimorfismo estático (compile-time).
 
> **Interfaces** = permitem tratar objetos diferentes de forma uniforme.

  >**Herança + sobrescrita** = polimorfismo dinâmico (runtime).
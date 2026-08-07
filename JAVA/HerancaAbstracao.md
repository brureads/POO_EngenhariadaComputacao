# Herança & Abstração

É quando uma classe **herda características (atributos e métodos)** de outra.

- Classe que passa as coisas = **superclasse** (ou classe base/pai).
- Classe que recebe = **subclasse** (ou classe filha).

```java
class Animal {
    void comer() {
        System.out.println("O animal está comendo...");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Au au!");
    }
}
```

- Cachorro herda de Animal, então pode usar comer() sem precisar reescrever.

## Interfaces

Uma **interface** é como um **contrato**: ela só define **o que deve existir** (métodos), mas não **como funciona**.

- Classes que **implementam** a interface são obrigadas a escrever o código desses métodos.
- Diferente da herança, **uma classe pode implementar várias interfaces**.

```java
interface Voador {
    void voar();
}

class Passaro implements Voador {
    public void voar() {
        System.out.println("O pássaro está voando!");
    }
}

class Aviao implements Voador {
    public void voar() {
        System.out.println("O avião está decolando!");
    }
}
```

- Tanto Passaro quanto Aviao cumprem o contrato de Voador, mas cada um faz de um jeito
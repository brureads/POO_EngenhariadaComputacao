## COMPOSIÇÃO - OBRIGATORIAMENTE

- É um tipo de **relação entre classes**.
- Em vez de uma classe herdar da outra (herança), uma classe **contém** objetos de outra classe.
- A ideia é que uma classe seja formada (“composta”) por outras.

exemplo:

- O carro **tem um motor**.
- Se o carro deixar de existir, o motor também vai embora.

exemplo: 

- Uma pessoa **tem um coração**.
- O coração não vive sem a pessoa.

Composição = quando uma coisa só existe porque faz parte da outra.

O **construtor na composição** serve pra **garantir que a parte (Motor)** seja criada junto com o **todo (Carro)**.


## AGREGAÇÃO - OPCIONAL

- É quando uma classe usa outra, mas **as duas podem existir separadas**.
- Diferente da composição, aqui a parte não depende totalmente do todo

exemplo:

- **Escola e Alunos**:
    
    Uma escola tem alunos, mas se a escola fechar, os alunos continuam existindo.
    
- **Time e Jogadores**:
    
    Um time é formado por jogadores, mas o jogador pode mudar de time ou ficar sem time.
    
- **Biblioteca e Livros**:
    
    A biblioteca guarda livros, mas o livro pode existir sem estar nela.
    

> **Composição**: a parte **morre junto** com o todo.

> **Agregação**: a parte pode **viver sozinha**, o todo só junta elas.


| Conceito | Exemplo | Como funciona | Existe sem o outro? |
|---|---|---|---|
| Herança | Gato é um Animal | Uma classe herda atributos e métodos de outra | Sim, cada classe existe sozinha, mas compartilham características |
| Agregação | Escola tem Alunos | Uma classe “guarda” objetos de outra, mas não cria nem controla eles | ✅ Sim! O aluno pode existir sem a escola |
| Composição | Carro tem Motor | Uma classe cria/gera o objeto da outra no construtor | ❌ Não! O motor só existe porque o carro existe |
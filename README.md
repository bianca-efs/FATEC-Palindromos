Palíndromos

Este projeto em **Java** verifica se uma palavra ou cadeia de caracteres fornecida pelo usuário é um **palíndromo**.

Um **palíndromo** é uma sequência de caracteres que se lê da direita para a esquerda e da esquerda para a direita, sendo a sequência igual nos dois sentidos.
Exemplos: `"arara"`, `"ovo"`, `"subinoonibus"`.

---

Estrutura do Projeto

* **Pacotes:**

  * `controller` – Contém a lógica principal para manipulação de Strings e verificação de palíndromos.
  * `view` – Contém a classe `Main`, responsável pela interação com o usuário.

* **Biblioteca usada:**

  * `PilhaStrings` – Biblioteca criada previamente por mim (https://github.com/bianca-efs/Estudo.de.Pilhas_Criacao.de.biblioteca-String), que fornece métodos `push()`, `pop()` e `isEmpty()` para manipulação de pilhas de Strings.

---

 Classes Principais

 1. `PalindromoController` (package `controller`)

Responsável pelo processamento da palavra.

* **Métodos:**

1. **`invertePalavra(String plv)`**
   Recebe uma `String` e retorna a `String` invertida.
   Utiliza a pilha da biblioteca `PilhaStrings` para inverter a sequência, usando os métodos:

   * `push()` – adiciona cada caractere da palavra na pilha
   * `pop()` – retira os caracteres da pilha na ordem inversa
   * `isEmpty()` – verifica se a pilha está vazia

2. **`comparaPalavras(String plv)`**
   Recebe a `String` original e compara com a `String` invertida.
   Retorna `boolean`:

   * `true` → a palavra é um palíndromo
   * `false` → a palavra não é um palíndromo

---

 2. `Main` (package `view`)

Classe responsável pela interação com o usuário:

* Exibe uma mensagem explicativa sobre palíndromos.
* Solicita ao usuário uma palavra ou cadeia de caracteres.
* Chama os métodos da classe `PalindromoController` para inverter a palavra e verificar se é um palíndromo.
* Exibe o resultado usando um ternário para a mensagem final:

```
System.out.println(ehPalindromo ? "É um Palíndromo" : "Não é um palíndromo!");
```

Observações

* O projeto usa **pilhas** para inverter a palavra, demonstrando o uso prático de estruturas de dados.
* Comparação de palavras é **case-insensitive**, ou seja, não diferencia maiúsculas e minúsculas.
* O código está organizado em **MVC simples** (View + Controller + Biblioteca de Pilha).


#   Sobrecarga

Exercícios de Programação Orientada a Objetos para a prática do conceito de Sobrecarga.



## Exercícios

1 Escreva uma classe chamada Impressora. Essa classe tem como finalidade imprimir
conteúdos diversos na tela. Ela deve possuir diversos métodos chamados exibir. Eles
poderão coexistir graças ao mecanismo conhecido como sobrecarga de métodos.
Escreva versões do método exibir que tenham as seguintes listas de parâmetros.

1.1 um único float.

1.2 dois floats.

1.3 um float e uma String, nessa ordem.

1.4 uma String e um float, nessa ordem.

1.5 três Strings.

1.6 dois ints e uma String, nessa ordem.

Em todo caso, cada método exibir deve exibir todos os valores usando
System.out.println, separando cada um por vírgula.

2 Escreva uma classe de teste que chama cada um dos métodos que você escreveu no
exercício 1.

3 Escreva uma classe chamada CalculadoraCientifica. Ela deve fazer as operações de
potenciação e radiciação com inteiros e reais.

3.1 Escreva um método chamado raiz. Utilizando sobrecarga de métodos, ele terá três
versões:

3.1.1 Lista de parâmetros com um inteiro

3.1.2 Lista de parâmetros com um double

3.1.3 Lista de parâmetros com uma String (internamente, ele converte a String para
Double com Double.parseDouble antes de fazer a operação).

**Dica:** Use o método [Math.sqrt](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#sqrt-double-) para fazer o cálculo da raiz.

3.2 Escreva um método chamado potência. Utilizando a sobrecarga de métodos, ele
terá três versões:

3.2.1 Lista de parâmetros com dois bytes a e b. Ele calcula e devolve a elevado a b.

3.2.2 Lista de parâmetros com duas Strings s1 e s2. Ele converte ambas para double,
calcula e devolve s1 elevado a s2.

3.2.3 Lista de parâmetros com um inteiro a e um double b. Ele calcula e devolve a
elevado a b.

**Dica 1:** Use o método [Math.pow](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#sqrt-pow) para calcular a potência.

**Dica 2:** Todos os métodos têm tipo de retorno double.

4 Escreva uma classe de teste para testar todos os métodos da sua calculadora
científica.

## Autor

- [@weslleyrods](https://www.github.com/weslleyrods)

  
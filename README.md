# Jogo de Baralho em Java - GEX098 - Programação I - 2023/2

Este projeto Java implementa um jogo de baralho tradicional com 52 cartas divididas em 4 naipes (paus, ouros, copas e espadas) e valores de 1 a 10, além das cartas especiais valete, dama e rei. O projeto é uma solução para a "Atividade 2 - Classes, Construtores e Tratamento de Exceções" realizada em 15/09.

## Estrutura do Projeto

O projeto é dividido em três classes:

Carta.java: Esta classe representa uma carta do baralho. Ela possui dois atributos, naipe e valor, que são definidos no construtor. A classe também contém métodos para validar o naipe e valor da carta.

Baralho.java: A classe Baralho representa o baralho completo e inclui métodos para criar o baralho, embaralhá-lo e pescar cartas do topo. Ela usa uma lista de Carta para armazenar as cartas do baralho.

Principal.java: A classe Principal contém o método main que é responsável por criar o baralho, embaralhá-lo e distribuir 7 cartas para o jogador. Ela também trata exceções caso o baralho esteja vazio.

## Como Executar o Projeto

Certifique-se de que você tem o Java instalado em seu sistema.

Compile os arquivos .java executando o seguinte comando no terminal na pasta onde estão os arquivos:
javac Carta.java Baralho.java Principal.java

Execute o programa com o comando:
java Principal

O programa irá criar um baralho, embaralhá-lo e distribuir 7 cartas para o jogador. Se o baralho estiver vazio, ele tratará a exceção e imprimirá a mensagem "Baralho vazio, não é possível pescar mais cartas."

As cartas na mão do jogador serão exibidas no final da execução.

## Considerações Finais

Este projeto demonstra o uso de classes, construtores e tratamento de exceções em Java para criar um jogo de baralho simples. Certifique-se de manter todos os arquivos e diretórios organizados da mesma forma que neste projeto para garantir que ele funcione corretamente.

# Trabalho Prático 2

|   #   | Código | Problema                                                      | Submissão | Aceito | Nível | Peso  |
| :---: | :----: | ------------------------------------------------------------- | :-------: | :----: | :---: | :---: |
|   1   |  1027  | [Onda Crítica](#onda-crítica)                                 |     -     |   -    |   9   |  100  |
|   2   |  1029  | [Fibonacci, Quantas Chamadas?](#fibonacci-quantas-chamadas)   |     -     |   -    |   4   |  100  |
|   3   |  1034  | [Festival de Estátuas de Gelo](#festival-de-estátuas-de-gelo) |     -     |   -    |   8   |  100  |
|   4   |  1084  | [Apagando e Ganhando](#apagando-e-ganhando)                   |     -     |   -    |   8   |  100  |
|   5   |  1286  | [Motoboy](#motoboy)                                           |     -     |   -    |   5   |  100  |
|   6   |  1487  | [Six Flags](#six-flags)                                       |     -     |   -    |   4   |  100  |

---

## [Onda Crítica][Onda]

[Onda]: https://judge.beecrowd.com/pt/problems/view/1027

Por Monirul Hasan Tomal, Southeast University  Bangladesh

Timelimit: 2

---

![img](https://resources.beecrowd.com/gallery/images/problems/UOJ_1027.png)

A tarefa é simples. Através de alguns pontos críticos em 2D, você deve desenhar uma onda como uma curva. Seu objetivo é incluir tantos pontos quantos forem possível.

- Haverá uma linha imaginária $y = a$, a qual chamaremos de eixo principal para a curva.
- Todos os pontos na curva deverão ter diferentes coordenadas $x$. Suas coordenadas $y$ devem ser na forma $a-1$ ou $a+1$.

Dois pontos consecutivos na curva devem ter diferença de $2$ na coordenada $y$.

### Entrada (Onda Crítica)

Haverá no máximo, $222$ casos de testes. Cada caso inicia com um inteiro $N$, que é o número de pontos no caso de teste. Nas próximas $N$ linhas, haverá $N$ pares de inteiros dando as coordenadas $x$ e $y$ de cada ponto. Não haverá mais do que $1000$ pontos em cada caso de teste. Todas coordenadas são inteiros - eles devem ficar dentro de um inteiro de $2$ bytes com sinal. Os dados devem ser lidos da entrada padrão.

### Saída (Onda Crítica)

Para cada caso de teste, imprima um número - o número máximo de pontos críticos que podem ser incluídos em uma curva desenhada a partir dos pontos dados.

### Exemplos (Onda Crítica)

| Exemplo de Entrada | Exemplo de Saída |
| -----------------: | ---------------: |
|                 10 |                4 |
|                0 1 |           &nbsp; |
|                1 0 |           &nbsp; |
|               1 -1 |           &nbsp; |
|               2 -2 |           &nbsp; |
|                3 1 |           &nbsp; |
|               3 -1 |           &nbsp; |
|               3 -2 |           &nbsp; |
|                4 1 |           &nbsp; |
|               4 -1 |           &nbsp; |
|               5 -1 |           &nbsp; |
|                 10 |                3 |
|                0 2 |           &nbsp; |
|                2 0 |           &nbsp; |
|               1 -1 |           &nbsp; |
|               2 -2 |           &nbsp; |
|                3 1 |           &nbsp; |
|               3 -1 |           &nbsp; |
|               3 -2 |           &nbsp; |
|                4 1 |           &nbsp; |
|               4 -1 |           &nbsp; |
|               5 -1 |           &nbsp; |

"Se você não considerar sua vida como uma jornada, provavelmente não chegará a lugar algum e provavelmente ela irá parecer a você como uma trilha sem fim e sem esperança."

## [Fibonacci, Quantas Chamadas?][Fibonacci]

[Fibonacci]: https://judge.beecrowd.com/pt/problems/view/1029

Por Neilor Tonin, URI  Brasil

Timelimit: 1

---

Quase todo estudante de Ciência da Computação recebe em algum momento no início de seu curso de graduação algum problema envolvendo a sequência de Fibonacci. Tal sequência tem como os dois primeiros valores $0$ (zero) e $1$ (um) e cada próximo valor será sempre a soma dos dois valores imediatamente anteriores. Por definição, podemos apresentar a seguinte fórmula para encontrar qualquer número da sequência de Fibonacci:

$$
  fib(0) = 0 \\
  fib(1) = 1 \\
  fib(n) = fib(n-1) + fib(n-2);
$$

Uma das formas de encontrar o número de Fibonacci é através de chamadas recursivas. Isto é ilustrado a seguir, apresentando a árvore de derivação ao calcularmos o valor $fib(4)$, ou seja o 5º valor desta sequência:

![IMG1029](https://resources.beecrowd.com/gallery/images/problems/UOJ_1029.png)

Desta forma,

- $fib(4) = 1+0+1+1+0 = 3$
- Foram feitas 8 calls, ou seja, 8 chamadas recursivas.

### Entrada (Fibonacci, Quantas Chamadas?)

A primeira linha da entrada contém um único inteiro $N$, indicando o número de casos de teste. Cada caso de teste contém um inteiro $X (1 \leq X \leq 39)$.

### Saída (Fibonacci, Quantas Chamadas?)

Para cada caso de teste de entrada deverá ser apresentada uma linha de saída, no seguinte formato: **fib(n) = num\_calls calls = result**, aonde **num\_calls** é o número de chamadas recursivas, tendo sempre um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.

### Exemplos (Fibonacci, Quantas Chamadas?)

| Exemplo de Entrada | Exemplo de Saída      |
| :----------------: | :-------------------- |
|         2          | &nbsp;                |
|         5          | fib(5) = 14 calls = 5 |
|         4          | fib(4) = 8  calls = 3 |

## [Festival de Estátuas de Gelo][Festival]

[Festival]: https://judge.beecrowd.com/pt/problems/view/1034

Por Wanderley Guimarães, USP  Brasil

Timelimit: 3

![img](https://resources.beecrowd.com/gallery/images/problems/UOJ_1034.jpg)

---

Todos os anos, artistas de todo o mundo se reúnem na cidade, onde fazem esculturas de gelo gigantescas. A cidade vira uma galeria de arte ao céu aberto, uma vez que as esculturas ficam expostas na rua por semanas, sem derreter. Afinal, a temperatura média no inverno de Harbin (época em que ocorrerá a final mundial do ICPC) é de -20 graus.

O primeiro passo para fazer a escultura é montar um grande bloco de gelo da dimensão pedida pelo artista. Os blocos são recortados das geleiras de Harbin em blocos de altura e profundidade padrão e vários comprimentos diferentes. O artista pode determinar qual o comprimento que ele deseja que tenha o seu bloco de gelo para que a escultura possa começar a ser esculpida.

Os comprimentos disponíveis dos blocos são $\{a_1; a_2; \dots;  a_N\}$ e o comprimento que o artista deseja é $M$. O bloco de comprimento $1$ é muito usado, por este motivo ele sempre aparece na lista de blocos disponíveis. Sua tarefa é determinar o número mínimo de blocos tal que a soma de seus comprimentos seja $M$.

### Entrada (Festival de Estátuas de Gelo)

A entrada é composta por diversas instâncias. A primeira linha da entrada contém um inteiro $T$ indicando o número de instâncias. A primeira linha de cada instância contém dois inteiros $N (1 \leq N \leq 25)$ e $M (1 \leq M \leq 1000000)$ representando o número de tipos de blocos e o comprimento desejado pelo artista, respectivamente. A próxima linha contém os inteiros $a_1; a_2; \dots; a_N$, onde $(1 \leq a_i \leq 100)$ para todo $i (1, 2, \dots, N)$ separados por espaço.

### Saída (Festival de Estátuas de Gelo)

Para cada instância, imprima o número mínimo de blocos necessários para obter um bloco de comprimento $M$.

### Exemplos (Festival de Estátuas de Gelo)

| Exemplo de Entrada | Exemplo de Saída |
| -----------------: | ---------------: |
|                  2 |           &nbsp; |
|              6 100 |                2 |
|    1 5 10 15 25 50 |           &nbsp; |
|              2 103 |               23 |
|                1 5 |           &nbsp; |

XIII Maratona de Programação IME-USP 2009.

## [Apagando e Ganhando][Apagando]

[Apagando]: https://judge.beecrowd.com/pt/problems/view/1084

Por Fábio Dias Moreira  Brasil

Timelimit: 1

---

Juliano é fã do programa de auditório Apagando e Ganhando, um programa no qual os participantes são selecionados através de um sorteio e recebem prêmios em dinheiro por participarem.

No programa, o apresentador escreve um número de $N$ dígitos em uma lousa. O participante então deve apagar exatamente $D$ dígitos do número que está na lousa; o número formado pelos dígitos que restaram é então o prêmio do participante.

Juliano finalmente foi selecionado para participar do programa, e pediu que você escrevesse um programa que, dados o número que o apresentador escreveu na lousa, e quantos dígitos Juliano tem que apagar, determina o valor do maior prêmio que Juliano pode ganhar.

### Entrada (Apagando e Ganhando)

A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém dois inteiros $N$ e $D (1 \leq D < N \leq 10^5)$, indicando a quantidade de dígitos do número que o apresentador escreveu na lousa e quantos dígitos devem ser apagados. A linha seguinte contém o número escrito pelo apresentador, que não contém zeros à esquerda.

O final da entrada é indicado por uma linha que contém apenas dois zeros, separados por um espaço em branco.

### Saída (Apagando e Ganhando)

Para cada caso de teste da entrada seu programa deve imprimir uma única linha na saída, contendo o maior prêmio que Juliano pode ganhar.

| Exemplo de Entrada | Exemplo de Saída |
| -----------------: | ---------------: |
|                4 2 |           &nbsp; |
|               3759 |               79 |
|                6 3 |           &nbsp; |
|             123123 |              323 |
|                7 4 |           &nbsp; |
|            1000000 |              100 |
|                7 3 |           &nbsp; |
|            1001234 |             1234 |
|                6 2 |           &nbsp; |
|             103759 |             3759 |
|                0 0 |           &nbsp; |

Maratona de Programação da SBC 2008.

## [Motoboy][Motoboy]

[Motoboy]: https://judge.beecrowd.com/pt/problems/view/1286

Por Thobias, Fernando e Luiz, URI  Brazil

Timelimit: 1

---

José é um motoboy e trabalha fazendo entregas para uma pizzaria. Seu salário é baseado no número de pizzas entregues. Só que esta pizzaria está com muito movimento e ele pediu auxílio a seu amigo Roberto para que o ajudasse nas entregas. Como Roberto é camarada e está sem trabalho no momento, ele concordou em pegar aqueles pedidos cujas entregas serão mais demoradas.

Assim, sempre que chegam à pizzaria, antes de partirem para novas entregas José determina a quantidade de pizzas que Roberto deverá entregar e seleciona para ele os pedidos mais demorados. Por exemplo, se há $22$ pizzas para serem entregues e José determinar que Roberto entregue no máximo $10$ destas pizzas (pode ser menos), estas devem estar obrigatoriamente entre os pedidos que levarão mais tempo para serem entregues. Isso é ilustrado no primeiro caso de teste, onde Roberto deverá fazer a entrega do segundo, terceiro e sexto pedido, somando $8$ pizzas e $62$ minutos $(23 + 21 + 18)$. Se Roberto fosse realmente entregar $10$ pizzas, ele teria que atender o segundo, terceiro e quarto pedido e isto levaria $59$ minutos $(23 + 21 + 16)$, o que não é o objetivo de José, pois levaria menos tempo do que a primeira opção, ou seja, a relação pizzas/tempo não importa muito para José (isso pode ser observado no segundo caso de teste do exemplo abaixo).

Para poder fazer a divisão do trabalho, José pediu a um amigo acadêmico em Ciência da Computação que desenvolvesse um programa que determinasse quanto tempo seu amigo Roberto irá levar para entregar estes pedidos mais demorados.

### Entrada (Motoboy)

A entrada contém vários casos de teste. Cada caso de teste contém na primeira linha um valor inteiro $N (1 \leq N \leq 20)$ que indica o número de pedidos. A linha seguinte contém um valor inteiro $P (1 \leq P \leq 30)$ indicando o número máximo de pizzas que podem ser entregues por Roberto. Cada uma das próximas $N$ linhas contém um pedido com o tempo total para ser entregue e a quantidade de pizzas do pedido, respectivamente. A final da entrada é determinado por $N = 0$, e não deverá ser processado.

### Saída (Motoboy)

Para cada caso de teste de entrada deve ser impresso um valor inteiro que determina o tempo que Roberto irá levar para entregar as suas pizzas seguido de um espaço em branco e do texto $min.$, conforme exemplo abaixo.

### Exemplos (Motoboy)

| Exemplo de Entrada | Exemplo de Saída |
| -----------------: | ---------------: |
|                  6 |          62 min. |
|                 10 |           &nbsp; |
|               15 5 |           &nbsp; |
|               23 4 |           &nbsp; |
|               21 2 |           &nbsp; |
|               16 4 |           &nbsp; |
|               19 5 |           &nbsp; |
|               18 2 |           &nbsp; |
|                  2 |          47 min. |
|                 15 |           &nbsp; |
|              47 12 |           &nbsp; |
|               39 4 |           &nbsp; |
|                  5 |          77 min. |
|                 23 |           &nbsp; |
|               43 9 |           &nbsp; |
|                4 1 |           &nbsp; |
|               17 2 |           &nbsp; |
|               13 5 |           &nbsp; |
|              54 17 |           &nbsp; |
|                  6 |          39 min. |
|                  7 |           &nbsp; |
|               14 4 |           &nbsp; |
|               21 2 |           &nbsp; |
|               26 7 |           &nbsp; |
|               18 4 |           &nbsp; |
|              30 13 |           &nbsp; |
|               10 2 |           &nbsp; |
|                  0 |           &nbsp; |

Adaptado por Neilor.

## [Six Flags][SixFlags]

[SixFlags]: https://judge.beecrowd.com/pt/problems/view/1487

IX Maratona de Programação IME-USP Brasil

Timelimit: 1

---

O Six Flags Fiesta Texas é um dos maiores parques de diversão do mundo, e fica em San Antonio. Sabendo que as finais do ACM-ICPC de 2006 serão naquela cidade, três colegas começaram a planejar em quais dos famosos brinquedos eles iriam, caso seu time se classificasse para as finais mundiais.

Para isso, estabeleceram notas para cada uma das atrações de acordo com o quanto eles gostariam de brincar lá. Por exemplo, a montanha russa "Superman Krypton Coaster" (que tem 800 m de giros, loops e quedas com o carrinho indo a mais de 100 km/h) recebeu a maior pontuação possível entre os colegas.

O problema é que é impossível visitar todas as atrações em um mesmo dia. Assim, os colegas pesquisaram, para cada uma delas, quanto tempo durava o brinquedo (e quanto tempo de fila teriam de enfrentar até chegar a ele...). Sua tarefa neste problema é encontrar, dado o tempo disponível pelos colegas no Six Flags, uma coleção (pode haver repetições) de atrações que dá a maior pontuação dentro deste período.

### Entrada (Six Flags)

Seu programa deve estar preparado para processar diversas instâncias. Na primeira linha são dados dois inteiros $0 \leq N \leq 100$ e $0 \leq T \leq 600$, em que $N$ é o número de atrações nas quais os colegas gostariam de brincar, e $T$ é o tempo (em minutos) que eles terão disponível para isso. Nas próximas $N$ linhas, são dados dois inteiros $0 \leq D \leq 600$ e $0 \leq P \leq 100$ (em cada linha). O primeiro deles, $D$, representa a duração do brinquedo (incluído aí o tempo de fila e uma estimativa do tempo de traslado entre os brinquedos). O segundo, $P$, representa a pontuação atribuída ao brinquedo pelos colegas. Um valor $N = 0$ indica o final das instâncias e não deverá ser processado.

### Saída (Six Flags)

Para cada instância solucionada, você deverá imprimir um identificador Instancia $H$ em que $H$ é um número inteiro, sequencial e crescente a partir de $1$. Na linha seguinte, deve ser impressa a pontuação total conseguida com a coleção determinada por seu programa. Com relação a quais são as atrações da coleção determinada, os colegas decidiram que iriam perguntar para você pessoalmente no futuro, já que eles não querem que outras pessoas saibam e venham a utilizá-la. Uma linha em branco deve ser impressa após cada caso de teste.

### Exemplos (Six Flags)

| Exemplo de Entrada | Exemplo de Saída |
| -----------------: | :--------------- |
|               5 60 | Instancia 1      |
|              10 30 | 180              |
|              20 32 | &nbsp;           |
|                5 4 | &nbsp;           |
|              50 90 | &nbsp;           |
|              22 45 | &nbsp;           |
|               5 60 | Instancia 2      |
|              10 10 | 104              |
|              20 32 | &nbsp;           |
|                5 4 | &nbsp;           |
|              50 90 | &nbsp;           |
|              22 45 | &nbsp;           |
|                0 0 | &nbsp;           |

IX Maratona de Programação IME-USP 2005.

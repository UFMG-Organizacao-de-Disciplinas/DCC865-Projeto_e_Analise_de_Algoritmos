# Bloco 2

## Módulo 3

### Aula 1

#### Slide de apresentação

- Interesses de pesquisa
  - Redes de Comunicação
  - Algoritmos e Sistemas distribuídos
  - Redes Sociais Online e Complexas
- Internet das Coisa **s** (IoT) [JV: Alertar para que ela altere no slide]
- Datacenters
- Análise de dados em redes sociais online.

#### Módulos 3 e 4

##### PAA 3 e 4

- Algorithm Design, Jon Kleinberg, Éva Tardos
- Algoritmos, teoria e prática, Thomas H. Cormen, et al.
- Projeto de Algoritmos, Nívio Ziviani

Provas de Verdadeiro ou Falso. Não serão provas pra elaborar algorimos ou fazer provas matemáticas.

##### Módulo 3 (slide)

- ~~Fundamentos matemáticos~~ [JV: como nesse semestre a sequência tá meio esquisita, ela não vai dar essa parte da matéria]
  - ~~Indução matemática e estrutural~~
  - ~~Recursividade~~
- Paradigmas Algortímicos
  - Divisão e Conquista
    - Separa o problema em subproblemas menores, resolve os subproblemas e junta as soluções.
  - Programação Dinâmica
    - É um tipo de divisão e conquista, porém com sobreposições. Por exemplo: "vou processar os primeiros 10%, depois os primeiros 20%..."
    - Risco de tender a se tornar exponencial. Espera-se que seja polinomial.
  - Algoritmos Gulosos (Greedy)
    - Geralmente são os algoritmos mais intuitivos, porém podem não conter garantia de otimalidade.

O Trabalho Prático também será no BeeCrowd.

##### Módulo 4

- NP-Completude
  - Reduções entre problemas
  - Classe P
  - CLasse NP
  - Classe NP-Completo

Falaremos sobre complexidades relativas/condicionadas a outros problemas.

##### Avaliações

- Provas 3 e 4 (2 x 20 pontos)
  - Datas previstas para 2024-02:
    - 20/12 (sex, 9h)
    - 24/01 (sex, 9h)
  - Presenciais em laboratórios com computadores (CAD3, sala B306-7):
    - Provas individuais e sem consulta
    - Formato questionário de múltipla escolha do Moodle
- Lista de exercícios: (5,0 pontos)
- Trabalho prático (5,0 pontos)
- Prova substituta: [JV: diferente de como foi com o Marcio, não vai poder fazer a substitutiva pra poder tentar melhorar a nota]
  - Substitui uma prova perdida
  - Data prevista 2024-02: 27/01 (seg, 13h)
  - Mesmo formato porém cobrindo toda a matéria dos módulos 3 e 4

##### Cronograma - Módulos 3 e 4

##### Conclusão: PRACTICE X THEORY

#### Slide: 5. Divide and Conquer I

- Mergesort
- Counting inversions
- Randomized quicksort
- Median and selection
- Closest pair of points

##### Divide and Conquer Paradigm

- Divide-and-conquer
  - Divide up problem into several subproblems (of the same kind).
  - Solve (conquer) each subproblem recursively.
  - Combine solutions to subproblems into overall solution.
- Most common usage.
  - Divide problem of size n into two subproblems of size n/2.
    - > Especificamente em casos divididos por uma constante maior que 1.
  - Solve (conquer) two subproblems recursively.
  - Combine two solutions into overall solution.
- Consequence.
  - Brute force: Θ(n2).
  - Divide-and-conquer: O(n log n).

##### Sorting Problem

Problem. Given a list $L$ of $n$ elements from a totally ordered universe, rearrange them in ascending order.

###### Sorting applications

- Obvious applications.
  - Organize an MP3 library.
  - Display Google PageRank results.
  - List RSS news items in reverse chronological order.
- Some problems become easier once elements are sorted.
  - Identify statistical outliers.
  - Binary search in a database.
  - Remove duplicates in a mailing list.
- Non-obvious applications.
  - Convex hull.
  - Closest pair of points.
  - Interval scheduling / interval partitioning.
  - Scheduling to minimize maximum lateness.
  - Minimum spanning trees (Kruskal’s algorithm).
  - ...

##### Mergesort

- Recursively sort left half.
- Recursively sort right half.
- Merge two halves to make sorted whole.

- Input: [A, L, G, O, R, I, T, H, M, S]
- Sort left half: **[A, G, L, O, R]** [I, H, M, S, T]
- Sort right half: [A, G, L, O, R] **[H, I, M, S, T]**
- Merge results: **[A, G, H, I, L, M, O, R, S, T]**

###### Merging

- **Goal:** Combine two sorted lists $A$ and $B$ into a sorted whole $C$.
  - Scan $A$ and $B$ from left to right.
  - Compare $a_i$ and $b_j$.
  - If $a_i \leq b_j$, append $a_i$ to $C$ (no larger than any remaining element in $B$).
  - If $a_i > b_j$, append $b_j$ to $C$ (smaller than every remaining element in $A$).

Percorre duas listas ordenadas e compara o menor de cada uma. O menor é adicionado à lista final. Com isso incrementa o índice da lista em que o menor foi encontrado.

###### Mergesort implementation

- **Input:** List $L$ of $n$ elements from a totally ordered universe.
- **Output:** The $n$ elements in ascending order.

$\vdots$

##### A Useful recurrance relation

$\vdots$

##### Dive-and-conquer recurrence: recursion tree

$\vdots$

[JV: entender por que que a árvore terá no máximo altura $log_2(n)$]

##### Proof by induction

- **Base case:** $n = 1, T(1) = 0 = n \log_{2} n$.
- **Inductive hypothesis: assume $T(n) = n \log_{2} n$.**
- **Goal:** show that $T(2n) = 2n \log_{2} 2n$.

- $T(2n) = 2T(n) + 2n$
- $= 2(n \log_{2} n) + n$
- $= 2n \log_{2} n + n$
- $= 2n (\log_{2} (2n) - 1) + 2n$
- $= 2n \log_{2} 2n$

##### Divide-and-conquer: quiz 1

[JV: por que tem um $n - 1$? Supõe-se que seja pela divisão ficar meio desequilibrada por causa do ceil e floor]

##### Analysis of Mergesort recurrence

$\vdots$

##### Digression: sorting lower bound

$\vdots$

###### Comparisson tree (for 3 distinct keys a, b, and c)

###### Sorting lower bound

- **Theorem:** Any deterministic compare-based sorting algorithm must make
$\Omega(n \log n)$ compares in the worst-case.

$\vdots$

---

$\vdots$

###### Shuffling a Linked List

Pensar em casa.

### Aula 2

#### Slide: 05DivideAndConquerI

##### Mergesort (2)

###### Shuffling a Linked List (2)

A forma de embaralhar a lista encadeada seria utilizar o RNG durante a parte da unificação da lista, onde ao juntar as listas que foram divididas pelo mergesort, o RNG seria utilizado para decidir qual elemento seria adicionado à lista final.

##### Counting Inversions

O que se deseja é contar quantas vezes que um par de elementos precisa ser trocado de posição para que a lista fique ordenada.

##### Counting Inversions: divide-and-conquer

Após partir todos os elementos em subconjuntos triviais, ao fazer a junção final, ao percorrer os índices $i$ e $j$, comparará os valores de $A_i$ e $B_j$. Se $A_i > B_j$, então todos os elementos restantes de $A$ também são maiores que $B_j$, então incrementa o contador de inversões de acordo com a quantidade de elementos restantes em $A$.

#### Slide: Merge Demo

#### Slide: 05DivideAndConquerI (2)

##### Randomized Quicksort

#### Slide: Demo quicksort

#### Slide: 05DivideAndConquerI (3)

##### Randomized Quicksort (2)

Escolhe um pivô $p$ aleatoriamente e vai percorrendo da esquerda pra direita a lista. Se o item selecionado for menor que o pivô, troca com o pivô, senão, joga pro final do vetor. Ao final, o pivô estará na posição correta.

No caso de pivôs com valores repetidos, ao trocar o valor $A_i$ com o pivô, ele troca apenas com o primeiro elemento do conjunto de pivôs e avança os índices

###### Divide-and-conquer: quiz 2

Given an array of $n \geq 8$ distinct elements $a_1, a_2, \dots, a_n$, what is the probability that $a_7$ and $a_8$ are compared during randomized quicksort?

a. $0$
b. $1/n$
c. $2/n$
d. $1$ <-

###### Divide-and-conquer: quiz 3

Given an array of $n \geq 2$ distinct elements $a_1, a_2, \dots, a_n$, what is the probability that $a_1$ and $a_n$ are compared during randomized quicksort?

a. $0$
b. $1/n$
c. $2/n$ <-
d. $1$

### Aula 3 - 09/12/2024

#### Slide: 05DivideAndConquerI (4)

##### Randomized Quickselect analysis

Para partir uma barrinha de chocolate em dois pedaços, dará um menor pedaço que será no mínimo $(1/2)n$ e no máximo $n - 1$. Ele terá então, em média, $\frac{((1/2)n) + (n - 1)}{2}$ elementos, que será $\frac{3n - 2}{4}$, o que gira em torno de $3/4$ de $n$.

##### Selection in worst-case linear time

###### Choosing the pivot element

Tarefa de casa: mostrar como encontrar a mediana em 6 comparações. "Em 11 é muito fácil"

##### Median-of-medians Selection Algorithm Recurrence

$C(n) \leq C( \left\lfloor n/5 \right\rfloor ) + C(n - 3 \left\lfloor n/10 \right\rfloor ) + \frac{11}{5}n$

- Super-additive: $C(X) + C(Y) \leq C(X + Y)$

---

Quiz 4: Ponto extra

Achar a constante que dá certo para $R = 7$

---

Ela vai mandar uma enquete para decidir se vai ter a prova dia 20 ou não.

### Aula 4 - 11/12/2024

#### Slide: 05DivideAndConquerI (5)

##### Closest Pair of Points

- **Closes Pair of Points problem:** Dados $n$ pontos em um plano, encontre o par de pontos com a menor distância Euclideanas entre eles.

- Tentativas de solução
  - **Força bruta:** $\Theta(n^2)$
  - **Ordenando por $x$ e $y$:** acaba não dando certo porque ordenar por uma coordenada, não garante que na outra será próximo o bastante.
  - **Dividir em 4 quadrantes com $n/4$ pontos em cada quadrante:**
    - **Problema:** os quadrantes podem não garantir que os pontos estejam subdivididos de forma a garantir que teremos $n/4$ pontos em cada quadrante.
  - **Dividir em 2 partes com $n/2$ pontos em cada parte:**
    - OK 👍

###### Closest Pair of Points: divide-and-conquer

- **Divida:** Divida os pontos em duas partes com $n/2$ pontos em cada parte.
- **Conquiste:** Encontre a menor distância entre os pares de pontos em cada parte recursivamente.
- **Combine:** Encontre a menor distância entre os pares de pontos em que um ponto está em uma parte e o outro ponto está na outra parte.
- Retorne a melhor entre as 3 soluções.

Agora, devemos analisar de que forma podemos encontrar a menor distância entre os pontos de uma parte e outra.

1. Após calcularmos recursivamente os menores pares de pontos de cada parte, devemos calcular a menor distância entre os pontos de uma parte e outra.
2. Para isso teremos um $\delta = \min(\delta_1, \delta_2)$, onde $\delta_1$ e $\delta_2$ são as menores distâncias encontradas em cada parte.
3. Com isso, define-se uma faixa de distância $\delta$ em torno da linha que divide as partes.
4. Para os pontos contidos nessa faixa $[L - \delta, L + \delta]$, ordene-os por $y$.
5. Checar as distâncias dos pontos em relação aos 7 pontos seguintes.
   1. $\dots$

---

**Ponto extra:** fazer uma prova para reduzir a constante de quantos pontos podem ser comparados dentro da faixa cinza e que podem ser menores que delta. (Slide: 05DivideAndConquerI, Pág. 73)

---

| Problema         | Bruto    | Esperto       |
| ---------------- | -------- | ------------- |
| Closest Pair     | $O(n^2)$ | $O(n \log n)$ |
| Farthest Pair    | $O(n^2)$ | $O(n \log n)$ |
| Convex hull      | $O(n^2)$ | $O(n \log n)$ |
| Delaunay/Voronoi | $O(n^4)$ | $O(n \log n)$ |
| Euclidean MST    | $O(n^2)$ | $O(n \log n)$ |

#### Slide: 04GreedyAlgorithmsI_select06_DP (1)

##### Greedy Algorithms

###### Coin Changing

- Ela pulou

###### Interval Scheduling

- Heurísticas:
  - Earliest start time
  - Earliest finish time (ótima)
  - Shortest interval

- Interval Scheduling: earliest-finish-time-first algorithm

- EARLIEST-FINISH-TIME-FIRST $(n, s_1, s_2, \dots, s_n, f_1, f_2, \dots, f_n)$
  - **SORT** jobs by finish times and renumber so that $f_1 \leq f_2 \leq \dots \leq f_n$.
  - $S \leftarrow \emptyset$ (set of jobs selected)
  - **FOR** $j = 1$ **TO** $n$
    - **IF** job $j$ is compatible with $S$
      - $S \leftarrow S \cup \{ j \}$
  - **RETURN** $S$

---

Tipo de questão que tem na prova:

A. Yes, because greedy algorithms are always optimal.
B. Yes, because the same proof of correctness is valid.
**C. No, because the same proof of correctness is no longer valid.**
D. No, because you could assign a huge weight to a job that overlaps the job with the earliest finish time.

Explicação: não é porque determinada prova de correção não é válida que o algoritmo não é mais ótimo.

---

Deu um bafafá por confusão da definição da condicional do C.

### Aula 5 - 16/12/2024

Ela começou explicando a parte lógica da afirmação do slide anterior que deu bafafá.

Mas como eu cheguei atrasado só peguei o final.

#### Slide: 06DynamicProgrammingI_select

##### Algorithmic paradigms

- **Greed:** processar o input e tomar decisões de forma míope não voltando atrás.
- **Divide-and-conquer:** separar em subproblemas menores
- **Dynamic programming:** resolver subproblemas e guardar as soluções para não ter que resolver novamente.s

##### Dynamic programming history

##### Dynamic programming applications

##### Dynamic programming books

##### 6. DYNAMIC PROGRAMMING I

###### Weighted Interval Scheduling

- Uma tarefa (job ($j$)) começa no tempo $s_j$ e termina no tempo $f_j$, and has weight $w_j > 0$.
- Dois jobs $i$ e $j$ são compatíveis se $f_i \leq s_j$.

Dynamic programming: binary choice

---

Vou começar a fazer umas anotações mais soltas porque o ritmo tá rápido.

---

Maximum Subarray Problem: que probleminha capcioso! kkkkkkkkkkkkkkkkkkkk

Utilizar lógica de peso dos intervalos nesse problema.

Pra ir linear, vai somando os valores. Se o somatório em determinada posição for menor que o valor atual, define que a melhor solução até então é o valor dessa posição. Depois disso, calcula o maior valor desse vetor de resultados. Com isso encontramos o j. Para encontrarmos o i, precisamos ir retornando do j até encontrar alguém em que a solução tenha o mesmo valor que o valor da posição em si.

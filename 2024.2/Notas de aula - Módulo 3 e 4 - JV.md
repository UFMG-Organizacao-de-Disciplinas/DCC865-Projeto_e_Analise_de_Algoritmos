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
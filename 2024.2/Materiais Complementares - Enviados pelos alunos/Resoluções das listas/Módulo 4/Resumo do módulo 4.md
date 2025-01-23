# Resumo do Módulo 4

- Módulo 4
  - Programação Dinâmica 2
    - Bellman–Ford–Moore algorithm
    - Distance-vector protocols
    - Negative cycles
  - NP-Completude
    - Reduções entre problemas
    - Classe P
    - Classe NP
    - Classe NP-Completo

## Programação Dinâmica 2

### Shortest paths with negative weights

- **Caminho mínimo**
  - **Explicação do problema:** Dado um grafo direcionado $G = (A, E)$, com tamanhos dos arcos $l_{vw}, encontre o caminho mais curto de $s$ a $t$. (Considerando que exista caminho de $s$ a $t$)
  - Tentativas
    - Dijkstra: pode não produzir o caminho mais curto se houverem arcos de peso negativo.
      - Rebalanceamento: adicionar uma constante a todos os arcos para torná-los positivos.
        - Não garante o mesmo caminho mínimo que o anterior.

#### Shortest paths with negative weights - Implementation

##### Algoritmo - Shortest-Paths with Negative Weights (Bellman–Ford–Moore)

- **Algoritmo:** Shortest-Paths(V, E, l, t):
  - **FOREACH** node $v \in V$:
    - $M[0, v] \leftarrow \infty$
  - $M[0, t] \leftarrow 0$
  - **FOR** $i = 1$ **TO** $n – 1$:
    - **FOREACH** node $v \in V$:
      - $M[i, v] \leftarrow M [i – 1, v]$
      - **FOREACH** edge $(v, w) \in E$:
        - $M[i, v] \leftarrow \min \{ M [i, v], M [i – 1, w] + l_{vw} \}$

- **Complexidades:**
  - **Tempo:** $\Theta(mn)$
    - [JV:
      - Por que não é $O(|E||V|^2)$?
      - Ou ainda mais, por que não $\Theta(|V| + |V|^2 \cdot |E|)$]
  - **Espaço:** $O(n^2)$

##### Explicação do algoritmo (Shortest-Paths)

| **$M$** | **$t$** | **$a$**  | **$b$**  | **$c$**  | **$d$**  | **$e$**  |
| :-----: | :-----: | :------: | :------: | :------: | :------: | :------: |
| **$0$** |   $0$   | $\infty$ | $\infty$ | $\infty$ | $\infty$ | $\infty$ |
| **$1$** |   $0$   |   $-3$   | $\infty$ |   $3$    |   $4$    |   $2$    |
| **$2$** |   $0$   |   $-3$   |   $0$    |   $3$    |   $3$    |   $0$    |
| **$3$** |   $0$   |   $-4$   |   $-2$   |   $3$    |   $3$    |   $0$    |
| **$4$** |   $0$   |   $-6$   |   $-2$   |   $3$    |   $2$    |   $0$    |
| **$5$** |   $0$   |   $-6$   |   $-2$   |   $3$    |   $0$    |   $0$    |

---

- Primeiro definimos que todos os caminhos até $t$ são infinitos.
- Depois definimos que $t$ até ele mesmo é 0.
- A partir daí, iteramos sobre cada um dos vértices.
- Para cada vértice, iteramos sobre cada um dos seus arcos de saída.
- E então, para cada um de seu arcos de saída, compara-se o mínimo entre o seu último valor obtido e a soma entre o valor de um arco de saída e o valor anterior do vértice que atingiu.
- Assim sempre mantendo o menor valor possível dentre os caminhos encontrados.

###### Aprimoramentos

- **Aprimoramento de espaço:** ter dois 1D arrays. Um $d[v] =$ menor distância $v \to t$ encontrada até então. Outro $successor[v] =$ direção do próximo arco no caminho mínimo $v \to t$.
- **Aprimoramento de tempo:** se não houve alteração em $d[w]$ na iteração $i-1$, não há necessidade de recalcular arcos que cheguem em $w$ na iteração $i$.

##### Finding the Shortest Path

- Mantenha um vetor $S$ de sucessores $sucessor[i, v]$ que apontam para o próximo vetor no caminho mínimo de $v \to t$ usando no máximo $i$ arcos.

[JV: há outra abordagem que eu escolhi ignorar]

###### Algoritmo - Finding the Shortest Path

[JV: Algoritmo alterado por mim baseado no que entendi]

- **Algoritmo:** Shortest-Paths(V, E, l, t):
  - **FOREACH** node $v \in V$:
    - $M[0, v] \leftarrow \infty$
    - $S[0, v] \leftarrow \text{v}$ [JV: Adicionando registro do caminho]
  - $M[0, t] \leftarrow 0$
  - **FOR** $i = 1$ **TO** $n – 1$:
    - **FOREACH** node $v \in V$:
      - $M[i, v] \leftarrow M [i – 1, v]$
      - **FOREACH** edge $(v, w) \in E$:
        - $M[i, v] \leftarrow \min \{ M [i, v], M [i – 1, w] + l_{vw} \}$
        - **IF** $M [i, v] = M[i – 1, w] + l_{vw}$: [JV: Se o caminho foi alterado]
          - $S[i, v] \leftarrow w$
        - **ELSE**: [JV: Se o caminho não foi alterado]
          - $S[i, v] \leftarrow S[i – 1, v]$

---

- **Algoritmo do Slide:** Bellman-Ford-Moore (Efficient implementation)
  - **Algoritmo:** Shortest-Paths $(V, E, c, t)$: [JV: não entendi o que é $c$]
    - **FOREACH** node $v \in V$:
      - $d[v] \leftarrow \infty$
      - $S[v] \leftarrow$ *null*
    - $d[t] \leftarrow 0$
    - **FOR** $i = 1$ **TO** $n – 1$:
      - **FOREACH** node $w \in V$: [JV: dessa vez ele vai passar a considerar os vértices de chegada]
        - **IF** ($d[w]$ foi alterado na iteração $i-1$):
          - **FOREACH** edge $(v, w) \in E$:
            - **IF** ($d[v] > d[w] + l_{vw}$):
              - $d[v] \leftarrow d[w] + l_{vw}$
              - $S[v] \leftarrow w$
        - **IF** (nenhum valor de $d[]$ foi alterado na iteração $i-1$):
          - **BREAK**

- **Quiz 7:** C (?)

###### Análise dos lemas

- **Lema 3:** todos os elementos de $d[]$ indicam a distância de algum caminho $v \to t$.
  - [JV: Afinal, essa é a premissa dessa variável.]
- **Lema 4:** para cada nó $v: d[v]$ é monotonicamente não-crescente.
  - [JV: se sempre busca o menor caminho, então não pode crescer. Mas me soa esquisito ao se considerar a ordem em que o nó é analisado. Suponho que seja considerado apenas a progressão de um determinado nó, e não ele com os outros.]
- **Lema 5:** Após a iteração $i$, $d[v] \leq$ o tamanho do menor caminho $v \to t$ com no máximo $i$ arcos.
  - [JV: Não entendi direito.]

- **Quiz 8:** B

- **Lema 6:** Qualquer ciclo direcionado $W$ no grafo dos sucessores é um ciclo negativo.
  - [JV: sinto que isso é verdade porque o algoritmo tende a buscar pelas menores rotas. E sempre haverá uma se atualizando e reduzindo seu tamanho, logo, ele tenderá a travar nesse loop.]

### Ciclo negativo

- **Definição:** Um ciclo é negativo se a soma dos pesos dos arcos do ciclo é negativa.
- **Matematicamente:** $l(W) = \sum_{e \in W} l_e < 0$
- **Lema 1:** Se existe caminho $v \to t$ com ciclo negativo, não há caminho mínimo de $v$ a $t$.
  - **Prova:** Isso porque podemos sempre dar a volta no ciclo negativo para diminuir o caminho.
- **Lema 2:** Se não há ciclos negativos, há caminho mínimo *simples* $v \to t$ que tem no máximo $n - 1$ arcos.
  - [JV: algo me incomodou. Fiquei relutante quanto à afirmação de que "Se não há ciclos negativos, há caminho", ora! Nada garante! Aí depois reli a premissa "Considerando que exista caminho de $s$ a $t$".]
  - **Prova:**
    - Dentre os caminhos mínimos $v \to t$, considere aquele com a menor quantidade de arcos.
    - Se houver mais de $n - 1$ arcos, haverá um ciclo, nesse caso, pode-se remover o ciclo e encontrar um caminho menor.
    - [JV: Mas, se já encontrei o menor dos mínimos, já não precisaria remover ciclos]
  - **Problema:** Encontrar Ciclo negativo (caso exista)
    - **Explicação do problema:** Dado um grafo direcionado $G = (A, E)$, com tamanhos dos arcos $l_{vw}, encontre o ciclo caso exista.

---

- **Single-destination shortest-paths**
  - **Explicação do problema:** Dado um grafo direcionado $G = (A, E)$, com tamanhos dos arcos $l_{vw}$, encontre o caminho mais curto de todos os os vértices ao vértice $t$.

---

#### Solução de programação dinâmica

- **Definição:** $OPT(i, v)$ = tamanho do caminho mínimo de $v$ a $t$ com no máximo $i$ arcos.
- **Objetivo:** $OPT(n-1, v)$ para cada $v$.
  - [JV: com isso encontram-se todos os caminhos mínimos até $t$]
  - Enquanto faz-se isso, dois casos podem ser encontrados:
    - **Caso 1:** o caminho mais curto de $v$ a $t$ com no máximo $i-1$ vértices.
      - $OPT(i, v) = OPT(i - 1, v)$
    - **Caso 2:** o caminho mais curto de $v$ a $t$ usa exatamente $i$ vértices.
      - Se $(v, w)$ é o primeiro vértice no caminho $v \to t$, defina seu valor como o custo de $l_{vw}$.
        - [JV: Não entendi]
      - Então, selecione o melhor caminho $w \to t$ com no máximo $i-1$ vértices.
  - Equação de Bellman:

```math
OPT(i, v) =
\begin{cases}
  0 & \text{se } i = 0 \text{ e } v = t \\
  \infty & \text{se } i = 0 \text{ e } v \neq t \\
  \min \{ OPT(i-1, v), \min_{(v, w) \in E} \{ OPT(i-1, w) + l_{vw} \} \}  & \text{se }i > 0 \\
\end{cases}
```

### Distance-vector protocols

### Negative cycles

- Algoritmo: Tempo $\Theta(mn)$, Espaço $\Theta(n^2)$
  - Partindo de um grafo $G = (A, E)$
  - Adicione um vértice extra `t` terminal e conecte todos os vértices a `t` com arestas de comprimento 0.
  - Esse novo grafo será $G'$
  - $G$ tem um ciclo negativo se e somente se $G'$ tem um ciclo negativo.
  - Caso 1: $OPT(n, v) = OPT(n - 1, v)$ para todo vértice $v$
    - Pela Lema 7, não há ciclos negativos.
  - Caso 2: $OPT(n, v) < OPT(n - 1, v)$ para algum vértice $v$
    - Usando a prova do Lema 8, podemos extrair um ciclo negativo do caminho $v \to t$.
    - O ciclo não pode conter `t` pois não há arestas saindo de `t`.

## Intractability

- Dúvidas
  - 3-SAT reduces to Independent Set: Qual seria o $|\Phi|$? Pág 28.
  - Num 3-SAT, não necessariamente precisamos definir V ou F pra todos os literais, certo? De que forma isso altera nas outras versões do problema?
  - "Encoding with gadgets" seria o mesmo que definir novas restrições à forma convertida?
  - > (Pág 31) **Decision problem**. Does there exist a vertex cover of size ≤ k ? **Search problem**. Find a vertex cover of size ≤ k. **Optimization problem**. Find a vertex cover of minimum size. **Goal**. Show that all three problems poly-time reduce to one another
    - Afinal, a otimização me parece o mais complexo, e o Vertex Cover tem solução polinomial?

### Hamiltonian Cycle

- Dúvidas:
  - Não daria problema quando se converte o direcionado para o não-direcionado por causa dos arcos de ida e volta?
  - Isso do `black, white, blue...` é o tal do gadget?
  - Muito esquisito o 3-SAT reduzir para o Hamiltonian Cycle.

## PNP

1. **P (Polynomial Time):** Problemas que podem ser resolvidos em tempo polinomial. "Eficientemente solucionáveis".
   - Explicação: Existe um algoritmo $A(instância) = Solução$ que roda em tempo polinomial.
   - Ex.: Multiplicação, ordenação, busca binária, etc.
   - Ex. Slide: Multiple, Rel-Prime, Primes, Edit-Distance, L-Solve, U-Conn, etc.
2. **NP (Non-deterministic Polynomial Time):** Problemas que podem ser verificados em tempo polinomial. "Eficientemente verificáveis".
   - Explicação: Existe um algoritmo $C(instância, possível Solução) = Sim/Não$ que roda em tempo polinomial.
   - Ex.: Fatoração, satisfatibilidade, clique, encontrar primos, SAT, etc.
   - Ex. Slide: L-Solve, Composites, Factor, Sat, Hamilton-Path, etc.
   - Ex. Slide. Com certificados polinomial: SAT, Hamilton-Path, Composites.
3. Externos ao NP:
   - Ex.: "Qual o melhor próximo movimento no xadrez?"
4. **NP-Complete:** Problemas que são tão difíceis quanto os mais difíceis problemas em NP.
   - **Explicação:** Problema $Y \in NP$ tal que para todo problema $X \in NP$, $X \leq_p Y$.
   - **Categorias:**
     - **Packing/covering problems**: SET-COVER, VERTEX-COVER,INDEPENDENT-SET.
     - **Constraint satisfaction problems**: CIRCUIT-SAT, SAT, 3-SAT.
     - **Sequencing problems**: HAMILTON-CYCLE, TSP.
     - **Partitioning problems**: 3D-MATCHING, 3-COLOR.
     - **Numerical problems**: SUBSET-SUM, KNAPSACK.
5. **NP-intermediate (NPI):** caso $P \neq NP$, então $|NPI| > 0$.
   - **Explicação:** Problemas NP que não são nem NP-Completo, nem em P.
   - **Ex.:** Factoring, Graph Isomorphism, etc.
6. **EXP:** Problemas que têm algoritmos exponenciais.
7. **Co-NP:** Problemas cuja negação está em NP.
   - **Explicação:** enquanto no NP você precisaria de um certificador de que a solução é correta, no Co-NP você precisaria de um certificador de que não existe solução correta.
   - **Ex.:** UN-SAT, No-Hamilton-Path, Primes.
8. **NP-Difícil:** Problemas que são tão difíceis quanto os mais difíceis problemas em NP.

"Rapidamente perceber que um resultado é correto é mais fácil do que encontrar o resultado?"

- Dúvida:
  - Afinal, por que é tão relevante a questão da complexidade?
    - Se pra um certo problema polinomial a entrada tende a crescer exponencialmente, quanto ao tempo, isso não acabaria empatando as coisas?
  - Não entendi a testagem de primalidade (Página 53)
  - Nem Factor/Factorize

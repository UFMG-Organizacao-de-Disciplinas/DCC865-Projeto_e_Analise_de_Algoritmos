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

- **Explicação do problema:** Dado um grafo direcionado $G = (A, E)$, com tamanhos dos arcos $l_{vw}, encontre o caminho mais curto de $s$ a $t$. (Considerando que exista caminho de $s$ a $t$)

### Bellman–Ford–Moore algorithm

### Distance-vector protocols

### Negative cycles

- Algoritmo: Tempo $\Theta(mn)$, Espaço $\Theta(n^2)$
  - Partindo de um grafo $G$
  - Adicione um vértice extra `t` terminal e conecte todos os vértices a `t` com arestas de comprimento 0.
  - Esse novo grafo será $G'$
  - $G$ tem um ciclo negativo se e somente se $G'$ tem um ciclo negativo.
  - Caso 1: $OPT(n, v) = OPT(n - 1, v)$ para todo vértice $v$
    - Pela Lema 7, não há ciclos negativos.
  - Caso 2: $OPT(n, v) < OPT(n - 1, v)$ para algum vértice $v$
    - Usando a prova do Lema 8, podemos extrair um ciclo negativo do caminho $v \to t$.
    - O ciclo não pode conter `t` pois não há arestas saindo de `t`.

# Tabelas

| Categoria                      | Nome do algoritmo          | Complexidade em lista de adjacências | Complexidade em matriz de adjacências |
| ------------------------------ | -------------------------- | ------------------------------------ | ------------------------------------- |
| Caminhamento                   | Depth First Search (DFS)   | $$O(V+E)$$                           | $$v^2$$                               |
| Caminhamento                   | Breadth First Search (BFS) | $$O(V+E)$$                           | $$v^2$$                               |
| Minimum Spanning Tree          | Kruskal                    | $$O(E log E) + EV$$ ou só $$O(EV)$$  | $$O(E log E) + EV$$                   |
| Minimum Spanning Tree          | Kruskal (Union Find)       | $$O(E log E)$$                       | $$O(E log E)$$                        |
| Minimum Spanning Tree          | Prim                       | $$O(V^2 + E)$$                       | $$O(V^2)$$                            |
| Minimum Spanning Tree          | Prim (Min-Heap)            | $$O(E log V)$$                       |                                       |
| Minimum Spanning Tree          | Prim (Fib. Heap)           | $$O(E + V log V)$$                   |                                       |
| Componentes Fortemente conexas | Kosaraju                   | $$O(V+E)$$                           | $$v^2$$                               |
| Fluxo                          | Ford-Fulkerson             | $$O(EF)$$                            |                                       |
| Fluxo                          | Edmonds-Karp               | $$O(VE^2)$$                          |                                       |
| Fluxo                          | Dinic                      | $$O(V^2 E)$$                         |                                       |
| Fluxo                          | Dinic Unitario             | $$O(\sqrt{V} E)$$                    |                                       |
| Shortest Path                  | Dijkstra                   | $$O(V^2)$$                           | $$O(V^2)$$                            |
| Shortest Path                  | Bellman-Ford               | $$O(VE)$$                            | $$O(V^2 E)$$                          |
| Shortest Path                  | Dijkstra (Min-Heap)        | $$O((V+E) log V)$$                   |                                       |
| Shortest Path                  | Dijkstra (Fibonacci-Heap)  | $$O(E+V log V)$$                     |                                       |

## Legenda

| Símbolo  | Significado                   |
| -------- | ----------------------------- |
| $V$      | Vertices                      |
| $E$      | Edges (Arestas)               |
| $F$      | Fluxo                         |
| $\alpha$ | Constante Inversa de Ackerman |

## Observações

Com Union Find, Kruskal detecta o ciclo em: $E*O(\alpha(n))$

Para Detectar Ciclos: $E*(\text{Complexidade para detectar ciclos})$

Find: $O(\alpha(n))$

Union: $O(\alpha(n))$

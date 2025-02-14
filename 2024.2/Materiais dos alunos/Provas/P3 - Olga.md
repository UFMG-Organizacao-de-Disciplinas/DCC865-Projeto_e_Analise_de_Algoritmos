# P3 - Olga - 01/2025 - Nota: 7,algumacoisa

## Questão 1

$$
OPT(i, w) =
\begin{cases}
0                                           & \text{, se } i = 0 \\
OPT(i-1, w)                                 & \text{, se } w_i > w \\
\max (OPT(i-1, w), v_i + OPT(i-1, w - w_i)) & \text{, caso contrário} \\
\end{cases}
$$

---

1. [F] $0 \leq i \leq n$; $0 \leq w \leq W$; $OPT(i-1, w): w_i > w$
   - Se não me engano ele é pseudo polinomial... $O(nW)$
   - Mas por que pseudo?
   - Jogar Fluxx
2. [F] Polinomial em função de N
3. [V] ? Não há algoritmo polinomial
4. [F] Polinomial em função da entrada, base 2
5. [F] Polinomial $\to NW$

## Questão 2

Melhor dia de compra e venda de ações:

- $0 \leq x < y \leq n; OPT = A[y] - A[x]$
- $B[i] = A[i] - A[i-1]; 1 \leq i \leq n$

---

1. [V] Divisão e Conquista: Soma máxima de B; $T(n) \leq 2T(n/2) + O(n) = O(n \log n)$
   1. $n \to 1$
   2. $(n/2) (n/2) \to 2$
   3. $(n/4) (n/4) (n/4) (n/4) \to 3$
   4. $1, 2, 3 \to \log n (?)$
2. [F] Soma Máxima A | Divisão e Conquista || $T(n) \leq 2T(n/2) + O(1) = O(n)$
3. [F] Soma Máxima B | Divisão e Conquista || $T(n/2) + O(1) = O(\log n)$
4. [F] $O(n)$ || Programação Dinâmica ||
   1. $$S(j) =
   \begin{cases}
    0                                     & \text{, se } j = 1 \\
    \max(S(j-1) + A[j], A[j] - A[j-1], 0) & \text{, se } j \geq 2 \\
   \end{cases}
   $$
5. [F] $2T(n/2) + O(1) = O(n)$

---

### Computando 2D

$$
S(j) =
\begin{cases}
  0                                     & \text{, se } j = 1 \\
  \max(S(j-1) + A[j], A[j] - A[j-1], 0) & \text{, se } j \geq 2 \\
\end{cases}
$$

$OPT = \max_{1 \leq j \leq n} S(j)$

|  Day   |   0   |   1   |   2   |   3   |   4   |   5   |   6   |   7   |   8   |   9   |  10   |  11   |  12   |  13   |  14   |  15   |  16   |
| :----: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Price  |  110  |  113  |  110  |  85   |  105  |  102  |  86   |  63   |  81   |  101  |  94   |  106  |  101  |  79   |  94   |  90   |  97   |
| Change |       |  13   |  -3   |  -25  |  20   |  -3   |  -16  |  -23  |  18   |  20   |  -7   |  12   |  -5   |  -22  |  15   |  -4   |   7   |

OPA! E o dia de compra???

|   O   |   1    |   2   |
| :---: | :----: | :---: |
|   0   | 0 + 13 |  10   |

## Questão 3

Closes Pait: distância euclidiana, $x$ distintos, Divisão e Conquista pela mediana, 2 sub p de $|x/2|$, resultado final com Conquer

---

1. [F] Precisa processar lados cinzas [V]; $\Omega(n) [F]; Computa apenas $O(n)$ pares [V].
2. [V] Divisão $\Theta(n \log n)$ || Conquer $\Theta(n)$ || Total $\Theta(n \log n)$
   1. É uma soma, né? 🤔
3. [F] Conquer processa todo no cinza [V] || Distância euclidiana $\Omega(n^2)$ na faixa || Pontos na faixa $\Theta(n)$ [F]
4. [F] Se custo div = $O(n)$; Custo conquista = $\Theta(n)$; Total = $\Theta(n \log n)$
   1. E isso faz algum sentido?
5. [V] Conquistar processa todos no cinza, não computa ponto $distância(P, L) > \sigma$, onde $\sigma = \min distância(CP(Left), CP(Right))$

## Questão 4

Sort and Count || Divisão e Conquista || Contar Inversões || 2 Listas ordenadas de $n$ elementos $L_1 = (1, 2, \dots, n)$; $L_2 = (a_1, a_2, \dots, a_n)$; $L_2 =$ entrada do problema:

Definição de Inversão: $i < j$ em $L_1 \cap a_i > a_j$ em $L_2$.

---

1. [V] $(1, 5, 4, 8, 10, 2, 6, 9, 3, 7)$ Inversões = 17 (Deveria ser 17)
2. [F] $(10, 1, 4, 5, 8, 2, 6, 9, 3, 7)$ Inversões = 17 (Deveria ser 20)
3. [V] $(10, 1, 4, 5, 8)$ Inversões = 4 (Deveria ser 4)
4. [F] $(1, 5, 4, 8, 10, 2, 6, 9, 3, 7)$ Inversões = 13 (Deveria ser 17)
5. [V] $(10, 1, 4, 5, 8, 2, 6, 9, 3, 7)$ Inversões = 20 (Deveria ser 20)

## Questão 5

$n$ números, encontrar $i$ maiores em ordem crescente, comparações. Algoritmos:

[a == b?]

1. Ordenar lista heapsort e listar $i$ maiores [n \log n? n \log n + i \log n?]
2. Lista de prioridade (heap), extrair máximo $i$ vezes [n \log n? n \log n + i \log n?]
3. Ordem estatística [?], encontrar i-ésimo maior,  particionar a partir disse e ordenar a lista com os $i$ maiores. [$O(?) n + i \log i$]

---

1. [V*] (3) é sempre melhor ou igual aos outros
2. [F*] para valores pequenos de $i = O(1), o de menor custo é (1) [Acho que seria (3)]
3. [V*] (1) é $\Theta(n \log n + i) [acho que dá pra ser]
4. [F*] (2) e (3) melhores ou iguais a (1)
5. [F] (2) $\theta(n + i \log n)$ [me parece mais um $\Theta(n \log n + i)$ [heap + extração]]
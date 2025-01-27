# Prova 4 - 2024.2

## Questão 2 - 2,0 pontos

P, NP, Co-NP, NPC

---

1. [V] $(P = NP) \to (NP = CoNP)$
2. [V] $X_2 \leq_p X_1$
3. [V] $X_2 \in CoNP$
4. [V] $X_1 \in NP$
5. [V] $(NP \neq CoNP) \to (P \neq NP)$

## Questão 3 - 4,0 pontos

Shortest Pathm Terminal $1 \leq i \leq n$, $d[v]$ Shortest Path $v \to t$; $Successor[v] = Grafo Paths$

$$
BFM: OPT(i, v) =
\begin{cases}
  0                                                            & \text{se } i = 0 \text{ e } v = t \\
  \infty                                                       & \text{se } i = 0 \text{ e } v \neq t \\
  \min (OPT(1-i, v), \min_{(v, w) \in E} OPT(i-1, w) + i_{vw}) & \text{se } i > 0 \\
\end{cases}
$$

---

1. [F] Ciclo precoce por $d[i] == d[i-1]$
   - Pode haver estagnação temporária
2. [F] Após $i$, $v \in V$ $d[v]$ $\min \leq i$ arestas monotônicas não crescente.
   - Pode ser um Ham-Path-Negativo
3. [V] $v \in V: (n, v) = (n-1, v):$ sem ciclo negativo
4. [V] Otim: não $proces(v, w)$ se $W_w[i] = W_w[i-1]$; Se $SP \leq k \leq (n-1)$; End = k
   - Talvez Pegadinha
5. [F] Após $i=(n-1); d[v] = SP$ $v \to t$;
   - Pode ser Ham-Path-Negativo

## Questão 6 - 2,0 pontos

Algoritmo $A_q$, Problema de decisão Q em tempo Polinomial pelo tamanho da entrada. Problema de decisão $P \leq_P Q$ Cook.

---

1. [F] I_q Inst Q. $\exists$ Solu(I_p) \leftrightarrow Solu(I_q)$
   - Nem todo Knapsack corresponde diretamente Subset... ~~Ou Será que...~~ Só se $P \in NPC \wedge Q \in NPC$
2. [V] Resolve $I_p$ polinomial combin $P \leq_P Q \wedge Poly(A_q)$
3. [F] $Q \leq_P P:$ Pelo menos tão Hard Q
4. [V] $P \leq_P Q:$ pelo menos tão Hard P
5. [?] Red $P \to Q$: Função sobrejetora (?)

## Questão 4 - 4,0 pontos (10h01)

Conjunto Incidente (CI), $A = \{a_1, \dots, a_n\}$, Coleções $B_1, \dots, B_m$ subconjunto A. Encontrar C. $H \subseteq A$, tal que H contenha pelo menos 1 elemento de cada $B_i$: $H \cap B_i \neq 0$. $\exists |CI| = K$?

VC (Vertex Cover), IS (Independent Set), parâmetro de decisão $k$, $(V \wedge IS) \in NPC$.

---

1. [V] $CI \in NP$ cert $|H| \leq k$ polinomial $n \time m$ se Algum $b \in B_i \supseteq k$
2. [F] $(CI \in NP \wedge VC \leq_P CI) \to (CI \in P \to VC \in P)$
3. [F] $VC \leq_P CI: A \leftarrow E \wedge B_i = [u, i], \forall (u_i, v_i) \in V \times V$
4. [V] $(CI \in P \wedge IS \leq_P CI) \to (P = NP)$
5. [F] $CI \in NP:$ list |subconjuntos| $= k$ e verif se $\exists b \in B_i$, $b \in H$ polinomial $n \times m$
   - Todo $to$ EXP

## Questão 1 - 4,0 pontos (10h30)

CI, CIP_{Máx}

---

1. [F]
2. [V] $\Delta$ e muita coisa que não li
3. [F] $CIP \leq CI$
   - Seria o oposto
4. [V] Árvore com pesos
5. [V] $CIP \in NP$: adivinha $I \sum w = z \exists para Vértices \in I, conec aresta
   - $O(|I|^2 m) m = aresta G$

## Questão 5 - 4,0 pontos

1. A
2. A
3. A
4. A
5. A


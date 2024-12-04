# asd

## Desafio de aula - Extra

$$
T(n) =
\begin{cases}
  0                                                       & \text{if } n = 1 \\
  T(\lceil n/2 \rceil) + T(\lfloor n/2 \rfloor) + n - 1   & \text{if } n > 1 \\
\end{cases}
$$

- $n_1 = \lceil n/2 \rceil$;
- $n_2 = \lfloor n/2 \rfloor$;
- $n = n_1 + n_2$;

---

- $T(n) = T(\lceil n/2 \rceil) + T(\lfloor n/2 \rfloor) + n - 1$
- $T(n) = T(n_1) + T(n_2) + n - 1$
- $T(n_1) = T(\lceil n_1/2 \rceil) + T(\lfloor n_1/2 \rfloor) + n_1 - 1$
- $T(n_2) = T(\lceil n_2/2 \rceil) + T(\lfloor n_2/2 \rfloor) + n_2 - 1$

---

## Exercícios de aula

### Módulo 3 - Paradigma Divisão e Conquista

#### Livro Kleinberg e Tardos: Cap. 5

##### Solved Exercise 1

Suppose you are given an array A with n entries, with each entry holding a distinct number. You are told that the sequence of values $A[1], A[2], \dots , A[n]$ is unimodal: For some index $p$ between $1$ and $n$, the values in the array entries increase up to position $p$ in $A$ and then decrease the remainder of the way until position $n$. (So if you were to draw a plot with the array position $j$ on the $x$-axis and the value of the entry $A[j]$ on the $y$-axis, the plotted points would rise until $x$-value $p$, where they’d achieve their maximum, and then fall from there on.)

You'd like to find the "peak entry" $p$ without having to read the entire array—in fact, by reading as few entries of $A$ as possible. Show how to find the entry $p$ by reading at most $O(\log n)$ entries of $A$.

##### Solved Exercise 2

You're consulting for a small computation-intensive investment company, and they have the following type of problem that they want to solve over and over. A typical instance of the problem is the following. They're doing a simulation in which they look at $n$ consecutive days of a given stock, at some point in the past. Let's number the days $i = 1, 2, \dots , n$; for each day $i$, they have a price $p(i)$ per share for the stock on that day. (We'll assume for simplicity that the price was fixed during each day.) Suppose during this time period, they wanted to buy $1,000$ shares on some day and sell all these shares on some (later) day. They want to know: When should they have bought and when should they have sold in order to have made as much money as possible? (If there was no way to make money during the n days, you should report this instead.)

For example, suppose $n = 3, p(1) = 9, p(2) = 1, p(3) = 5$. Then you should return "buy on $2$, sell on $3$" (buying on day $2$ and selling on day $3$ means they would have made \$4 per share, the maximum possible for that period).

Clearly, there’s a simple algorithm that takes time $O(n^2)$: try all possible pairs of buy/sell days and see which makes them the most money. Your investment friends were hoping for something a little better.

Show how to find the correct numbers $i$ and $j$ in time $O(n \log n)$.

##### Exercise 1

You are interested in analyzing some hard-to-obtain data from two separate databases. Each database contains n numerical values—so there are $2n$ values total—and you may assume that no two values are the same. You’d like to determine the median of this set of $2n$ values, which we will define here to be the $n^{th}$ smallest value.

However, the only way you can access these values is through queries to the databases. In a single query, you can specify a value $k$ to one of the two databases, and the chosen database will return the $k^{th}$ smallest value that it contains. Since queries are expensive, you would like to compute the median using as few queries as possible.

Give an algorithm that finds the median value using at most $O(\log n)$ queries.

##### Exercise 2

Recall the problem of finding the number of inversions. As in the text, we are given a sequence of $n$ numbers $a_1, \dots, a_n$, which we assume are all distinct, and we define an inversion to be a pair $i < j$ such that $a_i > a_j$.

We motivated the problem of counting inversions as a good measure of how different two orderings are. However, one might feel that this measure is too sensitive. Let’s call a pair a significant inversion if $i < j$ and $ai > 2a_j$. Give an $O(n \log n)$ algorithm to count the number of significant inversions between two orderings.

##### Exercise 6

Consider an $n$-node complete binary tree $T$, where $n = 2d − 1$ for some $d$. Each node $v$ of $T$ is labeled with a real number $x_v$. You may assume that the real numbers labeling the nodes are all distinct. A node $v$ of $T$ is a local minimum if the label $x_v$ is less than the label $x_w$ for all nodes $w$ that are joined to $v$ by an edge.

You are given such a complete binary tree $T$, but the labeling is only specified in the following implicit way: for each node $v$, you can determine the value $x_v$ by probing the node $v$. Show how to find a local minimum of $T$ using only $O(\log n)$ probes to the nodes of $T$.

#### Livro Cormen (3rd Ed.): Cap. 9

### Módulo 3 - Paradigma Programação Dinâmica

### Módulo 4 - NP e Intratabilidade Computacional

- Módulo 3 – Paradigma Divisão e Conquista
  - Livro Kleinberg e Tardos: Cap. 5
    - Exercícios resolvidos 1 e 2, e
    - Exercícios 1, 2, 6 (ao final do capítulo).
  - Livro Cormen (3rd Ed.): Cap. 9
    - Exercícios 9-1, 9.3-1, 9.3-5, 9.3-8.
- Módulo 3 – Paradigma Programação Dinâmica
  - Livro Kleinberg e Tardos: Cap. 6
    - Exercicio resolvido 1, e
    - Exercícios 1, 3, 7, 13 (ao final do capítulo).
- Módulo 4 – NP e Intratabilidade Computacional
  - Livro Kleinberg e Tardos: Cap. 8
    - Exercícios resolvidos 1 e 2, e
    - Exercícios 1, 2, 3, 5, 17, 26 (ao final do capítulo).

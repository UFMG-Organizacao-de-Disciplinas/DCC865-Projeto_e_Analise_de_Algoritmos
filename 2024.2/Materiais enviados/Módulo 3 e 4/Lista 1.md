# asd

## Exercícios de aula






## Exercícios de aula

### Módulo 3 - Paradigma Divisão e Conquista

#### Livro Kleinberg e Tardos: Cap. 5

##### Solved Exercise 1

Suppose you are given an array A with n entries, with each entry holding a distinct number. You are told that the sequence of values $A[1], A[2], \dots , A[n]$ is unimodal: For some index $p$ between $1$ and $n$, the values in the array entries increase up to position $p$ in $A$ and then decrease the remainder of the way until position $n$. (So if you were to draw a plot with the array position $j$ on the $x$-axis and the value of the entry $A[j]$ on the $y$-axis, the plotted points would rise until $x$-value $p$, where they'd achieve their maximum, and then fall from there on.)

You'd like to find the "peak entry" $p$ without having to read the entire array—in fact, by reading as few entries of $A$ as possible. Show how to find the entry $p$ by reading at most $O(\log n)$ entries of $A$.

##### Solved Exercise 2

You're consulting for a small computation-intensive investment company, and they have the following type of problem that they want to solve over and over. A typical instance of the problem is the following. They're doing a simulation in which they look at $n$ consecutive days of a given stock, at some point in the past. Let's number the days $i = 1, 2, \dots , n$; for each day $i$, they have a price $p(i)$ per share for the stock on that day. (We'll assume for simplicity that the price was fixed during each day.) Suppose during this time period, they wanted to buy $1,000$ shares on some day and sell all these shares on some (later) day. They want to know: When should they have bought and when should they have sold in order to have made as much money as possible? (If there was no way to make money during the n days, you should report this instead.)

For example, suppose $n = 3, p(1) = 9, p(2) = 1, p(3) = 5$. Then you should return "buy on $2$, sell on $3$" (buying on day $2$ and selling on day $3$ means they would have made \$4 per share, the maximum possible for that period).

Clearly, there's a simple algorithm that takes time $O(n^2)$: try all possible pairs of buy/sell days and see which makes them the most money. Your investment friends were hoping for something a little better.

Show how to find the correct numbers $i$ and $j$ in time $O(n \log n)$.

##### Exercise 1

You are interested in analyzing some hard-to-obtain data from two separate databases. Each database contains n numerical values—so there are $2n$ values total—and you may assume that no two values are the same. You'd like to determine the median of this set of $2n$ values, which we will define here to be the $n^{th}$ smallest value.

However, the only way you can access these values is through queries to the databases. In a single query, you can specify a value $k$ to one of the two databases, and the chosen database will return the $k^{th}$ smallest value that it contains. Since queries are expensive, you would like to compute the median using as few queries as possible.

Give an algorithm that finds the median value using at most $O(\log n)$ queries.

##### Exercise 2

Recall the problem of finding the number of inversions. As in the text, we are given a sequence of $n$ numbers $a_1, \dots, a_n$, which we assume are all distinct, and we define an inversion to be a pair $i < j$ such that $a_i > a_j$.

We motivated the problem of counting inversions as a good measure of how different two orderings are. However, one might feel that this measure is too sensitive. Let's call a pair a significant inversion if $i < j$ and $ai > 2a_j$. Give an $O(n \log n)$ algorithm to count the number of significant inversions between two orderings.

##### Exercise 6

Consider an $n$-node complete binary tree $T$, where $n = 2d - 1$ for some $d$. Each node $v$ of $T$ is labeled with a real number $x_v$. You may assume that the real numbers labeling the nodes are all distinct. A node $v$ of $T$ is a local minimum if the label $x_v$ is less than the label $x_w$ for all nodes $w$ that are joined to $v$ by an edge.

You are given such a complete binary tree $T$, but the labeling is only specified in the following implicit way: for each node $v$, you can determine the value $x_v$ by probing the node $v$. Show how to find a local minimum of $T$ using only $O(\log n)$ probes to the nodes of $T$.

#### Livro Cormen (3rd Ed.): Cap. 9

##### Exercises 9.1-1

Show that the second smallest of $n$ elements can be found with $n + \lroof \log n \rroof -2$ comparisons in the worst case. (Hint: Also find the smallest element.)

##### Exercises 9.1-2 *

Prove the lower bound of $\lroof 3n/2 \rroof$ comparisons in the worst case to find both the maximum and minimum of $n$ numbers. (Hint: Consider how many numbers are potentially either the maximum or minimum, and investigate how a comparison affects these counts.)

##### Exercises 9.3-1

In the algorithm SELECT, the input elements are divided into groups of 5. Will
the algorithm work in linear time if they are divided into groups of 7? Argue that
SELECT does not run in linear time if groups of 3 are used.

##### Exercises 9.3-5

Suppose that you have a "black-box" worst-case linear-time median subroutine. Give a simple, linear-time algorithm that solves the selection problem for an arbitrary order statistic.

##### Exercises 9.3-8

Let $X[1 .. n]$ and $Y[1 .. n]$ be two arrays, each containing $n$ numbers already in sorted order. Give an $O(\log n)$-time algorithm to find the median of all $2n$ elements in arrays $X$ and $Y$.

### Módulo 3 - Paradigma Programação Dinâmica

#### Livro Kleinberg e Tardos: Cap. 6

##### Solved Exercise - Cap. 6 - 1

Suppose you are managing the construction of billboards on the Stephen Daedalus Memorial Highway, a heavily traveled stretch of road that runs west-east for $M$ miles. The possible sites for billboards are given by numbers $$x_1, x_2 , \dots, x_n$, each in the interval $[0, M]$ (specifying their position along the highway, measured in miles from its western end). If you place a billboard at location $x_i$, you receive a revenue of $r_i > 0$.

Regulations imposed by the county's Highway Department require that no two of the billboards be within less than or equal to 5 miles of each other. You'd like to place billboards at a subset of the sites so as to maximize your total revenue, subject to this restriction.

**Example.** Suppose $M = 20$, $n = 4$,

$${x_1, x_2 , x_3 , x_4} = {6, 7, 12, 14},$$

and

$${r_1 , r_2 , r_3 , r_4} = {5, 6, 5, 1}.$$

Then the optimal solution would be to place billboards at $x_1$ and $x_3$, for a total revenue of 10.

Give an algorithm that takes an instance of this problem as input and returns the maximum total revenue that can be obtained from any valid subset of sites. The running time of the algorithm should be polynomial in $n$.

##### Solved Exercise - Cap. 6 - 1 - Solution

We can naturally apply dynamic programming to this problem if we reason as follows. Consider an optimal solution for a given input instance; in this solution, we either place a billboard at site $x_n$ or not. If we don't, the optimal solution on sites $x_1, \dots, x_n$ is really the same as the optimal solution on sites $x_1, \dots, x_{n-1}$; if we do, then we should eliminate $x_n$ and all other sites that are within 5 miles of it, and find an optimal solution on what's left. The same reasoning applies when we're looking at the problem defined by just the first $j$ sites, $x_1, \dots, x_j$: we either include $x_j$ in the optimal solution or we don't, with the same consequences.

Let's define some notation to help express this. For a site $x_j$, we let $e(j)$ denote the easternmost site $x_i$ that is more than 5 miles from $x_j$. Since sites are numbered west to east, this means that the sites $x_1, x_2, \dots, x_e(j)$ are still valid options once we've chosen to place a billboard at x_j, but the sites $x_{e(j)+1}, \dots, $x_{j-1}$ are not.

Now, our reasoning above justifies the following recurrence. If we let $OPT(j)$ denote the revenue from the optimal subset of sites among $x_1, \dots, x_j$, then we have

$$OPT(j) = \max(r_j + OPT(e(j)), OPT(j - 1)).$$

We now have most of the ingredients we need for a dynamic programming algorithm. First, we have a set of $n$ subproblems, consisting of the first $j$ sites for $j = 0, 1, 2, \dots, n$. Second, we have a recurrence that lets us build up the solutions to subproblems, given by $OPT(j) = \max(r_j + OPT(e(j)), OPT(j - 1))$.

To turn this into an algorithm, we just need to define an array $M$ that will store the $OPT$ values and throw a loop around the recurrence that builds up the values $M[j]$ in order of increasing $j$.

---

- Initialize $M[0] = 0$ and $M[1] = r1$
- For $j = 2, 3, \dots, n:$
  - Compute $M[j]$ using the recurrence
- $Endfor$
- Return $M[n]$

---

As with all the dynamic programming algorithms we've seen in this chapter, an optimal _set_ of billboards can be found by tracing back through the values in array $M$.

Given the values $e(j)$ for all $j$, the running time of the algorithm is $O(n)$, since each iteration of the loop takes constant time. We can also compute all $e(j)$ values in $O(n)$ time as follows. For each site location #x_i#, we deﬁne $x^{'}_{i} = x_i - 5$. We then merge the sorted list $x_1, \dots, x_n$ with the sorted list $x^{'}_{1}, \dots, x^{'}_{n} in linear time, as we saw how to do in Chapter 2. We now scan through this merged list; when we get to the entry x^{'}_{j}, we know that anything from this point onward to $x_j$ cannot be chosen together with $x_j$ (since it's within 5 miles), and so we simply define $e(j)$ to be the largest value of $i$ for which we've seen $x_i$ in our scan.

Here's a final observation on this problem. Clearly, the solution looks very much like that of the Weighted Interval Scheduling Problem, and there's a fundamental reason for that. In fact, our billboard placement problem can be directly encoded as an instance of Weighted Interval Scheduling, as follows. Suppose that for each site $x_i$, we define an interval with endpoints $[x_i - 5, x_i]$ and weight $r_i$. Then, given any nonoverlapping set of intervals, the corresponding set of sites has the property that no two lie within 5 miles of each other. Conversely, given any such set of sites (no two within 5 miles), the intervals associated with them will be nonoverlapping. Thus the collections of nonoverlapping intervals correspond precisely to the set of valid billboard placements, and so dropping the set of intervals we've just defined (with their weights) into an algorithm for Weighted Interval Scheduling will yield the desired solution.

##### Exercises - Cap. 6 - 1

Let $G = (V, E)$ be an undirected graph with $n$ nodes. Recall that a subset of the nodes is called an independent set if no two of them are joined by an edge. Finding large independent sets is difficult in general; but here we’ll see that it can be done efficiently if the graph is “simple” enough.

Call a graph $G = (V, E)$ a path if its nodes can be written as $v_1, v_2, \dots, v_n$, with an edge between $v_i$ and $v_j$ if and only if the numbers $i$ and $j$ differ by exactly 1. With each node $v_i$, we associate a positive integer weight $w_i$.

Consider, for example, the five-node path drawn in Figure 6.28. The weights are the numbers drawn inside the nodes.

The goal in this question is to solve the following problem:

_Find an independent set in a path $G$ whose total weight is as large as possible._

---

Figure 6.28

```mermaid
Graph LR
  A((1))
  B((8))
  C((6))
  D((3))
  E((6))

  A <--> B <--> C <--> D <--> E
```

###### Cap. 6, Q. 1a (Pág. 312)

Give an example to show that the following algorithm _does not_ always find an independent set of maximum total weight.

- The "heaviest-first" greedy algorithm
  - Start with $S$ equal to the empty set
  - While some node remains in $G$
    - Pick a node $v_i$ of maximum weight
    - Add $v_i$ to $S$
    - Delete $v_i$ and its neighbors from $G$
  - Endwhile
  - Return $S$

###### Cap. 6, Q. 1b (Pág. 312)

Give an example to show that the following algorithm also does not always find an independent set of maximum total weight.

---

- Let $S_1$ be the set of all $v_i$ where $i$ is an odd number
- Let $S_2$ be the set of all $v_i$ where $i$ is an even number
- (Note that $S_1$ and $S_2$ are both independent sets)
- Determine which of $S_1$ or $S_2$ has greater total weight, and return this one

---

###### Cap. 6, Q. 1c (Pág. 313)

Give an algorithm that takes an $n$-node path $G$ with weights and returns an independent set of maximum total weight. The running time should be polynomial in $n$, independent of the values of the weights.

##### Exercises - Cap. 6, Q. 3 (Pág. 314)

Let $G = (V, E)$ be a directed graph with nodes $v_1, \dots, v_n$. We say that $G$ is an _ordered graph_ if it has the following properties.

1. Each edge goes from a node with a lower index to a node with a higher index. That is, every directed edge has the form $(v_i, v_j)$ with $i < j$.
2. Each node except $v_n$ has at least one edge leaving it. That is, for every node $v_i$, $i = 1, 2, \dots, n - 1$, there is at least one edge of the form $(v_i, v_j)$.

The length of a path is the number of edges in it. The goal in this question is to solve the following problem (see Figure 6.29 for an example).

> Given an ordered graph $G$, ﬁnd the length of the longest path that begins at $v_1$ and ends at $v_n$.

---

**Figure 6.29** The correct answer for this ordered graph is 3: The longest path from $v_1$ to $v_n$ uses the three edges $(v_1 , v_2)$, $(v_2 , v_4)$, and $(v_4 , v_5)$.

```mermaid
Graph LR
    A(("v_1"))
    B(("v_2"))
    C(("v_3"))
    D(("v_4"))
    E(("v_5"))

    A --> B & D
    B --> D & E
    C --> D --> E
```

---

##### Exercises - Cap. 6, Q. 3a (Pág. 314)

Show that the following algorithm does not correctly solve this problem, by giving an example of an ordered graph on which it does not return the correct answer.

---

- Set $w = v_1$
- Set $L = 0$
- While there is an edge out of the node $w$
  - Choose the edge $(w, v_j)$
    - for which $j$ is as small as possible
  - Set $w = v_j$
  - Increase $L$ by $1$
- end while
- Return $L$ as the length of the longest path

---

In your example, say what the correct answer is and also what the algorithm above finds.

##### Exercises - Cap. 6, Q. 3b (Pág. 315)

Give an efficient algorithm that takes an ordered graph $G$ and returns the length of the longest path that begins at $v_1$ and ends at $v_n$. (Again, the length of a path is the number of edges in the path.)

##### Exercises - Cap. 6 - 7

##### Exercises - Cap. 6 - 13

### Módulo 4 - NP e Intratabilidade Computacional

- Módulo 3 – Paradigma Divisão e Conquista
  - Livro Kleinberg e Tardos: Cap. 5
    - Exercícios resolvidos 1 e 2, e
    - Exercícios 1, 2, 6 (ao final do capítulo).
  - Livro Cormen (3rd Ed.): Cap. 9
    - Exercícios 9-1, 9.3-1, 9.3-5, 9.3-8.
- Módulo 3 – Paradigma Programação Dinâmica
  - Livro Kleinberg e Tardos: Cap. 6
    - Exercício resolvido 1, e
    - Exercícios 1, 3, 7, 13 (ao final do capítulo).
- Módulo 4 – NP e Intratabilidade Computacional
  - Livro Kleinberg e Tardos: Cap. 8
    - Exercícios resolvidos 1 e 2, e
    - Exercícios 1, 2, 3, 5, 17, 26 (ao final do capítulo).

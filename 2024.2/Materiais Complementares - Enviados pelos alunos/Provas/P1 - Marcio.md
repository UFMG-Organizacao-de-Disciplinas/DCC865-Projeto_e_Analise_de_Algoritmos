# Prova 1

5 pontos por questão.

## 1. Fazer algoritmo com complexidades específicas

### A. $O(n^3 + n \log n)$

- Pseudocódigo flor
  - Entrada: vetor de inteiros v, inteiro size
  - for i -> size:
    - for j -> size:
      - for k -> size:
        - b <- b + 1
  - for i -> size:
    - for j -> size/2^j: [JV: Tá certo??]
      - b <- b + 1

### B. $O(n^2 + n + \log n)$

- Pseudocódigo flor
  - Entrada: vetor de inteiros v, inteiro size
  - for i -> size:
    - for j -> size:
      - b <- b + 1
  - for i -> size:
    - b <- b + 1
  - for i -> size/2^i: [JV: Tá certo??]
    - b <- b + 1

## 2. Verdadeiro ou falso

### A~C. análise amortizada

### D~J. Complexidade

## 3. Prova matemática

### A. $f(n) = O(g(n)) \rightarrow 2^{f(n)} = O(2^{g(n)})$

### B. $f(n) = O(g(n)) \rightarrow g(n) = \Omega (f(n))$

## 4. Resolver equações de recorrência

### A. $F(n) = F(n-1) + \frac{n}{2}$

### B. $F(n) = F(n-1) + \log(n)$

## 5. Resolver com teorema mestre $T(n) = 4T(\frac{n}{2}) + X$; e achar $X$ tal que

### A. $f(n) = \Theta(n^2)$

### B. $f(n) = \Theta(n^2 \log n)$

### C. $f(n) = \Theta(n^3 \log n)$

### D. X tal que não dá pra resolver pelo teorema mestre

# Resolvendo as listas do módulo 1

## Lista 1

Universidade Federal de Minas Gerais
Departamento de Computação
Projeto e Análise de Algoritmos - 2024.2
Professor: Marcio Costa Santos
Lista 1

---

### **Exercício 1.** Determine a função de complexidade do algoritmo abaixo e indique sua complexidade de

a. Melhor caso
b. Caso médio
c. Pior caso

### Pseudocódigo Q1

- **Entrada**: Vetor de $n$ inteiros $a$
- $cnt \leftarrow 0$;
- **para todo** $i \leftarrow 0$ até $n − 1$ **faça**
  - **se** $a[i]\%2 = 0$ **então**
    - $cnt \leftarrow cnt + 1$;
- **retorna** cnt;

---

### **Exercício 2.** Determine a função de complexidade do algoritmo abaixo e indique sua complexidade de

a. Melhor caso
b. Caso médio
c. Pior caso

### Pseudocódigo Q2

- **Entrada:** Matrizes $n \times n$ $A$ e $B$
- C $\leftarrow$ matriz vazia;
- **para todo** $i \leftarrow 0$ até $n − 1$ **faça**
  - **para todo** $j $\leftarrow$ 0$ até $n − 1$ **faça**
    - $C[i, j] \leftarrow 0$;
    - **para todo** $k \leftarrow 0$ até $n − 1$ **faça**
      - $C[i, j] \leftarrow C[i, j] + A[i, k] ∗ B[k, j]$;
- **retorna** $C$;

---

### **Exercício 3.** Considere o seguinte algoritmo

a. Simule a execução do algoritmo para o vetor [3, 5, 2, 8, 9]
b. O que esse algoritmo faz?
c. Qual sua complexidade de pior caso?
d. Qual sua complexidade de melhor caso?

### Pseudocódigo Q3

- **Entrada:** vetor de inteiros A, tamanho n de A
- **para todo** j $\leftarrow$ $2$ até $n$ **faça**
  - $chave \leftarrow A[j]$;
  - $i \leftarrow j − 1$;
  - enquanto $i > 0$ e $A[i] \geq chave$ **faça**
    - $A[i + 1] \leftarrow A[i]$;
    - $i \leftarrow i − 1$;
  - $A[i + 1] \leftarrow chave$;
- **retorna** A;

---

### **Exercício 4.** Considere o seguinte algoritmo

a. Simule a execução do algoritmo para o vetor [3, 5, 2, 8, 9]
b. O que esse algoritmo faz?
c. Qual sua complexidade de pior caso?
d. Qual sua complexidade de melhor caso?

### Pseudocódigo Q4

- **Entrada:** vetor de inteiros $A$, tamanho $n$ de $A$
- **para todo** $i \leftarrow 1$ até $n − 1$ **faça**
  - **para todo** $j \leftarrow n$ até $i + 1$ **faça**
    - **se** $A[j] < A[j − 1]$ **então**
      - troque $A[j]$ com $A[j − 1]$;
- **retorna** A;

---

### **Exercício 5.** Determine um limite superior assintótico para as funções abaixo(de preferência o mais apertado possível)

1. $2n^3 + n^4 − 1$
2. $2n + 5 \log n + n^2$
3. $\log_{10} n + \log_{3} 10$
4. $n + n \log n + \log n$
5. $4^n + 2^n + n$

---

### **Exercício 6.** Determine um limite superior assintótico para as funções abaixo(de preferência o mais apertado possível)

1. $2n^3 + n^4 − 1$
2. $2n + 5 \log n + n^2$
3. $\log_{10} n + \log_{3} 10$
4. $n + n \log n + \log n$
5. $4^n + 2^n + n$

---

### **Exercício 7.** Determine um limite superior assintótico restrito para as funções abaixo(de preferência o mais apertado possível)

1. $2n^3 + n^4 − 1$
2. $2n + 5 \log n + n^2$
3. $\log_{10} n + \log_{3} 10$
4. $n + n \log n + \log n$
5. $4^n + 2^n + n$

---

### **Exercício 8.** Determine um limite inferior assintótico para as funções abaixo(de preferência o mais apertado possível)

1. $2n^3 + n^4 − 1$
2. $2n + 5 \log n + n^2$
3. $\log_{10} n + \log_{3} 10$
4. $n + n \log n + \log n$
5. $4^n + 2^n + n$

---

### **Exercício 9.** Determine um limite inferior assintótico restrito para as funções abaixo(de preferência o mais apertado possível)

1. $2n^3 + n^4 − 1$
2. $2n + 5 \log n + n^2$
3. $\log_{10} n + \log_{3} 10$
4. $n + n \log n + \log n$
5. $4^n + 2^n + n$

---

### **Exercício 10.** Determine uma equivalência assintótica para as funções abaixo

1. $2n^3 + n^4 − 1$
2. $2n + 5 \log n + n^2$
3. $\log_{10} n + \log_{3} 10$
4. $n + n \log n + \log n$
5. $4^n + 2^n + n$

---

### **Exercício 11.** Dadas funções $f(n)$, $h(n)$ e $g(n)$ prove que

1. Se $f(n) = O(g(n))$ e $g(n) = O(h(n))$ então $f(n) = O(h(n))$
2. $f (n) = O(f (n))$
3. Se $f (n) = \Omega(g(n))$ e $g(n) = \Omega(h(n))$ então $f (n) = \Omega(h(n))$
4. $f (n) = \Omega(f (n))$
5. $f (n) \neq o(f (n))$
6. $f (n) \neq w(f (n))$

---

### **Exercício 12.** Prove que $n^3 \neq O(n^2)$

---

### **Exercício 13.** Prove que $n \neq O(\log n)$

---

### **Exercício 14.** Prove que $\sum^{n}_{i=1} i = \Theta (n^2)$, utilizando uma prova por indução

---

### **Exercício 15.** Prove que $\sum^{n}_{i=1} \frac{1}{k} = \Theta(\log n)$

---

## Lista 2

Universidade Federal de Minas Gerais
Departamento de Computação
Projeto e Análise de Algoritmos - 2024.2
Professor: Marcio Costa Santos
Lista 2

---

Considere que todas as recorrência descritas possuem caso base (ou casos bases) iguais a 1.

### **Exercício 1.** Determine e prove uma equivalência assintótica para todas as recorrências abaixo

#### 1. $T (n) = T (n − 3) + 1$

0. $T (n  ) = T (n − 3) + 1         \Leftrightarrow T(n - 0*3) = T (n - (0+1)*3) + (0+1)$
1. $T (n-3) = T (n − 6) + 1 + 1     \Leftrightarrow T(n - 1*3) = T (n - (1+1)*3) + (1+1)$
2. $T (n-6) = T (n − 9) + 1 + 1 + 1 \Leftrightarrow T(n - 2*3) = T (n - (2+1)*3) + (2+1)$
3. $\vdots$
4. $T(n - k*3) = T (n - (k+1)*3) + (k+1)$
5. $\vdots$
6. $T(n - (\frac{n-3}{3})*3) = T (0) + (\frac{n-3}{3}+1) \Leftrightarrow T(3) = 1 + (\frac{n-3}{3}+1)$

$$
Eq1:\\
n - (k+1)*3 = 0\\
n = (k+1)*3\\
n = 3k + 3\\
k = \frac{n-3}{3}
$$

[JV: Tá concluída?]
[JV: Aparentemente para concluir eu preciso dizer que...]

---

#### 2. $T (n) = 2T (n − 2) + \log n$

#### 3. $T (n) = T (n − 1) + n$

#### 4. $T (n) = 2T (n − 1) + n^2 + 1$


---

### **Exercício 2.** Determine e prove uma equivalência assintótica para todas as recorrências abaixo. **Não use o teorema mestre**

1. $T (n) = 2T ( \frac{n}{2} ) + 1$
2. $T (n) = 4T ( \frac{n}{2} ) + \log n$
3. $T (n) = 7T ( \frac{n}{3} ) + n$

---

### **Exercício 3.** Usando o teorema mestre determine uma equivalência assintótica para

1. $T (n) = 2T ( \frac{n}{4} ) + 1$
2. $T (n) = 2T ( \frac{n}{4} ) + n$
3. $T (n) = 2T ( \frac{n}{4} ) + \log n$
4. $T (n) = 4T ( \frac{n}{2} ) + 1$
5. $T (n) = 4T ( \frac{n}{2} ) + n$
6. $T (n) = 4T ( \frac{n}{2} ) + \log n$
7. $T (n) = 2T ( \frac{n}{2} ) + 1$
8. $T (n) = 2T ( \frac{n}{2} ) + \log n$
9. $T (n) = 2T ( \frac{n}{2} ) + n$
10. $T (n) = 2T ( \frac{n}{3} ) + 1$
11. $T (n) = 2T ( \frac{n}{3} ) + \log n$
12. $T (n) = 2T ( \frac{n}{3} ) + n$

---

### **Exercício 4.** Determine um limite assintótico para $T (n) = 2T (\sqrt{n})$. Dica: Faça uma substituição de variável. Faça $m = \log n$

---

### **Exercício 5.** Determine um limite assintótico para $T (n) = 2T (\sqrt{n}) + \log n$. Dica: Faça uma substituição de variável. Faça $m = \log n$

---

### **Exercício 6.** Determine e prove uma equivalência assintótica para $T (n) = T ( \frac{n}{4} ) + T ( \frac{n}{5} ) + T ( \frac{n}{6} ) + n$

Dica 1: Divida a prova em limite inferior e limite superior;
Dica 2: Aproxime a função para baixo e para cima usando seus próprios termos.

---

### Complexidade Amortizada

Para as questões a seguir considere uma pilha S que possui duas operações

- **pop(S)**: remove (desempilha) o topo da pilha S.
- **push(S,x)**: empilha o elemento x na pilha S.

Cada uma dessas operações possui custo O(1). Vamos definir uma nova operação para esta estrutura, a operação **multi-pop(S,k)** que remove os k últimos elementos empilhados.

---

#### **Exercício 7.** Apresente um algoritmo para a operação de **multi-pop**. Observe que você pode usar a operação inicial de pop e a operação **vazio(S)** (que verifica se a pilha $S$ é vazia ou não) no seu algoritmo

---

#### **Exercício 8.** Qual a complexidade amortizada da operação de **multi-pop** dada uma sequência de operações de push, pop e **multi-pop** em uma pilha originalmente vazia?

---

#### **Exercício 9.** Qual o custo computacional de sequência de n operações de **push**, **pop** e **multi-pop** em uma pilha com inicialmente $s_O$ elementos e que termina com $s_n$ elementos?

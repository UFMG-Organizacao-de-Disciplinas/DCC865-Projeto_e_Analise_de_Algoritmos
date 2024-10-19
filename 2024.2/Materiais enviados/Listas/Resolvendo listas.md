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
- **para todo** $i \leftarrow 0$ até $n - 1$ **faça**
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
- **para todo** $i \leftarrow 0$ até $n - 1$ **faça**
  - **para todo** $j $\leftarrow$ 0$ até $n - 1$ **faça**
    - $C[i, j] \leftarrow 0$;
    - **para todo** $k \leftarrow 0$ até $n - 1$ **faça**
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
  - $i \leftarrow j - 1$;
  - enquanto $i > 0$ e $A[i] \geq chave$ **faça**
    - $A[i + 1] \leftarrow A[i]$;
    - $i \leftarrow i - 1$;
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
- **para todo** $i \leftarrow 1$ até $n - 1$ **faça**
  - **para todo** $j \leftarrow n$ até $i + 1$ **faça**
    - **se** $A[j] < A[j - 1]$ **então**
      - troque $A[j]$ com $A[j - 1]$;
- **retorna** A;

---

### **Exercício 5.** Determine um limite superior assintótico para as funções abaixo (de preferência o mais apertado possível)

Para essa questão é importante considerarmos que:

- $O: \text{Limite Superior}$
- $o: \text{Limite Superior estrito}$
- $\Omega: \text{Limite Inferior}$
- $\omega: \text{Limite Inferior estrito}$
- $\Theta: \text{Equivalência}$

- $O(n!) < O(2^n) < O(n^2) < O(n log n) < O(n) < O(log n) < O(1)$

#### 5.1. $2n^3 + n^4 - 1$

- $f(n) = 2n^3 + n^4 - 1$
- $O(f(n)) = O(2n^3 + n^4 - 1)$
- $O(f(n)) = O(n^4)$

#### 5.2. $2^n + 5 \log n + n^2$

- $f(n) = 2^n + 5 \log n + n^2$
- $O(f(n)) = O(2^n + 5 \log n + n^2)$
- $O(f(n)) = O(2^n)$

#### 5.3. $\log_{10} n + \log_{3} 10$

- $f(n) = \log_{10} n + \log_{3} 10$
- $O(f(n)) = O(\log_{10} n + \log_{3} 10)$
- $O(f(n)) = O(\log_{10} n)$
- $O(f(n)) = O(\log n)$

#### 5.4. $n + n \log n + \log n$

- $f(n) = n + n \log n + \log n$
- $O(f(n)) = O(n + n \log n + \log n)$
- $O(f(n)) = O(n \log n)$

#### 5.5. $4^n + 2^n + n$

- $f(n) = 4^n + 2^n + n$
- $O(f(n)) = O(4^n + 2^n + n)$
- $O(f(n)) = O(4^n)$
- $O(f(n)) = O(2^{2+n})$
- $O(f(n)) = O(2^n)$

---

### **Exercício 6.** Determine um limite superior assintótico para as funções abaixo (de preferência o mais apertado possível) - [IGNORADA POR SER EXATAMENTE IGUAL AO EXERCÍCIO 5]

- 6.1. $2n^3 + n^4 - 1$
- 6.2. $2^n + 5 \log n + n^2$
- 6.3. $\log_{10} n + \log_{3} 10$
- 6.4. $n + n \log n + \log n$
- 6.5. $4^n + 2^n + n$

---

### **Exercício 7.** Determine um limite superior assintótico restrito para as funções abaixo (de preferência o mais apertado possível)

Para essa questão é importante considerarmos que:

- $O: \text{Limite Superior}$
- $o: \text{Limite Superior estrito}$
- $\Omega: \text{Limite Inferior}$
- $\omega: \text{Limite Inferior estrito}$
- $\Theta: \text{Equivalência}$

- $O(n!) < O(2^n) < O(n^2) < O(n log n) < O(n) < O(log n) < O(1)$

> Limite Superior Estrito (o)
>
> f = o(g) para todo $c > 0$ existe $n_0$ tal que: $f(n) < c * g(n)$ para todo $n \geq n_0$

- $f = o(g); f(n) < c*g(n); n \geq n_0$

#### 7.1. $2n^3 + n^4 - 1$

- $f(n) = 2n^3 + n^4 - 1$
- $O(f(n)) = O(2n^3 + n^4 - 1)$
- $O(f(n)) = O(n^4)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = n^5$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq 1$ a função $f(n)$ é menor que $g(n)$, sendo assim, $n^5 = o(f(n))$.

---

#### 7.2. $2^n + 5 \log n + n^2$

- $f(n) = 2^n + 5 \log n + n^2$
- $O(f(n)) = O(2^n + 5 \log n + n^2)$
- $O(f(n)) = O(2^n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = 3^n$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq 1$ a função $f(n)$ é menor que $g(n)$, sendo assim, $3^n = o(f(n))$.

#### 7.3. $\log_{10} n + \log_{3} 10$

- $f(n) = \log_{10} n + \log_{3} 10$
- $O(f(n)) = O(\log_{10} n + \log_{3} 10)$
- $O(f(n)) = O(\log_{10} n) + C_1$
- $O(f(n)) = O(\log n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = n$

Se considerarmos que o $n_0 = 10$ e $c = 1$, sabemos que para todos os valores de $n \geq 10$ a função $f(n)$ é menor que $g(n)$, sendo assim, $n = o(f(n))$.

#### 7.4. $n + n \log n + \log n$

- $f(n) = n + n \log n + \log n$
- $O(f(n)) = O(n + n \log n + \log n)$
- $O(f(n)) = O(n \log n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = n^2$

Se considerarmos que o $n_0 = 10$ e $c = 1$, sabemos que para todos os valores de $n \geq 2$ a função $f(n)$ é menor que $g(n)$, sendo assim, $n^2 = o(f(n))$.

#### 7.5. $4^n + 2^n + n$

- $f(n) = 4^n + 2^n + n$
- $O(f(n)) = O(4^n + 2^n + n)$
- $O(f(n)) = O(4^n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = 5^n$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq 1$ a função $f(n)$ é menor que $g(n)$, sendo assim, $5^n = o(f(n))$.


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
5. $\vdots$ EQ 1.1
6. $T(n - (\frac{n-3}{3})*3) = T (0) + (\frac{n-3}{3}+1) \Leftrightarrow T(3) = 1 + (\frac{n-3}{3}+1)$

---

$$
Eq 1.1:\\
n - (k+1)*3 = 0\\
n = (k+1)*3\\
n = 3k + 3\\
k = \frac{n-3}{3}
$$

---

[JV: Tá concluída?]
[JV: Aparentemente para concluir eu preciso dizer que...]

---

#### 2. $T (n) = 2T (n − 2) + \log n$

0. $T (n  ) = 2T (n − 2) + \log n$
1. $T (n-2) = 2T (n − 4) + \log (n-2) + \log n$
2. $T (n-4) = 2T (n − 6) + \log (n-4) + \log (n-2) + \log n$
3. $T (n-6) = 2T (n − 8) + \log (n-6) + \log (n-4) + \log (n-2) + \log n$
4. $\vdots$

---

1. $T (n-2*1) = 2T (n − 2*(1+1)) + \log (n-2*(1)) + \log (n - 2*(1-1))$
2. $T (n-2*2) = 2T (n − 2*(2+1)) + \log (n-2*(2)) + \log (n - 2*(2-1)) + \log (n - 2*(2-2))$
3. $T (n-2*3) = 2T (n − 2*(3+1)) + \log (n-2*(3)) + \log (n - 2*(3-1)) + \log (n - 2*(3-2)) + \log (n - 2*(3-3))$
4. $\vdots$
5. $T (n-2*k) = 2T (n-2*(k+1)) + \sum_{i=0}^{k} \log(n - 2*i)$
6. $\vdots$ *EQ 1.2*
7. $T(n-2*(\frac{n-2}{2})) = T(0) + \sum_{i=0}^{\frac{n-2}{2}} \log(n - 2*i)$
8. $T(2) = 1 + \sum_{i=0}^{\frac{n-2}{2}} \log(n - 2*i)$

---

$$
Eq 1.2:\\
T(n-2*(k+1)) = T(0)\\
n-2*(k+1) = 0\\
n = 2*(k+1)\\
n = 2k + 2\\
k = \frac{n-2}{2}
$$

---

- $\sum_{i=0}^{\frac{n-2}{2}} \log(n - 2*i) =\\$
- $\log(n-2*0) + \log(n-2*1) + \log(n-2*2) + \dots + \log(n-2*\frac{n-2}{2}) + \log(n-2*\frac{n-2}{2}) =\\$
- $\log(n-2*0) + \log(n-2*1) + \log(n-2*2) + \dots + \log(n-2*?) + \log(2) =\\$
- $\log(n-0) + \log(n-2) + \log(n-4) + \dots + \log(2) =\\$
- $\log((n-0)*(n-2)*(n-4)*\dots*2) =\\$

---

[JV: aqui já não sei o que fazer, vou chutar que eu meto um O() daquilo ali... Mas eu precisaria converter esse somatório.]

#### 3. $T (n) = T (n − 1) + n$

0. $T (n  ) = T (n − 1) + n$
1. $T (n-1) = T (n − 2) + (n-1) + n$
2. $T (n-2) = T (n − 3) + (n-2) + (n-1) + n$
3. $\vdots$
4. $T(n-k) = T(n-(k+1)) + \sum_{i=0}^{k} (n-i)$

---

0. $T(n-0) = T(n - (0 + 1)) + (n - (0 - 0))$
1. $T(n-1) = T(n - (1 + 1)) + (n - (1 - 0)) + (n - (1 - 1))$
2. $T(n-2) = T(n - (2 + 1)) + (n - (2 - 0)) + (n - (2 - 1)) + (n - (2 - 2))$
3. $\vdots$
4. $T(n-k) = T(n - (k + 1)) + \sum_{i=0}^{k} (n - (k - i))$
5. $\vdots$ *Eq 1.3*
6. $T(n-(n-1)) = T(0) + \sum_{i=0}^{n-1} (n - (n-1 - i))$
7. $\vdots$ *Eq 1.3.1*
8. $T(1) = 1 + \frac{n*(n+1)}{2}$

---

$$
Eq 1.3:\\
T(n-(k+1)) = T(0)\\
n-(k+1) = 0\\
n = k+1\\
k = n-1
$$

---

$$
Eq 1.3.1:\\
\sum_{i=0}^{n-1} (n - (n-1 - i)) =\\
\sum_{i=0}^{n-1} (n - n + 1 + i) =\\
\sum_{i=0}^{n-1} (1 + i) =\\
(1+0) + (1+1) + (1+2) + \dots + (1+(n-2)) + (1+(n-1)) =\\
1 + 2 + 3 + \dots + (n-1) + n =\\
1 + 2 + 3 + \dots +  (n-3) + (n-2) + (n-1) + n =\\
\frac{n*(n+1)}{2}
$$

#### 4. $T (n) = 2T (n − 1) + n^2 + 1$

0. $T (n  ) = 2T (n − 1) + n^2 + 1$
1. $T (n-1) = 2T (n − 2) + (n-1)^2 + 1 + n^2 + 1$
2. $T (n-2) = 2T (n − 3) + (n-2)^2 + 1 + (n-1)^2 + 1 + n^2 + 1$
3. $T (n-3) = 2T (n − 4) + (n-3)^2 + 1 + (n-2)^2 + 1 + (n-1)^2 + 1 + n^2 + 1$
4. $\vdots$

---

0. $T(n-0) = 2T(n - (0 + 1)) + (0 + 1) + (n-(0-0))^2$
1. $T(n-1) = 2T(n - (1 + 1)) + (1 + 1) + (n-(1-0))^2 + (n-(1-1))^2$
2. $T(n-2) = 2T(n - (2 + 1)) + (2 + 1) + (n-(2-0))^2 + (n-(2-1))^2 + (n-(2-2))^2$
3. $\vdots$
4. $T(n-k) = 2T(n - (k + 1)) + (k + 1) + \sum_{i=0}^{k} (n-(k-i))^2$
5. $\vdots$ *EQ 1.4*
6. $T(n-(n-1)) = T(0) + (n-1) + \sum_{i=0}^{n-1} (n-(n-1-i))^2 \Leftrightarrow T(1) = 1 + n - 1 + \sum_{i=0}^{n-1} (i+1)^2$
7. $\vdots$ *EQ 1.3.1*
8. $T(1) = 1 + n - 1 + \frac{n*(n+1)}{2}$$

---

$$
Eq 1.4:\\
T(n-(k+1)) = T(0)\\
n-(k+1) = 0\\
n = k+1\\
k = n-1
$$

---

### **Exercício 2.** Determine e prove uma equivalência assintótica para todas as recorrências abaixo. **Não use o teorema mestre**

#### 1. $T (n) = 2T ( \frac{n}{2} ) + 1$

#### 2. $T (n) = 4T ( \frac{n}{2} ) + \log n$

#### 3. $T (n) = 7T ( \frac{n}{3} ) + n$

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

# Resolvendo as listas do módulo 1

## Lista 1

Universidade Federal de Minas Gerais
Departamento de Computação
Projeto e Análise de Algoritmos - 2024.2
Professor: Marcio Costa Santos
Lista 1

---

### **Exercício 1.** Determine a função de complexidade do algoritmo abaixo e indique sua complexidade de melhor caso, caso médio e pior caso

- ***Pseudocódigo Q1***
  - **Entrada**: Vetor de $n$ inteiros $a$
  - $cnt \leftarrow 0$;
  - **para todo** $i \leftarrow 0$ até $n - 1$ **faça**
    - **se** $a[i]\%2 = 0$ **então**
      - $cnt \leftarrow cnt + 1$;
  - **retorna** cnt;

---

Contando a quantidade de passos:

- ***Pseudocódigo Q1***
  - **Entrada**: Vetor de $n$ inteiros $a$ [0]
  - $cnt \leftarrow 0$; [$C_1$]
  - **para todo** $i \leftarrow 0$ até $n - 1$ **faça** [Inicial: $C_2$; por ciclo: $C_3$]
    - **se** $a[i]\%2 = 0$ **então** [Por ciclo: $C_4$]
      - $cnt \leftarrow cnt + 1$; [Caso verdadeiro: $C_5$]
  - **retorna** cnt; [0]

Somando os passos:

- $T(n) = C_1 + C_2 + \sum_{i=0}^{n-1} ((C_3 + C_4) + P_5*C_5$)
- $T(n) = C_{1, 2} + \sum_{i=0}^{n-1} (C_{3, 4} + P_5*C_5$)
- $T(n) = C_{1, 2} + n*C_{3, 4} + n*P_5*C_5$

Onde temos que:

- $C_1 = 1$ (1 atribuição)
- $C_2 = 2$ (1 atribuição; 1 comparação inicial)
- $C_3 = 2$ (1 comparação; 1 incremento)
- $C_4 = 3$ (1 índice; 1 divisão; 1 comparação)x
- $C_5 = 2$ (1 soma; 1 atribuição)
- $P_5 = 0,5 \text{ (chance de ser par) ou } \frac{\text{número de pares em } a}{n}$
- $C_{1, 2} = C_1 + C_2$
- $C_{3, 4} = C_3 + C_4$

Temos então que sua função de complexidade é:

- $T(n) = C_{1, 2} + n*C_{3, 4} + n*P_5*C_5$

#### 1.a. Melhor caso

Como o algoritmo em questão conta a quantidade de números pares, sua execução variará de acordo com a quantidade de números pares. Sendo assim, o melhor caso é quando não há números pares no vetor $a$.

- $P_5 = 1$

#### 1.b. Caso médio

#### 1.c. Pior caso

### **Exercício 2.** Determine a função de complexidade do algoritmo abaixo e indique sua complexidade de melhor caso, caso médio e pior caso

- ***Pseudocódigo Q2***
  - **Entrada:** Matrizes $n \times n$ $A$ e $B$
  - C $\leftarrow$ matriz vazia;
  - **para todo** $i \leftarrow 0$ até $n - 1$ **faça**
    - **para todo** $j $\leftarrow$ 0$ até $n - 1$ **faça**
      - $C[i, j] \leftarrow 0$;
      - **para todo** $k \leftarrow 0$ até $n - 1$ **faça**
        - $C[i, j] \leftarrow C[i, j] + A[i, k] ∗ B[k, j]$;
  - **retorna** $C$;

---

#### 2.a. Melhor caso

#### 2.b. Caso médio

#### 2.c. Pior caso

### **Exercício 3.** Considere o seguinte algoritmo

- ***Pseudocódigo Q3***
  - **Entrada:** vetor de inteiros $A$, tamanho $n$ de $A$
  - **para todo** i $\leftarrow$ $2$ até $n$ **faça**
    - $chave \leftarrow A[i]$;
    - $j \leftarrow i - 1$;
    - **enquanto** $j > 0$ e $A[j] > chave$ **faça**
      - $A[j + 1] \leftarrow A[j]$;
      - $j \leftarrow j - 1$;
    - $A[j + 1] \leftarrow chave$;
  - **retorna** A;

---

#### 3.a. Simule a execução do algoritmo para o vetor [3, 5, 2, 8, 9]

- Variáveis: $A = [3, 5, 2, 8, 9]; n = 5; i=2; chave(A[i])=5; j=1; A[j]=3;$
- Variáveis: $A = [3, 5, 2, 8, 9]; n = 5; i=3; chave(A[i])=2; j=2; A[j]=5;$
  - $A = [3, 5, 5, 8, 9];
  - $A = [3, 2, 5, 8, 9];
- Variáveis: $A = [3, 2, 5, 8, 9]; n = 5; i=3; chave(A[i])=2; j=1; A[j]=3;$
  - $A = [3, 3, 5, 8, 9];
  - $A = [2, 3, 5, 8, 9];
- Variáveis: $A = [2, 3, 5, 8, 9]; n = 5; i=4; chave(A[i])=8; j=3; A[j]=5;$
- Variáveis: $A = [2, 3, 5, 8, 9]; n = 5; i=5; chave(A[i])=9; j=4; A[j]=2;$
- FIM: $A = [2, 3, 5, 8, 9];$

#### 3.b. O que esse algoritmo faz?

#### 3.c. Qual sua complexidade de pior caso?

Calculando o custo de cada passo:

- ***Pseudocódigo Q3***
  - **Entrada:** vetor de inteiros A, tamanho n de A
  - **para todo** j $\leftarrow$ $2$ até $n$ **faça** [1]
    - $chave \leftarrow A[j]$; [2]
    - $i \leftarrow j - 1$; [3]
    - enquanto $i > 0$ e $A[i] \geq chave$ **faça** [4]
      - $A[i + 1] \leftarrow A[i]$; [5]
      - $i \leftarrow i - 1$; [6]
    - $A[i + 1] \leftarrow chave$; [7]
  - **retorna** A;

- [1] $C12$
- [2] $$
- [3] $$
- [4] $$
- [5] $$
- [6] $$
- [7] $$

#### 3.d. Qual sua complexidade de melhor caso?

### **Exercício 4.** Considere o seguinte algoritmo

- ***Pseudocódigo Q4***
  - **Entrada:** vetor de inteiros $A$, tamanho $n$ de $A$
  - **para todo** $i \leftarrow 1$ até $n - 1$ **faça**
    - **para todo** $j \leftarrow n$ até $i + 1$ **faça**
      - **se** $A[j] < A[j - 1]$ **então**
        - troque $A[j]$ com $A[j - 1]$;
  - **retorna** A;

---

#### 4.a. Simule a execução do algoritmo para o vetor [3, 5, 2, 8, 9]

- Variáveis: $A = [3, 5, 2, 8, 9]; n = 5; i=1; j=5; A[j]=9; A[j-1]=8;$
- Variáveis: $A = [3, 5, 2, 8, 9]; n = 5; i=1; j=4; A[j]=8; A[j-1]=2;$
- Variáveis: $A = [3, 5, 2, 8, 9]; n = 5; i=1; j=3; A[j]=2; A[j-1]=5;$ Troca
- Variáveis: $A = [3, 2, 5, 8, 9]; n = 5; i=1; j=2; A[j]=2; A[j-1]=3;$ Troca
- Variáveis: $A = [2, 3, 5, 8, 9]; n = 5; i=2; j=5; A[j]=9; A[j-1]=8;$
- Variáveis: $A = [2, 3, 5, 8, 9]; n = 5; i=2; j=4; A[j]=8; A[j-1]=5;$
- Variáveis: $A = [2, 3, 5, 8, 9]; n = 5; i=2; j=3; A[j]=5; A[j-1]=3;$
- Variáveis: $A = [2, 3, 5, 8, 9]; n = 5; i=3; j=5; A[j]=9; A[j-1]=8;$
- Variáveis: $A = [2, 3, 5, 8, 9]; n = 5; i=3; j=4; A[j]=8; A[j-1]=5;$
- Variáveis: $A = [2, 3, 5, 8, 9]; n = 5; i=4; j=5; A[j]=9; A[j-1]=8;$
- Fim

#### 4.b. O que esse algoritmo faz?

Bubble sort: ordena lista de forma crescente.

#### 4.c. Qual sua complexidade de pior caso?

O pior caso é quando a lista está ordenada de forma decrescente.

Como são dois loops, um dentro do outro, ambos percorrendo aproximadamente n elementos, temos que a complexidade de pior caso é $O(n^2)$.

<!-- [JV: depois descobrir qual é a função f(n)] -->

#### 4.d. Qual sua complexidade de melhor caso?

O seu melhor caso ocorre quando a lista já está ordenada de forma crescente.

Mesmo que o algoritmo não precise fazer troca alguma, ainda assim ele percorre aproximadamente $n^2$ elementos, sendo assim, a complexidade de melhor caso é $O(n^2)$.

### **Exercício 5.** Determine um limite superior assintótico para as funções abaixo (de preferência o mais apertado possível)

Para essa questão é importante considerarmos que:

- $O: \text{Limite Superior}$
- $o: \text{Limite Superior estrito}$
- $\Theta: \text{Equivalência}$
- $\omega: \text{Limite Inferior estrito}$
- $\Omega: \text{Limite Inferior}$

- $O(n!) < O(2^n) < O(n^2) < O(n \log n) < O(n) < O(log n) < O(1)$

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
- $\Theta: \text{Equivalência}$
- $\omega: \text{Limite Inferior estrito}$
- $\Omega: \text{Limite Inferior}$

- $O(n!) < O(2^n) < O(n^2) < O(n \log n) < O(n) < O(log n) < O(1)$

> Limite Superior Estrito (o)
>
> f = o(g) para todo $c > 0$ existe $n_0$ tal que: $f(n) < c * g(n)$ para todo $n \geq n_0$

- $f = o(g); f(n) < c*g(n); n \geq n_0$

#### 7.1. $2n^3 + n^4 - 1$

- $f(n) = 2n^3 + n^4 - 1$
- $o(f(n)) = o(2n^3 + n^4 - 1)$
- $o(f(n)) = o(n^4)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = n^5$

Se considerarmos que o $n_0 = 1$ e $c = 1$, temos então que:

- $g(n) > c*f(n)$
- $n^5 > 2n^3 + n^4 - 1$

Sabemos que para todos os valores de $n \geq 1$ a função $f(n)$ é menor que $g(n)$, sendo assim, $n^5 = o(f(n))$.

---

#### 7.2. $2^n + 5 \log n + n^2$

- $f(n) = 2^n + 5 \log n + n^2$
- $o(f(n)) = o(2^n + 5 \log n + n^2)$
- $o(f(n)) = o(2^n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = 3^n$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq 1$ a função $f(n)$ é menor que $g(n)$, sendo assim, $3^n = o(f(n))$.

#### 7.3. $\log_{10} n + \log_{3} 10$

- $f(n) = \log_{10} n + \log_{3} 10$
- $o(f(n)) = o(\log_{10} n + \log_{3} 10)$
- $o(f(n)) = o(\log_{10} n) + C_1$
- $o(f(n)) = o(\log n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = n$

Se considerarmos que o $n_0 = 10$ e $c = 1$, sabemos que para todos os valores de $n \geq 10$ a função $f(n)$ é menor que $g(n)$, sendo assim, $n = o(f(n))$.

#### 7.4. $n + n \log n + \log n$

- $f(n) = n + n \log n + \log n$
- $o(f(n)) = o(n + n \log n + \log n)$
- $o(f(n)) = o(n \log n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = n^2$

Se considerarmos que o $n_0 = 10$ e $c = 1$, sabemos que para todos os valores de $n \geq 2$ a função $f(n)$ é menor que $g(n)$, sendo assim, $n^2 = o(f(n))$.

#### 7.5. $4^n + 2^n + n$

- $f(n) = 4^n + 2^n + n$
- $o(f(n)) = o(4^n + 2^n + n)$
- $o(f(n)) = o(4^n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = 5^n$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq 1$ a função $f(n)$ é menor que $g(n)$, sendo assim, $5^n = o(f(n))$.

### **Exercício 8.** Determine um limite inferior assintótico para as funções abaixo (de preferência o mais apertado possível)

Para essa questão é importante considerarmos que:

- $O: \text{Limite Superior}$
- $o: \text{Limite Superior estrito}$
- $\Theta: \text{Equivalência}$
- $\omega: \text{Limite Inferior estrito}$
- $\Omega: \text{Limite Inferior}$

- $O(n!) < O(2^n) < O(n^2) < O(n \log n) < O(n) < O(log n) < O(1)$

> Limite Inferior ($\Omega$)
>
> $f = \Omega(g)$ Existem $n_0$ e $c$ tal que: $f(n) \geq c * g(n)$ para todo $n \geq n_0$

- $f = \Omega(g); f(n) \geq c*g(n); n \geq n_0$

![Big-O Complexity Chart][ImgBigO]

[ImgBigO]: https://www.freecodecamp.org/portuguese/news/content/images/2021/12/1_KfZYFUT2OKfjekJlCeYvuQ.jpeg

#### 8.1. $2n^3 + n^4 - 1$

- $f(n) = 2n^3 + n^4 - 1$
- $\Omega(f(n)) = \Omega(2n^3 + n^4 - 1)$
- $\Omega(f(n)) = \Omega(n^4)$

---

Achando uma função $g(n)$ que seja maior ou igual que $f(n)$:

- $g(n) = n^4$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq n_0$ a função $f(n)$ é maior ou igual que $g(n)$, sendo assim, $5^n = \Omega(f(n))$.

#### 8.2. $2^n + 5 \log n + n^2$

- $f(n) = 2^n + 5 \log n + n^2$
- $\Omega(f(n)) = \Omega(2^n + 5 \log n + n^2)$
- $\Omega(f(n)) = \Omega(2^n)$

---

Achando uma função $g(n)$ que seja maior ou igual que $f(n)$:

- $g(n) = 2^n$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq n_0$ a função $f(n)$ é maior ou igual que $g(n)$, sendo assim, $2^n = \Omega(f(n))$.

#### 8.3. $\log_{10} n + \log_{3} 10$

- $f(n) = \log_{10} n + \log_{3} 10$
- $\Omega(f(n)) = \Omega(\log_{10} n + \log_{3} 10)$
- $\Omega(f(n)) = \Omega(\log_{10} n + C_1)$
- $\Omega(f(n)) = \Omega(\log n)$

---

Achando uma função $g(n)$ que seja maior ou igual que $f(n)$:

- $g(n) = \log n$

Se considerarmos que o $n_0 = 10$ e $c = 1$, sabemos que para todos os valores de $n \geq n_0$ a função $f(n)$ é maior ou igual que $g(n)$, sendo assim, $\log n = \Omega(f(n))$.

#### 8.4. $n + n \log n + \log n$

- $f(n) = n + n \log n + \log n$
- $\Omega(f(n)) = \Omega(n + n \log n + \log n)$
- $\Omega(f(n)) = \Omega(n \log n)$

---

Achando uma função $g(n)$ que seja maior ou igual que $f(n)$:

- $g(n) = n \log n$

Se considerarmos que o $n_0 = 10$ e $c = 1$, sabemos que para todos os valores de $n \geq n_0$ a função $f(n)$ é maior ou igual que $g(n)$, sendo assim, $n \log n = \Omega(f(n))$.

#### 8.5. $4^n + 2^n + n$

- $f(n) = 4^n + 2^n + n$
- $\Omega(f(n)) = \Omega(4^n + 2^n + n)$
- $\Omega(f(n)) = \Omega(4^n)$

---

Achando uma função $g(n)$ que seja maior ou igual que $f(n)$:

- $g(n) = 4^n$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq n_0$ a função $f(n)$ é maior ou igual que $g(n)$, sendo assim, $4^n = \Omega(f(n))$.

### **Exercício 9.** Determine um limite inferior assintótico restrito para as funções abaixo (de preferência o mais apertado possível)

Para essa questão é importante considerarmos que:

- $O(n!) < O(2^n) < O(n^2) < O(n \log n) < O(n) < O(log n) < O(1)$

> Limite Inferior Assintótico Estrito ($\omega$)
>
> $f = \omega(g)$ Para todo $c > 0$ existe $n_0$ tal que: $f(n) > c * g(n)$ para todo $n \geq n_0$

- $f = \omega(g) \forall c > 0 \exists n_0 | f(n) > c*g(n) \forall n \geq n_0$

#### 9.1. $2n^3 + n^4 - 1$

- $f(n) = 2n^3 + n^4 - 1$
- $\omega(f(n)) = \omega(2n^3 + n^4 - 1)$
- $\omega(f(n)) = \omega(n^4)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = n^5$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq n_0$ a função $f(n)$ é maior que $g(n)$, sendo assim, $n^5 = \omega(f(n))$.

#### 9.2. $2^n + 5 \log n + n^2$

- $f(n) = 2^n + 5 \log n + n^2$
- $\omega(f(n)) = \omega(2^n + 5 \log n + n^2)$
- $\omega(f(n)) = \omega(2^n)$

---

Achando uma função $g(n)$ que seja maior que $f(n)$:

- $g(n) = 3^n$

Se considerarmos que o $n_0 = 1$ e $c = 1$, sabemos que para todos os valores de $n \geq n_0$ a função $f(n)$ é maior que $g(n)$, sendo assim, $3^n = \omega(f(n))$.

#### 9.3. $\log_{10} n + \log_{3} 10$

#### 9.4. $n + n \log n + \log n$

#### 9.5. $4^n + 2^n + n$

---

### **Exercício 10.** Determine uma equivalência assintótica para as funções abaixo

#### 10.1. $2n^3 + n^4 - 1$

#### 10.2. $2^n + 5 \log n + n^2$

#### 10.3. $\log_{10} n + \log_{3} 10$

#### 10.4. $n + n \log n + \log n$

#### 10.5. $4^n + 2^n + n$

---
---

### Tabela resumindo as respostas das questões 5 a 10

| # Equação | Função                      | Limite Superior Estrito (o) (Q 7) | Limite Superior (O) (Q 5, 6) | Equivalência ($\Theta$) (Q 10) | Limite Inferior ($\Omega$) (Q 8) | Limite Inferior Estrito ($\omega$) (Q 9) |
| --------- | --------------------------- | --------------------------------- | ---------------------------- | ------------------------------ | -------------------------------- | ---------------------------------------- |
| .1        | $2n^3 + n^4 - 1$            | $n^5$                             | $n^4$                        | $n^4$                          | $n^4$                            | $n^5$                                    |
| .2        | $2^n + 5 \log n + n^2$      | $3^n$                             | $2^n$                        | $2^n$                          | $2^n$                            | $3^n$                                    |
| .3        | $\log_{10} n + \log_{3} 10$ | $n$                               | $\log n$                     | $\log n$                       | $\log n$                         | $n$                                      |
| .4        | $n + n \log n + \log n$     | $n^2$                             | $n \log n$                   | $n \log n$                     | $n \log n$                       | $n^2$                                    |
| .5        | $4^n + 2^n + n$             | $5^n$                             | $2^n$                        | $2^n$                          | $4^n$                            | $5^n$                                    |

---
---

### **Exercício 11.** Dadas funções $f(n)$, $h(n)$ e $g(n)$ prove que

#### 11.1. Se $f(n) = O(g(n))$ e $g(n) = O(h(n))$ então $f(n) = O(h(n))$

#### 11.2. $f (n) = O(f (n))$

#### 11.3. Se $f (n) = \Omega(g(n))$ e $g(n) = \Omega(h(n))$ então $f (n) = \Omega(h(n))$

#### 11.4. $f (n) = \Omega(f (n))$

#### 11.5. $f (n) \neq o(f (n))$

#### 11.6. $f (n) \neq w(f (n))$

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

#### 1. $T (n) = T (n - 3) + 1$

---

Sequência geral:

1. $T (n  ) = T (n - 3) + 1$
2. $T (n-3) = T (n - 6) + 1$
3. $T (n-6) = T (n - 9) + 1$
4. $\vdots$
5. $T(n - k*3) = T (n - (k+1)*3) + 1$
6. $\vdots$ Eq 1.1
7. $T(n - (\frac{n-3}{3})*3) = T (n - (\frac{n-3}{3} + 1)*3) + 1$

- $T(3) = T(0) + 1$

---

Sequência com o passo como variável:

1. $P(0): T(n - 0*3) = T (n - (0+1)*3) + 1$
2. $P(1): T(n - 1*3) = T (n - (1+1)*3) + 1$
3. $P(3): T(n - 2*3) = T (n - (2+1)*3) + 1$
4. $\vdots$
5. $P(k): T(n - k*3) = T (n - (k+1)*3) + 1$

---

$$
\text{Eq 1.1:}\\
n - (k+1)*3 = 0\\
n = (k+1)*3\\
n = 3k + 3\\
k = \frac{n-3}{3}
$$

---

Descascando a cebola:

1. $T (n  ) = T (n - 3) + 1$
2. $T (n-3) = T (n - 6) + 1$
3. $T (n-6) = T (n - 9) + 1$
4. $\vdots$
5. $T(n - k*3) = T (n - (k+1)*3) + 1$
6. $\vdots$ Eq 1.1
7. $T(n - (\frac{n-3}{3})*3) = T (n - (\frac{n-3}{3} + 1)*3) + 1$

- $T(3) = T(0) + 1$
- $T(6) = (T(0) + 1) + 1$
- $T(9) = ((T(0) + 1) + 1) + 1$

- $T(3*1) = T(0) + 1$
- $T(6*2) = T(0) + 2$
- $T(9*3) = T(0) + 3$
- $\vdots$
- $T(3*k) = T(0) + k$
- $\vdots$ Eq 1.2
- $T(3*\frac{n}{3}) = T(0) + \frac{n}{3}$
- $T(n) = T(0) + \frac{n}{3}$
- $O(T(n)) = O(T(0) + \frac{n}{3})$
- Por definição: $O(T(0)) = O(1)$
- $O(T(n)) = O(1 + \frac{n}{3})$
- $O(T(n)) = O(C_1*n)$
- $O(T(n)) = O(n)$

---

$$
\text{Eq 1.2:}\\
T(3*k) = T(n)\\
3*k = n\\
k = \frac{n}{3}
$$

---

#### 2. $T (n) = 2T (n - 2) + \log n$

0. $T (n  ) = 2T (n - 2) + \log n$
1. $T (n-2) = 2T (n - 4) + \log (n-2)$
2. $T (n-4) = 2T (n - 6) + \log (n-4)$
3. $T (n-6) = 2T (n - 8) + \log (n-6)$
4. $\vdots$

---

0. $T(n-2*0) = 2T(n - 2*(0 + 1)) + \log (n-2*0)$
1. $T(n-2*1) = 2T(n - 2*(1 + 1)) + \log (n-2*1)$
2. $T(n-2*2) = 2T(n - 2*(2 + 1)) + \log (n-2*2)$
3. $T(n-2*3) = 2T(n - 2*(3 + 1)) + \log (n-2*3)$
4. $\vdots$
5. $T(n-2*k) = 2T(n - 2*(k + 1)) + \log (n-2*k)$

---

$$
\text{Eq 1.2:}\\
T(n-2*(k+1)) = T(0)\\
n-2*(k+1) = 0\\
n = 2*(k+1)\\
n = 2k + 2\\
k = \frac{n-2}{2}
$$

---

Substituindo:

1. $T(n-2*3) = 2T(n - 2*(3 + 1)) + \log (n-2*3)$
2. $T(n-2*2) = 2 (2T(n - 2*(3 + 1)) + \log (n-2*3)) + \log (n-2*2)$
3. $T(n-2*1) = 2 (2 (2T(n - 2*(3 + 1)) + \log (n-2*3)) + \log (n-2*2)) + \log (n-2*1)$
4. $T(n-2*0) = 2 (2 (2 (2T(n - 2*(3 + 1)) + \log (n-2*3)) + \log (n-2*2)) + \log (n-2*1)) + \log (n-2*0)$

---

Enxugando:

1. $T(n-6) = 2T(n - 8) + \log (n-6)$
2. $T(n-4) = 2 (2T(n - 8) + \log (n-6)) + \log (n-4)$
3. $T(n-2) = 2 (2 (2T(n - 8) + \log (n-6)) + \log (n-4)) + \log (n-2)$
4. $T(n-0) = 2*2*2*2T(n - 8) + 2*2*2*\log (n-6) + 2*2*\log (n-4) + 2*\log (n-2) + \log (n-0)$

- 4: $T(n) = 2^4T(n - 8) + 2^3\log (n-6) + 2^2\log (n-4) + 2\log (n-2) + \log n$
- 4: $T(n) = 2^4T(n - 2^{4-1}) + 2^{4-1}\log (n-2*{4-1}) + 2^{4-2}\log (n-2*{4-2}) + 2^{4-3}\log (n-2*{4-3}) + 2^{4-4}\log (n-2*{4-4})$
- k: $T(n) = \sum_{i=0}^{k} 2^{n-i} \log (n-2*(n-i))$

---

[JV: aqui já não sei o que fazer, vou chutar que eu meto um O() daquilo ali... Mas eu precisaria converter esse somatório.]
  
#### 3. $T (n) = T (n - 1) + n$

0. $T (n  ) = T (n - 1) + n$
1. $T (n-1) = T (n - 2) + (n-1) + n$
2. $T (n-2) = T (n - 3) + (n-2) + (n-1) + n$
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

#### 4. $T (n) = 2T (n - 1) + n^2 + 1$

0. $T (n  ) = 2T (n - 1) + n^2 + 1$
1. $T (n-1) = 2T (n - 2) + (n-1)^2 + 1 + n^2 + 1$
2. $T (n-2) = 2T (n - 3) + (n-2)^2 + 1 + (n-1)^2 + 1 + n^2 + 1$
3. $T (n-3) = 2T (n - 4) + (n-3)^2 + 1 + (n-2)^2 + 1 + (n-1)^2 + 1 + n^2 + 1$
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

0. $T (n  ) = 2T ( \frac{n}{2} ) + 1$
1. $T ( \frac{n}{2} ) = 2T ( \frac{n}{ 4} ) + 1$
2. $T ( \frac{n}{4} ) = 2T ( \frac{n}{ 8} ) + 1$
3. $T ( \frac{n}{8} ) = 2T ( \frac{n}{16} ) + 1$
4. $\vdots$

---

0. $T(\frac{n}{2^{0}}) = 2T(\frac{n}{2^{0+1}}) + 1$
1. $T(\frac{n}{2^{1}}) = 2T(\frac{n}{2^{1+1}}) + 1$
2. $T(\frac{n}{2^{2}}) = 2T(\frac{n}{2^{2+1}}) + 1$
3. $T(\frac{n}{2^{3}}) = 2T(\frac{n}{2^{3+1}}) + 1$
4. $\vdots$
5. $T(\frac{n}{2^{k}}) = 2T(\frac{n}{2^{k+1}}) + 1$
6. $\vdots$ *EQ 2.1*

---

$$
\text{Eq 2.1:}\\
T(\frac{n}{2^{k+1}}) = T(1)\\
\frac{n}{2^{k+1}} = 1\\
n = 2^{k+1}\\
k = \log_{2} n - 1
$$

#### 2. $T (n) = 4T ( \frac{n}{2} ) + \log n$

0. $T (       n     ) = 4T ( \frac{n}{ 2} ) + \log n$
1. $T ( \frac{n}{2} ) = 4T ( \frac{n}{ 4} ) + \log \frac{n}{2}$
2. $T ( \frac{n}{4} ) = 4T ( \frac{n}{ 8} ) + \log \frac{n}{4}$
3. $T ( \frac{n}{8} ) = 4T ( \frac{n}{16} ) + \log \frac{n}{8}$
4. $\vdots$

---

1. $T(\frac{n}{2^{0}}) = 4T(\frac{n}{2^{0+1}}) + \log \frac{n}{2^0}$
2. $T(\frac{n}{2^{1}}) = 4T(\frac{n}{2^{1+1}}) + \log \frac{n}{2^1}$
3. $T(\frac{n}{2^{2}}) = 4T(\frac{n}{2^{2+1}}) + \log \frac{n}{2^2}$
4. $T(\frac{n}{2^{3}}) = 4T(\frac{n}{2^{3+1}}) + \log \frac{n}{2^3}$
5. $\vdots$
6. $T(\frac{n}{2^{k}}) = 4T(\frac{n}{2^{k+1}}) + \log \frac{n}{2^k}$

---

Substituindo...

1. $T ( \frac{n}{8} ) = 4T ( \frac{n}{16} ) + \log \frac{n}{8}$
2. $T ( \frac{n}{4} ) = 4(4T ( \frac{n}{16} ) + \log \frac{n}{8}) + \log \frac{n}{4}$
3. $T ( \frac{n}{2} ) = 4(4(4T ( \frac{n}{16} ) + \log \frac{n}{8}) + \log \frac{n}{4}) + \log \frac{n}{2}$
4. $T (       n     ) = 4(4(4(4T ( \frac{n}{16} ) + \log \frac{n}{8}) + \log \frac{n}{4}) + \log \frac{n}{2}) + \log n$

- $T (       n     ) = 4(4(4(4T ( \frac{n}{16} ) + \log \frac{n}{8}) + \log \frac{n}{4}) + \log \frac{n}{2}) + \log n$
- $T (n) = 4^4 * T(\frac{n}{2^{3}}) + 4^3 * \log \frac{n}{2^3} + 4^2 * \log \frac{n}{2^2} + 4 * \log \frac{n}{2^1} + \log n$
- $T (n) = 4^4 * T(\frac{n}{2^{4-1}}) + 4^{4-1} * \log \frac{n}{2^{4-1}} + 4^{4-2} * \log \frac{n}{2^{4-2}} + 4^{4-3} * \log \frac{n}{2^{4-3}} + \log \frac{n}{2^{4-4}}$

#### 3. $T (n) = 7T ( \frac{n}{3} ) + n$

### **Exercício 3.** Usando o teorema mestre determine uma equivalência assintótica para

- Teorema Mestre
  - Sejam $a \geq 1$ e $b > 1$ constantes, $f(n)$ uma função, e $T(n) = aT(\frac{n}{b}) + f(n)$, então, para algum $\epsilon > 0$:
    - Se $f(n) = O(n^{\log_{b}(a) - \epsilon}) \implies T(n) = \Theta(n^{\log_{b}(a)})$ [<=]
    - Se $f(n) = \Theta(n^{\log_{b}(a)}) \implies T(n) = \Theta(n^{\log_{b}(a)} * log(n))$ [=]
    - Se $f(n) = \Omega(n^{\log_{b}(a) + \epsilon})$ e $a f (\frac{n}{b}) \leq cf(n)$ então $\implies T(n) = \Theta(f(n))$ [>=]

![a](https://static.todamateria.com.br/upload/lo/ga/logaritmodefinicao.jpg)

#### 1. $T (n) = 2T ( \frac{n}{4} ) + 1$

- $a = 2; b = 4; f(n) = 1$

$n^{\log_{b}(a) \pm \epsilon} = n^{\log_{4}(2) \pm \epsilon} = n^{\frac{1}{2} \pm \epsilon}$

Considerando $\epsilon = \frac{1}{2}$, temos que:

- $n^{\frac{1}{2} - \frac{1}{2}} = n^0 = 1$

Então $f(n) = O(1)$, $f(n) = 1 = O(1)$. Logo, $T(n) = \Theta(n^{\log_{4}(2)}) = \Theta(n^{\frac{1}{2}}) = \Theta(\sqrt{n})$

---

- f(n) = 1
- $1 = O(n^{\log_{b}(a) \pm \epsilon})$
- $1 = O(n^{\log_{4}(2) \pm \epsilon})$
- $1 = O(n^{\frac{1}{2} \pm \epsilon})$
- [JV: para que n^{a alguma coisa} seja uma constante, seu expoente precisa ser 0]
- $0 = \frac{1}{2} \pm \epsilon$
- $\epsilon = \pm \frac{1}{2}$

#### 2. $T (n) = 2T ( \frac{n}{4} ) + n$

Encontrando $a$, $b$ e $f(n)$:

- $a = 2; b = 4; f(n) = n$

Para o primeiro caso:

- $n^{\log_{b}(a) - \epsilon} = n^{\log_{4}(2) - \epsilon} = n^{\frac{1}{2} - \epsilon}$

- $f(n) = n$
- $n = O(n^{\frac{1}{2} - \epsilon})$
  - Pra isso ser verdade, eu teria que dizer que o expoente de n é 1, então:
- $1 = \frac{1}{2} - \epsilon$
- $\epsilon = \frac{1}{2} - 1$
- $\epsilon = \frac{-1}{2}$
  - O que não pode ser verdade, pois o $\epsilon$ precisa ser positivo.

Para o segundo caso:

- $n = \Theta(n^{\frac{1}{2}})$
- $n = \Theta(\sqrt{n})$

Para o terceiro caso:

- $n = \Omega(n^{\frac{1}{2} + \epsilon})$
  - Considerando que $\epsilon = \frac{1}{2}$, temos que:
- $n = \Omega(n^{\frac{1}{2} + \frac{1}{2}})$
- $n = \Omega(n)$ 👍

Segundo teste do terceiro caso:

- $a f (\frac{n}{b}) \leq cf(n)$
- $2 * f( \frac{n}{4} ) \leq c * f(n)$
- $2 * \frac{n}{4} \leq c * n$
- $\frac{n}{2} \leq c * n$
  - Se considerarmos $c = \frac{1}{2}$, temos que:
- $\frac{n}{2} \leq \frac{1}{2} * n$
- $\frac{n}{2} \leq \frac{n}{2}$ 👍

Logo:

- $T(n) = \Theta(f(n))$
- $T(n) = \Theta(n)$

#### 3. $T (n) = 2T ( \frac{n}{4} ) + \log n$

#### 4. $T (n) = 4T ( \frac{n}{2} ) + 1$

#### 5. $T (n) = 4T ( \frac{n}{2} ) + n$

#### 6. $T (n) = 4T ( \frac{n}{2} ) + \log n$

#### 7. $T (n) = 2T ( \frac{n}{2} ) + 1$

#### 8. $T (n) = 2T ( \frac{n}{2} ) + \log n$

#### 9. $T (n) = 2T ( \frac{n}{2} ) + n$

#### 10. $T (n) = 2T ( \frac{n}{3} ) + 1$

#### 11. $T (n) = 2T ( \frac{n}{3} ) + \log n$

#### 12. $T (n) = 2T ( \frac{n}{3} ) + n$

### **Exercício 4.** Determine um limite assintótico para $T (n) = 2T (\sqrt{n})$. Dica: Faça uma substituição de variável. Faça $m = \log n$

---

### **Exercício 5.** Determine um limite assintótico para $T (n) = 2T (\sqrt{n}) + \log n$. Dica: Faça uma substituição de variável. Faça $m = \log n$

---

### **Exercício 6.** Determine e prove uma equivalência assintótica para $T (n) = T ( \frac{n}{4} ) + T ( \frac{n}{5} ) + T ( \frac{n}{6} ) + n$

- **Dica 1:** Divida a prova em limite inferior e limite superior;
- **Dica 2:** Aproxime a função para baixo e para cima usando seus próprios termos.

---

- $T(n) = T(\frac{n}{4}) + T(\frac{n}{5}) + T(\frac{n}{6}) + n$

- $T(4) = T(\frac{4}{4}) + T(\frac{4}{5}) + T(\frac{4}{6}) + 4$
- $T(5) = T(\frac{5}{4}) + T(\frac{5}{5}) + T(\frac{5}{6}) + 5$
- $T(6) = T(\frac{6}{4}) + T(\frac{6}{5}) + T(\frac{6}{6}) + 6$

- $T(4) = T(1) + T(\frac{4}{5}) + T(\frac{4}{6}) + 4$
- $T(5) = T(\frac{5}{4}) + T(1) + T(\frac{5}{6}) + 5$
- $T(6) = T(\frac{6}{4}) + T(\frac{6}{5}) + T(1) + 6$

---

- $T(n) = T(\frac{n}{4}) + T(\frac{n}{5}) + T(\frac{n}{6}) + n$

- $T(\frac{n}{4}) = T(\frac{\frac{n}{4}}{4}) + T(\frac{\frac{n}{4}}{5}) + T(\frac{\frac{n}{4}}{6}) + n$

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

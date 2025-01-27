# Resolvendo

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

- $P_0: T (n  ) = T (n - 1) + n$
- $P_1: T (n-1) = T (n - 2) + (n-1)$
- $P_2: T (n-2) = T (n - 3) + (n-2)$
- $P_3: T (n-3) = T (n - 4) + (n-3)$
- $\vdots$

Substituindo os passos no caso base:

- $T(n) = T(n-1) + n$
- $T(n) = (T(n-2) + (n-1)) + n$
  - $T(n) = T(n-2) + (n-1) + n$
  - $T(n) = T(n-2) + 2n - 1$
- $T(n) = T(n-3) + (n-2) + 2n - 1$
  - $T(n) = T(n-3) + 3n - 3$
- $T(n) = T(n-3) + 3n - 3$
  - $T(n) = T(n-4) + (n-3) + 3n - 3$
  - $T(n) = T(n-4) + 4n - 6$
- $\vdots$
- $T(n) = T(n-k) + kn - \sum_{i=0}^{k-1} i$
- $T(n) = T(n-k) + kn - \frac{k \cdot (k-1)}{2}$

---

Calculando $k$ para alcançar o caso base:

- $T(n-k) = T(0)$
- $n-k = 0$
- $n = k$

Substituindo $k$ na equação:

- $T(n) = T(0) + n^2 - \frac{n \cdot (n-1)}{2}$
- $T(n) = 1 + n^2 - \frac{n^2 - n}{2}$
- $T(n) = 1 + n^2 + \frac{- n^2 + n}{2}$
- $T(n) = 1 + n^2 + \frac{- n^2}{2} + \frac{n}{2}$
- $T(n) = \Theta(1) + \Theta(n^2) + \Theta(\frac{- n^2}{2}) + \Theta(\frac{n}{2})$
- $T(n) = \Theta(n^2)$

#### 4. $T (n) = 2T (n - 1) + n^2 + 1$

- $P_0: T (n  ) = 2T (n - 1) + (n  )^2 + 1$
- $P_1: T (n-1) = 2T (n - 2) + (n-1)^2 + 1$
- $P_2: T (n-2) = 2T (n - 3) + (n-2)^2 + 1$
- $P_3: T (n-3) = 2T (n - 4) + (n-3)^2 + 1$
- $P_4: T (n-4) = 2T (n - 5) + (n-4)^2 + 1$
- $\vdots$

---

Substituindo os passos no caso base:

- $T(n) = 2T(n-1) + n^2 + 1$
- $T(n) = 2(2T(n-2) + (n-1)^2 + 1) + n^2 + 1$
  - $T(n) = 4T(n-2) + 2(n-1)^2 + 2 + n^2 + 1$
- $T(n) = 4(2T (n-3) + (n-2)^2 + 1) + 2(n-1)^2 + 2 + n^2 + 1$
  - $T(n) = 8T(n-3) + 4(n-2)^2 + 4 + 2(n-1)^2 + 2 + n^2 + 1$
- $T(n) = 8(2T (n-4) + (n-3)^2 + 1) + 4(n-2)^2 + 4 + 2(n-1)^2 + 2 + n^2 + 1$
  - $T(n) = 16T(n-4) + 8(n-3)^2 + 8 + 4(n-2)^2 + 4 + 2(n-1)^2 + 2 + n^2 + 1$

Reordenando os termos:

- $T(n) = 16T(n-4) + 8(n-3)^2 + 4(n-2)^2 + 2(n-1)^2 + (n)^2 + (8 + 4 + 2 + 1)$

Adicionando mais uns detalhes pra facilitar o entendimento da progressão:

- $T(n) = 16T(n-4) + 8(n-3)^2 + 4(n-2)^2 + 2(n-1)^2 + 1(n-0)^2 + (8 + 4 + 2 + 1)$
- $T(n) = (2^4)T(n-4) + (2^3)(n-3)^2 + (2^2)(n-2)^2 + (2^1)(n-1)^2 + (2^0)(n-0)^2 + (8 + 4 + 2 + 1)$
- $T(n) = (2^4)T(n-4) + (2^3)(n-3)^2 + (2^2)(n-2)^2 + (2^1)(n-1)^2 + (2^0)(n-0)^2 + (15)$
- $T(n) = (2^4)T(n-4) + (2^3)(n-3)^2 + (2^2)(n-2)^2 + (2^1)(n-1)^2 + (2^0)(n-0)^2 + (2^4 - 1)$
- $T(n) = \left( (2^4)T(n-4) + (2^3)(n-3)^2 + (2^2)(n-2)^2 + (2^1)(n-1)^2 + (2^0)(n-0)^2 \right) + (2^4 - 1)$
- $\vdots$
- $Eq. 1: T(n) = 2^kT(n-k) + \sum_{i=0}^{k-1} \left( 2^i(n-i)^2 \right) + (2^k - 1)$
- ou
- $Eq. 2: T(n) = 2^kT(n-k) + \sum_{i=0}^{k-1} \left( 2^i(n-i)^2 + 2^i\right)$

---

Distribuindo a $Eq. 1$:

- $Eq. 1: T(n) = 2^kT(n-k) + \sum_{i=0}^{k-1} \left( 2^i(n-i)^2 \right) + (2^k - 1)$
- Considerando que $f(n) = 2^i(n-i)^2$
- $f(n) = 2^i(n-i)^2$
- $f(n) = 2^i(n^2- 2ni + i^2)$
- $f(n) = (2^i)*(n^2- 2ni + i^2)$
- $f(n) = ((2^i)*n^2- (2^i)*2ni + (2^i)*i^2)$
- $f(n) = (2^i)*n^2 - (2^i)*2ni + (2^i)*i^2$

Retornando o $f(n)$ ao somatório:

- $T(n) = 2^kT(n-k) + \sum_{i=0}^{k-1} \left( (2^i)*n^2 - (2^i)*2ni + (2^i)*i^2 \right) + (2^k - 1)$

Considerando que $g(n) = \sum_{i=0}^{k-1} \left( (2^i)*n^2 - (2^i)*2ni + (2^i)*i^2 \right)$

- $g(n) = \sum_{i=0}^{k-1} \left( (2^i)*n^2 - (2^i)*2ni + (2^i)*i^2 \right)$
- $g(n) = \sum_{i=0}^{k-1} (2^i)*n^2 - \sum_{i=0}^{k-1} (2^i)*2ni + \sum_{i=0}^{k-1} (2^i)*i^2$
- $g(n) = n^2 \sum_{i=0}^{k-1} (2^i) - 2n \sum_{i=0}^{k-1} (2^i)*i + \sum_{i=0}^{k-1} (2^i)*i^2$

---

Considerando que $h(n) = \sum_{i=0}^{k-1} (2^i)$

- $h(n) = \sum_{i=0}^{k-1} (2^i)$
- $h(n) = 2^0 + 2^1 + 2^2 + \ldots + 2^{k-1}$

##### Bira


BIRA

- $\sum_{i=1}^{n} \left( 2^i * (n-i)^2 \right)$
- $b(n) = \sum_{i=1}^{n} \left( 2^i * (n-i)^2 \right)$
- $b(n) - b(n-1) = 2n * (n-n)^2$ #COPILOT
- $b(n) - b(n-1) = (\sum_{i=1}^{n} \left( 2^i * (n-i)^2 \right))-(\sum_{i=1}^{n-1} \left( 2^i * ((n-1)-i)^2 \right))$
- $b(n) - b(n-1) = (\sum_{i=1}^{n-1} \left( 2^i * (n-i)^2 \right)) + (2^n * (n-n)^2) -(\sum_{i=1}^{n-1} \left( 2^i * ((n-1)-i)^2 \right))$
- $b(n) - b(n-1) = (\sum_{i=1}^{n-1} \left( 2^i * (n-i)^2 \right)) + (2^n * (0)^2) -(\sum_{i=1}^{n-1} \left( 2^i * ((n-1)-i)^2 \right))$
- $b(n) - b(n-1) = (\sum_{i=1}^{n-1} \left( 2^i * (n-i)^2 \right)) + (0) -(\sum_{i=1}^{n-1} \left( 2^i * ((n-1)-i)^2 \right))$
- $b(n) - b(n-1) = \sum_{i=1}^{n-1} \left( 2^i * (n-i)^2 \right) - \sum_{i=1}^{n-1} \left( 2^i * ((n-1)-i)^2 \right)$
- $b(n) - b(n-1) = \sum_{i=1}^{n-1} \left( (2^i * (n-i)^2) - (2^i * ((n-1)-i)^2) \right)$
- $b(n) - b(n-1) = \sum_{i=1}^{n-1} \left( 2^i * (n-i)^2 - 2^i * ((n-1)-i)^2 \right)$
- $b(n) - b(n-1) = \sum_{i=1}^{n-1} \left( 2^i * ((n-i)^2 - (n-i-1)^2) \right)$
- $b(n) - b(n-1) = \sum_{i=1}^{n-1} \left( 2^i * (2*(n-i) - 1) \right)$

Definindo $c(n) = \sum_{i=1}^{n-1} \left( 2^i * (2*(n-i) - 1) \right)$

---

---

ABANDONANDO A BAGUNÇA ANTERIOR E SEGUINDO PRO MÉTODO INDUTIVO.

Recorrência base: $T (n) = 2T (n - 1) + n^2 + 1$

- $T (n) = \Omega(2^n)$

- $2^1T (n - 1)$
- $2^2T (n - 2)$
- $2^3T (n - 3)$
- ...

---

- $T(n) \leq 2^n - 2* n^2$

Por hipótese de indução:

- $T(n-1) \leq 2^{n-1} - (n-1)^2$

Passo indutivo:

- $T(n) \leq 2T(n-1) + n^2 + 1$
- $T(n) \leq 2(2^{n-1} - 2* (n-1)^2) + n^2 + 1$
- $T(n) \leq 2*2^{n-1} - 4*(n-1)^2 + n^2 + 1$
- $T(n) \leq 2^{n} - 4*(n-1)^2 + n^2 + 1$
- $T(n) \leq 2^{n} - 4*(n^2 - 2n + 1) + n^2 + 1$
- $T(n) \leq 2^{n} - (4*n^2 - 4*2n + 4*1) + n^2 + 1$
- $T(n) \leq 2^{n} - (4*n^2 - 8n + 4) + n^2 + 1$
- $T(n) \leq 2^{n} - 4*n^2 + 8n - 4 + n^2 + 1$
- $T(n) \leq 2^{n} - 3n^2 + 8n - 3$
- $T(n) \leq 2^{n} - 3n^2 + 8n - 3 \leq 2^n - 2* n^2$

Como $2^n - 3n^2 + 8n - 3 \leq 2^n - 2* n^2$ é verdade, então $T(n) = \Omega(2^n)$ para $n$ grande o bastante.

---

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

Então $f(n) = O(1)$, $f(n) = 1 = O(1)$. Logo, $T(n) = \Theta(n^{\log_{4}(2)}) = \Theta(n^\frac{1}{2}) = \Theta(\sqrt{n})$

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

- $a = 2; b = 4; f(n) = \log n$

- $\log_{b}(a) = \log_{4}(2) = \frac{1}{2}$

Para o primeiro caso:

- $n^{\log_{b}(a) - \epsilon} = n^{\frac{1}{2} - \epsilon}$
- $f(n) = \log n = O(n^{\frac{1}{2} - \epsilon})$
  - Considerando $\epsilon = 1$, temos que:
- $n^{\frac{1}{2} - 1}$
- $n^{\frac{-1}{2}}$
- $\frac{1}{\sqrt{n}}$
  - $f(n) = \log n = O(\frac{1}{\sqrt{n}})$ 👎

---

- $n^2$
- $n^{\frac{1}{2}} = \sqrt n$
- $n^{-1} = \frac{1}{n}$
- $n^{-2} = \frac{1}{n^2}$
- $n^{- \frac{1}{2}} = \frac{1}{\sqrt n}$

---

Para o segundo caso:

- $f(n) = \log n = \Theta(n^{\frac{1}{2}})$
- $\log n =? \Theta(\sqrt{n})$ 👎❓

<!-- - $\log n \Leftrightarrow n^x = 2$ -->
<!-- - $\sqrt{n} \Leftrightarrow n^{1/2}$ -->

Para o terceiro caso:

- $f(n) = \log n = \Omega(n^{\frac{1}{2} + \epsilon})$
  - Considerando $\epsilon = \frac{1}{2}$, temos que:
- $\log n =? \Omega(n^{\frac{1}{2} + \frac{1}{2}})$
- $\log n =? \Omega(n)$👎❓

---

Tentando pelo método outro lá.

- $T (n) = 2T ( \frac{n}{4} ) + \log n$
- $T (\frac{n}{4}) = 2T ( \frac{\frac{n}{4}}{4} ) + \log \frac{n}{4}$
  - $T (\frac{n}{4}) = 2T ( \frac{n}{4*4} ) + \log \frac{n}{4}$
- $T (\frac{n}{4*4}) = 2T ( \frac{n}{4*4*4} ) + \log \frac{n}{4*4}$
- ...

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

#### Resolvendo com alteração de variável

- Aplicando a dica:
  - $m = \log n \Leftrightarrow 2^m = n$
- Usando a definição de raiz quadrada:
  - $\sqrt{n} = n^\frac{1}{2}$
- Unindo ambos:
  - $\sqrt{n} = (n)^\frac{1}{2} = (2^m)^\frac{1}{2} = 2^\frac{m}{2}$

$Eq. 1: T (n) = 2T (\sqrt{n})$

Substituindo $\sqrt{n}$ por $n^\frac{1}{2}$ na $Eq. 1$:

$Eq. 2: T (n) = 2T (n^\frac{1}{2})$

Então, se tivermos na equação $T (n) = 2T (\sqrt{n})$ um valor de $n$ tal que $n = 2^m$, então teremos que:

- $Eq. 3: T (2^m) = 2T (2^\frac{m}{2})$

Criemos arbitrariamente uma nova função de conversão $Eq. 4: T(n) = T(2^m) = R(m)$.

Para que consigamos obter um $T (2^\frac{m}{2})$ encontrado na $Eq. 2$, precisaríamos que na função $R$, o parâmetro fosse $\frac{m}{2}$, então:

- $Eq. 5: R(\frac{m}{2}) = T(2^\frac{m}{2})$

Assim, substituindo os termos da $Eq. 3$ pelos da $Eq. 4$ e $Eq. 5$, temos que:

- $R(m) = 2R (\frac{m}{2})$

Assim, podemos agora aplicar o método de preferência para a resolução de recorrências.

##### Teorema Mestre

- $a = 2; b = 2; f(n) = 0$

- $\log_{b}(a) = \log_{2}(2) = 1$

- Caso 1
  - $f(n) = O(n^{\log_{b}(a) - \epsilon})$
  - $0 = O(n^{1 - \epsilon})$
  - Para $\epsilon = 1$, temos que:
  - $0 = O(n^{1 - 1})$
  - $0 = O(n^0)$
  - $0 = O(1)$

Como o caso 1 é verdadeiro, temos que:

- $R(m) = \Theta(m^{\log_{b}(a)})$
- $R(m) = \Theta(m^{1})$
- $R(m) = \Theta(m)$

Substituindo $m$ pelo seu valor inicial ($\log n$), e utilizando a definição da $Eq. 4$ temos que:

- $T(n) = \Theta(\log n)$

---

#### Tentativa de outro método sem a conversão de variáveis

Expandindo:

- $T (n) = 2T (\sqrt{n})$
- $T (n) = 2T (n^\frac{1}{2})$
- $T (n) = 2(2T (n^\frac{1}{4}))$
- $T (n) = 2(2(2T (n^\frac{1}{8})))$
- $T (n) = 2(2(2(2T (n^\frac{1}{16}))))$

Ou seja:

- $T (n) = 2^1 T (n^\frac{1}{2^1})$
- $T (n) = 2^2 T (n^\frac{1}{2^2})$
- $T (n) = 2^3 T (n^\frac{1}{2^3})$
- $\vdots$
- $T (n) = 2^k T (n^\frac{1}{2^k})$

---

---

### **Exercício 5.** Determine um limite assintótico para $T (n) = 2T (\sqrt{n}) + \log n$. Dica: Faça uma substituição de variável. Faça $m = \log n$

#### Resolvendo com alteração de variável Q5

- Aplicando a dica:
  - $m = \log n \Leftrightarrow 2^m = n$
- Usando a definição de raiz quadrada:
  - $\sqrt{n} = n^\frac{1}{2}$
- Unindo ambos:
  - $\sqrt{n} = (n)^\frac{1}{2} = (2^m)^\frac{1}{2} = 2^\frac{m}{2}$

$Eq. 1: T (n) = 2T (\sqrt{n}) + \log n$

Substituindo $\sqrt{n}$ por $n^\frac{1}{2}$ na $Eq. 1$:

$Eq. 2: T (n) = 2T (n^\frac{1}{2}) + \log n$

Então, se tivermos na equação $T (n) = 2T (\sqrt{n}) + \log n$ um valor de $n$ tal que $n = 2^m$, então teremos que:

- $Eq. 3: T (2^m) = 2T (2^\frac{m}{2}) + \log (2^m)$

- $\log (2^m) \Leftrightarrow 2^x = 2^m \implies x = m$
- $\log (2^m) = m$

- $Eq. 4: T (2^m) = 2T (2^\frac{m}{2}) + m$

Criemos arbitrariamente uma nova função de conversão $Eq. 5: T(n) = T(2^m) = R(m)$.

Para que consigamos obter um $T (2^\frac{m}{2})$ encontrado na $Eq. 3$, precisaríamos que na função $R$, o parâmetro fosse $\frac{m}{2}$, então:

- $Eq. 6: R(\frac{m}{2}) = T(2^\frac{m}{2})$

Assim, substituindo os termos da $Eq. 4$ pelos da $Eq. 5$ e $Eq. 6$, temos que:

- $Eq. 7: R(m) = 2R (\frac{m}{2}) + m$

Assim, podemos agora aplicar o método de preferência para a resolução de recorrências.

##### Teorema Mestre Q5

- Teorema Mestre
  - Sejam $a \geq 1$ e $b > 1$ constantes, $f(n)$ uma função, e $T(n) = aT(\frac{n}{b}) + f(n)$, então, para algum $\epsilon > 0$:
    - Se $f(n) = O(n^{\log_{b}(a) - \epsilon}) \implies T(n) = \Theta(n^{\log_{b}(a)})$ [<=]
    - Se $f(n) = \Theta(n^{\log_{b}(a)}) \implies T(n) = \Theta(n^{\log_{b}(a)} * log(n))$ [=]
    - Se $f(n) = \Omega(n^{\log_{b}(a) + \epsilon})$ e $a f (\frac{n}{b}) \leq cf(n)$ então $\implies T(n) = \Theta(f(n))$ [>=]

![a](https://static.todamateria.com.br/upload/lo/ga/logaritmodefinicao.jpg)

---

- $a = 2; b = 2; f(m) = m$

- $\log_{b}(a) = \log_{2}(2) = 1$

- Caso 1
  - $f(m) = O(m^{\log_{b}(a) - \epsilon})$
  - $m = O(m^{1 - \epsilon})$
  - $m^1 = O(m^{1 - \epsilon})$
    - Caso 1 inválido visto que o menor dos $\epsilon$ ainda assim não será válido.
- Caso 2
  - $f(m) = \Theta(m^{\log_{b}(a)})$
  - $m = \Theta(m^{1})$
  - $m = \Theta(m)$
  - 👍

Como o Caso 2 é verdadeiro, temos que:

- $R(m) = \Theta(m^{\log_{b}(a)} \cdot \log m)$
- $R(m) = \Theta(m^{1} \cdot \log m)$
- $R(m) = \Theta(m \cdot \log m)$
- $R(m) = \Theta(m \log m)$

Substituindo $m$ pelo seu valor inicial ($\log n$), e utilizando a definição da $Eq. 5$ temos que:

- $T(n) = \Theta((\log n) \log (\log n))$
- $T(n) = \Theta(\log n \log^2 n)$

---

---

### **Exercício 6.** Determine e prove uma equivalência assintótica para $T (n) = T ( \frac{n}{4} ) + T ( \frac{n}{5} ) + T ( \frac{n}{6} ) + n$

- **Dica 1:** Divida a prova em limite inferior e limite superior;
- **Dica 2:** Aproxime a função para baixo e para cima usando seus próprios termos.

---

- Teorema Mestre
  - Sejam $a \geq 1$ e $b > 1$ constantes, $f(n)$ uma função, e $T(n) = aT(\frac{n}{b}) + f(n)$, então, para algum $\epsilon > 0$:
    - Se $f(n) = O(n^{\log_{b}(a) - \epsilon}) \implies T(n) = \Theta(n^{\log_{b}(a)})$ [<=]
    - Se $f(n) = \Theta(n^{\log_{b}(a)}) \implies T(n) = \Theta(n^{\log_{b}(a)} * log(n))$ [=]
    - Se $f(n) = \Omega(n^{\log_{b}(a) + \epsilon})$ e $a f (\frac{n}{b}) \leq cf(n)$ então $\implies T(n) = \Theta(f(n))$ [>=]

---

- $T(n) = T(\frac{n}{4}) + T(\frac{n}{5}) + T(\frac{n}{6}) + n$
- $T^{+}(n) = T(\frac{n}{4}) + T(\frac{n}{4}) + T(\frac{n}{4}) + n$
  - Consideraremos que $T^{+}(n)$ como sendo uma função similar que seja **maior** que $T(n)$
  - $T^{+}(n) = 3T(\frac{n}{4}) + n$
- $T^{-}(n) = T(\frac{n}{6}) + T(\frac{n}{6}) + T(\frac{n}{6}) + n$
  - Consideraremos que $T^{-}(n)$ como sendo uma função similar que seja **menor** que $T(n)$
  - $T^{-}(n) = 3T(\frac{n}{6}) + n$

- Executando o Teorema Mestre para $T^{+}(n)$:
  - $a = 3; b = 4; f(n) = n$
  - $\log_{b}(a) = \log_{4}(3) = 0,792$
  - Caso 1:
    - $n^{\log_{b}(a) - \epsilon} = n^{\log_{4}(3) - \epsilon}$
    - $f(n) = n = O(n^{\log_{4}(3) - \epsilon})$
    - $n^1 = O(n^{\log_{4}(3) - \epsilon})$
    - $1 < \log_{4}(3) - \epsilon$
    - $\epsilon < 0,792 - 1$
    - $\epsilon < -0,208$
    - $0 < \epsilon < -0,208$ 👎
    - Com isso, entendemos que o caso 1 não é válido
  - Caso 2:
    - $n^{\log_{b}(a)} = n^{\log_{4}(3)}$
    - $f(n) = n = \Theta(n^{\log_{4}(3)})$
    - $n^1 = \Theta(n^{0,792})$
- Executando o Teorema Mestre para $T^{-}(n)$:
  - $a = 3; b = 6; f(n) = n$
  - $\log_{b}(a) = \log_{6}(3)$
  - Caso 1:
    - $n^{\log_{b}(a) - \epsilon} = n^{\log_{6}(3) - \epsilon}$
    - $f(n) = n = O(n^{\log_{6}(3) - \epsilon})$
    - $n^1 = O(n^{\log_{6}(3) - \epsilon})$ [#confia]
    - $1 = \log_{6}(3) - \epsilon$
    - $\epsilon = \log_{6}(3) - 1$
    - Com isso:
      - $T^{-}(n) = \Theta(n^{\log_{6}(3)})$

---

Então, considerando a equivalência assintótica para $T^{+}(n)$ e $T^{-}(n)$, desconsideraremos a base do $\log$, enfim tendo que:

$T(n) = \Theta(n^{\log 3})$

### Complexidade Amortizada

Para as questões a seguir considere uma pilha S que possui duas operações

- **pop(S)**: remove (desempilha) o topo da pilha $S$.
- **push(S,x)**: empilha o elemento x na pilha $S$.

Cada uma dessas operações possui custo O(1). Vamos definir uma nova operação para esta estrutura, a operação **multi-pop(S,k)** que remove os $k$ últimos elementos empilhados.

---

#### **Exercício 7.** Apresente um algoritmo para a operação de **multi-pop**. Observe que você pode usar a operação inicial de pop e a operação **vazio(S)** (que verifica se a pilha $S$ é vazia ou não) no seu algoritmo

---

- Algoritmo para **multi-pop**:
  - Entrada: pilha $S$ e inteiro $k$
  - $restaRemover \leftarrow k$
  - **ENQUANTO** !vazio(S) **E** restaRemover > 0 **FAÇA:**
    - pop(S)
    - $restaRemover \leftarrow restaRemover - 1$

#### **Exercício 8.** Qual a complexidade amortizada da operação de **multi-pop** dada uma sequência de operações de push, pop e **multi-pop** em uma pilha originalmente vazia?

Complexidade multi-pop:

- Algoritmo para **multi-pop**:
  - Entrada: pilha $S$ e inteiro $k$
  - $restaRemover \leftarrow k$ $[C_1]$
  - **ENQUANTO** !vazio(S) **E** restaRemover > 0 **FAÇA:** $[C_2]$
    - pop(S) $[C_3]$
    - $restaRemover \leftarrow restaRemover - 1$ $[C_4]$

- $C_1: 1 = O(1)$
- $C_2: O(1) + 1 = O(1)$ [Considerando que O(vazio(S)) = O(1)]
- $C_3: 1 = O(1)$
- $C_4: 2 = O(1)$

---

Através do método contável, consideraremos que no pior caso, teremos $n$ operações de **push**. Então, como cada operação de **push** tem complexidade O(1), a complexidade total será de O(n).

Então, ao fazermos a complexidade do pior caso, divida pelo número de operações, teremos a complexidade amortizada.

- Análise de complexidade amortizada: $\frac{O(n)}{n} = O(1)$

#### **Exercício 9.** Qual o custo computacional de sequência de $n$ operações de **push**, **pop** e **multi-pop** em uma pilha com inicialmente $s_O$ elementos e que termina com $s_n$ elementos?

Considerarei que serão realizados separadamente $n$ operações de push; $n$ operações de pop; e $n$ operações de multi-pop.

- push: adiciona um elemento
- pop: remove um elemento
- multi-pop: remove k elementos

---

Determinemos que:

- $S_O$ é a quantidade inicial de elementos na pilha
- $S_n$ é a quantidade final de elementos na pilha
- $P$ é a quantidade de operações de push
- $O$ é a quantidade de operações de pop
- $M$ é a quantidade de operações de multi-pop
- $n$ é a quantidade total de operações realizadas, sendo ela igual à soma de operações de push, pop e multi-pop.
  - Ou seja, $n = P + O + M$

Então após n operações distribuídas aleatoriamente entre P operações de Push, O operações de Pop e M operações de Multi-Pop, teremos que $n = P + O + M$. A complexidade de cada operação é O(1), então a complexidade de P operações de Push é $P*O(1) = O(P)$, a complexidade de O operações de Pop é $O*O(1) = O(O)$ e a complexidade de M operações de Multi-Pop é $M*O(1) = O(M)$.

Então, considerando também que $S_n$ é a quantidade de elementos após as n operações, Podemos dizer que $S_n = S_O + P - O - M$. Então a variação de elementos será dado por $S_n - S_O = P - O - M$.

[ Bira: Custo de todos multi-pop: $S_O + n - S_n$ ]

Sendo assim, o custo computacional será de $O(P) + O(O) + O(M) = O(P + O + M) = O(n)$.

---

[JV: NÃO TENHO CERTEZA ALGUMA DO QUE EU TÔ DIZENDO AQUI]

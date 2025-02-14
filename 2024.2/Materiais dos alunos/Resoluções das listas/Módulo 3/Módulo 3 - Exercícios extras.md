# Exercícios extras

<!--
⌊x⌋: chão \left\lfloor floor
⌈x⌉: teto \left\rroof roof ceil
-->

## Possíveis pontos extras

### SHUFFLING A LINKED LIST [JV: Também não sei se vale ponto extra]

- **Problem.** Given a singly linked list, rearrange its nodes uniformly at random. (All $n!$ permutations equally likely.)
- **Assumption.** Access to a perfect random-number generator.
- **Performance.** $O(n \log n)$ time, $O(\log n)$ extra space.

### Ponto extra 1: 11/12/2024 - Tentar reduzir o número de pontos para algo abaixo de 7 [JV: esse é pra fazer mesmo]

Exemplo original do Kleinberg (Slide 005DivideAndConquer1 pág 73)

**Definição:** Seja $s_i$ um ponto na faixa de tamanho $2 \delta$, com a $i$-ésima menor coordenada $y$.

**Afirmação:** Se $|j – i| > 7$, então a distância entre $s_i$ e $s_j$ é pelo menos $\delta$.

**Prova:**

- Considere um retângulo $R$ de $2 \delta$ por $\delta$ na faixa cuja mínima coordenada $y$ é a coordenada $y$ do ponto $s_i$.
- A distância entre $s_i$ e qualquer ponto $s_j$ acima de $R$ é $\geq \delta$.
- Subdivida $R$ em 8 quadrados.
- Haverá no máximo 1 ponto por quadrado. (O diâmetro é $\delta/\sqrt{2} < \delta$)
- No máximo **7** outros pontos podem estar em $R$.
  - A constante pode ser aprimorada com um argumento mais refinado de geometric packing.

---

**Postulado:** Dado que $\delta$ é a menor distância entre dois pontos dentro do problema dividido de menores distâncias por meio de divisão e conquista. Se $|j – i| > 7$, então a distância entre $s_i$ e $s_j$ é pelo menos $\delta$.

**Ponto extra**: fazer uma prova para reduzir a constante de quantos pontos podem ser comparados dentro da faixa cinza e que podem ser menores que delta.

![Exec aula 11-12-2024](<Img/005DivideAndConquer_73.png>)

---

### Ponto Extra 2: 09/12/2024 - Divide-and-conquer: Quiz 5 - Mediana das medianas para uma divisão por 7

Suppose that we divide $n$ elements into $⌊ n/5 ⌋$ groups of $r$ elements each, and use the median-of-medians of these $⌈n/r⌉$ groups as the pivot. For which $r$ is the worst-case running time of select $O(n)$?

a. $r = 3$
b. $r = 7$
c. Both a and b
d. Neither a nor b

---

$C(n) \leq C( ⌊ n/5 ⌋ ) + C(n - 3 ⌊ n/10 ⌋ ) + \frac{11}{5}n$

Achar a constante que dá certo para $R = 7$

---

Quando consideramos 5 elementos, temos as seguintes 3 partes: $C(n) \leq X_5 + Y_5 + Z_5$

- $X_5 = C( ⌊ n/5 ⌋ )$
  - Onde $⌊ n/5 ⌋$ é o número de grupos de 5 elementos que serão comparados
- $Y_5 = C(n - 3 ⌊ n/10 ⌋ )$
  - Onde $n - 3 ⌊ n/10 ⌋$ é o número de elementos que não são a mediana
  - Ele também pode ser escrito como:
    - $n - ⌊ 3n/10 ⌋ =$
    - $n - ⌊ 3/5 * n/2 ⌋ =$
      - Onde $⌊ 3/5 * n/2 ⌋$ é o número de elementos que são definitivamente menores, ou definitivamente maiores que a mediana das medianas
    - que representa a quantidade total de elementos removidos os elementos explicados acima.
- $Z_5 = \frac{11}{5}n$
  - Onde $\frac{11}{5}n$ é o número de comparações que serão feitas para encontrar a mediana das medianas
  - Também pode ser reescrito como $6 \cdot (n/5) + n$ que representa a quantidade de comparações que serão feitas para encontrar a mediana nos grupos de 5 elementos.

---

Então, se considerarmos $r = 7$, teremos que:

- $X_7 = C( ⌊ n/7 ⌋ )$
  - Onde $⌊ n/7 ⌋$ é o número de grupos de 7 elementos que serão comparados
- $Y_7 = \dots$
  - Para calcularmos este valor, seguiremos o caminho inverso:
    - Considerando que ao invés de 5 elementos, temos 7 elementos; e que, ao invés de 3 elementos garantidamente menores, temos 4 elementos garantidamente menores, teremos que:
      - $n - ⌊(4/7)*(n/2)⌋ =$
      - Que no formato original seria:
      - $n - 4 ⌊ n/14 ⌋$
    - Assim, concluindo que
  - $Y_7 = C(n - 4 ⌊ n/14 ⌋ )$

```mermaid
graph LR
  %% Styling
  style A1 fill:#ED9B9D,stroke:#000,color:#000
  style A2 fill:#ED9B9D,stroke:#000,color:#000
  style A3 fill:#ED9B9D,stroke:#000,color:#000
  style B1 fill:#AD7173,stroke:#000,color:#000
  style B2 fill:#AD7173,stroke:#000,color:#000
  style B3 fill:#AD7173,stroke:#000,color:#000
  style C1 fill:#70494A,stroke:#000,color:#000
  style C2 fill:#70494A,stroke:#000,color:#000
  style C3 fill:#70494A,stroke:#000,color:#000

  style A4 fill:#F06D04,stroke:#000,color:#000
  style B4 fill:#B55203,stroke:#000,color:#000
  style C4 fill:#783602,stroke:#000,color:#000

  style A5 fill:#9306E0,stroke:#000,color:#000
  style A6 fill:#9306E0,stroke:#000,color:#000
  style A7 fill:#9306E0,stroke:#000,color:#000
  style B5 fill:#6A04A3,stroke:#000,color:#000
  style B6 fill:#6A04A3,stroke:#000,color:#000
  style B7 fill:#6A04A3,stroke:#000,color:#000
  style C5 fill:#4A026F,stroke:#000,color:#000
  style C6 fill:#4A026F,stroke:#000,color:#000
  style C7 fill:#4A026F,stroke:#000,color:#000

  %% A4 --> B4 --> C4

    

  subgraph A
    direction LR
    A1(("`10^0 + 0`"))
    A2(("`10^1 + 0`"))
    A3(("`10^2 + 0`"))
    A4(("`10^3 + 0`"))
    A5(("`10^4 + 0`"))
    A6(("`10^5 + 0`"))
    A7(("`10^6 + 0`"))
  end

  subgraph B
    direction LR
    B1(("`10^0 + 1`"))
    B2(("`10^1 + 1`"))
    B3(("`10^2 + 1`"))
    B4(("`10^3 + 1`"))
    B5(("`10^4 + 1`"))
    B6(("`10^5 + 1`"))
    B7(("`10^6 + 1`"))
  end

  subgraph C
    direction LR
    C1(("`10^0 + 2`"))
    C2(("`10^1 + 2`"))
    C3(("`10^2 + 2`"))
    C4(("`10^3 + 2`"))
    C5(("`10^4 + 2`"))
    C6(("`10^5 + 2`"))
    C7(("`10^6 + 2`"))
  end

  A1 --> A2 --> A3 --> A4 --> A5 --> A6 --> A7
  B1 --> B2 --> B3 --> B4 --> B5 --> B6 --> B7
  C1 --> C2 --> C3 --> C4 --> C5 --> C6 --> C7
```

- $Z_7 = \dots$
  - Também fazendo o caminho inverso, teremos que:
    - $\#Comp \cdot (n/7) + n$
    - Onde, $\#Comp$ é a quantidade de comparações que serão feitas para encontrar a mediana nos grupos de 7 elementos.
      - Segundo Donald Knuth:
        - ![Donald Knuth](<https://raw.githubusercontent.com/UFMG-Organizacao-de-Disciplinas/DCC865-Projeto_e_Analise_de_Algoritmos/refs/heads/main/2024.2/Materiais%20Complementares%20-%20Enviados%20pelos%20alunos/Resolu%C3%A7%C3%B5es%20das%20listas/M%C3%B3dulo%203/Img/Knuth%20Median%20Of%20Median%20Comparisons.png>)
      - O 4º menor elemento de um conjunto de 7 elementos pode ser encontrado com no máximo 10 comparações, então: $\#Comp = 10$
    - Assim, concluindo que
  - $Z_7 = 10 \cdot (n/7) + n$
    - $Z_7 = 10n/7 + n$
    - $Z_7 = 10n/7 + 7n/7$
    - $Z_7 = 17n/7$

---

Com isso, conclui-se que a recorrência para $r = 7$ é:

$C(n) \leq C( ⌊ n/7 ⌋ ) + C(n - 4 ⌊ n/14 ⌋ ) + 17n/7$

Ou, mais objetivamente, a constante da parte linear é: $17/7$

### Ponto extra 3?: Resolvendo Recorrência [JV: aparentemente esse daqui foi só zoeira]

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

## Resoluções JV

### JV: Ponto extra 1: 11/12/2024 - Tentar reduzir o número de pontos para algo abaixo de 7 [JV: esse é pra fazer mesmo]

Exemplo original do Kleinberg (Slide 005DivideAndConquer1 pág 73)

**Definição:** Seja $s_i$ um ponto na faixa de tamanho $2 \delta$, com a $i$-ésima menor coordenada $y$.

**Afirmação:** Se $|j – i| > 7$, então a distância entre $s_i$ e $s_j$ é pelo menos $\delta$.

**Prova:**

- Considere um retângulo $R$ de $2 \delta$ por $\delta$ na faixa cuja mínima coordenada $y$ é a coordenada $y$ do ponto $s_i$.
- A distância entre $s_i$ e qualquer ponto $s_j$ acima de $R$ é $\geq \delta$.
- Subdivida $R$ em 8 quadrados.
- Haverá no máximo 1 ponto por quadrado. (O diâmetro é $\delta/\sqrt{2} < \delta$)
- No máximo **7** outros pontos podem estar em $R$.
  - A constante pode ser aprimorada com um argumento mais refinado de *geometric packing*.

---

**Postulado:** Dado que $\delta$ é a menor distância entre dois pontos dentro do problema dividido de menores distâncias por meio de divisão e conquista. Se $|j – i| > 7$, então a distância entre $s_i$ e $s_j$ é pelo menos $\delta$.

**Ponto extra**: fazer uma prova para reduzir a constante de quantos pontos podem ser comparados dentro da faixa cinza e que podem ser menores que delta.

![Exec aula 11-12-2024](<Img/005DivideAndConquer_73.png>)

---

#### Solução: apenas analisar os quadrados do lado oposto

Como estamos buscando o menor valor, teremos que, caso a distância entre dois pontos de um mesmo lado tenha valor menor que $\delta$, isso o tornaria o novo $\delta$, sendo assim, consideramos que o menor valor entre dois pontos de um mesmo lado do $L$, não pode ser menor que $\delta$.

Com isso, entendemos que a menor distância entre qualquer par de pontos pertencente ao intervalo $[L - \delta, L]$ ou ao intervalo $[L, L + \delta]$ é $\delta$. Então, para potencialmente encontrarmos uma solução menor que $\delta$, para um ponto pertencente ao lado esquerdo de $L$, para cada um dos pontos, precisamos apenas analisar os pontos do lado oposto ao qual ele se encontra.

Assim, considerando ainda a partição em quadrantes, reduz-se o número máximo de pontos a serem comparados para 4.

#### Apenas analisar os quadrantes que têm interseção com o círculo de raio $\delta$ [JV: errado]

A redução pode ser ainda maior, se considerarmos que a distância entre dois pontos é menor que $\delta$ se, e somente se, os dois pontos estiverem contidos em um círculo de raio $\delta$. Assim, podemos considerar que um círculo cujo centro é o ponto $S_i$, esse círculo sobreporá no máximo 2 dos quadrantes do outro lado.

### JV: Ponto Extra 2 - Divide-and-conquer: Quiz 5 - Mediana das medianas para uma divisão por 7

Suppose that we divide $n$ elements into $⌊ n/5 ⌋$ groups of $r$ elements each, and use the median-of-medians of these $⌈n/r⌉$ groups as the pivot. For which $r$ is the worst-case running time of select $O(n)$?

a. $r = 3$
b. $r = 7$
c. Both $a$ and $b$
d. Neither $a$ nor $b$

---

Achar a constante que dá certo para $R = 7$

---

$C(n) \leq C( ⌊ n/5 ⌋ ) + C(n - 3 ⌊ n/10 ⌋ ) + \frac{11}{5}n$

Onze comparações:

```mermaid
flowchart TD
    C1{"a < b"} --> L1{"a < c"}
    C1 --> R1{"b < c"}

    L1 --> M1["a é a mediana"]
    L1 --> M2["c é a mediana"]
    R1 --> M3["b é a mediana"]
    R1 --> M2
```

```mermaid
flowchart TD
    %% Comparação inicial
    C1{"a < b"} --> C2{"a < c"}
    C1 --> C3{"b < c"}

    %% Comparações à esquerda
    C2 --> C4{"a < d"}
    C2 --> C5{"c < d"}

    C4 --> M1["a é mediana"]
    C4 --> C6{"d < e"}
    C5 --> M2["c é mediana"]

    %% Comparações à direita
    C3 --> C7{"b < d"}
    C3 --> C8{"c < d"}

    C7 --> M3["b é mediana"]
    C8 --> C9{"d < e"}
    C9 --> M4["d é mediana"]
    C6 --> M5["e é mediana"]
```

```mermaid
flowchart TD
    %% Primeira camada de comparações
    C1{"a < b"} --> C2{"c < d"}
    C1 --> C3{"b < c"}

    %% Comparação entre os maiores dos pares
    C2 --> C4{"a < e"}
    C3 --> C5{"b < e"}

    %% Comparações para encontrar a mediana
    C4 --> C6{"a < c"}
    C5 --> C7{"b < c"}
    
    %% Mediana entre os 3 restantes
    C6 --> M1["a é a mediana"]
    C7 --> M2["b é a mediana"]
    C6 --> M3["c é a mediana"]
```

## Resoluções Gustavo

### Questão que não sei qual

![alt text](<Img/Resolução Tarefa Extra Gustavo.jpg>)

### É possível reduzir o número de comparações para o problema de menor distância planar para algo menor que 7?

- Resposta:
  - Opção 01:
    - Regiões de menor densidade podem resultar em uma comparação com $n < 7$ elementos. Se há uma garantia que a densidade da região é pequena. Em nível de complexidade pode-se reduzir o número máximo de comparações uma vez que nem todos os quadradinhos serão populados
  - Opção 02:
    - Usando diagramas de Voronoi no lugar de quadradinhos. O Diagrama divide o espaço em células poligonais e cada célula possui os pontos mais próximos de um ponto específico. Dois pontos só podem ter distância menor do que $\delta$ se as duas células tiverem arestas simultâneas. Então só será necessário comparar cada ponto com suas arestas vizinhas. Se os polígonos resultantes tiverem menos de 7 lados, garantidamente haverão menos de 7 comparações

### Mediana das medianas para uma divisão por 7

Para o número de elementos iguais a 7

Pelo menos metade dos 7 medianas de elementos tem que ser menores ou iguais a p

Além disso, pelo menos Chão(Chão(n/7)/2) (Ou seja, chão(n/14)) medianas tem que ser menores ou iguais a p

Entretanto, como P pode ser maior ou igual a 4 dos elementos, temos que 4*chão(n/14)) tem que ser menores ou iguais a p

## Dúvidas

> Non-degeneracy assumption. No two points have the same x-coordinate.

Por que eles não podem ter o mesmo valor de x?

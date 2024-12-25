# Resumo do Módulo 3

## Dijkstra 3-way partitioning - $O(n)$

- **Descrição:** defina um pivô `p`; tenha os ponteiros `i`, `lt` (less than) e `gt` (greater than); O `lt` marca o primeiro elemento do conjunto de valores iguais ao pivô; O `i` começa no primeiro elemento após o conjunto de pivôs e o `gt` começa no último elemento do array; Se o elemento na posição `i` for menor que o pivô, troque com o elemento na posição `lt` e incremente `i` e `lt`; Se o elemento na posição `i` for maior que o pivô, troque com o elemento na posição `gt` e decremente o `gt`; Se o elemento na posição `i` for igual ao pivô, apenas incremente o `i`;

---

Anotações do slide Demo

- Seja `p` o pivô
- Troque `p` pelo index `lo` [JV: Não entendi]
- Escaneie com o `i` da esquerda pra direita
  - Se `a[i] < p`, troque `a[lt]` com `a[i]` e incremente `lt` e `i`
  - Se `a[i] > p`, troque `a[gt]` com `a[i]` e decremente `gt`
  - Se `a[i] == p`, apenas incremente `i`

## Randomized quicksort - $O(n \log n)$

- **Descrição:** Defina um pivô aleatório; Coloque os menores à esquerda e os maiores à direita; Recursivamente, aplique o algoritmo nos subarrays à esquerda e à direita do pivô.

---

### Anotações do slide Demo

- Escolha um pivô aleatório
- Crie 3 partes do array: Esquerda, Meio e Direita
- Recursivamente, aplique o algoritmo nos subarrays à parte esquerda e à parte direita do pivô

#### Randomized quicksort - Implementação

```python
def partition_3_way_dijkstra(A, pivot):
  lt = 0
  gt = len(A) - 1
  i = 0
  while i <= gt:
    if A[i] < pivot:
      A[lt], A[i] = A[i], A[lt]
      lt += 1
      i += 1
    elif A[i] > pivot:
      A[gt], A[i] = A[i], A[gt]
      gt -= 1
    else:
      i += 1
  
  left = A[:lt]
  middle = A[lt:gt+1]
  right = A[gt+1:]

  return left, middle, right
  # return A

def partition_3_way_py(A, pivot):
  left    = [x for x in A if x <  pivot]
  middle  = [x for x in A if x == pivot]
  right   = [x for x in A if x >  pivot]
  return left, middle, right

def randomized_quicksort(A):
  if len(A) <= 1:
    return A
  pivot = random.choice(A)
  L, M, R = partition_3_way_py(A, pivot)
  return randomized_quicksort(L) + M + randomized_quicksort(R)
```

#### Chance dos elementos $a_i$ e $a_j$ serem comparados

Apenas se um deles for escolhido como pivô. A chance dele ser escolhido como pivô aleatoriamente é $\frac{1}{n}$, onde $n$ é o tamanho do array. Como são dois possíveis pivôs, a chance de um deles ser escolhido é $\frac{1}{n} + \frac{1}{n} = \frac{2}{n}$.

É dito que a Probabilidade de $a_i$ e $a_j$ serem comparados é $\frac{2}{j-i+1}$. Ou seja, $2 =$ a quantidade de elementos que se tá computando a probabilidade de serem comparados. e $j-i+1 =$ a quantidade de elementos que estão entre $a_i$ e $a_j$.

---

Tem toda uma matemática com soma harmônica que eu não entendi.

#### Median-of-medians Selection Algorithm

- **Descrição:** Divide o array em grupos de 5 elementos; Encontra a mediana de cada grupo; Encontra a mediana das medianas; Usa a mediana das medianas como pivô.

---

- **Pseudocódigo**

- **MOM-SELECT** $(A, k)$
- $n \leftarrow |A|$
- **SE** $(n < 50)$
  - **RETORNE** o $k$-ésimo menor elemento de $A$ via mergesort.
- Agrupe $A$ em $\left\lceil \frac{n}{5} \right\rceil$ grupos de 5 elementos cada (ignore leftovers).
- $B \leftarrow$ mediana de cada grupo de 5.
- $p \leftarrow$ MOM-SELECT$(B, \left\lceil \frac{n}{10} \right\rceil)$ <!-- <- Mediana das medianas -->
- $(L, M, R) \leftarrow$ PARTITION-3-WAY$(A, p)$.
- **SE** $(k \leq |L|)$ **RETORNE** MOM-SELECT$(L, k)$.
- **SENÃO SE** $(k > |L| + |M|)$ **RETORNE** MOM-SELECT$(R, k - |L| - |M|)$
- **SENÃO** **RETORNE** $p$.

## Algoritmos Gulosos

### Cashier's Algorithm

- **Descrição:** a cada iteração, adicione uma moeda do maior valor que não nos leva além do valor a ser pago.

- **Observações:** sua otimalidade depende do conjunto de moedas que poderão ser utilizadas. Não só a otimalidade, mas a existência de uma solução.
  - Exemplo de não-otimalidade:
    - Valor a ser pago: 6; Moedas: 1, 3, 4
  - Exemplo de inexistência de solução:
    - Valor a ser pago: 2; Moedas: 3, 4

- **Propriedades de uma solução ótima:** [JV: No slide fala especificamente sobre as moedas dos EUA e não fala de forma não matematicamente genérica, então não garanto a certeza dessa afirmação.]
  - Cada moeda deverá ter uma soma em seu valor menor que a o valor da moeda seguinte.
  - **Matematicamente:**
    - **Descrição:** cada somatório de valores de moedas não deve exceder o valor da moeda seguinte.
      - $⌈ \frac{m_{k+1}}{m_k} ⌉ - 1 \leq n_k$
      - $⌈ \frac{m_{k+1}}{m_k} ⌉ > n_k$
      - Onde:
        - $m_k$ é o valor da moeda $k$
        - $n_k$ é a quantidade de moedas de valor $m_k$
        - $m_{k+1}$ é o valor da moeda diretamente maior que $m_k$
    - **Descrição:** o somatório de moedas de valor baixo não deve exceder o valor da moeda de valor mais alto.
      - $\sum_{i=1}^{k} m_i \cdot n_i \leq m_{k+1} - 1$
    - **Descrição:** se tenho um valor a ser pago que se encontra entre dois valores de moedas, a solução ótima inclui a moeda diretamente menor que o valor.
      - $m_k < v \leq m_{k+1}; m_k \in S.O.$
      - Onde:
        - $S.O.$ é a solução ótima
      - [JV: ora... mas isso recai no exemplo de não-otimalidade 🤔]

---

- **Pseudocódigo**
  - **CASHIERS_ALGORITM** $(x, c_1, c_2, \dots, c_n)$
  - **SORT** $n$ coin denominations so that $0 < c_1 < c_2 < \dots < c_n$.
  - $S \leftarrow \emptyset$.
  - **WHILE** $(x > 0)$
    - $k \leftarrow$ largest coin denomination $c_k$ such that $c_k \leq x$.
    - **IF** (no such $k$)
      - **RETURN** "no solution."
    - **ELSE**
      - $x \leftarrow x - c_k$.
      - $S \leftarrow S \cup \{ k \}$.
  - **RETURN** $S$.

- **Código**

```python
def cashier(amount, coins):
  coins.sort(reverse=True)
  change = []
  for coin in coins:
    while coin <= amount:
      change.append(coin)
      amount -= coin
  return change
```

### Algoritmos de programação dinâmica

#### Weighted Interval Scheduling - Brute Force

- **Descrição:** encontrar o conjunto de intervalos que não se sobrepõem e que tenham o maior somatório possível.
  - Um intervalo começa em $s_i$ e termina em $f_i$ e tem um peso $w_i$.

- Função auxiliar $p(i)$
  - **Descrição:** retorna o maior índice $j$ tal que $f_j \leq s_i$.

---

- **Pseudocódigo**
  - **WIS_TopDown(n, StartingTime, FinishTime, Weight)**
    - sort intervals by finish time
    - $p \leftarrow \emptyset$
    - for $i = 1$ to $n$
      - $p[i] \leftarrow$ $p(i)$ # find the largest index j such that $f_j \leq s_i$
    - $M[0] \leftarrow 0$
    - **Return** M_Compute_Opt(n, M)

  - **WIS_BottomUp(n, StartingTime, FinishTime, Weight)**
    - sort intervals by finish time
    - $p \leftarrow \emptyset$
    - for $i = 1$ to $n$
      - $p[i] \leftarrow$ $p(i)$ # find the largest index j such that $f_j \leq s_i$
    - $M[0] \leftarrow 0$
    - for $j = 1$ to $n$
      - $M[j] \leftarrow \max \{ M[j-1], w_j + M[p[j]] \}$
    - **Return** $M[n]$

  - **M_Compute_Opt(j, M)**
    - **IF** ($M = \emptyset$)
      - $M[j] \leftarrow \max \{ M_Compute_Opt(j-1, M), w_j + M_Compute_Opt(p[j], M) \}$
    - **Return** $M[j]$

  - **Find_Solution(j)**
    - **IF** ($j = 0$)
      - **Return** $\emptyset$
    - **ELSE IF** ($w_j + M[p[j]] > M[j-1]$)
      - **Return** $\{ j \} \cup$ Find_Solution(p[j])
    - **ELSE**
      - **Return** Find_Solution(j-1)

---

- **Código**

```python
# Pode acabar ocorrendo problema com a indexação por 1.

def sort_by_finish_time(starts, ends, weights):
  return zip(*sorted(zip(starts, ends, weights), key=lambda x: x[1])) # Does it work? Copilot did it for me.

def compute_previous_jobs(n, starts, ends, previous_jobs):
  previous_jobs = [-1] * (n)
  for i in range(1, n):
    # previous_jobs[i] armazenará o maior índice j que tem o seu tempo de término menor ou igual ao tempo de início de i
    previous_jobs[i] = max([j for j in range(i) if ends[j] <= starts[i]], default=-1)
  return previous_jobs

def wis_bottom_up(n, starts, ends, weights, previous_jobs):
  s, f, w = sort_by_finish_time(starts, ends, weights)
  compute_previous_jobs(n, s, f, previous_jobs)
  values_vec = [0] * (n)
  for j in range(1, n):
    values_vec[j] = max([values_vec[j-1], w[j] + values_vec[previous_jobs[j]]], default=-1)
  return values_vec

def find_solution(j, weights, values_vec, previous_jobs):
  if j == 0:
    return []
  elif weights[j] + values_vec[previous_jobs[j]] > values_vec[j-1]:
    return [j] + find_solution(previous_jobs[j], values_vec, previous_jobs)
  else:
    return find_solution(j-1, values_vec, previous_jobs)

def input_initial_values():
  n = 5
  starts = [1, 2, 4, 6, 8]
  ends = [3, 5, 7, 9, 10]
  weights = [5, 1, 8, 4, 6]
  return n, starts, ends, weights

def get_WIS_solution(n, starts, ends, weights):
  previous_jobs = []
  values_vec, weights = wis_bottom_up(n, starts, ends, weights, previous_jobs)
  solution = find_solution(n-1, weights, values_vec, previous_jobs)
  return solution

def weighted_interval_scheduling():
  n, starts, ends, weights = input_initial_values()
  final_solution = get_WIS_solution(n, starts, ends, weights)
  print(final_solution)
```

#### Maximum Subarray Problem

#### Kadane's Algorithm

#### Bentley's Algorithm

Complexidade

$(n^2)^x = n^3$

$x = 3/2 = 1 + 1/2$

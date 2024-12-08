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

# Exercícios extras

## Desafio de aula - Extra

$$
T(n) =
\begin{cases}
  0                                                       & \text{if} n = 1 \\
  T(\lceil n/2 \rceil) + T(\lfloor n/2 \rfloor) + n - 1   & \text{if} n > 1 \\
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

## Tem mais um que não sei quando foi

## 09/12/2024

Para grupos de 5 elementos

$C(n) = C( \left\lfloor n/5 \right\rfloor ) + C( n - 3 \left\lfloor n/10 \right\rfloor ) + \frac{11}{5}n$

- $\frac{11}{5}n$
  - computar mediana de 5 elementos ($\leq$ 6 comparações por grupo)
  - Particionar

## 11/12/2024 - Tentar reduzir o número de pontos para algo abaixo de 7
Exemplo original do Kleinberg (Slide 005DivideAndConquerl pág 73)

Ponto extra: fazer uma prova para reduzir a constante de quantos pontos podem ser comparados dentro da faixa cinza e que podem ser menores que delta. (Slide: 05DivideAndConquerI, Pág. 73)

Postulado: Dado que δ é a menor distância entre dois pontos dentro do problema dividido de menores distâncias por meio de divisão e conquista. Se $⎜j – i⎟$ > 7, então a distância entre $s_i$ e $s_j$ é pelo menos δ.

![Exec aula 11-12-2024](<Img/005DivideAndConquer_73.png>)

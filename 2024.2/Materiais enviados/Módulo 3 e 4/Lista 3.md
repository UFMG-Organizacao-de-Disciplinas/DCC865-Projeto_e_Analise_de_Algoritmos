# asd

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

# Ponto extra: 11/12/2024 - Tentar reduzir o número de pontos para algo abaixo de 7

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

<!-- ![Exec aula 11-12-2024](<Img/005DivideAndConquer_73.png>) -->

![Exec aula 11-12-2024](<https://raw.githubusercontent.com/UFMG-Organizacao-de-Disciplinas/DCC865-Projeto_e_Analise_de_Algoritmos/refs/heads/main/2024.2/Materiais%20Complementares%20-%20Enviados%20pelos%20alunos/Resolu%C3%A7%C3%B5es%20das%20listas/M%C3%B3dulo%203/Img/005DivideAndConquer_73.png>)

---

## Solução: apenas analisar os quadrados do lado oposto

Como estamos buscando o menor valor, teremos que, caso a distância entre dois pontos de um mesmo lado tenha valor menor que $\delta$, isso o tornaria o novo $\delta$, sendo assim, consideramos que o menor valor entre dois pontos de um mesmo lado do $L$, não pode ser menor que $\delta$.

Com isso, entendemos que a menor distância entre qualquer par de pontos pertencente ao intervalo $[L - \delta, L]$ ou ao intervalo $[L, L + \delta]$ é $\delta$. Então, para potencialmente encontrarmos uma solução menor que $\delta$, para um ponto pertencente ao lado esquerdo de $L$, para cada um dos pontos, precisamos apenas analisar os pontos do lado oposto ao qual ele se encontra.

Assim, considerando ainda a partição em quadrantes, reduz-se o número máximo de pontos a serem comparados para 4.

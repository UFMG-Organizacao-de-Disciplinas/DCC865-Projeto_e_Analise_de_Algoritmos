# Conteúdo da Prova - Módulo 1 - Substitutiva

PROJETOS E ANÁLISE DE ALGORITMOS — 2024/2 — PROVA I (SUBSTITUTIVA) (25 PONTOS)

PROF. MARCIO COSTA SANTOS

---

INSTRUÇÕES

a. As respostas devem estar na prova no espaço designado para tal.
b. A interpretação das questões faz parte da prova. Explique as suposições que fizer.
c. Não é permitido o uso de material de consulta.

---

**Nome:**
**Matrícula:**

---

**Questão 1 (5 pontos)** (Complexidade) Determine a complexidade de melhor caso e de pior caso do algoritmo abaixo
  
- **Entrada:** Vetor de inteiros a de tamanho $n$
- $cont \leftarrow 0$;
- **para** $i$ de $1$ até $n$ **faça**
  - **se** $a[i]$ *é par* **então**
    - **retorna** $i$;
  - **senão**
    - **para** $j$ de $1$ até $i$ **faça**
      - $cont \leftarrow cont + 1$;
- **retorna** $cont$;

---

**Questão 2 (5 pontos)** (Complexidade Amortizada) Considere uma estrutura de vetor variável definida da seguinte maneira: Um vetor $v$, a sua última posição ocupada $n$ e seu tamanho máximo $N$. Esta estrutura dispõe de uma operação de inserção ($INCLUI(x)$ que inclui o elemento $x$ sempre no final) descrita a seguir que tem a especificidade que quando o vetor está cheio, aloca o dobro de espaço do vetor corrente e transfere os elementos para este novo espaço alocado. Qual a complexidade de pior caso desse algoritmo e complexidade amortizada? Justifique sua resposta.

- **Algoritmo 1:** INCLUIR
  - **Data:** Vetor Ajustável $v$, elemento $x$
  - $n \leftarrow$ número de elementos em $v$;
  - **se** $n < N$ **então**
    - $v[n] = x$;
    - $n \leftarrow n + 1$;
  - **senão**
    - $u \leftarrow$ aloca $2n$ espaços de memória;
    - **para todo** $i$ de $1$ até $n$ **faça**
      - $u[i] \leftarrow v[i]$;
    - $N \leftarrow 2n$;
    - Libera memória de $v$;
    - $v \leftarrow u$;

---

**Questão 3 (5 pontos)** (Notação Assintótica) Mostre que para qualquer real positivo $\epsilon > 0$, $n \log n \neq \Omega (n^{1 + \epsilon})$.

---

**Questão 4 (5 pontos)** (Funções Recursivas e Recorrências) Apresente uma equivalência assintótica ($\Theta$) para a recorrência abaixo. A equivalência deve ser acompanhada de uma demonstração.

$T(n) = T(n - 1) + \frac{1}{n} + \log n$

---

**Questão 5 (5 pontos)** (Teorema Mestre) Apresente um limite superior assintótico ($O$) e um limite inferior assintótico ($\Omega$) para a recorrência abaixo. Ambos devem ser acompanhados de uma demonstração. Quanto mais apertado o limite, mas pontos valerá a questão. Limites triviais $\Omega(1)$ e $\Omega(2^n)$ não serão considerados.

$T(n) = T(\frac{n}{2}) + T(\frac{n}{3}) + 1$

---

## Informações Úteis

1. Teorema Mestre: Sejam $a \geq 1$ e $b > 1$ constantes, $f(n)$ uma função e $T(n) = aT(\frac{n}{b}) + f(n)$,
   - Então, para algum $\epsilon > 0$
   - **Se** $f(n) = O(n^{\log_{b} a - \epsilon})$ **então** $T(n) = \Theta(n^{\log_b a})$
   - **Se** $f(n) = \Theta(n^{\log_b a})$ **então** $T(n) = \Theta(n^{\log_b a} \log n)$
   - **Se** $f(n) = \Omega(n^{\log_b a + \epsilon})$ **e** $af(\frac{n}{b}) \leq cf(n)$ **então** $T(n) = \Theta(f(n))$
2. $n! = \Theta(n^n)$.
3. $\sum_{i=1}^{n} \frac{1}{i} = \Theta(\log n)$.

# PAA 2024 - Marcio Costa Santos <marciocs@dc.ufmg.br> & Olga NIkolaevna Goussevskaia

livro do cormen e do udi manber

## Aula 1 - 25/09/24

Primeira aula é pra explicar

- Análise e complexidade de algoritmos
- Algoritmos em grafos
- Projetos e Design de algoritmos
- Complexidade de problemas

Os dois primeiros é dele. As duas últimas é com a Olga.

Cada um dos módulos vale 25 pontos. O primeiro módulo só tem uma prova que vale 25. Nos outros terá uma prova mais uma atividade, podendo ser uma lista de exercícios ou um trabalho prático. Cada professor define de que forma distribui os 25 pontos entre prova e atividade.

Muito provavelmente pra ele será 20 pra prova e 5 pra atividade/lista. Geralmente a Olga faz (20 e 5), e (15, 10)

Vâo postar o cronograma de PAA no Moodle.

Algumas das avaliações são também pelo Moodle

Ele geralmente usa slide e também escreve muito no quadro. Algumas coisas como algoritmos e desenhos ele prefere ter no slide.

Os slides e as listas ele disponibiliza no Moodle, mesmo que ele não faça atividades só de exercícios. Ele deve fazer duas aulas assim antes de cada uma das provas dos dois primeiros módulos. Porém, tente resolver todos os exercícios antes das aulas.

Pretende enviar todo o material do módulo de uma só vez.

Ele segue um livro e a Olga, outro. Ele gosta de seguir o Cormen "de cabo a rabo".

Ele vai indicar quais capítulos correspondem àquela aula.

### Sobre o módulo

Ela não é uma disciplina pra aprender a programar, nem é das mais fáceis de teoria.

Exemplo que ele vai fingir que vc sabe: PA, PG, Logaritmo; Estruturas de controle em programação; Estruturas de dados básicos (filha, pilha, árvore, heap);

A disciplina é de Análise e construção de algoritmo. A ideia do curso é que você já entende o básico e vai partir daí.

O professor Coutinho criou um material de estudo que é o "Pré-PAA" que tem uma sequência de materiais para estudo próprio. Se não souber de algo, pare e tente resolver.

É importante seguir o cronograma e fazer isso o mais rápido possível.

As aulas vão começar básicas e elas tendem a se tornar muito complicadas.

Exemplo: Aula 1 é o básico de grafos. Aula 2 já seria a notação matemática para o que foi dado na aula 1.

Ele deve usar bastante transformação de logaritmo.

- Que linguagem de programação é usada em PAA?
  - Nenhuma. O que ele vai mostrar são algoritmos. Exemplos: `while (deu certo)`, `Inclui V NaLista L`, `R = folhas da árvore T`.
  - No início ele deve tentar esquematizar mais a parte da estrutura dos dados, mas com o tempo vai se tornar cada vez mais abstrato.

Especialmente em algoritmos recursivos ele vai explicar como funciona o algoritmo, principalmente na ideia, mas faltando alguns passos. Exemplo: ignorando todos os corner-cases e focar na ideia que é principal.

Python, Java, C ou C++. Ele é muito fanboy de Julia kkkkkkkkkkkkkkkkkkkkkk

O trabalho provavelmente vai envolver alguma coisa de programação.

- Ele mais se importa que a ideia do algoritmo esteja certa. Não importa muito os pormenores. Aqueles últimos detalhes:
  - Divide em grupos de cinco
    - E se não for múltiplo?
  - Divide na metade
    - E se for ímpar?

A primeira parte da disciplina não é criar algoritmos, apenas analisá-los.

Nessa primeira parte é aquela análise de Big-O para definir a quantidade de passos que o algoritmo executa.

Geralmente vai se utilizar formas matemáticas de se utilizar Somatórios, que geralmente são PAs ou PGs.

- Às vezes o somatório é muito esquisito, que resulta em algo ainda mais esquisito. Exemplo:
  - $\sum^{n}_{i = 0} = \frac{1}{i} = \log n$
  - Mas nesses casos ele geralmente informa que esses "passes de mágica" serão utilizados nas provas.

Recursão será muito utilizado. Mesmo algoritmos não recursivos ele tende a escrevê-las de forma recursiva. Então, teremos que analisar bem cuidadosamente a complexidade de algoritmos recursivos.

Veremos dois métodos para a análise de algoritmos recursivos.

Muitos dos resultados ele tentará provar matematicamente que algumas análises estão corretas.

Faremos algumas demonstrações na disciplina, especialmente nos módulos 3 e 4, principalmente no 4.

Um dos principais é prova por indução. Ele tentará já utilizar algumas provas por indução, especialmente as provas que envolvem grafos na segunda parte da disciplina.

Na primeira parte é mais conta.

Ele vai tentar não exigir provas matemáticas nas avaliações, mas geralmente tem na lista. Mesmo que não precise demonstrar, geralmente é útil que se saiba como que acontece para ficar mais fácil de entender certas coisas.

Geralmente os alunos tem mais dificuldade nos algoritmos recursivos.

A disciplina será muito corrida é o tempo da disciplina é muito curto. Raramente ele demorará mais do que uma aula por assunto.

Raramente eles voltarão nos assuntos das aulas anteriores.

Se perder alguma aula (Por favor não faça isso). É a pior coisa que você pode fazer nessa disciplina.

Os módulos geralmente são bem desconexos. Mas num mesmo módulo, se perder algo, dificilmente vai conseguir recuperar essa informação. Se perdeu algo, vai ter que refazer todas as aulas perdidas antes das aulas posteriores. No primeiro módulo ainda dá pra faltar algumas, mas nas próximas... 💀

Quem não tem acesso ao Moodle, tenha o mais rápido possível.

Sexta já deve ter todos os materiais lá.

Existe a chance de que mude de sala. E se avisar, será pelo moodle.

### Dúvidas dos alunos

- Tem monitor?
  - Ele tem X% de certeza que sim, mas ainda não temos. Até o começo de outubro devem saber quem é. Geralmente serão na sexta que é quando estamos mais livres. Ele recomenda fortemente que venhamos nas monitorias. Ele gosta de postar uma lista por semana. À priori elas não valem ponto.
- Enquanto não tem monitor, com quem tirar dúvidas?
  - O Márcio geralmente tem as manhãs livres, depois das 8h30 na sala dele 4322 no anexo do DCC. Normalmente é só chegar lá e bater. Sexta ele geralmente tá aqui o dia todo. Se for algo que demore mais, pode mandar e-mail.
- Vai ter alguma aula de pré-PAA ou vai direto na matéria?
  - Ele vai direto na matéria, até porque a matéria é muito extensa.
- Tem vídeo-aulas gravadas?
  - Acha que sim, provavelmente o Gabriel Coutinho tem.
- As datas das provas do cronograma estão definidas a serem nesses dias mesmo?
  - Sim. Dificilmente mudarão a não ser que aconteça algo mt atípico (pandemia/greve). Se acontecer algo com as aulas, ainda dá pra repor em outros horários, mas prova é pouco provável que se altere.
- A substitutiva [funciona como]?
  - Se você perder uma avaliação, ele sempre abre uma substitutiva para cobrir uma que vc perdeu. Ele costuma deixar que vc faça a substitutiva mesmo que tenha feito as provas. E a nota da substitutiva sobrescreve a que você já fez, independente de ser maior ou menor.
  - A substitutiva ocorre no sábado. Sempre sábado de manhã, normalmente às 9h. As provas geralmente são nos horários de aula. A Olga geralmente prefere fazer as provas no sábado também.
- O conteúdo da substitutiva é qual?
  - O conteúdo vai ser de acordo com a prova que você quer substituir.
- Alguma pergunta que não vi
  - Ele vai dizer quais vão ser os capítulos que ele dará em cada aula. O livro é da terceira versão.
- Qual a diferença entre "PG2" e "PG1_PG2 - Metaturma"?
  - Nenhuma. São duas turmas diferente acontecendo no mesmo horário, com o mesmo professor, na mesma sala. A Meta-turma é para reencaminhar os conteúdos para as turmas menores.
- E onde enviaremos as atividades?
  - Na Metaturma.
- Qual o capítulo da aula de segunda?
  - Se não se engana, os capítulos 2 e 3. E veja também os conteúdos de pré-PAA.

## Aula 2 - 30/09/2024 - [13h08, 14h40]

### Slide: Complexidade de Algoritmos

- Algoritmos no geral serão considerados como funções $f(n)$ que transformam conjunto de entrada em conjunto de saída.
- Para descrever os algoritmos, serão utilizados pseudocódigos de forma imperativa com estruturas usuais de controle de fluxo.
- atribuição como setas e iguais como comparação
- Estruturas de dados simples.
- Considera-se memória infinita sem se preocupar com a atribuição.

Dúvida 1: Exemplo algoritmo 1: o i=1 seria uma comparação ou atribuição?

- Dúvida 2: Exemplo algoritmo 2: Por que a saída tá como "?"?
  - Resposta: Para pensarmos sobre o que o algoritmo tá fazendo, sem dar a resposta de cara.

- Todos os algoritmos ignoram completamente quaisquer dos cornercases que poderiam dar errado: overflow, alocação de memória, typechecking, etc.
- O problema do módulo 1 é analisar quão bons ou ruins são os algoritmos. Suponho eu que seja a notação de Big-O.
- A complexidade de um algoritmo é uma função que descreve o número de operações elementares que o algoritmo executa em função do tamanho da entrada.
- "Custos"
  - Se = Escolha, subconjunto. [Considero que seja algo do tipo um "ou", ou uma multiplicação entre as possibilidades.]
  - Para e enquanto: Somatório
  - Atribuição: tempo unitário
  - Matemática e regras: tempo unitário  (a depender da complexidade das regras)
  - Estruturas de dados: Tempo de cada operação.
- O laço tem custo de "2" porque incrementa e compara se chegou na condição.
- No caso do Algoritmo 1, a Função seria: $F_1(x, n) = 1 + \sum_{i=1}^{n} (2 + 3) = 1 + \sum_{i=1}^{n} (5) = 1 + 5n$.
- No caso do Algoritmo 2, a Função seria: $F_2(x, n) = 2 + \sum_{i=2}^{n} (1 [checagem do loop] +2 [comparação condicional + indexação] +1 [somatório do iterador]) + \sum_{i=2; se x[i] for par}^{n} (1) [CASOS EM QUE OCORRE A OPERAÇÃO *SE*] = 2 + (n-1)*4 [N-1 porque começou i pelo valor 2] + \sum_{i=2; se x[i] for par}^{n} (1)$.
  - Poderia também utilizar algo como $\sum_{i=2; se x[i] for par}^{n} (1) = (x[i]\%2)*1$
- Exemplo Algoritmo 3:
  - 1: n*m: preencher a matriz Z NxM
  - 2: comparação e incremento do loop i
  - 2: comparação e incremento do loop j
  - 8: 2: indexação $z[i][j]$, 2: indexação $x[i][j]$, 2: indexação $y[i][j]$, 1: soma x e y, 1: atribuição em $z[i][j]$
  - $F_3(x, y, n, m) = n*m + \sum_{i=1}^{n} (2 + \sum_{j=1}^{m} (2+8)) = n*m + \sum_{i=1}^{n} (2 + 10m) = n*m + 2n + 10nm = 11nm + 2n$

- Instância: conjunto de dados de entrada de um algoritmo: $I$
- Tamanho de uma instância: tamanho em bits da entrada: $I_n$
- Complexidade de um algoritmo: é a função que leva o tamanho da instância em...

- Complexidade de pior caso: o maior número de passos para uma instância de tamanho $n$.
  - $T(n) = \max_{x \in I_n} F(n, x)$
- Complexidade de melhor caso: o menor número de passos para uma instância de tamanho $n$.
  - $T(n) = \min_{x \in I_n} F(n, x)$

Dúvida: Existe um cálculo estatístico de quão prováveis de ocorrer são os melhores e maiores casos?
Resposta: Pelo que eu entendi, até dá, só que é bem difícil calcular

- Complexidade de médio caso: o número esperado de passos para uma instância de tamanho $n$.
  - $T(n) = \sum_{x \in I_n} P(x)F(n, x)$
  - $P(x)$ é a probabilidade de ocorrer a instância $x$.
    - "Mas como calcular a probabilidade de uma instância?" "Não é tão fácil assim"
- Ele sempre considerará "complexidade" como sendo "complexidade de pior caso".

- Algoritmo 1:
  - Melhor: [...] 1+5n
  - Pior:  [...] 1+5n
  - Médio:  [...] 1+5n
    - Entendi +- como que o F(x, n) foi pra fora do somatório.
- Algoritmo 2:
  - Melhor: todos elementos são ímpares [...] 5n - 4
  - Pior: todos elementos são pares [...] 7n-6
  - Médio:  [...] Mó trampo. Favor ignorar 😄👍

- Análise Assintótica
  - O objetivo é analisar o comportamento de uma função quando $n$ tende ao infinito.

- Dúvida: Por que eu compararia n=infinito do pior com o n=infinito do melhor?
- Resposta: Porque no caso, o que a gente tá comparando é a melhor e pior distribuição dos valores para uma mesma quantidade de elementos. Então, a gente tá comparando o melhor caso de uma quantidade de elementos com o pior caso de uma quantidade de elementos.

- Simbolos:
  - $O$
  - $o$
  - $\Theta$
  - $\Omega$

- f = G(g). Essa parte ficou Muito confusa.
- f = O(g) Existem $n_0$ e $c$ tal que: $f(n) \leq c*g(n)$ para todo $n \geq n_0$
  - Entende-se o $c$ como sendo uma forma de chutar o valor de $g$ para cima. E o $n_0$ indica o momento em que $f$ começa a ser menor que $g$.

- Geralmente e procura o menor limite superior assintótico, mas usar outros maiores também é válido. (Menos na prova)
  - $N^k + N^{k-1} \dots + N + 1 = O(N^k)$

Alguns exercícios serão mostrar valores $C$ e $N_o$ que satisfaçam a equação e provem o limite superior.

Geralmente o que ele vai pedir é encontrar o O() de uma função.

## Aula 3 - 02/10/2024 - [13h06, 14h40]

- Aulas extras
  - 13h às 15h
  - Não tem presença
  - Não precisa dos conteúdos, mas os conteúdos podem ser úteis.
  - Irão confirmar quais serão os tópicos de cada aula
  - Pontuação extra por presença nas aulas. Muito provavelmente 0,5 ponto por aula.
  - Quase como se fosse aula de pré-PAA

### Aula 3: Slide - Aula 2 - Complexidade e Notação Assintótica

- Limite superior
  - $f() = O(g())$ pode ser rústicamente definido como $f() \leq g()$
- Limite superior estrito
  - $f() = o(g())$ pode ser rústicamente definido como $f() < g()$
  - $f = o(g)$ Para todo $c > 0$ existe $n_0$ tal que: $f(n) < c*g(n)$ para todo $n > n_0$
  - É importante analisar matematicamente de que forma que o descubramos quais os possíveis valores de $C$ e seu respectivo $n_0$.
  - Podemos entender que $n \neq o(n)$ e que $n = O(n)$
- Limite Inferior
  - $f() = \Omega(g())$ pode ser rústicamente definido como $f() \geq g()$
  - Existem $n_0$ e $c$ tal que: $f(n) \geq c*g(n)$ para todo $n \geq n_0$
- Limite Inferior Estrito
  - $f() = \omega(g())$ pode ser rústicamente definido como $f() > g()$
  - Para todo $c > 0$ existe $n_0$ tal que: $f(n) > c*g(n)$ para todo $n > n_0$
- Equivalência
  - $f() = \Theta(g())$ pode ser rústicamente definido como $f() = g()$
  - Existem $n_0$, $c_1$ e $c_2$ tal que: $c_1*g(n) \leq f(n) \leq c_2*g(n)$ para todo $n \geq n_0$
  - Que equivale a dizer que $f() = \Omega(g())$ e $f() = O(g())$
  - Exemplos: $2n^2 + n = \Theta(n^2)$
  - Geralmente busca-se o $\Theta$ de uma função, mas foca-se mais no $O$.

- Propriedades
  - $k*f(n) = O(f(n))$ para todo $k \in \R$
  - $f(n) * g(n) = O(f(n) * g(n))$
  - $O(f(n)) + O(g(n)) = O(f(n) + g(n))$
  - $O(f(n)) * O(g(n)) = O(f(n) * g(n))$
  - Extra: $O(n)*n = O(n*n) = O(n^2)$

- Entende-se que $O(f(n)) = [conjunto] {g \in F | g = O(f(n))}$
  - Sendo $F$ todas as funções possíveis

- É importante considerar que os somatórios entre funções é o somatório normal. E o somatório entre $O()$'s é um tipo de agrupamento entre conjuntos de funções.
- Na prova sempre considerar que estamos buscando o limite mais estrito possível.
- Quando não se tem condicional, podemos considerar que o $O()$ é o mesmo que o $\Omega()$, que são iguais ao $\Theta()$.

### Aula 3: Slide - Aula 3 - Algoritmos Recursivos e Relações de Recorrência

[JV: O que é função de recorrência?
R Copilot: É uma função que é definida em termos de si mesma. Exemplo: $f(n) = f(n-1) + 1$]

- Sempre consideraremos que $F(1)$ e $F(0)$ são constantes e iguais a $O(1)$, sendo $F$ uma função recursiva.

- Algoritmo Recursivo 1

```pseudocode
Algoritmo 1: REC
Entrada: inteiro x.
Saída: ?
se x <= E REC(x-1) >= 1 então
  RETORNA REC(x-1) + 1
RETORNA 1;  
```

"A parte de encontrar a função de recorrência para o algoritmo é tranquila. O problema é a análise da parte recursiva"

- Resolução de Recorrências
  - Podemos resolver equações na forma:
    - 1. $T(n) = aT(n/b) + f(n)$
      - Num caso de divisão e conquista, a parte da divisão seria o $b$, e a agregação das respostas seria o $a$.
    - 2. $T(n) = aT(n-b) + f(n)$
      - Esse geralmente se refere a casos em que vá removendo alguns itens de uma estrutura de dados a cada passo.
  - Não podemos resolver equações na forma:
    - 3. $T(n) = T(n-a) + T(n-b)$
      - [Tipo Fibonacci]
      - Tendem  a ser ineficientes

$F(n) = F(n-1) + 1$; Condição de parada: $F(1) = 1; F(0) = 1$

$$
F(n) =\\
F(n-1) + 1 =\\
(F(n-2) + 1) + 1 = F(n-2) + 2 =\\
(F(n-3) + 1) + 1 + 1 = F(n-3) + 3 =\\
\vdots\\
F(n) = F(n-k) + k\\
\text{Para n = k}\\
F(k) = F(0) + n = O(1) + n = O(n)
$$

---

$F(n) = F(n-1) + n$

$$
F(n) = F(n-1) + n =\\
(F(n-2) + n-1) + n = F(n-2) + 2n - 1 =\\
(F(n-3) + n-2) + n-1 = F(n-3) + 3n - 2 - 1 =\\
\vdots
F(n-k) + kn - \sum_{i=1}^{k} i=\\
F(0) + n^2 - \sum_{i=1}^{n-1} i \implies \frac{(n-1)*n}{2} \implies O(n^2)
F(0) + n^2 - O(n^2) = O(n^2)
$$

"Teorema mestre"

Revisar PA e PG.

---

Dúvida: Quando na soma assintótica há uma subtração, a gente ignora ela? Sim. Considera-se como se fosse soma normal. Mas a mesma ignorância não ocorre na divisão e multiplicação

### Aula 4: Slide - Aula 3 - Algoritmos Recursivos e Relações de Recorrência

- $T(n) = T(n - b) + f(n)$
- $T(n) = a * T(\frac{n}{b}) + f(n)$

- Exemplo:
  - $T(n) = 2T(n-4)+5$
    - $T(0) = O(1)$
    - $T(1) = O(1)$
    - $T(2) = O(1)$
    - $T(3) = O(1)$
  - Ele não precisa especificar, nem pretende, mas a ideia é que todas tenham esses critérios de parada.
  - Resolvendo pelo método da substituição:

$$
T(n)   = 2( T(n-4)    ) + 5 \\
T(n-4) = 2(2T(n-8) + 5) + 5 = 2^2 T(n-8) + 5*2 + 5 \\
T(n-8) = 2^2 (2T(n-12) + 5) + 5*2 + 4 =  \\
\vdots \\
\text{PASSO K:} 2^k T(n- k*4) + \sum_{i=0}^{k - 1} 2^i*5
$$

- Caso de término: n - k*4 = 0; 4k = n; k = n/4
- Complexidade: $2^(n/4) * \Theta(1) + 5 * \sum_{i=0}^{n/4 - 1} 2^i = \Theta(2^{n/4}) + 2^{n/4} - 1 = \Theta(2^{n/4})$

Não mexer com constantes em expoentes

- Teorema Mestre
  - Sejam $a \geq 1$ e $b > 1$ constantes, $f(n)$ uma função, e $T(n) = aT(\frac{n}{b}) + f(n)$, então, para algum $\epsilon > 0$:
    - Se $f(n) = O(n^{\log_{b}(a) - \epsilon}) \implies T(n) = \Theta(n^{\log_{b}(a)})$ leq
    - Se $f(n) = \Theta(n^{\log_{b}(a)}) \implies T(n) = \Theta(n^{\log_{b}(a)} * log(n))$ =
    - Se $f(n) = \Omega(n^{\log_{b}(a) + \epsilon})$ e $a f (\frac{n}{b}) \leq cf(n)$ então $\implies T(n) = \Theta(f(n))$ geq

Esse $\epsilon$ quando usa a propriedade de potência, torna o caso do Big-O numa divisão e o caso do Big-Omega numa multiplicação.

- Revisar propriedade de logaritmo

Ele fez dois exemplos no quado que eu n anotei.

- $T(n) = 2T(\frac{n}{2}) + 1$
  - $a = 2; b = 2; f(n) = 1$
  - $\log_{b}(a) = \log_{2}(2) = 1$
  - $n^{\log_{b}a = n^1 = n}$
  - $f(n) = O(n^{\log_{b}(a)})$
  - $1 = O(n^{1-\epsilon}) = \Theta(n)$
- $T(n) = 4T(\frac{n}{4}) + n + 1$
  - $a = 4; b = 4; f(n) = n + 1$
  - $\log_{b}(a) = \log_{4}(4) = 1$
  - $n^{\log_{b}a} = n^1 = n$
  - $f(n) = \Theta(n^{\log_{b} a})$
  - $n+1 = \Theta(n)$
  - $\Theta (n * log n)$

Exercício: Descobrir pq que $\log_{b}(n) = O(\log_{2}(n))$ para $b > 1$

- $T(n) = 4T (\frac{n}{2}) + n^3 + n - 5$
  - $a = 4; b = 2; f(n) = n^3 + n - 5$
  - $\log_{b}(a) = \log_{2}(4) = 2$
  - $n^3 + n - 5 = \Omega(n^{2+\epsilon})$
  - $\Theta(f(n)) = \Theta(n^3 + n - 5) = \Theta(n^3)$
- $T(n) = 4T (\frac{n}{2}) + n^2\log_{{2}}(n)$: Não dá pra usar o teorema mestre nessa função.
  - Tentando usar o teorema mestre
  - $a = 4; b = 2; f(n) = n^2\log_{2}(n)$
  - $\log_{b}(a) = \log_{2}(4) = 2$
  - $n^{\log_{b}(a)} = n^2$
  - $n^2$ e $n^2 * log(n)$ são equivalentes?
  - ... [Tentativa de resolução pelo Teorema Mestre]

Na prova ele espera que se diga "não dá para usar Teorema Mestre". Ele não espere que se resolva a equação. Até pode sair abrindo se preferir.

O problema surge quando comparamos o $f(n)$ com a equação com $a$ e $b$ e que a única diferença seja o log.

"Tem que ser um polinônimo menor ou maior para ter diferença entre elas."

Algumas questões não vão dar pra fazer. Às vezes tem como, mas é meio tortuoso.

- Exemplo: $T(n) = T(\frac{n}{3}) + T(\frac{n}{4}) + 1$
  - Divide em duas equações falsas do tipo:
    - $F(n) = F(\frac{n}{3}) + F(\frac{n}{3}) + 1 = 2F(\frac{n}{3}) + 1$
    - $G(n) = G(\frac{n}{4}) + G(\frac{n}{4}) + 1 = 2G(\frac{n}{4}) + 1$

- Vai ter gabarito das listas?
  - +-, ele vai tirar dúvidas no final. Teremos monitoria e a monitora deve responder boa parte das respostas da lista.

"Essa é a parte mais fácil da matéria"

"Estude isso *freneticamente*"

## Aula 4 - 09/10/2024 - [13h08, 14h47]

### Pré-aula 4

- Monitoria possivelmente remota e/ou presencial
- BeeCrowd para trabalhos
- Ele adiantará a aula de exercícios e provavelmente serão 3 horas no sábado.
- Alguns tópicos extras nas aulas de sexta

### Slide: Análise Amortizada

#### Contador Binário

- Assume que temos um vetor de $n$ bits.
- Este vetor representa um número.
- Vamos criar uma função para incrementar uma unidade no número representado.

$$
{1, 3, 4} =
\begin{bmatrix}
  5 && 4 && 3 && 2 && 1 && 0\\
  0 && 1 && 1 && 0 && 1 && 0\\
\end{bmatrix} =
26
$$

$$
{2} =
\begin{bmatrix}
  4 && 3 && 2 && 1 && 0\\
  1 && 1 && 0 && 1 && 0\\
\end{bmatrix} =
4
$$

---

- 0: 0000
- 1: 0001
- 2: 0010
- 3: 0011
- 4: 0100
- 5: 0101
- 6: 0110
- 7: 0111
- 8: 1000

O que o algoritmo faz?

- Enquanto tem um, troca pra zero, quando achar o primeiro zero troca pra um, o resto não faz nada.

#### Algoritmo

...

#### Contador Binário - Complexidade

- Complexidade de Pior caso: O(n).
- Mas esse pior caso acontece muito raramente...
- As operações têm uma relação clara entre elas.
- Seria interessante ter uma ligação entre a complexidade e as operações

#### Contador Binário - Análise Amortizada

- Considere o número de operações para se realizar uma sequência de n operações: $T(n)$.
- Desejamos calcular
  - $\frac{T(n)}{n}$
- Complexidade Amortizada.

Dúvida: quão distante a complexidade amortizada está do caso médio?
Resposta: Razoavelmente distante. Porque nesse caso o output de um é o input do outro. Já no caso médio, sorteia-se números aleatórios como input.

- Três métodos:
  - (esqueci)
  - Método dos potenciais
  - Análise Financeira/Método contável

---

- Vamos realziar $n$ operações de incremento.
- Calcular o número de cada chamada é complicado.
- Vamos pensar em quantas vezes cada bit é trocado de 0 para 1 ou vice versa.
- Seja $F(i)$ o número de vezes que o bit na posição $i$ é flipado.

#### Contador Binário - $F(0)$

- $F(0) = n$
- ...

#### Contador Binário - $F(1)$

- $F(1) = \frac{n}{2}$
- ...

- $F(2) = \frac{n}{4}$
- $F(3) = \frac{n}{8}$
- ...
- $F(k) = \frac{n}{2^k}$
- ...
- $F(n - 1) = 2$ "Ele volta pra zero" [JV: Não entendi muito bem] "Esse $n$ é relacionado ao tamanho do vetor", aqueles $n$'s acima são da quantidade de operações.

$T(n) = \sum_{i=0}^{n-1} F(i) = \sum_{i=0}^{n-1} \frac{n}{2^i} = n \sum_{i=0}^{n-1} \frac{1}{2^i} \leq 3n$ "Não precisa responder isso exatamente"

$\frac{T(n)}{n} \leq \frac{3n}{n} \leq 3 = \Theta(1)$

[JV: Ele se embolou um pouco na notação dos índices e quantidades de operações]

Na teoria, deveria ser $\lim_{n \cond \inf} \frac{T(n)}{n}$, mas ele vai ignorar o limite.

#### Método do Potencial

- VAmos atribuir uma energia potencial para a estrutura de dados.
- Temos uma função que calcula esse potencial $\phi()$.
- Seja $D_0$ uma estrutura de dados, temos $\phi(D_0)$.
- Vamos realizar $n$ operações com essa estrutura.
- Seja $D_i$ é a estrutura após a i-ésima operação.

---

... [Não anotei]

---

... [Não anotei]

Consideramos que a energia potencial é a quantidade de bits que estão em 1.

---

- $b_0 = 0$ e $b_n = k$
- $b_i = b_{i-1} - t_i + 1$ isso significa que $b_i - b_{i-1} = -t_i + 1$
- $c^{\^}_i = c_i + \Phi(D_i) - \Phi(D_{i-1}) = t_i + 1 + (-t_i + 1) = 2$

Dúvida Manu: de que forma é definido o que é uma operação?

#### Método Contável

- Vamos analisar o nosso contador Binário.
- Vamos modificar os custos do nosso programa.
- Vamos assumir que flipar um bit para 1 custa 2.
- Por que?
- Porque vamos mudar umbit para 0 de graça!

A lógica disso é que em cada execução da função, apenas há uma mudança de 0 para 1, então, cada uma das operações custa exatamente 2.

Esse último método nem sempre é o mais direto, mas deve-ser ter cuidado na hora de se equilibrar as operações.

"Pode sempre ter lucro, o problema é ficar no vermelho"

---

Fim da matéria da P1

## Estudar

- Material de Pré-PAA
- Heap
- Transformação de logaritmo
- Propriedades de logaritmo
- Soma de PA e PG

## Dúvidas

$O(n!)$ isn't equivalent to $O(n^n)$. It is asymptotically less than $O(n^n)$.

$O(\log(n!))$ is equal to $O(n \log(n))$. Here is one way to prove that:

Note that by using the log rule $\log(mn) = \log(m) + \log(n)$ we can see that:

$\log(n!) = \log(n*(n-1)*...2*1) = \log(n) + \log(n-1) + ... \log(2) + \log(1)$

Proof that $O(\log(n!)) \subseteq O(n \log(n))$:

$\log(n!) = \log(n) + \log(n-1) + ... \log(2) + \log(1)$

Which is less than:

$\log(n) + \log(n) + \log(n) + \log(n) + ... + \log(n) = n*\log(n)$

So $O(\log(n!))$ is a subset of $O(n \log(n))$

Proof that $O(n \log(n)) \subseteq O(\log(n!))$:

$\log(n!) = \log(n) + \log(n-1) + \dots \log(2) + \log(1)$

Which is greater than the left half of that expression with all $(n-x)$ replaced by $n/2$:

$\log(n/2) + \log(n/2) + ... + \log(n/2) = floor(n/2)*\log(floor(n/2)) \in O(n \log(n))$

So $O(n \log(n))$ is a subset of O(\log(n!))$.

Since $O(n \log(n)) \subseteq O(\log(n!)) \subseteq O(n \log(n))$, they are equivalent big-Oh classes.

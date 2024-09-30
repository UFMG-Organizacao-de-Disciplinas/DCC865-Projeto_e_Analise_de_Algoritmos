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

## Estudar

- Material de Pré-PAA
- Heap
- Transformação de logaritmo

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

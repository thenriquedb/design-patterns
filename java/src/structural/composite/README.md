# Composite

### Intenção
Compor objetos em estruturas de árvore para representarem hierarquias partes-todo.
Composite permite aos clientes tratarem de maneira uniforme objetos individuaiscomposições de objetos.

### Aplicabilidade
Use o padrão Composite quando:
- quiser representar hierarquias partes-todo de objetos;
- quiser que os clientes sejam capazes de ignorar a diferença entre composições
de objetos e objetos individuais. Os clientes tratarão todos os objetos na estrutura
composta de maneira uniforme.

###Colaborações
- Os clientes usam a interface da classe Component para interagir com os
objetos na estrutura composta. Se o receptor é uma Leaf (Folha), entãosolicitação é tratada diretamente. Se o receptor é um Composite, ele normalmen-
te repassa as solicitações para os seus componentes-filhos, executando opera-
ções adicionais antes e/ou depois do repasse.

### Conseqüências
O padrão Composite:

- define hierarquias de classe que consistem de objetos primitivos e objetos
compostos. Os objetos primitivos podem compor objetos mais complexos, os
quais, por sua vez, também podem compor outros objetos, e assim por diante,
recursivamente. Sempre que o código do cliente esperar um objeto primitivo,
ele também poderá aceitar um objeto composto.

- torna o cliente simples. Os clientes podem tratar estruturas compostas e objetos
individuais de maneira uniforme. Os clientes normalmente não sabem (e nã
deveriam se preocupar com isto) se estão tratando com uma folha ou um
componente composto. Isto simplifica o código a ser escrito nas classes- cliente,
porque evita o uso de comandos do tipo CASE com os rótulos classes que
definem a composição.

- torna mais fácil de acrescentar novas espécies de componentes. Novas
subclasses definidas, Composite ou Leaf, funcionam automaticamente com as
estruturas existentes e o código do cliente. Os clientes não precisam ser
alterados para tratar novas classes Component.

- pode tornar o projeto excessivamente genérico. A desvantagem de facilitaracrescimo de novos componentes é que isso torna mais difícil restringir os
componentes de uma composição. Algumas vezes, você deseja uma compo-
sição que tenha somente certos componentes. Com Composite, você não pode
confiar no sistema de tipos para garantir a obediência a essas restrições. Ao
invés disso, terá que usar verificações e testes em tempo de execução.

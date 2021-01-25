###Intenção
Dinamicamente, agregar responsabilidades adicionais a um objeto. Os Decorators
fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionali-
dades.

### Também Conhecido Como
Wrapper

### Motivação
Algumas vezes queremos acrescentar responsabidades a objetos individuais, e não a
toda uma classe. Por exemplo, um toolkit para construção de interfaces gráficas de
usuário deveria permitir a adição de propriedades, como bordas, ou comportamen-
tos, como rolamento, para qualquer componente da interface do usuário.
Uma forma de adicionar responsabilidades é a herança. Herdar uma borda de
uma outra classe coloca uma borda em volta de todas as instâncias de uma subclasse.
Contudo, essa abordagem é inflexível, porque a escolha da borda é feita estaticamen-
te. Um cliente não pode controlar como e quando decorar o componente com uma
borda.

Uma abordagem mais flexível é embutir o componente em outro objeto que
acrescente a borda. O objeto que envolve o primeiro é chamado de decorator. O
decorator segue a interface do componente que decora, de modo que sua presença é
transparente para os clientes do componente.
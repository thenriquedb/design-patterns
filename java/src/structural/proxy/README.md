# Proxy

### Intenção
Fornece um substituto (surrogate) ou marcador da localização de outro objeto para
controlar o acesso a esse objeto.

### Também conhecido como
Surrogate

### Motivação
Uma razão para controlar o acesso a um objeto é adiar o custo integral de sua criação
e inicialização até o momento em que realmente necessitamos usá-lo. 
Essas restrições sugerem a criação de tais objetos caros sob demanda, o que, neste

### Aplicabilidade
O padrão Proxy é aplicável sempre que há necessidade de uma referência mais versátil,
ou sofisticada, do que um simples apontador para um objeto. Aqui apresentamos
diversas situações comuns nas quais o padrão Proxy é aplicável:
1. Um **remote proxy** fornece um representante local para um objeto num espaço
   de endereçamento diferente. 
   
2. Um **virtual proxy** cria objetos caros sob demanda. 
   
3. Um **protection proxy** controla o acesso ao objeto original. Os proxies de
   proteção são úteis quando os objetos devem ter diferentes direitos de acesso.
   Por exemplo, KernelProxies, no sistema operacional Choices, fornece um acesso protegido aos objetos do sistema operacional.
   
4. Um **smart reference** é um substituto para um simples pointer que executa
   ações adicionais quando um objeto é acessado. Usos típicos incluem:
   Estrutura
   * contar o número de referências para o objeto real, de modo que o mesmo possa ser liberado automaticamente quando não houver mais referências (também chamadas de smart pointers;
   *  carregar um objeto persistente para a memória quando ele for referenciado pela primeira vez;
   *  verificar se o objeto real está bloqueado antes de ser acessado, para assegurar que nenhum outro objeto possa mudá-lo.

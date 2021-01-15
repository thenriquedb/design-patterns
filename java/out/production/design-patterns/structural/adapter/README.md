# Adapter

### Intenção
Converter a interface de uma classe em outra interface, esperada pelos clientes. O
Adapter permite que classes com interfaces incompatíveis trabalhem em conjunto –
o que, de outra forma, seria impossível.

### Também conhecido como
Wrapper

### Motivação
Algumas vezes, uma classe de um toolkit, projetada para ser reutilizada não é
reutilizável porque sua interface não corresponde à interface específica de um
domínio requerida por uma aplicação.

### Aplicabilidade
- Se não quiser que seu código dependa diretamente de código de terceiros ou legado;
- Você quiser usar uma classe existente porém sua interface é incompatível com a interface que seu código ou domínio precisam.

### Vantagens
- Desacopla o código da aplicação de códigos de terceiros

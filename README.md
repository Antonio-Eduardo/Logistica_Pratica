Esse aqui é o meu terceiro projeto focado em Java e POO.
Saí de um projeto de 5 horas pra esse aqui que matei em menos de 2 horas. O foco foi organizar a bagunça e entender como os objetos conversam entre si,nesse projeto 
eu foquei em Composição e Enumeração. Nada de herança ainda.
Enumeração (enum): Usei pra não deixar texto solto no código. Tem Prioridade (tipo SEDEX) e TipoEvento (POSTAGEM, ENTREGUE, etc).
Composição: A Encomenda tem uma lista de Rastreio, e cada Rastreio tem um Local.
Manipulação de Datas: Usei SimpleDateFormat pra transformar as Strings que eu recebi em objetos Date de verdade e depois formatar tudo organizado no relatório.
StringBuilder: Aprendi que usar System.out.println dentro de toString é pedir pra passar raiva,
agora eu monto o relatório inteiro no StringBuilder e dou um único print no final.

Sinceramente o que eu tirei desse projeto foi principalmente que O Java é obediente demais, se eu der add na lista fora de ordem,
o relatório sai bagunçado. Se eu imprimir no lugar errado, o texto sai voando no console. Especificamente nesse meu problema maior foi justamente a saida, os dados estavam saindo
completamente bagunçados, mas considerei uma vitoria pois o projeto anterior me tirou 5 horas e o problema foi entender como as classes conversam entre si, ja nesse foi so
a questão da impressão. 
Estou iniciando o modulo de polimorfismo e herança, pretendo continuar atualizando esse projeto para pratica.

Atualização: implementação de herança, polimorfismo, classe e metodos abstratos.gi
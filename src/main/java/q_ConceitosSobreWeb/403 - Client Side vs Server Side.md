# 403. Client Side vs Server Side

Nesta aula, abordaremos a diferença entre uma aplicação cliente e uma aplicação servidor, destacando a importância dessa escolha arquitetural no desenvolvimento de aplicações.

## Evolução das Arquiteturas

No contexto das arquiteturas, a primeira que podemos considerar é a aplicação distribuída em mainframes. Essa abordagem centralizava todas as operações, desde a execução lógica até a geração da tela, com terminais burros realizando entrada de dados.

A transição seguinte foi para a era cliente-servidor, marcada pelo desenvolvimento em Delphi e Java. Aqui, as aplicações eram classificadas em duas ou três camadas, envolvendo um cliente rico desktop, servidor e, às vezes, acesso direto ao banco de dados.

Com o tempo, a web ganhou destaque, introduzindo as aplicações server-side. Nesse modelo, toda a lógica e renderização das páginas ocorre no servidor, enquanto o cliente funciona mais como um terminal, recebendo o conteúdo gerado.

## Desafios do Modelo Cliente-Servidor

O modelo cliente-servidor, apesar de trazer vantagens, enfrentava desafios na atualização das aplicações. A necessidade de replicar versões atualizadas nas máquinas dos clientes gerava complexidade e demandava esforços significativos, especialmente em parques de usuários extensos.

## Era da Web e Aplicações Front-End

A transição seguinte nos levou à era das aplicações front-end ou cliente-side. Aqui, a aplicação do lado do cliente assume maior responsabilidade, comportando-se de maneira semelhante às aplicações desktop. A lógica, as regras visuais e até mesmo animações são geradas usando JavaScript, exigindo domínio de frameworks modernos como Angular, React e Vue.js.

## Comparação Entre Server-Side e Client-Side

A aplicação server-side gera conteúdo HTML no servidor, enquanto na aplicação client-side, a página HTML é construída dinamicamente no navegador do cliente usando JavaScript. Embora a aplicação server-side simplifique a distribuição, ela pode resultar em latência e lentidão na experiência do usuário. Por outro lado, a abordagem client-side oferece maior dinamismo, mas requer habilidades avançadas em JavaScript.

## Conclusão e Evolução Cíclica

Em resumo, a evolução das arquiteturas é cíclica, passando por modelos centralizados, aplicações ricas desktop, retorno ao modelo centralizado web, e finalmente, as aplicações ricas no lado do cliente na web. Cada abordagem tem suas vantagens e desafios, destacando a importância de escolher a arquitetura adequada para o contexto da aplicação.

Espero que tenha ficado claro esse conceito e aguardo você na próxima aula.

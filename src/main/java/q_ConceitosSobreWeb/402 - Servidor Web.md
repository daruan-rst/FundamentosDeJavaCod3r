# 402 - Servidor Web

O conceito de servidor web é crucial no desenvolvimento web. Diversas opções estão disponíveis, como Apache no mundo Java, o Microsoft IIS, e até mesmo servidores embutidos em linguagens como Python (Flask) e Java (Spring Boot).

## Estratégias de Servidores

Existem diferentes estratégias para lidar com requisições. O Apache, por exemplo, utiliza threads, enquanto o Nginx trata requisições de forma assíncrona. Cada abordagem tem suas vantagens e desvantagens, sendo adequada para diferentes cenários.

## DNS e Publicação

Ao publicar um site, é necessário configurar o servidor DNS para direcionar o tráfego corretamente. Isso envolve a associação de um domínio a um endereço IP. Alterações no DNS podem levar algumas horas para se propagar globalmente, exigindo cuidado.

## Estrutura e Escalabilidade

A estrutura de servidores web varia de simples hospedagens compartilhadas a grandes clusters. Para lidar com grandes demandas, serviços como CDN (Content Delivery Network) replicam dados em servidores globalmente, reduzindo latência.

## Arquivos Estáticos e Dinâmicos

Em ambientes de produção, separar arquivos estáticos (imagens, CSS, JavaScript) pode melhorar a performance. Redes CDN são comumente utilizadas para entregar esses conteúdos, reduzindo a carga no servidor principal.

## Servidor Web no Contexto

Servidores web frequentemente fazem parte de um ecossistema que inclui sistema operacional, banco de dados e linguagem de programação. O conjunto LAMP (Linux, Apache, MySQL, PHP) é um exemplo comum.

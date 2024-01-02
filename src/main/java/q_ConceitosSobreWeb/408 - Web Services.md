# 408 - Web Services

## Definição de Web Service
Um Web Service é um serviço web que a aplicação disponibiliza, geralmente sobre o protocolo HTTP. A comunicação entre sistemas ocorre de forma textual, facilitando a interoperabilidade entre diferentes tecnologias. Os formatos mais comuns são XML e JSON.

## Protocolos: SOAP e REST
Existem dois principais protocolos para implementar Web Services: SOAP (Simple Object Access Protocol) e REST (Representational State Transfer). O SOAP é mais antigo e burocrático, baseado em XML, enquanto o REST utiliza o HTTP puro, sendo mais leve e simples.

### SOAP (Simple Object Access Protocol)
- Usa XML para descrever o Web Service (WSDL).
- Requisições e respostas são em formato XML.
- Conhecido como RPC (Remote Procedure Call).

### REST (Representational State Transfer)
- Utiliza o HTTP para comunicação.
- Requisições e respostas em formato JSON ou XML.
- Métodos HTTP (GET, POST, PUT, DELETE) são utilizados para operações.

## Arquiteturas: SOA vs. Micro Serviços
Duas arquiteturas comuns são SOA (Service-Oriented Architecture) e Micro Serviços. SOA é baseada em um barramento de serviços centralizado, orquestrando processos. Micro Serviços quebram a aplicação em módulos independentes, cada um com seu ciclo de vida, favorecendo escalabilidade e autonomia nas escolhas tecnológicas.

Concluindo, a escolha entre SOA e Micro Serviços depende do contexto, sendo a tendência atual favorecendo a flexibilidade e autonomia proporcionadas pelos Micro Serviços.


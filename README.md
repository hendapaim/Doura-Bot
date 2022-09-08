# Doura-Bot
Doura - Um Smart Enquiry Chatbot

# Olá 👋, Sou a Doura a sua assistente

## O sistema atual responde a consultas de três maneiras categorizadas:
1. Saudações: Respostas à saudação pelos usuários de forma endereçada, tornando-a fácil de usar.
2. Respostas específicas do domínio: Estas incluem respostas sobre os institutos específicos que estão sendo questionados.
3. Respostas apologéticas: Estas incluem respostas a consultas que parecem difíceis de recuperar, sendo respondidas silenciosamente com uma resposta apologética.

Usaremos python como linguagem de programação junto com AIML (Artificial
Intelligence Markup Language) para fazer correspondência de padrões para seleção de resposta.
As seguintes fases foram envolvidas na fabricação deste bot.
Fase de treinamento:
Usamos a biblioteca de processamento de linguagem natural NLTK para processar consultas brutas
(conjunto de treinamento) e convertê-las em um conjunto de palavras sinônimos (consulta reduzida). Isso
em suma descreve o contexto/conceito da consulta. A regra de ouro aqui se aplica, mais
dados, melhores resultados. 

A resposta esperada para tal consulta reduzida é conhecida e usamos esse conhecimento para
gerar aiml/xml ?les para fins de correspondência de padrões.

Fase de correspondência de padrões:
a entrada do usuário é novamente dividida em uma consulta reduzida usando NLP e usamos AIML ?les gerado a partir da fase 1 para encontrar o padrão mais próximo possível existente em nosso banco de dados para o qual a resposta é conhecida. Se esse padrão existir, as informações são recuperadas do banco de dados ou o bot tenta atrasar a conversa para manter o usuário interessado ou pedir desculpas pela incapacidade de resposta.

Diagramas: Diagrama UML relevante
 <img src="https://media.geeksforgeeks.org/wp-content/uploads/image.jpg"/>


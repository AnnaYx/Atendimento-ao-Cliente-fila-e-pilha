#  ATIVIDADE PRATICA Fila E Pilha 

O projeto simula um sistema simples de atendimento e histórico de solicitações usando *listas encadeadas* pra implementar *fila e pilha*   

A ideia é mostrar o funcionamento dessas duas estruturas em um sistema de atendimento com clientes e solicitações.  

---

##  O que o sistema faz

- *Fila de Atendimento:*  
  - Guarda os clientes que estão esperando atendimento.  
  - O primeiro que entra é o primeiro que sai *(ordem FIFO).*  
  - É possível visualizar toda a fila e atender o próximo cliente.  

- *Pilha de Histórico:*  
  - Guarda o histórico de solicitações de serviço realizadas.  
  - O último que entra é o primeiro que sai *(ordem LIFO).*  
  - É possível visualizar o histórico e adicionar novas solicitações.  

---

##  Estrutura do projeto

O projeto é todo baseado em *lista encadeada*
 e as classes são as seguintes   


src/
 ├── Elemento.java     → representa cada cliente ou solicitação
 ├── No.java           → nó da lista encadeada
 ├── Fila.java         → controla a fila de atendimento
 ├── Pilha.java        → controla o histórico de solicitações
 └── MainSistema.java  → menu principal e execução do programa


---

##  Explicando cada parte

###  Elemento.java
Guarda os dados que vão ser salvos tanto na fila quanto na pilha.  
Como o mesmo tipo serve pros dois, os campos são genéricos:
java
String id;                // Código de identificação
String nomeOuDescricao;   // Nome do cliente ou descrição da solicitação
String motivoOuDataHora;  // Motivo do atendimento ou data/hora


###  No.java
Cada nó da lista encadeada tem:
- Um valor (do tipo Elemento)
- Um ponteiro (proximo) que indica o próximo nó  


###  Fila.java
Implementa a fila de atendimento.  
Tem dois ponteiros:
- inicio → o primeiro da fila  
- fim → o último da fila  

Funções principais:
- insere(Elemento e) → adiciona um cliente no fim  
- remove() → remove o primeiro (cliente atendido)  
- imprime() → mostra todos os clientes na fila  
- estaVazia() → verifica se a fila está vazia  

###  Pilha.java
Implementa o histórico de solicitações.  
Tem um ponteiro topo, que aponta pro último elemento inserido.  

Funções principais:
- insere(Elemento e) → adiciona uma nova solicitação no topo  
- remove() → remove a última inserida (desfazer)  
- imprime() → mostra todo o histórico  
- estaVazia() → verifica se está vazia  

###  MainSistema.java
É onde tudo acontece.  
Tem um *menu interativo* com 6 opções principais:


===== SISTEMA DE ATENDIMENTO =====
1 - Ver fila de atendimento
2 - Adicionar cliente à fila
3 - Atender próximo cliente
4 - Ver histórico de solicitações
5 - Adicionar nova solicitação ao histórico
6 - Remover última solicitação do histórico
0 - Sair


---

## Como funciona 

Assim que o programa inicia, ele cria:
- Uma fila com 10 clientes 
- Uma pilha com 10 solicitações 

Ver fila de atendimento, adicionar cliente à fila, atender próximo cliente, ver histórico de solicitações, adicionar nova solicitação ao histórico, remover última solicitação do histórico e sair

---

##  Exemplo de uso


===== SISTEMA DE ATENDIMENTO =====
1 - Ver fila de atendimento
2 - Atender próximo cliente
3 - Ver histórico de solicitações
4 - Adicionar nova solicitação ao histórico
0 - Sair
Escolha uma opção: 1

--- Fila de Atendimento ---
ID: CLI001 | Maria Silva | Dúvida sobre produto
ID: CLI002 | João Souza | Reclamação de serviço
...

Escolha uma opção: 2
Cliente atendido:
ID: CLI001 | Maria Silva | Dúvida sobre produto

Escolha uma opção: 3
--- Histórico de Solicitações ---
ID: REQ010 | Consulta técnica | 2024-08-20 15:00
ID: REQ009 | Restauração de dados | 2024-08-20 14:30
...

Escolha uma opção: 4
Digite o ID da solicitação:
REQ011
Digite a descrição:
Verificação de rede
Digite a data e hora (ex: 2024-10-17 14:00):
2024-10-17 18:00
Solicitação adicionada ao histórico!

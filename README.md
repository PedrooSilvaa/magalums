# magalums

Projeto desenvolvido com **Java** e **Spring Boot**, focado em microsserviços de notificações. Este projeto gerencia notificações agendadas, com funcionalidades para agendar, consultar, cancelar e processar notificações com base no status.

## 🚀 Tecnologias Utilizadas

- **Java** com **Spring Boot** para construção da aplicação.
- **Microsserviços** para gerenciar notificações.
- **Spring Data JPA** para persistência no banco de dados.
- **Status de Notificação**: Gerenciamento de status das notificações.

## ✨ Funcionalidades

- **Agendamento de Notificação**: Método para agendar notificações, salvando no banco de dados.
- **Consulta de Notificação**: Consultar notificações pelo ID.
- **Cancelamento de Notificação**: Alterar o status de uma notificação para "Cancelada".
- **Verificação de Notificações Pendentes**: Verifica notificações com status "Pendente" ou "Erro" antes de um horário específico.
- **Envio de Notificação**: Método que simula o envio de notificações e altera o status para "Sucesso".

## 🛠️ Como Executar o Projeto

Para executar o projeto localmente, siga os passos abaixo:

1. Clone o repositório:

```bash
git clone https://github.com/SeuUsuario/magalums.git

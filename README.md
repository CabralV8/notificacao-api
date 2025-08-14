# Projeto Notificações - Microsserviço de Envio de E-mails

Este microsserviço é responsável por enviar notificações por e-mail referentes a eventos e tarefas.
Foi desenvolvido em **Java** com **Spring Boot**, utilizando **JavaMailSender** para envio de e-mails e **Thymeleaf** para templates.

O serviço opera em conjunto com outros microsserviços (Usuário, Gestor de Tarefas e BFF), recebendo informações de eventos e disparando notificações automáticas.

---

## Variáveis de Ambiente

Para rodar este projeto, você precisará adicionar as seguintes variáveis de ambiente no seu `application.yml` ou `application.properties`:

| Variável                                           | Descrição                                              | Valor Padrão   |
|:---------------------------------------------------|:-------------------------------------------------------|:---------------|
| `spring.mail.host`                                 | Host SMTP para envio de e-mails                        | `smtp.gmail.com` |
| `spring.mail.port`                                 | Porta SMTP                                             | `587`          |
| `spring.mail.username`                             | E-mail usado para autenticação no servidor SMTP        | **Obrigatório** |
| `spring.mail.password`                             | Senha / App Password do e-mail remetente               | **Obrigatório** |
| `spring.mail.protocol`                             | Protocolo de envio                                     | `smtp`         |
| `spring.mail.properties.mail.smtp.auth`            | Habilita autenticação SMTP                              | `true`         |
| `spring.mail.properties.mail.smtp.starttls.enable` | Habilita STARTTLS para segurança                        | `true`         |
| `envio.email.remetente`                            | Endereço de e-mail do remetente                        | **Obrigatório** |
| `envio.email.nomeRemetente`                        | Nome que aparecerá como remetente no e-mail            | `Cabral`       |
| `server.port`                                      | Porta em que o serviço irá rodar                       | `8082`         |

---

## Documentação da API

A documentação da API se encontra disponível no Swagger. Para acessar localmente:

http://localhost:8082/swagger-ui.html

---

#### Enviar e-mail de notificação

```http
POST /email
```
| Parâmetro | Tipo     | Descrição                              |
|:----------|:---------|:---------------------------------------|
| `TarefasRecord`     | `JSON` | **Obrigatório**:Dados da tarefa, incluindo nome, data do evento e e-mail|

#### Exemplo de corpo da requisição:

```json
{
  "id": "64f8b5f2c8f1b25f4f2a1234",
  "nomeTarefa": "Reunião com Cliente",
  "dataCriacao": "13-08-2025 10:00:00",
  "dataEvento": "14-08-2025 09:00:00",
  "emailUsuario": "usuario@dominio.com",
  "dataAlteracao": "13-08-2025 12:00:00",
  "statusNotificacaoEnum": "PENDENTE"
}
```

### Feedback
Se você tiver algum feedback ou dúvida, por favor entre em contato:

**Email**: valberton77@gmail.com

**GitHub**: https://github.com/CabralV8

**LinkedIn**: www.linkedin.com/in/valbertoncabral
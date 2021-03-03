# push-notification-service

Esse projeto tem cuida da solução de push para os aplicativo. 

A implementação está na branch develop. 


> Basta comitar no github que o deploy é feito automaticamente

## Para rodar os testes unitários 

> npm run test 

## Utilizaçao do serviço 

O servidor de push esperar uma mesagem na fila do  SQS definida no template.yaml PushNotificationMessageQueue. Você pode enviar uma mensagem pelo console da amazon nessa fila mencionada. 

> O formato da mensagem enviada deve ser um JSON:
``  {
  'body' :  {"order_type": "ifood", "info2": "ifood"},  
   "smartpagTokens": "teste" 
}``


> body deve conter a mensagem a ser enviada para o serviço do push e smartpagToken é o token necessário para recuperar o firebase token. O firebase token é recuperado da tabela do banco de dados PushNotificationDynamoDBTable. Tal valor é temporário e deve expirar de acordo com o tempo de expiração do token do smartpag. 


##  sendPushNotication

>Função que faz o envio para o firebase.
>Ela espera que exista uma variavel de ambiente process.env.FIREBASE_SERVER_KEY. 
>Essa chave deve ser pega no firebase. Dependendo do deploy no codepipeline essa variável e removia, portanto é necessário uma estratégia melhor. Talbez o SSM(Parametros).

>const options = {
>		method: 'POST',
>		headers: {
>			'Authorization': 'Key='  + process.env.FIREBASE_SERVER_KEY,
>			'Content-Type': 'application/json'
>		}
>	};  


##  IfoodCredentials Store 

Esse serviço recebe um smartpag token vindo de uma mensagem do SQS event.Records como no exemplo abaixo:

>{
>    "access_token": "eiZXN0YWJsaXNobWVudElkIjoyLCJpYXQiOjE2MDM5ODc4MzEsImV4cCI6MTYwNDA3NDIzMX0.>fjtzGfim0NrauXfSdYmbDbz2lSzL3Uv7enuvHmCumJU"
>}

De posso to token ele faz uma requisição para o serviço do smartpag backend e salva as credenciais do Ifood(user, senha, mechantid, ...) em um tabela do dynamodb CredenciaisIntegration com Time to Leave de 12 horas

Segue o link de sugestão. 
>https://smartpay-development.herokuapp.com/api/credentials
Esse serviço ainda não existem então ele está mocado dentro do lambda. 


##  IfoodUserDeviceToken Store

Esse serviço recebe um token do smartpag e um token do firebase para armazenar e ser utilizado pelo push. Ele espera no corpo do body um json nesse formato:
>{ "firebase_token": "eutoken_firebase" }

Além disso, ele esperar o smartpag token no header da requisição

## Autentication Proxy

Esse lambda repassa a autenticação de login para o smartpag backend(heroku) e envia o token do smartpag para iniciar uma requisição utilizando o IfoodCredentials Store Lambda.








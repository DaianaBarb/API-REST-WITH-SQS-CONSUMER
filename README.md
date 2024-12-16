# API-REST-WITH-SQS-CONSUMER
o projeto possui:
Uma api que faz um CRUD de usuario, fazendo uma consulta do cep do usuario na api externa viacep. O banco de dados utilizado e o mysql.
(consumidor) SQSListener, que escuta de uma fila aws de dez em dez mensagens, realizando o processamento de cada mensagem.
(Produtor) Envio pra uma fila SQS da aws.

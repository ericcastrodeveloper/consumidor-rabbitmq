# consumidor-rabbitmq

Para iniciar a aplicação rodar um container do docker antes com o comando:

docker run -d --hostname local-rabbit --name rabbit-mq -p 15672:15672 -p 5672:5672 rabbitmq:3.6.9-management

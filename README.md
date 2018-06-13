# spring-boot-activeMQ-webSocket
Ejemplo de como trabaja activeMQ y web socket en dos proyectos separados

instalar y correr ambos proyectos

desde http://localhost:8080/swagger-ui.html#/topic-controller/produceUsingPOST

se puede enviar un objeto de tipo

{
  "accountId": "1",
  "countryType": "AR",
  "message": "1",
  "messageType": "COUNT_NEW_LEADS"
}

y lo va a recibir http://localhost:8090/index.html

a su vez se puede enviar 

{
  "accountId": "2",
  "countryType": "AR",
  "message": "1",
  "messageType": "COUNT_NEW_LEADS"
}

y lo va a recibir http://localhost:8090/index2.html

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


GLOSARIO DE TERMINOS

STOMP

STOMP es un sencillo protocolo diseñado para la comunicación asíncrona entre clientes a través de un mediador de mensajes (en nuestro caso, ActiveMQ). El protocolo está basado en frames. Los frames no son más que un comando (u operación), un mensaje (o body) y unas cabeceras del mensaje (headers). La especificación STOMP se compone de una serie de operaciones (comandos) para la interacción entre cliente e intermediario de mensajes. A nosotros únicamente nos harán falta cuatro de estas operaciones.
connect: Establece conexión con el broker de mensajería.
subscribe: El cliente se suscribe a un destino del broker (una cola o un topic).
send: El cliente envía un mensaje a un destino del broker (cola o topic).
disconnect: Cierra la conexión con el broker de mensajería.

BROKER
Un bróker de mensajería es un patrón arquitectónico para la validación, la transformación y el ruteo de mensajes. Es un mecanismo mediador de la comunicación entre aplicaciones, permitiendo minimizar el grado de conocimiento mutuo que estas aplicaciones necesitan tener, para poder intercambiar mensajes, implementando así efectivamente su desacoplamiento.
El propósito del bróker es recibir los mensajes entrantes desde las aplicaciones y llevar a cabo determinadas acciones con ellas. He aquí algunos ejemplos de posibles acciones a emprender por parte del bróker:
Rutear mensajes a una o más destinaciones distintas
Transformar mensajes a una representación alternativa
Realizar una agregación de mensajes, descomponer mensajes en varios mensajes componentes, reenviándolos a sus respectivos destinos, para posteriormente recomponer las respuestas en un único mensaje que será remitido al usuario
Interactuar con un depósito externo para aumentar un mensaje o almacenarlo
Invocar un servicio Web para consultar datos
Responder a eventos o errores
Proveer un ruteo de los mensajes basado en su contenido o en sus tópicos empleando el modelo de publica/suscribe
Existen numerosos patrones de mensajería (como publica/suscribe) que pueden operar sin un bróker de mensajería. Un patrón que sí requiere la intervención de un bróker de mensajería es el de las colas de trabajos, es decir, colas de mensajería manejadas por múltiples receptores. Se requiere que tales colas tengan un mecanismo único y central de administración, transacción y generalmente también almacenamiento confiable.


JMS (Java Messagin Service)

La API Java Message Service (en español servicio de mensajes Java), también conocida por sus siglas JMS, es la solución creada por Sun Microsystems para el uso de colas de mensajes. Este es un estándar de mensajería que permite a los componentes de aplicaciones basados en la plataforma Java2 crear, enviar, recibir y leer mensajes. También hace posible la comunicación confiable de manera asíncrona.

Existen dos modelos de la API JMS, los cuales son:
Modelo Punto a Punto (point to point): Este modelo cuenta con solo dos clientes, uno que envía el mensaje y otro que lo recibe. Este modelo asegura la llegada del mensaje ya que si el receptor no está disponible para aceptar el mensaje o atenderlo, de cualquier forma se le envía el mensaje y este se agrega en una cola del tipo FIFO para luego ser recibido según haya entrado
Modelo Publicador/Suscriptor (Publish/subscribe): Este modelo cuenta con varios clientes, unos que publican temas o eventos, y los que ven estos temas, a diferencia del modelo punto a punto este modelo tiende a tener más de un consumidor.
Ambos modelos pueden ser síncronos mediante el método receive y asíncronos por medio de un MessageListener.

WebSocket

WebSockets es una bidireccional , dúplex completo , conexión persistente entre un navegador web y un servidor. Una vez que se establece una conexión WebSocket, la conexión permanece abierta hasta que el cliente o servidor decida cerrar esta conexión.


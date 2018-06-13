$(document).ready(function() {
    var messageList = $("#messages");

    var socket = new SockJS('/apiNotification');
    var stompClient = Stomp.over(socket);
    stompClient.connect({}, subscriptions);

    function subscriptions() {
        var url = '/queue' + "/2/1";
        stompClient.subscribe(url, processMessage);
    }

    function processMessage(data) {
        messageList.append(data.body);
    }
});
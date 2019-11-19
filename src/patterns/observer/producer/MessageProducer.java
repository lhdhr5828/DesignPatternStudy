package patterns.observer.producer;

import patterns.observer.observable.LeeMQ;
import patterns.observer.observable.LeePushMQ;


public class MessageProducer {
    private LeeMQ leePushMQ;

    public void sendMessage(String message) {
        this.leePushMQ.receiveMes(message);
    }

    public MessageProducer(LeeMQ leeMQ) {
        this.leePushMQ = leeMQ;
    }

    public void setleeMQ(LeeMQ leePushMQ) {
        this.leePushMQ = leePushMQ;
    }
}

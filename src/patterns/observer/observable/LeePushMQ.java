package patterns.observer.observable;

import java.util.Observable;
import java.util.Observer;

public class LeePushMQ extends Observable implements LeeMQ {

    public LeePushMQ() {

    }

    @Override
    public void receiveMes(String mes) {
        this.setChanged();
        this.notifyObservers(mes);
    }


}

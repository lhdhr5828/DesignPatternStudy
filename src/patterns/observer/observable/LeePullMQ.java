package patterns.observer.observable;

import java.util.Observable;

public class LeePullMQ extends Observable implements LeeMQ {
    public LeePullMQ() {

    }

    private String mes;

    public void afterReceive() {
        this.setChanged();
        this.notifyObservers();
    }

    @Override

    public void receiveMes(String mes) {
        this.mes = mes;
        this.afterReceive();
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}

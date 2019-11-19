package patterns.observer.observer;

import patterns.observer.observable.LeePullMQ;

import java.util.Observable;
import java.util.Observer;

public class BPullListener implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof LeePullMQ) {
            String mes = ((LeePullMQ) o).getMes();
            System.out.println("listener b pull a message " + mes);
        }
    }
}

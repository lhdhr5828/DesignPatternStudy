package patterns.observer.observer;

import java.util.Observable;
import java.util.Observer;

public class DPushListener implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg + " push D listener");
    }
}

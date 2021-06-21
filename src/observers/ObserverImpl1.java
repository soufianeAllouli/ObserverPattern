package observers;

import observables.Observable;
import observables.ObservableImpl1;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println("Observable 1 --- this is my new state : "+((ObservableImpl1)observable).getState());
    }
}

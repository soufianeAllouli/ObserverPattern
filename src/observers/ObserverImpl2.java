package observers;

import observables.Observable;
import observables.ObservableImpl1;

public class ObserverImpl2 implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println("Observable 2 --- this is my new state : "+((ObservableImpl1)observable).getState());
    }
}

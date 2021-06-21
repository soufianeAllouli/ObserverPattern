import observables.Observable;
import observables.ObservableImpl1;
import observers.Observer;
import observers.ObserverImpl1;
import observers.ObserverImpl2;

import java.lang.invoke.MethodHandles;

public class Main {


    public static void main(String[] args) {
        Observable observable=new ObservableImpl1();
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();

        System.out.println("------------------------------ state 0 --> "+((ObservableImpl1)observable).getState());
        observable.addObserver(observer1);
        observable.addObserver(observer2);

        System.out.println("------------------------------ state 1 --> "+((ObservableImpl1)observable).getState());
        ((ObservableImpl1)observable).setState(25);

        observable.addObserver(new Observer() {
            @Override
            public void update(Observable observable) {
                System.out.println("anonymous observer ---- current observable state is :"+((ObservableImpl1)observable).getState());
            }
        });

        System.out.println("------------------------------ state 2 --> "+((ObservableImpl1)observable).getState());
        ((ObservableImpl1)observable).setState(100);
    }
}

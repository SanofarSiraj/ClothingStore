package patterns.observer;

public class CEO implements Observer {
    @Override
    public void update(String message) {
        System.out.println("CEO Notification: " + message);
    }
}

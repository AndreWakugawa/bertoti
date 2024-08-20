package bertoti.padroes.observer;

import java.util.EventListener;

public interface Notification extends EventListener {
    void update();
}

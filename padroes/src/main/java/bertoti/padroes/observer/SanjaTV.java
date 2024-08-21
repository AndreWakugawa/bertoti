package bertoti.padroes.observer;

public class SanjaTV implements Observer{
    private float temp;

    @Override
    public void update(float temp) {
        this.temp = temp;
    }
}

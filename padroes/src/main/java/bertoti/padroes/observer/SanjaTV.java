package bertoti.padroes.observer;

public class SanjaTV implements Observer{
    private float temp;

    @Override
    public void update(float temp) {
        this.temp = temp;
        System.out.println("Temperatura agora em São José dos Campos: " +temp);
    }
}

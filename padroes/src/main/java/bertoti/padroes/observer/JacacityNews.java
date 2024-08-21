package bertoti.padroes.observer;

public class JacacityNews implements Observer{
    private float temp;

    @Override
    public void update(float temp) {
        this.temp = temp;
        System.out.println("Jacareí é do lado de São José então também tem a seguinte temperatura : " +temp);
    }
}

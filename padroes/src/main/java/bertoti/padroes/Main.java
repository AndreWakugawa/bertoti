package bertoti.padroes;

public class Main {
    public static void main(String[] args) {

        Cliente jose = Cliente.builder()
                .nome("José")
                .comprarPao(new PaoFrances())
                .build();

        jose.comprar();

        jose.setComprarPao(new PaoCareca());

        jose.comprar();


    }
}
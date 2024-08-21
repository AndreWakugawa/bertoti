package bertoti.padroes.observer;

import java.util.Scanner;

public class ObserverPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inpe inpe = new Inpe();
        inpe.addObserver(new SanjaTV());
        inpe.addObserver(new JacacityNews());

        System.out.println("QUAL A TEMPERATURA AGORA??????");
        float newTemp = scanner.nextFloat();
        inpe.setTemp(newTemp);

    }
}

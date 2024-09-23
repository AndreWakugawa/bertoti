package bertoti.padroes.composite;

public class CompositePattern {
    public static void main(String[] args) {
        Composite composite = new Composite("Composite");

        Leaf leaf = new Leaf("Leaf");

        composite.add(leaf);

        composite.execute();
        composite.getComponents().get(0).execute();
    }
}

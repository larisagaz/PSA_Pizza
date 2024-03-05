package src;

public class SegundaQuartaSextaFactory implements PizzariaFactory {
    @Override
    public Pizza createPizza() {
        return new CalabresaPizza();
    }

    @Override
    public Calzone createCalzone() {
        return new CalabresaCalzone();
    }
}
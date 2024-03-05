package src;

public class TercaQuintaSabadoFactory implements PizzariaFactory {
    @Override
    public Pizza createPizza() {
        return new PresuntoPizza();
    }

    @Override
    public Calzone createCalzone() {
        return new PresuntoCalzone();
    }
}
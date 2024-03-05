package src;

interface Pizza {
    String ingredients();
}

interface Calzone {
    String ingredients();
}

// Hierarquia de Fábricas
interface PizzariaFactory {
    Pizza createPizza();
    Calzone createCalzone();
}

public class Main {
    public static void main(String[] args) {
        String date = "26/02/2024";
        Pizzaria pizzaria = new Pizzaria(date);
        System.out.println(pizzaria.getMenu());
    }
}

package src;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pizzaria {
    private LocalDate date;

    public Pizzaria(String date) {
        this.date = LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getMenu() {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        PizzariaFactory factory;
        switch (dayOfWeek) {
            case MONDAY:
            case WEDNESDAY:
            case FRIDAY:
                factory = new SegundaQuartaSextaFactory();
                break;
            case TUESDAY:
            case THURSDAY:
            case SATURDAY:
                factory = new TercaQuintaSabadoFactory();
                break;
            default:
                return "A pizzaria está fechada hoje.";
        }

        Pizza pizza = factory.createPizza();
        Calzone calzone = factory.createCalzone();

        return String.format("No menu de hoje:\nPizza: %s\nCalzone: %s", pizza.ingredients(), calzone.ingredients());
    }
}
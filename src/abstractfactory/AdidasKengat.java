package abstractfactory;

public class AdidasKengat implements Kengat {
    private String name;
    public AdidasKengat () {
        this.name = "kengat";
    }

    @Override
    public String getName() {
        return "Adidas " + name;
    }
}

package abstractfactory;

public class AdidasPaita implements Paita {
    private String name;
    public AdidasPaita () {
        this.name = "paita";
    }

    @Override
    public String getName() {
        return "Adidas " + name;
    }
}

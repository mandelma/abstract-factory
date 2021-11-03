package abstractfactory;

public class AdidasLippis implements Lippis {
    private String name;
    public AdidasLippis () {
        this.name = "lippis";
    }

    @Override
    public String getName() {
        return "Adidas " + name;
    }
}

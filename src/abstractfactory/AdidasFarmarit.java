package abstractfactory;

public class AdidasFarmarit implements Farmarit {
    private String name;
    public AdidasFarmarit () {
        this.name = "farmarit";
    }

    @Override
    public String getName() {
        return "Adidas " + name;
    }
}

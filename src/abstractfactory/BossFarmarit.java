package abstractfactory;

public class BossFarmarit implements Farmarit {
    private String name;
    public BossFarmarit () {
        this.name = "farmarit";
    }

    @Override
    public String getName() {
        return "Bosh " + name;
    }
}

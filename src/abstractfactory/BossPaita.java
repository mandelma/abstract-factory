package abstractfactory;

public class BossPaita implements Paita {
    private String name;
    public BossPaita () {
        this.name = "paita";
    }

    @Override
    public String getName() {
        return "Boss " + name;
    }
}

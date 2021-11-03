package abstractfactory;

public class BossLippis implements Lippis {
    private String name;
    public BossLippis () {
        this.name = "lippis";
    }

    @Override
    public String getName() {
        return "Boss " + name;
    }
}

package abstractfactory;

public class BossKengat implements Kengat {
    private String name;
    public BossKengat () {
        this.name = "kengat";
    }

    @Override
    public String getName() {
        return "Boss " + name;
    }
}

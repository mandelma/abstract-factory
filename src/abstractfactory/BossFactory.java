package abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class BossFactory extends ItemAbstractFactory {

    public ItemAbstractFactory getDressed() {
        System.out.println("Minulla on " + pList().get(0) + ", " + pList().get(1) +
                ", " + pList().get(2) + " ja " + pList().get(3));
        return null;
    }

    private List<String> pList () {
        List<String> list = new ArrayList<String>();

        Farmarit farmarit = new BossFarmarit();
        Kengat kengat = new BossKengat();
        Paita paita = new BossPaita();
        Lippis lippis = new BossLippis();

        list.add(kengat.getName());
        list.add(farmarit.getName());
        list.add(paita.getName());
        list.add(lippis.getName());

        return list;
    }

}

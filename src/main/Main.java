package main;

import abstractfactory.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main (String[] args) {
        ItemAbstractFactory adidas = new AdidasFactory();
        adidas.getDressed();

        System.out.println("--------------------------------");

        ItemAbstractFactory boss = new BossFactory();
        boss.getDressed();

//        Class c = null;
//        ItemAbstractFactory tehdas = null;
//        Properties properties = new Properties();
//
//        try {
//            properties.load(
//                    new FileInputStream("tehdas.properties"));
//            } catch (IOException e) {e.printStackTrace();}
//        try{
//            //luetaan toteuttava tehdas properties-tiedostosta
//            c = Class.forName(properties.getProperty("tehdas"));
//            tehdas = (ItemAbstractFactory)c.getDeclaredConstructor().newInstance();
//            }catch (Exception e){e.printStackTrace();
//
//            //AdidasFactory adi = tehdas.;
//            ItemAbstractFactory it = tehdas.getDressed();
//        }

    }
}

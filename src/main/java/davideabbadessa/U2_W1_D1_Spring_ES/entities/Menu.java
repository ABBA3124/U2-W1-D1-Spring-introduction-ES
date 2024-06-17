package davideabbadessa.U2_W1_D1_Spring_ES.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {


    private List<ProvaAstratta> provaAstrattas = new ArrayList<>();

    public void aggiungiProdotto(ProvaAstratta provaAstratta) {
        provaAstrattas.add(provaAstratta);
    }


    public void stampaMenu() {
        for (ProvaAstratta provaAstratta : provaAstrattas) {
            System.out.println(provaAstratta.getName() + ": " + provaAstratta.getPrice() + "€ - Ingredienti: " + provaAstratta.getInfoNutrizionali());
        }
    }

}

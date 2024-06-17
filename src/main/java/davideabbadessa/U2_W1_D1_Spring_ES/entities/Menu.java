package davideabbadessa.U2_W1_D1_Spring_ES.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<ProvaAstratta> provaAstrattas;

    public Menu() {
        this.provaAstrattas = new ArrayList<>();
    }

    public void aggiungiProdotto(ProvaAstratta provaAstratta) {
        provaAstrattas.add(provaAstratta);
    }

    public void stampaMenu() {
        System.out.println("\n\t<-- Menù Pizze -->");
        for (ProvaAstratta provaAstratta : provaAstrattas) {
            if (provaAstratta instanceof Pizza) {
                System.out.println(provaAstratta.getName() + " " + ((Pizza) provaAstratta).getToppings() + " ");
                System.out.println("Calorie: " + provaAstratta.getCalorie() + " Prezzo: " + provaAstratta.getPrice() + "€");
            }
        }
        System.out.println("\n\t<-- Toppings -->");
        for (ProvaAstratta provaAstratta : provaAstrattas) {
            if (provaAstratta instanceof Topping) {
                System.out.println(provaAstratta.getName());
                System.out.println("Calorie: " + provaAstratta.getCalorie() + " kcal" + " Prezzo: " + provaAstratta.getPrice() + "€");
            }
        }
        System.out.println("\n\t<-- Drinks -->");
        for (ProvaAstratta provaAstratta : provaAstrattas) {
            if (provaAstratta instanceof Drink) {
                System.out.println(provaAstratta.getName());
                System.out.println("Calorie : " + provaAstratta.getCalorie() + " Prezzo: " + provaAstratta.getPrice() + "€");
            }
        }
    }

    // getters and setters
    public List<ProvaAstratta> getItems() {
        return provaAstrattas;
    }

    public void setItems(List<ProvaAstratta> items) {
        this.provaAstrattas = items;
    }
}

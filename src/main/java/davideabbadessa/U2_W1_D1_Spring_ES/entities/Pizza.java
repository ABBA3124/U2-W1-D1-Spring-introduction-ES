package davideabbadessa.U2_W1_D1_Spring_ES.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends ProvaAstratta {

    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price, String infoNutrizionali) {
        super(name, price, infoNutrizionali);
        this.toppings = toppings;
    }

    public void aggiungiTopping(Topping topping) {
        toppings.add(topping);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                '}';
    }
}

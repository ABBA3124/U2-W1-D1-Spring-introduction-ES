package davideabbadessa.U2_W1_D1_Spring_ES;


import davideabbadessa.U2_W1_D1_Spring_ES.entities.Drink;
import davideabbadessa.U2_W1_D1_Spring_ES.entities.Menu;
import davideabbadessa.U2_W1_D1_Spring_ES.entities.Pizza;
import davideabbadessa.U2_W1_D1_Spring_ES.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMenu {

    //Pizze
    @Bean
    public Pizza margherita() {
        return new Pizza("margherita", 4.99, "Pomodoro, Mozzarella");
    }

    //Drink
    @Bean
    public Drink water() {
        return new Drink("Water", 1.29, "Calorie: 0");
    }

    //Topping
    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 0.69, "Calorie: 92");
    }


    //Menu
    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.aggiungiProdotto(margherita());
        menu.aggiungiProdotto(water());
        return menu;
    }


}

package davideabbadessa.U2_W1_D1_Spring_ES;


import davideabbadessa.U2_W1_D1_Spring_ES.entities.Drink;
import davideabbadessa.U2_W1_D1_Spring_ES.entities.Menu;
import davideabbadessa.U2_W1_D1_Spring_ES.entities.Pizza;
import davideabbadessa.U2_W1_D1_Spring_ES.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMenu {

    //<------------ Pizze ------------>
    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", 4.99, "Pomodoro, Mozzarella", "Calorie: 1104");
    }

    @Bean
    public Pizza hawaiian() {
        return new Pizza("Pizza Hawaiian", 6.49, "Pomodoro, Mozzarella, Prosciutto, Ananas", "Calorie: 1024");
    }

    @Bean
    public Pizza salame() {
        return new Pizza("Pizza Salame", 5.99, "Pomodoro, Mozzarella, Salame", "Calorie: 1160");
    }


    //<------------ Drink ------------>
    @Bean
    public Drink water() {
        return new Drink("Water", 1.29, "Calorie: 0");
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade", 1.29, "Calorie: 128");
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine", 7.49, "Calorie: 607");
    }


    //<------------ Topping ------------>
    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 0.69, "Calorie: 92");
    }

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 0.99, "Calorie: 35");
    }

    @Bean
    public Topping cipolla() {
        return new Topping("Cipolla", 0.69, "Calorie: 22");
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 0.79, "Calorie: 24");
    }

    @Bean
    public Topping salameT() {
        return new Topping("Salame", 0.99, "Calorie: 86");
    }


    //Menu
    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.aggiungiProdotto(margherita());
        menu.aggiungiProdotto(hawaiian());
        menu.aggiungiProdotto(salame());
        //drink
        menu.aggiungiProdotto(water());
        menu.aggiungiProdotto(wine());
        menu.aggiungiProdotto(lemonade());
        //toppings
//        menu.aggiungiProdotto(mozzarella());
//        menu.aggiungiProdotto(prosciutto());
//        menu.aggiungiProdotto(cipolla());
//        menu.aggiungiProdotto(ananas());
//        menu.aggiungiProdotto(salameT());
        return menu;
    }


}

package davideabbadessa.U2_W1_D1_Spring_ES.entities;

public class Topping {

    private String name;
    private double price;
    private String calorie;


    public Topping(String name, double price, String calorie) {
        this.name = name;
        this.price = price;
        this.calorie = calorie;
    }

    public String getInfoNutrizionali() {
        return calorie;
    }

    public void setInfoNutrizionali(String calorie) {
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", infoNutrizionali='" + calorie + '\'' +
                '}';
    }
}

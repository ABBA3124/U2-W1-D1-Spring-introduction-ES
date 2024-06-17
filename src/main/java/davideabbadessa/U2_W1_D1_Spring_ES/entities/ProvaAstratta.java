package davideabbadessa.U2_W1_D1_Spring_ES.entities;

public abstract class ProvaAstratta {
    private String name;
    private double price;
    private String ingredienti;

    public ProvaAstratta(String name, double price, String ingredienti) {
        this.name = name;
        this.price = price;
        this.ingredienti = ingredienti;
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

    public String getInfoNutrizionali() {
        return ingredienti;
    }

    public void setInfoNutrizionali(String ingredienti) {
        this.ingredienti = ProvaAstratta.this.ingredienti;
    }

    @Override
    public String toString() {
        return "ProvaAstratta{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredienti='" + ingredienti + '\'' +
                '}';
    }
}

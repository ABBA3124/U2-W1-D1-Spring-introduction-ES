package davideabbadessa.U2_W1_D1_Spring_ES.entities;

public abstract class ProvaAstratta {
    private String name;
    private double price;
    private String infoNutrizionali;

    public ProvaAstratta(String name, double price, String infoNutrizionali) {
        this.name = name;
        this.price = price;
        this.infoNutrizionali = infoNutrizionali;
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
        return infoNutrizionali;
    }

    public void setInfoNutrizionali(String infoNutrizionali) {
        this.infoNutrizionali = infoNutrizionali;
    }

    @Override
    public String toString() {
        return "ProvaAstratta{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", infoNutrizionali='" + infoNutrizionali + '\'' +
                '}';
    }
}

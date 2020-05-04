public class car {

    public String model;
    public String producer;
    public String colour;
    public int price = 500;

    public String toString() {

        return model + " " + price + " " + colour + " " + producer;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public String getColour() {
        return colour;
    }
}

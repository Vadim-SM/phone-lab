public class Phone {
    private String brand;
    private String model;
    private double price;
    private int memoryGb;

    public Phone(String brand, String model, double price, int memoryGb) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memoryGb = memoryGb;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(int memoryGb) {
        this.memoryGb = memoryGb;
    }
}
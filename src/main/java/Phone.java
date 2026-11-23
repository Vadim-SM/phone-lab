import java.util.Objects;
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
    
    @Override
    public String toString() {
        return "Phone{brand='" + brand + "', model='" + model
                + "', price=" + price + ", memoryGb=" + memoryGb + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0
                && memoryGb == phone.memoryGb
                && Objects.equals(brand, phone.brand)
                && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, memoryGb);
    }
}

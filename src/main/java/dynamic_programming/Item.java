package dynamic_programming;

public class Item {
    private String name;
    private Long weight; // фунты
    private Long price; // в долларах

    public Item() {
    }

    public Item(String name, Long weight, Long price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}

public class Food {
    private String name;
    private int price, quantity = 1;

    public void setFoodDetail(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return "Name" + name + "Price :" + price;
    }
}

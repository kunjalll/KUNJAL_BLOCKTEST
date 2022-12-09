package model;

public class Orders {
    String item_code;
    String user_id;
    int price;
    int quantity;
    String description;

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Orders(String item_code, String user_id, int price, int quantity, String description) {
        this.item_code = item_code;
        this.user_id = user_id;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
}

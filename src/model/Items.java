package model;

public class Items {
    public Items(String item_name, String code, String brand, int price, String description) {
        this.item_name = item_name;
        Code = code;
        Brand = brand;
        Price = price;
        this.description = description;
    }

    String item_name;
    String Code;
    String Brand;
    int Price;
    String description;

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void itemformat() {
        System.out.println("Item_name" + "  :" + this.item_name);
        System.out.println("Code" + "     :" + this.Code);
        System.out.println("Brand" + "    :" + this.Brand);
        System.out.println("Price" + "    :" + this.Price);
        System.out.println("Description" + "    :" + this.description);

    }
}

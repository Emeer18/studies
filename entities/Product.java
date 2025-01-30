package entities;

public class Product {
    public String name;
    public Double price;
    public Double quantity;
    
    public double totalValueInStock(){

        return price * quantity;

    }

    public void addProduct(int quantity){

        this.quantity += quantity;

    }

    public void removeProducts(int quantity){

        this.quantity -= quantity;

    }

    public String toString(){

        return name 
        + ", $ "
        + price
        + ", "
        + quantity
        +" units, Total $ "
        + totalValueInStock();
    }

}

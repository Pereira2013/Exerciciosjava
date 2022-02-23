package entities;

public class Product {
  public String name;
  public double price;
  public int quantity;

  public double totalValueStock() {
    return price * quantity;
  }

  public void addProduct(int quantity) {
    this.quantity += quantity;  // o this para referir ao atributo da classe, não com o parametro do método
  }

  public void removeProduct(int quantity) {
    this.quantity -= quantity;
  }
}

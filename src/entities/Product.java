package entities;

public class Product {
  public String name;
  public double price;
  public int quantity;

  //construtor padrão

  public  Product(){}

  // criado construtor para não iniciar vazio o nome, price e quantity

  public  Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
    //sobrecarga

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double totalValueStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;  // o this para referir ao atributo da classe, não com o parametro do método
  }

  public void removeProduct(int quantity) {
    this.quantity -= quantity;
  }

  public  String toString(){
    return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueStock());
  }

}



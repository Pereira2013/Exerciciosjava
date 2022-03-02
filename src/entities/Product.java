package entities;

public class Product {
  private String name;
  private double price;
  private int quantity;

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

  //Encapsulamento

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }
// pelo regra de negocio o quantity só pode ser alterada pelo meio das operações criado no metodo.
  public int getQuantity() {
    return quantity;
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



package unit12_java_colectiton_framework.exescire;

public class Product {
    private double priceProduct;
    private int idProduct;
    private String nameProduct;

    Product() {
    }

    Product(int idProduct, String nameProduct,double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct=priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "id:"+ idProduct +"name:" + nameProduct+"price"+ priceProduct;
    }
}

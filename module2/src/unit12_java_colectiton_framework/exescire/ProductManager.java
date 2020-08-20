package unit12_java_colectiton_framework.exescire;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductManager extends Product {

    public static ArrayList<Product> arrProduct = new ArrayList<>();
    public static LinkedList<Product> linkedProduct = new LinkedList<>();

    public static void edit(int id, String name) {
        for (Product item : arrProduct) {
            if (item.getIdProduct() == id) {
                item.setNameProduct(name);
                break;
            }
        }
    }

    public static void searchByName(String name) {
        for (Product item : arrProduct) {
            if (item.getNameProduct().equals(name)) {
                System.out.println("Tìm thấy " + item.getNameProduct());
            }
        }
    }
    public static void deleteById(int id) {
        arrProduct.remove(id);
        System.out.println("Mảng còn lại: " + "\n" + arrProduct.toString());
    }
}
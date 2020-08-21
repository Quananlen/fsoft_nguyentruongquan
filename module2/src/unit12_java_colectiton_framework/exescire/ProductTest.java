package unit12_java_colectiton_framework.exescire;

import java.util.Scanner;

import static unit12_java_colectiton_framework.exescire.ProductManager.*;

public class ProductTest {
    public static void main(String[] args) {
        int idProduct = 0;
        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Show all product");
            System.out.println("4. Search product");
            System.out.println("5. Delete product");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    idProduct++;
                    System.out.println("Enter your name Product" + idProduct + " :");
                    Scanner sc1 = new Scanner(System.in);
                    String nameProduct = sc1.nextLine();
//                    arrProduct.add(new Product(idProduct, nameProduct));
                    break;
                case 2:
                    System.out.println("Edit product :");
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Enter your Id product");
                    int a = sc2.nextInt();
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter your product name want edit");
                    String editedName = sc3.nextLine();
                    edit(a, editedName);
                    break;
                case 3:
                    System.out.println(arrProduct);
                    break;
                case 4:
                    System.out.println("Search your product: ");
                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.nextLine();
                    searchByName(name);
                    break;
                case 5:
                    System.out.println("Delete your product,enter Id want delete :");
                    Scanner sc4 = new Scanner(System.in);
                    int id = sc4.nextInt();
                    deleteById(id);
                    break;
            }

        }
    }
}


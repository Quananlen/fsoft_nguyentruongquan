package unit12_java_colectiton_framework.practice.setup_binarysearchtree;

public class MainBST {
    public static void main(String[] args) {
        BST<String> tree=new BST<>();
        tree.insert("google");
        tree.insert("facebook");
        tree.insert("macbook");
        tree.insert("iphone");
        System.out.println("(Inorder (sorted)");
        tree.inorder();
        System.out.println("The number of nodes is:" +tree.getSize());
    }
}

package unit12_java_colectiton_framework.exescire.search_in_binaryseacrchtre;

public class BST<E extends Comparable<E>>{
     /*
                        15
                    /       \
                9         20
               /    \            \
            6          12           21
                     /    \
                    9     13
     */

    Node<E> root;
    int size = 0;

    public BST() {
        root = null;
    }

    void delete(E e) {
        root = deleteNode(root, e);
    }

    Node deleteNode(Node root, E e) {
        if (root == null) return root;
        if (e.compareTo((E) root.value) < 0) {
            root.left = deleteNode(root.left, e);
        } else if (e.compareTo((E) root.value) > 0) {
            root.right = deleteNode(root.right, e);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.value = minValue(root.right);
            root.right = deleteNode(root.right, (E) root.value);
        }
        return root;
    }

    E minValue(Node root) {
        E min = (E) root.value;
        while (root.left != null) {
            min = (E) root.left.value;
            root = root.left;
        }
        return min;
    }

    void insert(E e) {
        root = insertNode(root, e);
    }

    Node insertNode(Node root, E e) {
        if (root == null) {
            root = new Node(e);
            return root;
        }
        if (e.compareTo((E) root.value) < 0) {
            root.left = insertNode(root.left, e);
        } else if (e.compareTo((E) root.value) > 0) {
            root.right = insertNode(root.right, e);
        }
        return root;
    }

    void inoder() {
        inoderNode(root);
    }

    public void inoderNode(Node root) {
        if (root != null) {
            inoderNode(root.left);
            System.out.println(root.value);
            inoderNode(root.right);
        }
    }
}

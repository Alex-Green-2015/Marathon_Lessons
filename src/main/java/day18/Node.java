package day18;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public static void addNode(int value, Node root) {
        if (value < root.getValue()) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(value));
            } else {
                addNode(value, root.getLeft());
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new Node(value));
            } else {
                addNode(value, root.getRight());
            }
        }
    }

    public static void dfs(Node root) {
        if (root.getLeft() != null) {
            dfs(root.getLeft());
        }
        System.out.print(root.getValue() + " ");
        if (root.getRight() != null) {
            dfs(root.getRight());
        }
    }
}

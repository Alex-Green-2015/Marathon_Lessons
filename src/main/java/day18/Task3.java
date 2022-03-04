package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        Node.addNode(14, root);
        Node.addNode(23, root);
        Node.addNode(11, root);
        Node.addNode(16, root);
        Node.addNode(22, root);
        Node.addNode(27, root);
        Node.addNode(5, root);
        Node.addNode(15, root);
        Node.addNode(18, root);
        Node.addNode(24, root);
        Node.addNode(150, root);
        Node.addNode(8, root);

        Node.dfs(root);
    }
}
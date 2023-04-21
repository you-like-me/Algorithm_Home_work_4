import java.util.*;
import java.util.function.Consumer;

    public class Tree {

        private class Node {
            private int value;
            private Node left;
            private Node right;

            public Node(int value) {
                this.value = value;
            }
        }

        static Node root;

        public void add(int value) {
            root = appendNode(root, value);
        }

        private Node appendNode(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }
            if (current.value > value) {
                current.left = appendNode(current.left, value);
            } else if (current.value < value) {
                current.right = appendNode(current.right, value);
            }
            return current;
        }

        public List<Node> dfs() {
            List<Node> result = new ArrayList<>();
            dfsInternal(root, result);
            return result;
        }

        private void dfsInternal(Node current, List<Node> result) {
            if (current != null) {
                dfsInternal(current.left, result);
                result.add(current);
                dfsInternal(current.right, result);
            }
        }

        public static void findLastElement(Tree tree){
            List<Integer> dfsOrderItems = new ArrayList<>();
            for (Node n: tree.dfs()) {
                dfsOrderItems.add(n.value);
            }
            System.out.println("Все элементы дерева: " + dfsOrderItems);
            System.out.println("Максимальное значение в дереве: " + Collections.max(dfsOrderItems));
        }
        public static void findFirstElement(Tree tree) {
            List<Integer> dfsOrderItems = new ArrayList<>();
            for (Node n: tree.dfs()) {
                dfsOrderItems.add(n.value);
            }
            System.out.println("Все элементы дерева: " + dfsOrderItems);
            System.out.println("Минимальное значение в дереве: " + Collections.min(dfsOrderItems));
        }
        public static int getChildrenCount(Tree tree){
            int count = 0;
            for (Node n: tree.dfs()){
                if (n.left == null && n.right == null){
                    count++;
                }
            };
            return count;
        }
    }

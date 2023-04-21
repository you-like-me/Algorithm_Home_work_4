public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(7);tree.add(3);tree.add(9);tree.add(2);tree.add(1);tree.add(5);tree.add(4);tree.add(6);tree.add(8);
        tree.add(16);tree.add(0);tree.add(30);tree.add(50);tree.add(25);

        Tree.findFirstElement(tree);
        Tree.findLastElement(tree);
        System.out.println("<====================================>\n");
        System.out.println("В данном дереве " + Tree.getChildrenCount(tree) + " листьев.");


    }

}

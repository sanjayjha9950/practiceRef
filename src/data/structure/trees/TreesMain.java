package data.structure.trees;

public class TreesMain {

    public static void main(String args[]){

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(7);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();
        System.out.println();

        System.out.println(intTree.get(7).getData());
        System.out.println("Min = "+ intTree.min());
        System.out.println("Max = "+ intTree.max());

        intTree.delete(20);
        intTree.traverseInOrder();

    }
}

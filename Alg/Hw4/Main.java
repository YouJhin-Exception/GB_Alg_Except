package Alg.Hw4;

import Alg.Hw4.RedBlackTree.MyRedBlackTree;

public class Main {
    public static void main(String[] args) {
        MyRedBlackTree<String> treeStr = new MyRedBlackTree<>();

        treeStr.add("a");
        System.out.println("-------------------------");
        treeStr.printMyTree(treeStr.root);
        treeStr.add("b");
        System.out.println("-------------------------");
        treeStr.printMyTree(treeStr.root);
        treeStr.add("c");
        System.out.println("-------------------------");
        treeStr.printMyTree(treeStr.root);
        treeStr.add("d");
        System.out.println("-------------------------");
        treeStr.printMyTree(treeStr.root);
        treeStr.add("f");
        System.out.println("-------------------------");
        treeStr.printMyTree(treeStr.root);

        System.out.println();
        System.out.println(treeStr.contains("z"));


        MyRedBlackTree<Integer> treeInt = new MyRedBlackTree<>();

        treeInt.add(5);
        System.out.println("-------------------------");
        treeInt.printMyTree(treeInt.root);
        treeInt.add(6);
        System.out.println("-------------------------");
        treeInt.printMyTree(treeInt.root);
        treeInt.add(12);
        System.out.println("-------------------------");
        treeInt.printMyTree(treeInt.root);
        treeInt.add(45);
        System.out.println("-------------------------");
        treeInt.printMyTree(treeInt.root);
        treeInt.add(7);
        System.out.println("-------------------------");
        treeInt.printMyTree(treeInt.root);
        treeInt.add(9);
        System.out.println("-------------------------");
        treeInt.printMyTree(treeInt.root);

        System.out.println();
        System.out.println(treeInt.contains(99));

    }
}

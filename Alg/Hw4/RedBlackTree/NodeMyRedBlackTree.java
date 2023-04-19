package Alg.Hw4.RedBlackTree;

class NodeMyRedBlackTree<T extends Comparable<T>> {
    NodeMyRedBlackTree<T> parent;
    NodeMyRedBlackTree<T> left;
    NodeMyRedBlackTree<T> right;
    T value;
    ColorMyRedBlackTree color;

//    public NodeMyRedBlackTree() {
//        this.color = ColorMyRedBlackTree.RED;
//    }

    public NodeMyRedBlackTree(T value) {
        this.left = null;
        this.right = null;
        this.parent = null;
        this.value = value;
        this.color = ColorMyRedBlackTree.RED;
    }

    @Override
    public String toString() {
        return "Node{this=" + this.hashCode() +
                ", parent=" + (parent != null ? parent.hashCode() : "null") +
                ", left=" + (left != null ? left.hashCode() : "null") +
                ", right=" + (right != null ? right.hashCode() : "null") +
                ", value=" + value +
                ", color=" + color +
                '}';
    }
}

package Alg.Hw4.RedBlackTree;

public class MyRedBlackTree<T extends Comparable<T>> {
    public NodeMyRedBlackTree<T> root;

    public boolean contains(T value) {
        NodeMyRedBlackTree<T> node = root;

        while (node != null) {
            if (node.value.equals(value)) {
                return true;
            }
            if (node.value.compareTo(value) > 0) {
                node = node.left;

            } else {
                node = node.right;
            }
        }
        return false;
    }

    public boolean add(T value) {
        if (root == null) {
            root = new NodeMyRedBlackTree<>(value);
            root.color = ColorMyRedBlackTree.BLACK;
            return true;
        }
        return add(value, root);
    }

    private boolean add(T value, NodeMyRedBlackTree<T> firstNode) {
        if (firstNode.value.equals(value)) {
            return false;
        }
        if (firstNode.value.compareTo(value) > 0) {
            if (firstNode.left == null) {
                firstNode.left = new NodeMyRedBlackTree<>(value);
                firstNode.left.parent = firstNode;
                balance(firstNode.left);
                return true;
            }
            return add(value, firstNode.left);
        } else {
            if (firstNode.right == null) {
                firstNode.right = new NodeMyRedBlackTree<>(value);
                firstNode.right.parent = firstNode;
                balance(firstNode.right);
                return true;
            } else {
                return add(value, firstNode.right);
            }
        }
    }

    private void balance(NodeMyRedBlackTree<T> node) {
        if (node == null) {
            return;
        }
        if (node.parent != null) {
            if (node.parent.left != null && node.parent.right != null &&
                    node.parent.right.color == ColorMyRedBlackTree.RED &&
                    node.parent.left.color == ColorMyRedBlackTree.RED) {
                colorSwap(node.parent);
            }
            if (node.parent.right == node && node.color == ColorMyRedBlackTree.RED) {
                leftSwap(node.parent);
                if (node.parent != null) {
                    if (node.parent.left != null) {
                        balance(node.parent.left);
                    }
                    if (node.parent.right != null) {
                        balance(node.parent.right);
                    }
                }
            } else {
                if (node.parent.left == node && (node.color == ColorMyRedBlackTree.RED && node.parent.color == ColorMyRedBlackTree.RED)) {
                    rightSwap(node.parent.parent);
                    colorSwap(node.parent);
                    balance(node.parent.right.left);
                }
            }
        }

    }

    private void colorSwap(NodeMyRedBlackTree<T> node) {
        node.color = ColorMyRedBlackTree.RED;
        node.left.color = ColorMyRedBlackTree.BLACK;
        node.right.color = ColorMyRedBlackTree.BLACK;
        if (node == root) {
            node.color = ColorMyRedBlackTree.BLACK;
        }
        balance(node);
    }

    private void leftSwap(NodeMyRedBlackTree<T> node) {
        NodeMyRedBlackTree<T> parentNode = node.parent;
        NodeMyRedBlackTree<T> childNode = node.right;
        node.right = childNode.left;
        childNode.left = node;
        node.parent = childNode;
        childNode.parent = parentNode;
        if (parentNode != null) {
            if (parentNode.left == node) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
        } else {
            root = childNode;
        }
        node.color = ColorMyRedBlackTree.RED;
        childNode.color = ColorMyRedBlackTree.BLACK;
    }

    private void rightSwap(NodeMyRedBlackTree<T> node) {
        NodeMyRedBlackTree<T> parentNode = node.parent;
        NodeMyRedBlackTree<T> childNode = node.left;
        node.left = childNode.right;
        childNode.right = node;
        node.parent = childNode;
        childNode.parent = parentNode;
        if (parentNode != null) {
            if (parentNode.left == node) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
        } else {
            root = childNode;
        }
        node.color = ColorMyRedBlackTree.RED;
        childNode.color = ColorMyRedBlackTree.BLACK;
    }

    public void printMyTree(NodeMyRedBlackTree<T> node) {
        if (node != null) {
            System.out.println(node);
            printMyTree(node.left);
            printMyTree(node.right);
        }
    }


}

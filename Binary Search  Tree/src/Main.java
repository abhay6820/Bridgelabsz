// Define the INode interface with the necessary methods
interface INode<K extends Comparable<K>> {
    K getKey();
    void setKey(K key);
    INode<K> getLeft();
    void setLeft(INode<K> left);
    INode<K> getRight();
    void setRight(INode<K> right);
}

// Create the MyBinaryNode class implementing the INode interface
class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
    private K key;
    private INode<K> left;
    private INode<K> right;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getLeft() {
        return left;
    }

    @Override
    public void setLeft(INode<K> left) {
        this.left = left;
    }

    @Override
    public INode<K> getRight() {
        return right;
    }

    @Override
    public void setRight(INode<K> right) {
        this.right = right;
    }
}

// Define the BinaryTree class to manage the binary tree
class BinaryTree<K extends Comparable<K>> {
    private INode<K> root;

    public BinaryTree() {
        this.root = null;
    }

    // UC 1: Add nodes to create a BST
    public void add(K key) {
        root = addRec(root, key);
    }

    private INode<K> addRec(INode<K> root, K key) {
        if (root == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(root.getKey()) < 0) {
            root.setLeft(addRec(root.getLeft(), key));
        } else if (key.compareTo(root.getKey()) > 0) {
            root.setRight(addRec(root.getRight(), key));
        }

        return root;
    }

    // UC 2: Check if all nodes are added using the size method
    public int size() {
        return sizeRec(root);
    }

    private int sizeRec(INode<K> root) {
        if (root == null) {
            return 0;
        }

        return 1 + sizeRec(root.getLeft()) + sizeRec(root.getRight());
    }

    // UC 3: Search for a key in the binary tree
    public boolean search(K key) {
        return searchRec(root, key);
    }

    private boolean searchRec(INode<K> root, K key) {
        if (root == null) {
            return false;
        }

        if (key.equals(root.getKey())) {
            return true;
        }

        if (key.compareTo(root.getKey()) < 0) {
            return searchRec(root.getLeft(), key);
        } else {
            return searchRec(root.getRight(), key);
        }
    }
}

// Main class to test the binary tree operations
public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        // UC 1: Add nodes to create a BST
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        // UC 2: Check if all nodes are added using the size method
        System.out.println("Size of the binary tree: " + binaryTree.size()); // Should print 3

        // UC 3: Search for a key in the binary tree
        System.out.println("Is 63 present in the binary tree? " + binaryTree.search(63)); // Should print false
    }
}

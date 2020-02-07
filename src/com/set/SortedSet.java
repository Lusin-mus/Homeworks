package com.set;

/**
 * This generic class is the sorted set implementation using binary search tree algorithm
 * The class accept objects that implement the Comparable interface and contains no duplicate elements
 * The class has getSize(), add(), remove() and contains() methods
 *
 * @param <T> the type of elements maintained by this set
 * @see Set interface
 */
class SortedSet<T extends Comparable<T>> implements Set<T> {

    /**
     * Nested  Node class
     */

    class Node {
        T data;
        Node left;
        Node right;

        /**
         * Node class constructor
         *
         * @param data is defined, left and right fields are defined null at the beginning
         */

        Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node root;

    /**
     * Constructor of the SortedSet class, root is defined null at the beginning
     */
    SortedSet() {
        root = null;

    }

    /**
     * The method is overridden from the Set interface
     * @return this method calls another method
     * in the same name which returns the size of the set
     */

    @Override
    public int getSize() {
        return getSize(root);
    }

    /**
     * The method is overridden from the Set interface
     * this method calls another method in the same name
     * which adds a new element in the set
     * @param data  T type data that implements the Comparable interface
     */

    @Override
    public void add(T data) {
        root = add(root, data);
    }

    /**
     * The method is overridden from the Set interface
     * this method calls another method in the same name
     * which removes specified element in the set if exists
     * @param data  T type data that implements the Comparable interface
     */

    @Override
    public void remove(T data) {
        root = remove(root, data);
    }

    /**
     * The method is overridden from the Set interface
     * this method calls another method in the same name which checks
     * if the set contains the specified element
     * @param data  T type data that implements the Comparable interface
     */

    @Override
    public void contains(T data) {
        System.out.println(contains(root, data));
    }

    /**
     * Returns the count of elements
     * @param root is the middle element of the set
     * which has left (smaller elements) and right (bigger elements) sides
     * @return gives the quantity of elements in the set, counting root, left and right elements
     */

    private int getSize(Node root) {
        if (root == null) return (0);
        else {
            return (getSize(root.left) + 1 + getSize(root.right));
        }
    }
    /**
     * Adds the specified element to the set if it is not already present
     * If the set already contains the element, the call leaves the set
     * unchanged and returns {@code false}.  Set never contain
     * duplicate elements.     *
     * @param  data is the element of the type T  to be added to this set
     * @return {@code true} if this set did not already contain the specified
     *         element
     * @throws UnsupportedOperationException if the {@code add} operation
     *         is not supported by this set
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this set
     * @throws NullPointerException if the specified element is null and this
     *         set does not permit null elements
     */
    private Node add(Node root, T data) {

        if (root == null) {
            return new Node(data);
        } else if (data.compareTo(root.data) < 0) {
            root.left = add(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = add(root.right, data);
        } else {
            return root;
        }

        return root;
    }

    /**
     * Removes the specified element from the set if it is present
     * @param data is the element of the type T  to be removed from the set if it is present
     * @return {@code true} if this set contained the specified element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this set
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null and this
     *         set does not permit null elements
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws UnsupportedOperationException if the {@code remove} operation
     *         is not supported by this set
     */
    private Node remove(Node root, T data) {
        if (root == null) {
            return null;
        } else if (data.compareTo(root.data) < 0) {
            root.left = remove(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = remove(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
        }
        return root;
    }

    /**
     * Returns {@code true} if this set contains the specified element,
     * if this set contains an element {@code e} such that
     * {@code Objects.equals(o, e)}.
     * @param data is the element of the type T  to be tested
     * @return {@code true} if this set contains the specified element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this set
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     * @throws NullPointerException if the specified element is null because
     *      the   set does not permit null elements
     * (<a href="Collection.html#optional-restrictions">optional</a>)
     */
    private boolean contains(Node root, T data) {

        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        return (data.compareTo(root.data) < 0)
                ? contains(root.left, data)
                : contains(root.right, data);
    }

    /**
     * The print() method calls another method in the same name which the set data
     */

    void print() {
        System.out.print("Print SortedSet:");
        print(root);
        System.out.println();
    }

    /**
     * This method traverse and print set elements, left elements, root and right side elements
     * @param root is the start point to find the order of sorted tree
     */
    private void print(Node root) {
        if (root == null)
            return;
        print(root.left);
        System.out.print(" " + root.data);
        print(root.right);
    }
}

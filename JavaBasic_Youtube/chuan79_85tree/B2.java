package chuan79_85tree;

import java.awt.*;

public class B2<Key extends Comparable<Key>, Value> {
    private Node root;
    private int N;

    private class Node {
        public Key key;
        private Value value;
        public Node left;
        public Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public int size() {
        return N;
    }

    public void put(Value value, Key key) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) {
            N++;
            return new Node(key, value, null, null);
        }
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else {
            //  if key = x.key;
            x.value = value;
        }
        return x;
    }
}

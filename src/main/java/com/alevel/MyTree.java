package com.alevel;

public class MyTree <K, V> {

    private K key;
    private V value;
    private MyTree<K, V> left;
    private MyTree<K, V> right;

    private MyTree(K key, V value, MyTree<K, V> left, MyTree<K, V> right) {
        this.left = left;
        this.right = right;
        this.value = value;
        this.key = key;
    }

    public MyTree<K, V> getLeft() {
        return left;
    }

    public MyTree<K, V> getRight() {
        return right;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public static <K, V> Builder<K, V> builder(K key, V value) {
        return new Builder<>(key, value);
    }

    public static class Builder <K, V>{
        private K key;
        private V value;
        private MyTree<K, V> left;
        private MyTree<K, V> right;

        public Builder(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public Builder<K, V> left(MyTree<K, V> left) {
            this.left = left;
            return this;
        }
        public Builder<K, V> right(MyTree<K, V> right) {
            this.right = right;
            return this;
        }
        public MyTree<K, V> build() {
            return new MyTree<>(this.key, this.value, this.left, this.right);
        }
    }
}

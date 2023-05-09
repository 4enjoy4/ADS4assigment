import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class MyHashTable <K, V> {
    private class HashNode <K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;
        public HashNode(K key, V value){
            this.key = key;
            this.value = value;
        }
        @Override
        public  String toString(){
            return "{" + key +" "+ value + "}";
        }
    }
    private HashNode <K, V>[] arr;
    private int M = 11;
    private int size;
    public MyHashTable(){
        this.arr = new HashNode[M];
    };
    public MyHashTable(int M){
        this.M = M;
        this.arr = new HashNode[M];
    };
    private int Hash(K key){
        return Math.abs(key.hashCode()%M);
    };
    public void put(K key, V value){
        int index = Hash(key);
        HashNode<K, V> node = arr[index];
        while(node != null){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
            node= node.next;
        }
        size++;
    };
    public V get(K key){
        int index = Hash(key);
        HashNode<K, V> node = arr[index];
        while(node != null){
            if(node.key.equals(key)){
                return node.value;
            }
            node = node.next;
        }
        return null;
    };
    public V remove(K key){
        int index = Hash(key);
        HashNode<K, V> node = arr[index];
        HashNode<K, V> prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    arr[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return node.value;
            }
            prev = node;
            node = node.next;
        }
        return null;
    };
    public int size(){
        return size;
    };
    public boolean contains(V value){
        for (int i = 0; i < M; i++) {
            HashNode<K, V> node = arr[i];
            while (node != null) {
                if (node.value.equals(value)) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    };
    public K getKey(V value){
        for (int i = 0; i < M; i++) {
            HashNode<K, V> node = arr[i];

            while (node != null) {
                if (node.value.equals(value)) {
                    return node.key;
                }

                node = node.next;
            }
        }

        return null;
    }
    };



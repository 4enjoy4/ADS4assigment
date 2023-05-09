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
        
        size++;
    };
    public V get(K key){
        return null;
    };
    public V remove(K key){
        return null;
    };
    public int size(){
        return size;
    };
    public boolean contains(V value){
        if(size == 0){
            return false;
        }
        return true;
    };
    public K getKey(V value){
        return null;
    };

}

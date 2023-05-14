import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MyHashTable<String, Integer> table1 = new MyHashTable<>();
        table1.put("Keyboard", 3);
        table1.put("monitor", 2);
        table1.put("mousePud", 4);
        table1.put("mouse", 1);
        System.out.println(table1.get("Keyboard"));
        table1.remove("Keyboard");
        System.out.println(table1.get("Keyboard"));
        System.out.println(table1.getKey(2));
        MyHashTable<Integer, Integer> table = new MyHashTable<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int key = random.nextInt(1000);
            int value = random.nextInt(1000);
            table.put(key, value);
        }
        System.out.println("Hash table contents:");
        for(int i =0; i < table.size(); i++){
            System.out.println(table.getBucketSize(i));
        }
    }
}
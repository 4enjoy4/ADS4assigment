import java.util.Random;

public class MyTestingClass {
    public static void main(String[] args) {
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





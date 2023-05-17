import java.util.Random;

public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass() {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


     // Custom hashCode implementation that uses the id and name fields to calculate the hash code.
     // The hash code is calculated using a simple formula that combines the hash codes of the two fields and multiplies them together with a prime number (31 in this case).

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        return result;
    }
    public void getRandom(){
        MyHashTable<Integer, String> table = new MyHashTable<>();
        Random rand = new Random();
        int bucketSize = 0;
        for(int i =0; i < 1000; i++){
        int key = rand.nextInt(1000);
        String value = "Value" + rand.nextInt(1000);
        table.put(key, value);
        bucketSize = table.getBucketSize(table.hash(key));
        }
        System.out.println(bucketSize);
    }
}





public class Main {
    public static void main(String[] args) {

        MyHashTable<String, Integer> table = new MyHashTable<>();
        table.put("Keyboard", 3);
        table.put("monitor", 2);
        table.put("mousePud", 4);
        table.put("mouse", 1);
        System.out.println(table.get("Keyboard"));
        table.remove("Keyboard");
        System.out.println(table.get("Keyboard"));
        System.out.println(table.getKey(2));

    }
}
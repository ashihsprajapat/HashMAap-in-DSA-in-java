# HashMAap-in-DSA-in-java
all operation of HashMap which build by java collection fremwork
import java.util.HashMap;
import java.util.Set;

public class hashmapComplete {
    public static void main(String[] args) {
        // create hash map
        HashMap<String, Integer> hm = new HashMap<>();
        // Operations
        // put
        hm.put("Ashish", 22);
        hm.put("Abhishek", 23);
        hm.put("Anuj", 24);
        hm.put("vishnu", 12);
        System.out.println(hm);

        // size()
        System.out.println(hm.size());

        // remove operation
        System.out.println(hm.remove("Anuj"));
        System.out.println(hm.size());

        // get operation
        System.out.println(hm.get("Ashish"));

        // containsKey operation
        System.out.println(hm.containsKey("Abhishek"));

        // isEmpty
        System.out.println(hm.isEmpty());

        // Iteration on hash map
        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println(k);
        }
    }
}

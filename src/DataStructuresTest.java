import dictionaries.Dictionary;
import dictionaries.HashMap;

public class DataStructuresTest {
    public static void main(String[] args) throws Exception {
        Dictionary<String, String> map = new HashMap();
        map.put("eevee", "I love Eevee!");
        System.out.println(map.containsKey("eevee"));
        System.out.println(map.get("eevee"));
        System.out.println(map.containsValue("I love Eevee!"));
        System.out.println(map.containsValue("I love Ekans too!"));

        map.put("ekans", "I love Ekans too!");
        System.out.println(map.containsKey("ekans"));

        map.replace("eevee", "I adore Eevee!");
        System.out.println(map.get("eevee"));

        map.remove("eevee");
        System.out.println(map.containsKey("eevee"));
        System.out.println(map.containsKey("ekans"));
    }
}

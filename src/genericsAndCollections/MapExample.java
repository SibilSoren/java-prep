package genericsAndCollections;

import java.util.HashMap;

public class MapExample {
    static void main() {
        HashMap<String,String> names = new HashMap<>();
        names.put("sibil@mail.com","Sibil");
        names.put("kunal@gmail.com","Kunal");

        for(String email: names.values()){
            System.out.println(email);
        }
    }
}

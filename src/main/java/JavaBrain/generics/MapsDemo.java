package JavaBrain.generics;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
       // Map<String, Date> m = new HashMap();
        Map<String, String> m = new HashMap();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        m.put("one",formatter.format(date));
        System.out.println(m.get("one"));
    }
}

package behavioral.template_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Extractor<T> {
    public abstract T extractOne(Character character);

    public void extractAll(String rs) {
        List<T> result = new ArrayList<T>();
        int index = 0;
        while (index < rs.length()) {
            result.add(extractOne(rs.charAt(index)));
            index++;
        }
        System.out.println(result);
    }
}

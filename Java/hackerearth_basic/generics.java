import java.util.ArrayList;
import java.util.Collection;

public class generics{
    public static void main(String[] args) {
        Collection<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        System.out.println(values);
    }
}
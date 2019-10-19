import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergey
 */
public class MapLauncher {

    public static void main(String[] args) {
        HashMap<Car,Integer> numbers=new HashMap<Car,Integer>();

        numbers.put(new Car("Toyota","Corolla",50),50);
        numbers.put(new Car("Audi","A5",50),52);
        numbers.put(new Car("BMW","RX",50),53);
       // for(Map.Entry<Car, Integer> entry: numbers.entrySet())
        //System.out.println(entry.getValue(new Car("Audi","A5",50)));
        System.out.println(numbers.get(new Car("Audi","A5",50)));
        System.out.println(numbers.containsKey(new Car("Audi","A5",50)));
    }

}

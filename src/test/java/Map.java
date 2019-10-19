import java.util.HashMap;

/**
 * Created by Sergey
 */
public class Map {

    public static void main(String[] args) {
        HashMap<Cat,Integer> map =new HashMap<>();
        Cat cat1=new Cat("Marusya",8);
        Cat cat2=new Cat("Garik",7);


        map.put(cat1,7);
        map.put(cat2,10);

        System.out.println(map.get(cat2));

    }


}

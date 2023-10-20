import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class shuffle {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);

        System.out.println("Array before Shuffle: " + newList);

        Collections.shuffle(newList);
        System.out.println("Array after shuffle: " + newList);

    }
}
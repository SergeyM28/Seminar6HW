import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
        public static void main(String[] args) {
                ImmutableList im = new ImmutableList(new ArrayList<>(Arrays.asList(1, 2, 3)));
                System.out.println(im.getSize());
                System.out.println(im.get(1));

                List<Integer> myList = new ArrayList<>();
                myList.add(1);
                myList.add(2);
                myList.add(3);

                MutableList ml = new MutableList(myList);
                ml.addElem(4);
                System.out.println(ml.baseList);
                ml.setElem(0, 100);
                ml.removeElem(4);
                System.out.println(ml.baseList);
        }
}

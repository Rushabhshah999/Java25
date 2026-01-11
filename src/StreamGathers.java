import java.util.ArrayList;
import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class StreamGathers {

    public static void main(){

        System.out.println("output");

        List<List<Integer>> inpiutList = Stream.of(1,2,3,4,5,6,7)
                .gather(Gatherers.windowFixed(2)).toList();

        System.out.println(inpiutList); // [[1, 2], [3, 4], [5, 6], [7]]


        List<List<Integer>> inpiutList1 = Stream.of(1,2,3,4,5,6,7)
                .gather(Gatherers.windowSliding(3)).toList();

        System.out.println(inpiutList1); // [[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5, 6], [5, 6, 7]]

        // before
        int windowSize = 2;
        List<List<List<Integer>>> windows = new ArrayList<>();

        for (int i = 0; i < inpiutList.size(); i += windowSize) {
            List<List<Integer>> intList =  inpiutList.subList(i, Math.min(i + windowSize, inpiutList.size()));
            windows.add(intList);
        }
        System.out.println(windows); //[[[1, 2], [3, 4]], [[5, 6], [7]]]



    }


}

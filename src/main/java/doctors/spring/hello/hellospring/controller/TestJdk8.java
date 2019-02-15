package doctors.spring.hello.hellospring.controller;

import com.google.common.collect.*;

import java.util.*;

/**
 * @author chenjunlin
 * @date 2019-02-14
 */
public class TestJdk8 {
    public static void main(String[] args) {

        /*List<Integer> numbers = new ArrayList<>();

        numbers.forEach(integer -> System.out.println(integer));*/


        /*Iterator<Integer> powersOfTwo = new AbstractSequentialIterator<Integer>(1) { // note the initial value!
            protected Integer computeNext(Integer previous) {
                return (previous == 1 << 30) ? null : previous * 2;
            }
        };*/

        HashMap<Integer, String> map = new HashMap(16);
        map.put(7, "");
        map.put(11, "");
        map.put(43, "");
        map.put(59, "");
        map.put(19, "");
        map.put(3, "");
        map.put(35, "");

        System.out.println("遍历结果：");
        for (Integer key : map.keySet()) {
            System.out.print(key + " -> ");
        }
        System.out.println();

        Set<String> animals = ImmutableSet.of("gerbil", "hamster");
        Set<String> fruits = ImmutableSet.of("apple", "orange", "banana");

        Set<List<String>> product = Sets.cartesianProduct(animals, fruits);

        Set<Set<String>> animalSets = Sets.powerSet(animals);

        /**
         * formap
         */
        Map<String, Integer> maps = ImmutableMap.of("a", 1, "b", 1, "c", 2);
        SetMultimap<String, Integer> multimap = Multimaps.forMap(maps);
        MultimapTester<Integer, String> inverse = Multimaps.invertFrom(multimap, HashMultimap.<Integer, String> create());
        System.out.println("++++++++"+inverse);
        System.out.println();

        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(1, 10));
        rangeSet.add(Range.closedOpen(11, 15));
        rangeSet.add(Range.closedOpen(15, 20));
        rangeSet.add(Range.openClosed(0, 0));
        rangeSet.remove(Range.open(5, 10));
        System.out.println(rangeSet+"=======");



        /*Map<String, Integer> imap = ImmutableMap.of("a", 4, "b", 9);
        Function<Integer, Double> sqrt =
                new Function<Integer, Double>() {
                    public Double apply(Integer in) {
                        return Math.sqrt((int) in);
                    }
                };
        Map<String, Double> transformed = Maps.transformValues(imap, sqrt);
        System.out.println(transformed);*/
    }
}

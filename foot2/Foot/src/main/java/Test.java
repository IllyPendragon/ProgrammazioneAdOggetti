import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import it.univpm.Foot.filter.StatsFilter;
import it.univpm.Foot.model.AverageNameAndNumOfGoalsScorers;

public class Test {

public static void main(String args[]) {

    String[] stringArray = { "name1", "name1", "name2", "name2", "name2", "name2", "name2", "name2", "name2", "name2", "name3", "name3", "name3","name4", "name4", "name4", "name4" };
    //countStringOccurence(stringArray);
    //countStringOccurenceUsingStream(stringArray);
    String result = StatsFilter.highestRepeated(stringArray);
    System.out.println("result="+result);
    result = StatsFilter.theLeastRepeated(stringArray);
    System.out.println("result="+result);
}



//private static void countStringOccurenceUsingStream(String[] stringArray) {
//    // TODO Auto-generated method stub
//    Arrays.stream(stringArray).collect(Collectors.groupingBy(s -> s))
//            .forEach((k, v) -> System.out.println(k + "   -->   " + v.size()));
//}
//
//private static void countStringOccurence(String[] stringArray) {
//    // TODO Auto-generated method stub
//    Map<String, Integer> map = new HashMap<String, Integer>();
//    for (String s : stringArray) {
//        if (map.containsKey(s)) {
//            map.put(s, map.get(s) + 1);
//        } else {
//            map.put(s, 1);
//        }
//    }
//
//    for (Map.Entry<String, Integer> entry : map.entrySet()) {
//        System.out.println(entry.getKey() + "   -->   " + entry.getValue());
//    }
//
//}
}
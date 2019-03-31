package interview.datastructure.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: Junjia
 * @Date: 2019-03-30 20:34
 * @Description: 如何找出数组中重复元素最多的数
 */
public class Test {
    public static int findMostFrequentInArray(int[] a) {
        int result = 0;
        int size = a.length;
        if (size == 0) {
            return Integer.MAX_VALUE;
        }
        // 记录每个元素出现的次数
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (m.containsKey(a[i])) {
                m.put(a[i], m.get(a[i]) + 1);
            } else {
                m.put(a[i], 1);
            }
        }
        // 找出出现次数最多的元素
        int most = 0;
        Iterator iter = m.entrySet().iterator();
        while (((Iterator) iter).hasNext()) {
            Map.Entry enter = (Map.Entry) iter.next();
            int key = (Integer) enter.getKey();
            int val = (Integer) enter.getValue();
            if (val > most) {
                result = key;
                most = val;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int array[] = {1, 5, 4, 3, 4, 4, 5, 4, 5, 5, 6, 6, 6, 6, 6};
        int maxFreNum = findMostFrequentInArray(array);
        System.out.println(maxFreNum);
    }
}

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {

            int cur = tangerine[i];

            if (!map.containsKey(cur)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, (a, b) -> b - a);

        int answer = 0;
        for (int i : list) {
            System.out.println(i);
            if (k <= 0) {
                return answer;
            }
            k -= i;
            answer++;
        }

        return answer;
    }
}
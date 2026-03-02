import java.util.*;

class FreqCount {
	void main () {
		int arr [] = {1,2,2,3,1,4};
		Map<Integer,Integer> map = new HashMap<>();
		for(int n : arr) {
			if(map.containsKey(n)) {
				 map.put(n,map.get(n)+1);
			}
			else {
				map.put(n,1);
			}
		}
			for(Map.Entry<Integer,Integer> entry : map.entrySet())  {
				IO.println(entry.getKey() + " " + entry.getValue());
			}

	}
}
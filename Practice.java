import java.util.HashMap;
import java.util.Map;

class Practice {
	void main() {
		String s = "dsssssdgd";
		        Map<Character,Integer> map = new HashMap<>();

		    for(int i =0;i<s.length();i++) {
            char currChar = s.charAt(i);
            map.put(currChar,map.getOrDefault(currChar,0)+1);
        }
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			IO.println(entry);
		}
	}
}
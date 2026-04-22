package Math;

class CountFreq {
	void main() {
		int oregional = 1114466667;
		int lastD;      
		int count=0;			     //0
		for(int i=1;i<=9;i++) {
		  int num = oregional;
			count=0;			     //0
		while(num > 0) {                   //true
			 lastD = num%10;            //7
			if(lastD==i) {               //7==1
				count++;
			}
			else {                             //0
				if(count>0) {
						System.out.println(i + " -> " + count);
					}
				count = 0;
			}
			num=num/10;
		}
		if(count>0) {
						System.out.println(i + " -> " + count);
		}
		}
	}
}
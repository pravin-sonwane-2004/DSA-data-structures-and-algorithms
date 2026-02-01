package Math;

class FCAAP {
	void main() {
		int num = 11224456;
		int oregional = num;
		int count = 0;
		for(int i=1;i<=9;i++) {
			
			num = oregional;          //
			count = 0;

			while(num>0) {             //    1122445 > 0
				int lastDigit = num %10;         //5
				if(lastDigit == i) {             //5==i
					count++;                     //1
				}
				else {
					if(count>0) {
						System.out.println(i + " -> " + count);
					}
					count = 0;
				}
				num = num/10;                       // 1122445
			}
		}
	}
}
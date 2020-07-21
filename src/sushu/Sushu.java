package sushu;

public class Sushu {
	
	public static void Method1() {
		boolean flag = true;
		long start = System.currentTimeMillis();  //compute the running time(ms)
		for(int i=2; i<=1000; i++ ) {
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(i);
			}
			flag = true;
		}
		long end = System.currentTimeMillis();  
		System.out.println(end-start);
	}

	public static void Method2() {
		boolean flag = true;
		long start = System.currentTimeMillis();
		for(int i=2;i<1000;i++) {
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					flag = false;
					break;   //如果用i求余为0，已经判定为合数，后面大于2的因数不用再计算了
				}
			}
			if(flag) {
				System.out.println(i);
			}
			flag = true;
		}
		long end = System.currentTimeMillis();
		System.out.print(end-start);
	}
	
	public static void Method3() {
		boolean flag = true;
		long start = System.currentTimeMillis();
		for(int i=2;i<1000;i++) {
			for(int j=2;j<=Math.sqrt(i);j++) { //只需判断前半部分，需要遍历的数少了根号倍
				if(i%j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
			flag = true;
		}
		long end = System.currentTimeMillis();
		System.out.print(end-start);
	}
	
	
	public static void main(String[] args) {
		// Method1();
		// Method2();
		 Method3();
	}

	
}

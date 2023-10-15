public class TypeCasting {

	public static void main(String[] args) {
		TypeCasting no = new TypeCasting();
		int num = 2972;
		int res = no.palindrom(num);
		System.out.println(res);
		if(num == res) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrome");
		}
	}

	private int palindrom(int i) {
		int sum = 0;
		while(i > 0) {
			int rem = i % 10;
			sum = (sum*10) + rem;
			i = i/10;		
		}
		return sum;
		
	}

}

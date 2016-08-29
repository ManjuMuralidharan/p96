package p96;

public class p96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		if(a>10)
		{
			String s1=String.valueOf(a);
			int l=s1.length();
			int first=s1.charAt(0);
			int last=s1.charAt(l-1);
			int sum=(first-48)+(last-48);
			System.out.println("sum - "+sum);
		}
		else
		{
			System.out.println("sum - "+a);
		}
		
		
		
		
	}

}

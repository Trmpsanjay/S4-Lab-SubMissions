import java.util.*;
class ReverseStringUsingStack{
	public static String reverse(Stack<Character> s){
		String ans = "";
		while(s.size()!=0){
			ans = ans + s.pop();
		}
		return ans;

	}
	public static void main(String[] args) {
		Stack<Character> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		for(int i=0;i<str.length();i++){
			s.push(str.charAt(i));
		}
		String p =reverse(s);
		System.out.println(p);
	

	}
}

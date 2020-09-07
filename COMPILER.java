import java.io.*;
import java.util.Stack;
class CompilersAndParsers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String str = br.readLine();
			Stack<Character>  stk = new Stack<Character>();
			int max = 0;
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				if(stk.isEmpty()) {
					if(str.charAt(i) == '<') {
						stk.push(str.charAt(i));
						count++;
					}
					else
						break;
				}
				else {
					if(str.charAt(i) == '<') {
						stk.push(str.charAt(i));
						count++;
					}
					else{
						stk.pop();
						count--;
					}
				}
				if(count==0)
					max=i+1;
				if(count<0)
					break;
			}
			System.out.println(max);
		}

	}

}

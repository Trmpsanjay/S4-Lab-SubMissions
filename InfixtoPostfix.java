import java.util.*;
class stk{
 char arr[]=new char[100];
 char item;  
 int size;
 int top=-1;
 stk(int s){
   size=s;
   top=-1;
 }
 void push(char d){
  if(top==size-1){
    System.out.println("stack overflow");
  }
  else{
   top++;
   item=d;
   arr[top]=item;
  }
 }
 char pop(){
  if(top==-1){
  return 0;   
  }
  else{
   item=arr[top];
   top--;
  }
  return item;
 }
 char peek(){
  return arr[top];
 }
 void display(){
   System.out.println("stack elements");
  for(int i=top;i>=0;i--){
    System.out.println(arr[i]);
   }
  }
 boolean isEmpty() {
    if (top==-1) {
        return true;
    } else {
        return false;
    }
  }
  boolean isFull() {
    if (top==size-1) {
        return true;
    } else {
        return false;
    }
  }
}

class InfixtoPostfix
{ 
	
	static int priority(char ch) 
	{ 
		
		
		if((ch=='+')||(ch=='-'))
			return 1; 
	
		else if((ch=='*')||(ch=='/')) 
			return 2; 
	
		else if(ch=='^') 
			return 3; 
		
                
                       return -1; 
	} 

	static String convert(String exp){

        String result = "";
        stk stack = new stk(exp.length());
        for (int i = 0; i <exp.length() ; i++) {
            char c = exp.charAt(i);

            
            if(priority(c)>0){
                while(!stack.isEmpty() && priority(stack.peek())>=priority(c)){
                    if(stack.peek()=='(')
                        return "invalid expression"; 
                    result += stack.pop();
                }
                stack.push(c);
            }
            else if(c==')'){
                char x = stack.pop();
                while(!stack.isEmpty() && x!='('){
                    result += x;
                    if(!stack.isEmpty() && stack.peek()!='(')
                     return "invalid expression";
                    x = stack.pop();
                }
            }
            else if(c=='('){
                stack.push(c);
            }
            else{
                
                result += c;
            }
        }
        while(!stack.isEmpty()) {
            if(stack.peek()=='(')
             return "invalid expression"; 
            result += stack.pop();
           
        }
        return result;
    }
	
	public static void main(String[] args) 
	{ 
                Scanner sc=new Scanner(System.in);
                System.out.println("enter a string");
		String exp = new String();
                exp=sc.next();
		System.out.println(convert(exp)); 
	} 
} 

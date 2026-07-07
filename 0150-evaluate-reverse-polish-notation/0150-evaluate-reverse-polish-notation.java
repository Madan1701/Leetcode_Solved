class Solution {
    public int evalRPN(String[] s) {
         Stack<Integer> stack = new Stack<>();
         for(String a: s){
            if(a.equals("+")){
                int b = stack.pop();
                int x = stack.pop();
                stack.push(x+b);
            }
            else if(a.equals("-")){
                int b = stack.pop();
                int x = stack.pop();
                stack.push(x-b);

            }
            else if(a.equals("*")){
                int b = stack.pop();
                int x = stack.pop();
                stack.push(x*b);
            }
            else if(a.equals("/")){
                int b = stack.pop();
                int x = stack.pop();
                stack.push(x/b);
            }
            else{
                stack.push(Integer.parseInt(a));
            }
         }   
         return stack.pop();
          

       
    }
}
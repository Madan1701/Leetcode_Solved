class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int n = operations.length;

        for (int i = 0; i < n; i++) {
            String s = operations[i];

            if (s.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();

                stack.push(a);
                stack.push(a + b);
            }
            else if (s.equals("D")) {
                stack.push(stack.peek() * 2);
            }
            else if (s.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }

        int sum = 0;

        for (int num : stack) {
            sum += num;
        }

        return sum;
    }
}
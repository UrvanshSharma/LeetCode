import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") &&
                !tokens[i].equals("*") && !tokens[i].equals("/")) {

                st.push(Integer.parseInt(tokens[i]));
            } else {
                int b = st.pop();
                int a = st.pop();

                if (tokens[i].equals("+")) {
                    st.push(a + b);
                } else if (tokens[i].equals("-")) {
                    st.push(a - b);
                } else if (tokens[i].equals("*")) {
                    st.push(a * b);
                } else if (tokens[i].equals("/")) {
                    st.push(a / b);
                }
            }
        }

        return st.pop();
    }
}
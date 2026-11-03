
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && asteroid < 0 && !st.isEmpty() && st.peek() > 0) {
                if (st.peek() < -asteroid) {
                    st.pop();
                } 
                else if (st.peek() == -asteroid) {
                    st.pop();
                    alive = false;
                } 
                else {
                    alive = false;
                }
            }

            if (alive) {
                st.push(asteroid);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}

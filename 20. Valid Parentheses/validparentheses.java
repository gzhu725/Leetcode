import java.util.*;

class validparentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('[', ']');
        hm.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                st.push(c);
            } else {
                if (st.isEmpty() || hm.get(st.peek()) != c) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}

// validparentheses solution = new validparentheses();
// System.out.println(solution.isValid("[]()"));
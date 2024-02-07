import java.util.*;

public class ruf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        String s = in.next();
        w = w.toLowerCase();
        s = s.toLowerCase();
        int count = fun(s, w);
        System.out.println(count);
    }

    public static int fun(String s, String w) {
        if (s.isEmpty()) {
            return 0;
        }

        if (s.startsWith(w)) {
            // If the current substring starts with the word, recursively call with count + 1
            return 1 + fun(s.substring(w.length()), w);
        } else {
            // If the current substring doesn't start with the word, recursively call with the same count
            return fun(s.substring(1), w);
        }
    }
}

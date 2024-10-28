package SUB_ARRAYS;

// given a string s of lowercase characters, return the count of pairs(i,j) such that i < j ans s[i] is 'a' and s[j] is 'g'
public class CountPairs {
    public static int count(String s) {
        int count = 0;
        int countOfA = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                countOfA++;
            } else if (ch == 'g') {
                count += countOfA;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "bcaggaag";
        int ans = count(s);
        System.out.println(ans);
    }
}

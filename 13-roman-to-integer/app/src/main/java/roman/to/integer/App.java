package roman.to.integer;

import java.util.Map;

public class App {
    private final Map<Character, Integer> romansInt = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static void main(String[] args) {
    }

    public int romanToInt(String s) {
        char[] romans = s.toCharArray();
        int total = 0;

        for (int i = 0; i < romans.length; i++) {
            int current = romansInt.get(romans[i]);

            if (i + 1 != romans.length) {
                int next = romansInt.get(romans[i + 1]);

                if (next > current) {
                    total += next - current;
                    i++;
                    continue;
                }
            }

            total += current;
        }

        return total;
    }
}

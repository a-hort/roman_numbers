package de.thro.inf;

public class Roman {
    public static int romanToArabicString(String roman) {
        Integer result = 0;
        Integer last = 0;
        Integer current = 0;

        for(char c : roman.toCharArray()){

            current = parseDigit(c);

            if (current > last) {
                result = result + current - 2*last;
            }
            else
            {
                result += current;
            }

            last = current;
        }

        if (result != null) return result;
        return -1;
    }

    private static Integer parseDigit(char c) {
        switch (c) {
            case 'I': return 1;
            case 'X': return 10;
            case 'V': return 5;
            case 'L': return 50;
            default: return null;
        }

    }
}

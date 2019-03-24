package de.thro.inf;

//TODO: return -1 when there is a letter that is not available in the roman number system
//      The validation does not with 5 -> 1 should not return -1 when the significance of the 1 is two levels higher than the 5
//          for example: VC should work

public class Roman {
    public static int romanToArabicString(String roman) {
        Integer result = 0;
        Integer last = 0;
        Integer current = 0;
        int count = 1;
        int lastFirstDigit = 0;
        int currentFirstDigit = 0;

        for(char c : roman.toCharArray()) {

            current = parseDigit(c);

            // getting the first digit of the "last" number
            String s = String.valueOf(last);
            lastFirstDigit = Integer.valueOf(s.charAt(0)) - 48;

            // getting the first digit of the "current" number
            s = String.valueOf(current);
            currentFirstDigit = Integer.valueOf(s.charAt(0)) - 48;

            if (current > last) {
                // There can't be a number that start with "1" after a number that starts with "5" where
                // the significance of the number with "5" is lower
                // For example: VX should not be possible
                if (lastFirstDigit == 5 && currentFirstDigit == 1) {
                    return -1;
                }
                else {
                    result = result + current - 2*last;
                }
            } else {
                if (current == last) {

                    // There can't be two consecutive numbers that start with a "5"
                    if(lastFirstDigit == 5) {
                        return -1;
                    }

                    count++;

                    if(count > 3){
                        return -1;
                    }

                } else {
                    count = 1;
                }

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
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            default: return null;
        }

    }
}

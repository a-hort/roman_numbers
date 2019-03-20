package de.thro.inf;

public class Roman {
    public static int romanToArabicString(String roman) {
        Integer result = 0;
        Integer last = 0;
        Integer current = 0;
        int count = 1;
        int firstNum = 0;

        for(char c : roman.toCharArray()){

            current = parseDigit(c);

            if (current > last) {
                result = result + current - 2*last;
            }
            else
            {
                if (current == last){
                    String s = String.valueOf(last);
                    firstNum = Integer.valueOf(s.charAt(0)) - 48;
                    if(firstNum == 5){
                        return -1;
                    }
                    count++;
                    if(count > 3){
                        return -1;
                    }
                }else{
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

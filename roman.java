public class roman {
    public static void main(String[] args) {
        System.out.println(romanToInt("MVII"));
        System.out.println("\n");
        System.out.println(romanSwitch("XI"));
        /*
         * I= 1 V= 5 X= 10 L= 50 C= 100 D= 500 M= 1000
         */
    }

    public static int romanToInt(String romanInput) {
        int total = 0;
        for (int i = 0; i < romanInput.length(); i++) {
            if (romanInput.charAt(i) == 'I') {
                total += 1;
            }
            if (romanInput.charAt(i) == 'V') {
                total += 5;
            }
            if (romanInput.charAt(i) == 'X') {
                total += 10;
            }
            if (romanInput.charAt(i) == 'L') {
                total += 50;
            }
            if (romanInput.charAt(i) == 'C') {
                total += 100;
            }
            if (romanInput.charAt(i) == 'D') {
                total += 500;
            }
            if (romanInput.charAt(i) == 'M') {
                total += 1000;
            }
        }
        return total;
    }

    public static int romanSwitch(String romanInput) {

        int total = 0;

        for (int i = 0; i < romanInput.length(); i++) {
            switch (romanInput.charAt(i)) {
                case 'I':
                    total += 1;
                    break;
                case 'V':
                    total += 5;
                    break;
                case 'X':
                    total += 10;
                    break;
                case 'L':
                    total += 50;
                    break;
                case 'C':
                    total += 100;
                    break;
                case 'D':
                    total += 500;
                    break;
                case 'M':
                    total += 1000;
                    break;
            }
        }
        return total;
    }
}

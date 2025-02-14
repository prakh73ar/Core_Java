package learning.oops;

class Alphabets {
    public static void main(String[] args) {
        /*
         * for(char x='A' ;x<='z';x++)
         * {
         * System.out.print(x+" , ");
         * }
         */
        for (int i = 65; i <= 90; i++) {
            // char c=(char)i;//explicit type casting
            System.out.print((char) i + "  ");
        }
        int k = '$';
        System.out.println(k);

        char xy = '$';
        int kh = (int) xy;
        System.out.println(kh);

        int ki = 36;
        char kk = (char) ki;
        System.out.println(kk);

    }
}
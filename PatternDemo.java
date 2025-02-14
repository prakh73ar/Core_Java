package learning.oops;

class PatternDemo {
    public static void main(String[] args) {
        String name = "ADITYA";
        int len = name.length();// find the length of string
        System.out.println("Length of " + name + " is " + len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                char c = name.charAt(j);
                System.out.print(c + " ");

            } // innner close

            System.out.println();
        } // outer close
    }// main close
}// class close
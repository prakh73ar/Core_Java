package learning.oops;

class Pattern {
    public static void main(String[] args) {
        String name = "Prakhar";
        int len = name.length();// find the length of string
        System.out.println("Length of " + name + " is " + len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                // char c=name.charAt(j);
                // System.out.print(c+" ");
                System.out.print(name.charAt(j) + " ");

            } // innner close

            System.out.println();
        } // outer close
    }// main close
}// class close
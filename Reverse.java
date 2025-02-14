package learning.oops;

class Reverse {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int reverseNum = 0;
        while (num > 0) {
            int rem = num % 10;

            reverseNum = reverseNum * 10 + rem;
            num = num / 10;

        }
        System.out.println("Reverse Number of  " + temp + " is " + reverseNum);
        if (temp == reverseNum)
            System.out.println(temp + " is a palindrome");
        else
            System.out.println(temp + " is a not  palindrome");

    }

}
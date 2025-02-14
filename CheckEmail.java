package learning.oops;

class CheckEmail {
    public static void main(String[] args) {
        String email = args[0];
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.');

        System.out.println(atIndex);
        System.out.println(dotIndex);

        if (atIndex == -1 || dotIndex == -1)
            System.out.println("Invalid email");
        else
            System.out.println("Valid email");
    }
}
package learning.oops;

class CommandDemo {
    public static void main(String[] args) {
        // String name=args[0]; // fetching value that is
        // passed as command line
        // System.out.println("Hello " +args[0]);

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            String number = args[i];
            int num = Integer.parseInt(number);
            sum = sum + num;
        }
        System.out.println("Sum of " + args.length + " number is " + sum);

    }
}
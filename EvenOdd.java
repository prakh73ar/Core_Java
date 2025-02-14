package learning.oops;

class EvenOdd {
    public static void main(String[] args) {

        int eCount = 0, oCount = 0;

        for (int i = 0; i < args.length; i++) {
            // String number=args[i];
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0)
                eCount++;
            else
                oCount++;
        }
        System.out.println("totall no of even is " + eCount + " totall no of odd " + oCount);

    }
}
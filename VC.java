package learning.oops;

class VC {
    public static void main(String[] args) {

        int vCount = 0, cCount = 0;
        String name = args[0];
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char alpha = name.charAt(i);
            if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u')
                vCount++;
            else
                cCount++;
        }
        System.out.println("totall no of vowel is " + vCount + " totall no of consonant " + cCount);

    }
}
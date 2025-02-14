package learning.oops;

class MVC {
    public static void main(String[] args) {

        int vCount = 0, cCount = 0;

        for (int i = 0; i < args.length; i++) {
            String name = args[i].toLowerCase();
            vCount = 0;
            cCount = 0;

            for (int j = 0; j < name.length(); j++) {
                char alpha = name.charAt(j);
                if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u')
                    vCount++;
                else
                    cCount++;
            } // inner looop
            System.out.println(
                    "totall no of vowel in name " + name + " are " + vCount + " totall no of consonant are " + cCount);

        } // outer loop

    }
}
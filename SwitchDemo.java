package learning.oops;

class SwitchDemo {
    public static void main(String[] args) {
        String monthName = "may";
        switch (monthName) {
            case "jan":
            case "feb":
            case "dec":
                System.out.println("use blower");
                break;

            case "april":
            case "march":
            case "may":
                System.out.println("use fan");
                break;
        }

    }
}

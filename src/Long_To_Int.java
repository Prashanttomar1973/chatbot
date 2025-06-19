public class Long_To_Int {
    public static void main(String[] args){
        long withinIntRange=12345L;
        int intWithinRange=(int) withinIntRange;
        System.out.println("Scenario 1:");

        System.out.println("Original long value: "+withinIntRange);

        System.out.println("Converted int value: "+intWithinRange);

        System.out.println();

        long beyondIntRange=2147483649L;
        int intBeyondRange=(int) beyondIntRange;

        System.out.println("Scenario 2: ");

        System.out.println("Original long value: "+beyondIntRange);

        System.out.println("Converted int value: "+intBeyondRange);

        System.out.println("Warning: Casting may result in data loss if the long value exceeds Integer.MAX_VALUE");
    }
}

package gov.test;

class IncrementTest {

    public static void main(String[] args) {
        int i = 3;
        System.out.println(i);

        System.out.println(i++); // now 4
        System.out.println();

        int x = 18;
        int y = x;

        x++; // now 19
        System.out.println(x);
        System.out.println(y); // still 18, not changed, only x was


    }
}
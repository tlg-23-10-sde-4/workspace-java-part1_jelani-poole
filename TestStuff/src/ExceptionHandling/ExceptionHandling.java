package ExceptionHandling;

class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int myInt = Integer.parseInt("23"); // put a string like "pants", will not run
        }
        catch (Exception e) {
            System.out.println("Hey! Cant make an Int out of that!");
        }
        finally {
            System.out.println("in the finally block");  // will print with exception or not. no matter what
        }  // also overrides even with no exception
        System.out.println("End here");
    }
}
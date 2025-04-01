public class exceptionHandling {
    public static void main(String[] args){
        int i = 50;
        int j = 0;
        int[] arr = new int[5];
        String str = null;
        try {
            int result = 10 / i;
            if (j==0){
                throw new ArithmeticException("Div by zero");
            }

        } catch (ArithmeticException e) {
            // This block will catch ArithmeticException
            System.out.println("Error: " + e.getMessage());
        }finally {
            // This block will always be executed
            System.out.println("This will always execute.");
        }
    }
}

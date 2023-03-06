public class Numbers {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String operator = args[2];
        
        if ("+".equals(operator)) {
            System.out.println("First WebHook test");
            System.out.println("Add: " + (num1 + num2));
        } else if ("-".equals(operator)) {
            System.out.println("Substract: " + (num1 - num2));
        } else {
            System.out.println("Enter valid operator");
        }
    }
}

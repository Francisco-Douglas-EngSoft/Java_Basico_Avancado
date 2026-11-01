public class instaceOf {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("The object is a String: " + str);
        } else {
            System.out.println("The object is not a String.");
        }
    }
}

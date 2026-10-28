public class op_instanceof {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        
        //O Operador instanceof é usado para verificar 
        // se um objeto é uma instância de uma classe 
        // específica ou implementa uma interface específica.
        if (obj instanceof String) {
            String str = (String) obj; // Cast to String
            System.out.println("The object is a String: " + str);
        } else {
            System.out.println("The object is not a String.");
        }
    }
}
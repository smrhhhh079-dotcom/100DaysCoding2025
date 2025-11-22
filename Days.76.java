package days76;

public class Days76 {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "java";
        String s3 = "";
        String s4 = "Belajar Java Programming";

        System.out.println("=== equals() ===");
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.equals(\"Java\") : " + s1.equals("Java"));

        System.out.println("\n=== equalsIgnoreCase() ===");
        System.out.println("s1.equalsIgnoreCase(s2) : " + s1.equalsIgnoreCase(s2));

        System.out.println("\n=== contains() ===");
        System.out.println("s4.contains(\"Java\") : " + s4.contains("Java"));
        System.out.println("s4.contains(\"Python\") : " + s4.contains("Python"));


        System.out.println("\n=== isEmpty() ===");
        System.out.println("s3.isEmpty() : " + s3.isEmpty());
        System.out.println("s1.isEmpty() : " + s1.isEmpty());
    }
}

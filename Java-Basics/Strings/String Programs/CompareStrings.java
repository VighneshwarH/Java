public class CompareStrings {
    public static void main(String[] args) {
        String a = "Hello", b = "hello";
            if(a.compareTo(b) != 0) {
                System.out.println("Not Equal");
            }
            else{
                System.out.println("Equal");
            }
            if(a.compareToIgnoreCase(b) != 0) {
                System.out.println("Not Equal");
            }
            else{
                System.out.println("Equal");
            }
    }
}

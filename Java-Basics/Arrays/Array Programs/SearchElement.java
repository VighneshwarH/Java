import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean found = false;
        for(int num: arr) {
            if(num == key) { found = true; break; }
        }
        if(found) System.out.println("Found");
        else System.out.println("Not Found");
        sc.close();
    }
}

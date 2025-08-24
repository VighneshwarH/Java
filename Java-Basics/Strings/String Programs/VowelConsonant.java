public class VowelConsonant {
    public static void main(String[] args) {
        String str = "Java Programming";
        int vowels=0, consonants=0;
        str = str.toLowerCase();
        for(char c: str.toCharArray()) {
            if("aeiou".indexOf(c)!=-1) vowels++;
            else if(c>='a' && c<='z') consonants++;
        }
        System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);
    }
}

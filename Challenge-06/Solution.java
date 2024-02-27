import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char Input = input.next().charAt(0);

        VowelsConsonants(Input);
    }

    private static void VowelsConsonants(char Input) {
        switch (Input){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}

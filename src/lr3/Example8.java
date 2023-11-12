package lr3;

public class Example8 {
    public static void main(String[] args) {
        char[] symbols = new char[10];
        char[] vowels = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char sym = 'A';

        for(int i = 0; i < 10; i++)
        {
            boolean flag = true;
            for (char vowel : vowels) {
                if (sym == vowel) {
                    i--;
                    flag = false;
                    break;
                }
            }
            if (flag) symbols[i] = sym;
            sym++;
        }

        for (int i = 0; i < 10; i++){
            System.out.print(symbols[i] + " ");
        }

    }
}

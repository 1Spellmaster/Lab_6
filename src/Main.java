import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();

        translator.addWord("i", "я");
        translator.addWord("you", "ти");
        translator.addWord("we", "ми");
        translator.addWord("love", "люблю");
        translator.addWord("java", "java");
        translator.addWord("hello", "привіт");
        translator.addWord("world", "світ");
        translator.addWord("good", "добрий");
        translator.addWord("morning", "ранок");
        translator.addWord("cat", "кіт");
        translator.addWord("dog", "собака");
        translator.addWord("read", "читаю");
        translator.addWord("book", "книгу");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Додавання слів до словника (порожній рядок - завершити).");
        while (true) {
            System.out.print("Англійське слово: ");
            String english = scanner.nextLine().trim();
            if (english.isEmpty()) {
                break;
            }
            System.out.print("Український переклад: ");
            String ukrainian = scanner.nextLine().trim();
            translator.addWord(english, ukrainian);
        }

        System.out.print("Введіть фразу англійською: ");
        String phrase = scanner.nextLine();

        System.out.println("Переклад: " + translator.translate(phrase));
    }
}

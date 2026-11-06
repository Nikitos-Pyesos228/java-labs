public class z2 {
    public static void main(String[] args) {
        String sentence = "Изучаем разработку приложений на языке Java быстро и легко";


        String[] words = sentence.split("[\\s\\p{Punct}]+");

        if (words.length == 0 || (words.length == 1 && words[0].isEmpty())) {
            System.out.println("Слова не найдены.");
            return;
        }

        String shortestWord = words[0];
        for (String word : words) {
            if (!word.isEmpty() && word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("Исходное предложение: " + sentence);
        System.out.println("Самое короткое слово: \"" + shortestWord + "\" (длина: " + shortestWord.length() + ")");
    }
}
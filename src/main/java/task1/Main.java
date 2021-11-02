package task1;

public class Main {
    public static void main(String[] args) {
        String s = """
                многострочный Это  многострочный текст, длина каждой из строк которого
                больше, чем многострочный ширина страницы в символах
                и тут еще есть текст многострочный""";
        System.out.println(new LeftAlign().alignText(s, 100));
    }
}

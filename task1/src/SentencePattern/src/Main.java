import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Одна из целей Java 7 — предоставить максимально возможное количество вспомогательных\n");
        text.add("методов для считывания файлов и записи информации в них. Разумеется, такие новые методы\n");
        text.add("используют местоположения Path, но разработчики позаботились и о взаимодействии со\n");
        text.add("старыми потоковыми классами из пакета java.io. ");
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^!?]*[.!?]\\s");
        for (String line : text) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}

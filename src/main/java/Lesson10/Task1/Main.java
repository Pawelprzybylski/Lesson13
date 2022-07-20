package Lesson10.Task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\pawel\\IdeaProjects\\FutureCollarsLessons\\src\\main\\java\\Lesson10\\Task1\\PhoneBook.csv");
        String content = Files.readString(file.toPath());

        List<String> data = Arrays.asList(content.split("\r\n"));

        Map<String, List<PhoneBookRecord>> phoneBook = data
                .stream()
                .map(element -> element.split(";"))
                .map(element -> {
                    PhoneBookRecord record = new PhoneBookRecord(
                            element[0],
                            element[1],
                            element[2]
                    );
                    return record;
                })
                .collect(Collectors.groupingBy(PhoneBookRecord::getName));

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (phoneBook.get(name) != null) {
            System.out.println(phoneBook.get(name));
        }
        throw new IllegalArgumentException("Input value is not found");

    }

}

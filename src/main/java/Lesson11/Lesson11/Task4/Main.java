package Lesson11.Lesson11.Task4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> specializations = new ArrayList();
        specializations.add(("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra"));
        specializations.add("Przychodnia:Pediatra");
        specializations.add("Przychodnia:Internista:Laryngolog:Pediatra");

        Set<String> specs = specializations
                .stream()
                .map(spec -> spec.split(":"))
                .flatMap(Arrays::stream)
                .filter(spec -> !spec.contains("Szpital"))
                .filter(spec -> !spec.contains("Przychodnia"))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(specs);

    }

}

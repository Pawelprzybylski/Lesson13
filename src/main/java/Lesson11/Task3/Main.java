package Lesson11.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<ScreeningRoom> screeningRooms = Arrays.asList(
                new ScreeningRoom("screenRoom1", "2D"),
                new ScreeningRoom("screenRoom2", "3D"),
                new ScreeningRoom("screenRoom3", "4D"),
                new ScreeningRoom("screenRoom4", "2D"),
                new ScreeningRoom("screenRoom5", "2D"),
                new ScreeningRoom("screenRoom6", "3D"),
                new ScreeningRoom("screenRoom7", "3D"),
                new ScreeningRoom("screenRoom8", "4D"),
                new ScreeningRoom("screenRoom9", "4D"),
                new ScreeningRoom("screenRoom10", "2D")
        );

        System.out.println("Sorted screen rooms by type");
        List<ScreeningRoom> screeningRoomsSortedByType = screeningRooms.stream()
                .sorted((ScreeningRoom o1, ScreeningRoom o2) -> CharSequence.compare(o1.getType(), o2.getType()))
                .collect(Collectors.toList());
        System.out.println(screeningRoomsSortedByType);

        System.out.println("Numbers of screen rooms 2D type: ");
        List<ScreeningRoom> screeningRooms2D = screeningRooms.stream()
                .filter(screeningRoom -> screeningRoom.getType() == "2D")
                .collect(Collectors.toList());
        long numberOfScreeningRooms2D = screeningRooms2D.stream().count();
        System.out.println(numberOfScreeningRooms2D);

        System.out.println("Numbers of screen rooms 3D type: ");
        List<ScreeningRoom> screeningRooms3D = screeningRooms.stream()
                .filter(screeningRoom -> screeningRoom.getType() == "3D")
                .collect(Collectors.toList());
        long numberOfScreeningRooms3D = screeningRooms3D.stream().count();
        System.out.println(numberOfScreeningRooms3D);

        System.out.println("Numbers of screen rooms 4D type: ");
        List<ScreeningRoom> screeningRooms4D = screeningRooms.stream()
                .filter(screeningRoom -> screeningRoom.getType() == "4D")
                .collect(Collectors.toList());
        long numberOfScreeningRooms4D = screeningRooms4D.stream().count();
        System.out.println(numberOfScreeningRooms4D);
    }

}
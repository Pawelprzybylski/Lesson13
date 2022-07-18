package Lesson11.Lesson11.Task3;

public class ScreeningRoom {

    private final String name;
    private final String type;

    public ScreeningRoom(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ScreeningRoom{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}

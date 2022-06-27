package Lesson9.Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapTest {
    @Test
    public void shouldContainsKey() {
        //given
        Map map = new Map();
        //when
        map.put("Imię", "Jan");
        //then
        Assertions.assertTrue(map.containsKey("Imię"));
    }

    @Test
    public void shouldContainsValue() {
        //given
        Map map = new Map();
        //when
        map.put("Imię", "Jan");
        //then
        Assertions.assertTrue(map.containsValue("Jan"));
    }

    @Test
    public void shouldRemove() {
        //given
        Map map = new Map();
        //when
        map.put("Imię", "Jan");
        //then
        Assertions.assertEquals("Jan", map.remove("Imię"));
    }

    @Test
    public void shouldGet() {
        //given
        Map map = new Map();
        //when
        map.put("Imię", "Jan");
        map.put("Nazwisko", "Kowalski");
        //then
        Assertions.assertEquals("Jan", map.get("Imię"));
    }

}
package task7;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import task3.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SerializerTest {

    Serializer<Rectangle> serializer = new Serializer<>();
    ListSerializer<List<Shape>> listSerializer = new ListSerializer<>();

    @Test
    void serialize() throws JsonProcessingException {
        assertEquals("""
                {
                  "side1" : 4.0,
                  "side2" : 5.0
                }""", serializer.serialize(new Rectangle(4, 5)));
    }

    @Test
    void deserialize() throws JsonProcessingException {
        assertEquals(new Rectangle(4, 5),
                serializer.deserialize(serializer.serialize(new Rectangle(4, 5)),
                        Rectangle.class));
    }

    @Test
    void listSerialize() throws JsonProcessingException {
        assertEquals("""
                [ {
                  "radius" : 5.0
                }, {
                  "side" : 5.0
                }, {
                  "side1" : 4.0,
                  "side2" : 7.0,
                  "side3" : 5.0
                } ]""", listSerializer.serialize(List.of(new Circle(5),
                new Square(5), new Triangle(4, 7, 5))));
    }
}
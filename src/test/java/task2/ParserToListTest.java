package task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserToListTest {

    ParserToList parser = new ParserToList();

    @Test
    void parse1() {
        assertEquals(List.of("(", "3", "+", "5", "+", "589", ")", "-", "6", "+", "28"),
                parser.parse("(3+5+589) - 6     + 28"));
    }

}
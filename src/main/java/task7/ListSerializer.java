package task7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import task3.Shape;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ListSerializer {
    protected final static ObjectMapper objectMapper = new ObjectMapper();

    public String serialize(List<Shape> list) throws JsonProcessingException {
        Fleet fleet = new Fleet();
        fleet.setShapeList(list);
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(fleet);
    }

    public void serializeToFile(List<Shape> list, String pathToFile) throws IOException {
        Fleet fleet = new Fleet();
        fleet.setShapeList(list);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(pathToFile), fleet);
    }

    public List<Shape> deserialize(String s) throws JsonProcessingException {
        Fleet fleet = objectMapper.readValue(s, Fleet.class);
        return fleet.getShapeList();
    }

    public List<Shape> deserializeFromFile(String pathToFile) throws IOException {
        File file = new File(pathToFile);
        if (file.length() == 0) throw new IncorrectFileException("File is empty");
        Fleet deserializedFleet = objectMapper.readValue(file, Fleet.class);
        return deserializedFleet.getShapeList();
    }
}

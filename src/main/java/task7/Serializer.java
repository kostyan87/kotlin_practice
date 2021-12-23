package task7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Serializer<T> {
    protected final static ObjectMapper objectMapper = new ObjectMapper();

    public String serialize(T t) throws JsonProcessingException {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(t);
    }

    public void serializeToFile(T t, String pathToFile) throws IOException {
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(pathToFile), t);
    }

    public final T deserializeFromFile(String pathToFile, Class<T> tClass) throws IOException {
        return objectMapper.readValue(new File(pathToFile), tClass);
    }

    public final T deserialize(String s, Class<T> tClass) throws JsonProcessingException {
        return objectMapper.readValue(s, tClass);
    }
}

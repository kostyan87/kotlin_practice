package task7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectSerializer<T> {
    protected final static ObjectMapper objectMapper = new ObjectMapper();

    public String serialize(T t) throws JsonProcessingException {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(t);
    }

    public void serializeToFile(T t, String pathToFile) throws IOException {
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(pathToFile), t);
    }

    public final T deserializeFromFile(String pathToFile, Class<T> tClass) throws IOException {
        File file = new File(pathToFile);
        if (file.length() == 0) throw new IncorrectFileException("File is empty");
        return objectMapper.readValue(file, tClass);
    }

    public final T deserialize(String s, Class<T> tClass) throws JsonProcessingException {
        return objectMapper.readValue(s, tClass);
    }
}

package task7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class ListSerializer<T extends Collection> extends Serializer<T> {
    public T deserialize(String s) throws JsonProcessingException {
        return objectMapper.readValue(s, new TypeReference<T>() {});
    }

    public T deserializeFromFile(String pathToFile) throws IOException {
        return objectMapper.readValue(new File(pathToFile), new TypeReference<T>() {});
    }
}

package task7;

import task3.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Shape> shapeList;
        ListSerializer listSerializer = new ListSerializer();
        shapeList = listSerializer.deserializeFromFile("file.json");
        shapeList.add(new Triangle(7, 5, 7));
        shapeList.add(new Circle(4));
        listSerializer.serializeToFile(shapeList, "output_file.json");
    }
}

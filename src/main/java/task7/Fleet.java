package task7;

import task3.Shape;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Shape> shapeList = new ArrayList<>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }
}

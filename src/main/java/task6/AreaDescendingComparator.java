package task6;

import task3.Shape;

import java.util.Comparator;

public class AreaDescendingComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return -Double.compare(o2.calcArea(), o1.calcArea());
    }
}

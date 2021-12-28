package task6;

public class ShapeComparators {
    private final AreaAscendingComparator areaAscendingComparator;
    private final AreaDescendingComparator areaDescendingComparator;
    private final PerimeterAscendingComparator periemeterAscendingComparator;
    private final PerimeterDescendingComparator periemeterDescendingComparator;
    private final CircleRadiusAscendingComparator circleRadiusAscendingComparator;
    private final CircleRadiusDescendingComparator circleRadiusDescendingComparator;

    {
        areaAscendingComparator = new AreaAscendingComparator();
        areaDescendingComparator = new AreaDescendingComparator();
        periemeterAscendingComparator = new PerimeterAscendingComparator();
        periemeterDescendingComparator = new PerimeterDescendingComparator();
        circleRadiusAscendingComparator = new CircleRadiusAscendingComparator();
        circleRadiusDescendingComparator = new CircleRadiusDescendingComparator();
    }

    public AreaAscendingComparator getAreaAscendingComparator() {
        return areaAscendingComparator;
    }

    public AreaDescendingComparator getAreaDescendingComparator() {
        return areaDescendingComparator;
    }

    public PerimeterAscendingComparator getPeriemeterAscendingComparator() {
        return periemeterAscendingComparator;
    }

    public PerimeterDescendingComparator getPeriemeterDescendingComparator() {
        return periemeterDescendingComparator;
    }

    public CircleRadiusAscendingComparator getCircleRadiusAscendingComparator() {
        return circleRadiusAscendingComparator;
    }

    public CircleRadiusDescendingComparator getCircleRadiusDescendingComparator() {
        return circleRadiusDescendingComparator;
    }
}

package task4;

import java.util.AbstractMap;

public abstract class AssignOperation {

    public void doOperationAlgo(Matrix matrix1, Matrix matrix2) {
        for (AbstractMap.SimpleImmutableEntry<Integer, Integer> entry:
                matrix1) {
            int i = entry.getKey();
            int j = entry.getValue();
            double a = matrix1.get(i, j);
            double b = matrix2.get(i, j);
            matrix1.set(i, j, doOperation(a, b));
        }
    }

    protected abstract double doOperation(double a, double b);
}

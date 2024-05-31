import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class MyIntStream {

    private final int[] array;

    public MyIntStream(int[] array) {
        this.array = array;
    }

    public int count() {
        return array.length;
    }

    public MyIntStream filter(IntPredicate predicate) {
        int[] result = new int[array.length];
        int index = 0;
        for (int element : array) {
            if (predicate.test(element)) {
                result[index++] = element;
            }
        }
        return new MyIntStream(Arrays.copyOf(result, index));
    }

    public MyIntStream map(IntUnaryOperator mapper) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = mapper.applyAsInt(array[i]);
        }
        return new MyIntStream(result);
    }

    public MyIntStream flatMap(IntFunction<? extends MyIntStream> mapper) {
        int[] result = new int[array.length];
        int index = 0;
        for (int element : array) {
            MyIntStream stream = mapper.apply(element);
            for (int r : stream.toArray()) {
                result[index++] = r;
            }
        }
        return new MyIntStream(Arrays.copyOf(result, index));
    }

    public MyIntStream peek(IntConsumer action) {
        for (int element : array) {
            action.accept(element);
        }
        return this;
    }

    public void forEach(IntConsumer action) {
        for (int element : array) {
            action.accept(element);
        }
    }

    public int[] toArray() {
        return Arrays.copyOf(array, array.length);
    }

    public int sum() {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public int min() throws Exception {
        if (array.length == 0) {
            throw new Exception("it's empty!");
        }
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public int max() throws Exception {
        if (array.length == 0) {
            throw new Exception("it's empty!");

        }
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public double average() throws Exception {
        if (array.length == 0) {
            throw new Exception("it's empty!");
        }
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (sum / array.length);
    }

    public boolean findAny() {
        if (array.length > 0) {
            return false;
        }
        return true;
    }
}
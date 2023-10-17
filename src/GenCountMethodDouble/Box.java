package GenCountMethodDouble;

public class Box <T extends Comparable<T>> implements Comparable<Box<T>> {

    private T box;

    public Box(T box) {
        this.setBox(box);
    }

    public T getBox() {
        return box;
    }

    private void setBox(T box) {
        this.box = box;
    }


    @Override
    public int compareTo(Box<T> o) {
        return this.box.compareTo(o.box);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(box.getClass().getName()).append(String.format(": %s",box));
        return sb.toString();
    }
}

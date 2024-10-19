public class GenericList<T> {
    private Object[] array;
    private int size;

    public GenericList() {
        size = 0;
        array = new Object[16];
    }

    public void add(T element) {
        if (size >= array.length) {
            enlarge();
        }
        array[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) array[index];
    }


    private void enlarge() {
        Object[] newArray = new Object[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append(System.lineSeparator());
        }
        return sb.toString();
    }


}
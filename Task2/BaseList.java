import java.util.List;

class BaseList <T> {
    public List<T> baseList;

    public BaseList(List<T> baseList) {
        this.baseList = baseList;
    }

    public int getSize() {
        return baseList.size();
    }

    public T get(int i) {
        return baseList.get(i);
    }
}

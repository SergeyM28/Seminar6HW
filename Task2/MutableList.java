import java.util.List;

public class MutableList <T> extends BaseList{
    public MutableList(List baseList) {
        super(baseList);
        }
    public void setElem(int index, T value){
        this.baseList.set(index, value);
    }
    public void addElem(T newValue){
        this.baseList.add(newValue);
    }
    public void removeElem (T value){
        this.baseList.remove(value);
    }
}

import java.util.List;

public class ImmutableList<T> extends BaseList{
    public ImmutableList(List<T> baseList) {
        super(baseList);
    }
}

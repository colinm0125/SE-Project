import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
public class RawData implements List {
    private List<Integer> data;

    public RawData() {
        data = new ArrayList<>();
    }

    public RawData(List<Integer> in) {
        data = new ArrayList<>(in);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }

    @Override
    public Iterator iterator() {
        return data.iterator();
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public boolean add(Object o) {
        return data.add((Integer) o);
    }

    @Override
    public boolean remove(Object o) {
        return data.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return data.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return data.addAll(index, c);
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public Object get(int index) {
        return data.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        return data.set(index, (Integer) element);
    }

    @Override
    public void add(int index, Object element) {
        data.add(index, (Integer) element);
    }

    @Override
    public Object remove(int index) {
        return data.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return data.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return data.lastIndexOf(o);
    }

    @Override
    public ListIterator listIterator() {
        return data.listIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        return data.listIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return data.subList(fromIndex, toIndex);
    }

    @Override
    public boolean retainAll(Collection c) {
        return data.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return data.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return data.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return data.toArray(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RawData rawData = (RawData) o;
        return Objects.equals(data, rawData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return data.toString();
    }
    

}

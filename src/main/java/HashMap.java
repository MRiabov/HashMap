import java.util.List;
import java.util.Set;

public class HashMap implements CarMap{
    private static final int DEFAULT_LENGTH=16;
    private static Entry[] entries=new Entry[DEFAULT_LENGTH];
    private static final double loadFactor= 0.75;
    int size=0;


    @Override
    public void put(CarOwner key, Car value) {
        int pos=key.hashCode()%entries.length;
        Entry existingEntry=entries[pos];
        if (existingEntry==null) {
            
            size++;
        } else
    }

    @Override
    public Car get(CarOwner key) {
        return null;
    }

    @Override
    public Set<CarOwner> keySet() {
        return null;
    }

    @Override
    public List<Car> values() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean remove(CarOwner key) {
        return false;
    }
}

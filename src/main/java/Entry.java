public class Entry {

    int key;
    Object value;
    Entry nextEntry;

    public Entry(int key, Object value, Entry nextEntry) {
        this.key = key;
        this.value = value;
        this.nextEntry = nextEntry;
    }
}

package Lesson9.Task4;

public class Pair<K, V> {
   // List<K> keys = new ArrayList<>();
   // List<V> values = new ArrayList<>();
//
   // public <K> List<K> getAnyKey() {
//
   //     return (List<K>) keys;
   // }
//
   // public <V> List<V> getAnyValue() {
   //     return (List<V>) values;
   // }
//
    public K keys;
    public V values;

    public K geyKeys(){
        return keys;
    }
    public V getValues(){
        return values;
    }
}

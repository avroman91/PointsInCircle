package map.ua.ithillel;

class MyMap<K,V> {
    private static class Node<K,V> {
        Pair<K,V> pair;
        Node<K,V> next;
    }

    private Node[] buckets = new Node[16];


    private int getIndex(K key) {
        return key.hashCode() % buckets.length;
    }

    public void put(K key, V value) {

        int index = getIndex(key);

        Node<K,V> node = new Node<K,V>();
        node.pair.setKey(key);
        node.pair.setValue(value);


        if (buckets[index] == null) buckets[index] = node;
        else {
            Node<K,V> current = buckets[index];
            while (current != null) {
                if (current.pair.getKey().equals(key)) {
                    current.pair.setKey(key);
                    current.pair.setValue(value);
                    break;
                }
                if (current.next == null) {
                    current.next = node;
                    break;
                }
                current = current.next;
            }
        }
    }
}

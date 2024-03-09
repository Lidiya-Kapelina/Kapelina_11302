import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> implements Map<K, V> {
    private K[] key;
    private V[] value;

    public MyMap() {
        this.key = (K[]) new Object[0];
        this.value = (V[]) new Object[0];
    }

    @Override
    public int size() {
        return this.key.length;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        for (int i = 0; i < this.size(); i += 1) {
            if (this.key[i] == (K) key) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < this.size(); i += 1) {
            if (this.value[i] == (V) value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        if (this.containsKey(key)) {
            for (int i = 0; i < this.size(); i += 1) {
                if (this.key[i] == (K) key) {
                    return this.value[i];
                }
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (!(this.containsKey(key))) {
            K[] dk;
            V[] dv;
            dk = this.key;
            dv = this.value;
            this.key = (K[]) new Object[dk.length + 1];
            this.value = (V[]) new Object[dk.length + 1];
            for (int i = 0; i < dk.length; i += 1) {
                this.key[i] = dk[i];
                this.value[i] = dv[i];
            }
            this.key[dk.length] = key;
            this.value[dk.length] = value;
            return null;
        }
        for (int i = 0; i < this.size(); i += 1) {
            if (this.key[i] == key) {
                V a;
                a = this.value[i];
                this.value[i] = value;
                return a;
            }
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        V a = null;
        for (int i = 0; i < this.size(); i += 1) {
            if (this.key[i] == (K) key) {
                this.key[i] = null;
                a = this.value[i];
                this.value[i] = null;
                break;
            }
        }
        return a;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }


    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
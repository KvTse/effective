package cn.kvtse.study.jdk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 简单实现HashMap
 * @author Tsing Tse
 * @date 2019年5月15日09:35:43
 */
public class MyHashMap<K,V> {
    /** HashMap底层的数组结构 */
    private Entry<K,V>[] table;
    /** 数组的默认容量 */
    private static int Capacitry = 8;
    public int size() {
        return 0;
    }
    public Object get(Object key) {
        return null;
    }

    public Object put(Object key, Object value) {
        return null;
    }

    private class Entry<K,V> {
        private K k;
        private V v;
        private Entry<K,V> next;

        public Entry(K k, V v, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }

        public K getK() {
            return k;
        }

        public V getV() {
            return v;
        }

        public Entry<K, V> getNext() {
            return next;
        }
    }
}

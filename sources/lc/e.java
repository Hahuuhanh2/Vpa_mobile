package lc;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public abstract class e<K, V> {
    private final Map zza = new HashMap();

    public abstract V create(K k10);

    public V get(K k10) {
        synchronized (this.zza) {
            if (this.zza.containsKey(k10)) {
                V v2 = this.zza.get(k10);
                return v2;
            }
            V create = create(k10);
            this.zza.put(k10, create);
            return create;
        }
    }
}

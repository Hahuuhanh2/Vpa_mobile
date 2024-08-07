package u8;

import java.util.Map;
import u8.i;

/* compiled from: AbstractMapEntry */
public abstract class b<K, V> implements Map.Entry<K, V> {
    public final String toString() {
        i.t tVar = (i.t) this;
        String valueOf = String.valueOf(tVar.f15371a);
        String valueOf2 = String.valueOf(tVar.f15372b);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}

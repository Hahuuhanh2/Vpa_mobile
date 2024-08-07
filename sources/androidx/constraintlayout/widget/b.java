package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: SharedValues */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, HashSet<WeakReference<a>>> f2044a = new HashMap<>();

    /* compiled from: SharedValues */
    public interface a {
    }

    public b() {
        new SparseIntArray();
    }

    public final void a(int i10, a aVar) {
        HashSet hashSet = this.f2044a.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f2044a.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }
}

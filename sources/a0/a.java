package a0;

import al.g0;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import c0.o;
import c0.p0;
import f0.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v.x;
import w.z;

/* compiled from: Camera2CameraCoordinator */
public final class a implements d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f6c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public Set<Set<String>> f7d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public int f8e = 0;

    public a(z zVar) {
        try {
            this.f7d = zVar.f16259a.e();
        } catch (CameraAccessExceptionCompat unused) {
            p0.b("Camera2CameraCoordinator");
        }
        for (Set<String> arrayList : this.f7d) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.size() >= 2) {
                String str = (String) arrayList2.get(0);
                String str2 = (String) arrayList2.get(1);
                if (!this.f5b.containsKey(str)) {
                    this.f5b.put(str, new ArrayList());
                }
                if (!this.f5b.containsKey(str2)) {
                    this.f5b.put(str2, new ArrayList());
                }
                ((List) this.f5b.get(str)).add((String) arrayList2.get(1));
                ((List) this.f5b.get(str2)).add((String) arrayList2.get(0));
            }
        }
    }

    public final String a(String str) {
        if (!this.f5b.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) this.f5b.get(str)) {
            Iterator it = this.f6c.iterator();
            while (true) {
                if (it.hasNext()) {
                    q e10 = ((q) ((o) it.next())).e();
                    g0.y("CameraInfo doesn't contain Camera2 implementation.", e10 instanceof x);
                    if (str2.equals(((x) e10).f15912c.f3870a.f15910a)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }
}

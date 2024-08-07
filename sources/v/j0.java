package v;

import android.content.Context;
import android.media.CamcorderProfile;
import f0.o;
import g0.l;
import java.util.HashMap;
import java.util.Set;
import w.z;

/* compiled from: Camera2DeviceSurfaceManager */
public final class j0 implements o {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15715a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final d f15716b;

    /* compiled from: Camera2DeviceSurfaceManager */
    public class a implements d {
        public final CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        public final boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public j0(Context context, Object obj, Set<String> set) {
        z zVar;
        a aVar = new a();
        this.f15716b = aVar;
        if (obj instanceof z) {
            zVar = (z) obj;
        } else {
            zVar = z.a(context, l.a());
        }
        context.getClass();
        for (String next : set) {
            this.f15715a.put(next, new t1(context, next, zVar, this.f15716b));
        }
    }
}

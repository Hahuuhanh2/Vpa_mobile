package l0;

import android.media.MediaCodec;
import androidx.camera.core.impl.u;
import c0.t0;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f12629a;

    public /* synthetic */ b(c cVar) {
        this.f12629a = cVar;
    }

    public final int compare(Object obj, Object obj2) {
        int i10;
        Class<t0> cls = t0.class;
        u.e eVar = (u.e) obj2;
        this.f12629a.getClass();
        Class<?> cls2 = ((u.e) obj).e().f1322j;
        int i11 = 0;
        if (cls2 == MediaCodec.class) {
            i10 = 2;
        } else if (cls2 == cls) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        Class<?> cls3 = eVar.e().f1322j;
        if (cls3 == MediaCodec.class) {
            i11 = 2;
        } else if (cls3 != cls) {
            i11 = 1;
        }
        return i10 - i11;
    }
}

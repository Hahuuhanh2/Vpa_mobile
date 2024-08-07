package ib;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import i1.i;
import java.util.HashMap;
import java.util.Map;
import lb.a;
import mb.c;
import sb.e;

/* compiled from: FrameMetricsRecorder */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f11425e = a.d();

    /* renamed from: a  reason: collision with root package name */
    public final Activity f11426a;

    /* renamed from: b  reason: collision with root package name */
    public final i f11427b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Fragment, c> f11428c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11429d;

    @VisibleForTesting
    public d() {
        throw null;
    }

    public d(Activity activity) {
        i iVar = new i();
        HashMap hashMap = new HashMap();
        this.f11429d = false;
        this.f11426a = activity;
        this.f11427b = iVar;
        this.f11428c = hashMap;
    }

    public final e<c> a() {
        if (!this.f11429d) {
            f11425e.a();
            return new e<>();
        }
        SparseIntArray[] b10 = this.f11427b.f10946a.b();
        if (b10 == null) {
            f11425e.a();
            return new e<>();
        }
        SparseIntArray sparseIntArray = b10[0];
        if (sparseIntArray == null) {
            f11425e.a();
            return new e<>();
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int keyAt = sparseIntArray.keyAt(i13);
            int valueAt = sparseIntArray.valueAt(i13);
            i10 += valueAt;
            if (keyAt > 700) {
                i12 += valueAt;
            }
            if (keyAt > 16) {
                i11 += valueAt;
            }
        }
        return new e<>(new c(i10, i11, i12));
    }
}

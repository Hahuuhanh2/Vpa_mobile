package y6;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import u6.a;
import u6.b;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f17602a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public b f17603b;

    public w() {
        a aVar = a.f15288d;
        this.f17603b = aVar;
    }

    public final int a(Context context, a.f fVar) {
        j.f(context);
        j.f(fVar);
        int i10 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int i11 = this.f17602a.get(minApkVersion, -1);
        if (i11 == -1) {
            int i12 = 0;
            while (true) {
                if (i12 >= this.f17602a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f17602a.keyAt(i12);
                if (keyAt > minApkVersion && this.f17602a.get(keyAt) == 0) {
                    break;
                }
                i12++;
            }
            if (i10 == -1) {
                i11 = this.f17603b.c(context, minApkVersion);
            } else {
                i11 = i10;
            }
            this.f17602a.put(minApkVersion, i11);
        }
        return i11;
    }
}

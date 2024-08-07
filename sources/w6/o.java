package w6;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class o<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final Feature[] f16636a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16637b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16638c;

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public m f16639a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f16640b = true;

        /* renamed from: c  reason: collision with root package name */
        public Feature[] f16641c;

        /* renamed from: d  reason: collision with root package name */
        public int f16642d = 0;

        public final v0 a() {
            boolean z10;
            if (this.f16639a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            j.a("execute parameter required", z10);
            return new v0(this, this.f16641c, this.f16640b, this.f16642d);
        }
    }

    public o(Feature[] featureArr, boolean z10, int i10) {
        this.f16636a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f16637b = z11;
        this.f16638c = i10;
    }
}

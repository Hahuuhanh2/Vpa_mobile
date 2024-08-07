package ub;

import android.content.Context;
import android.os.Trace;
import ca.b;
import ca.f;
import ca.s;
import ub.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15428a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f15429b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15430c;

    public /* synthetic */ e(String str, int i10, Object obj) {
        this.f15428a = i10;
        this.f15429b = str;
        this.f15430c = obj;
    }

    public final Object k(s sVar) {
        switch (this.f15428a) {
            case 0:
                return new a(this.f15429b, ((f.a) this.f15430c).d((Context) sVar.a(Context.class)));
            default:
                String str = this.f15429b;
                b bVar = (b) this.f15430c;
                try {
                    Trace.beginSection(str);
                    return bVar.f4612f.k(sVar);
                } finally {
                    Trace.endSection();
                }
        }
    }
}

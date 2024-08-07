package v;

import io.github.g00fy2.quickie.QRScannerActivity;
import r2.q;
import rk.l;
import sk.j;
import v.x;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15905b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f15904a = i10;
        this.f15905b = obj;
    }

    public final void b(Object obj) {
        switch (this.f15904a) {
            case 0:
                ((x.a) this.f15905b).j(obj);
                return;
            default:
                l lVar = (l) this.f15905b;
                int i10 = QRScannerActivity.Q;
                j.f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
        }
    }
}

package v5;

import ck.a;
import ek.i;
import java.util.List;
import rk.l;
import sj.b;
import sk.k;
import t5.b;
import u5.f;

/* compiled from: RxExtensions.kt */
public final class c extends k implements l<b, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a<List<r5.a>> f16070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t5.b f16071b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b.a f16072c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a aVar, f fVar, a aVar2) {
        super(1);
        this.f16070a = aVar;
        this.f16071b = fVar;
        this.f16072c = aVar2;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        sj.b bVar = (sj.b) obj;
        if (((a.C0258a[]) this.f16070a.f19203a.get()).length != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f16071b.c(this.f16072c);
        }
        return i.f20112a;
    }
}

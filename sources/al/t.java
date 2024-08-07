package al;

import android.support.v4.media.a;
import ek.i;
import java.util.concurrent.CancellationException;
import rk.l;
import sk.j;

/* compiled from: CancellableContinuationImpl.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f19088a;

    /* renamed from: b  reason: collision with root package name */
    public final i f19089b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, i> f19090c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f19091d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f19092e;

    public t(Object obj, i iVar, l<? super Throwable, i> lVar, Object obj2, Throwable th2) {
        this.f19088a = obj;
        this.f19089b = iVar;
        this.f19090c = lVar;
        this.f19091d = obj2;
        this.f19092e = th2;
    }

    public static t a(t tVar, i iVar, CancellationException cancellationException, int i10) {
        Object obj;
        l<Throwable, i> lVar;
        Object obj2 = null;
        if ((i10 & 1) != 0) {
            obj = tVar.f19088a;
        } else {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            iVar = tVar.f19089b;
        }
        i iVar2 = iVar;
        if ((i10 & 4) != 0) {
            lVar = tVar.f19090c;
        } else {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            obj2 = tVar.f19091d;
        }
        Object obj3 = obj2;
        Throwable th2 = cancellationException;
        if ((i10 & 16) != 0) {
            th2 = tVar.f19092e;
        }
        tVar.getClass();
        return new t(obj, iVar2, (l<? super Throwable, i>) lVar, obj3, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return j.a(this.f19088a, tVar.f19088a) && j.a(this.f19089b, tVar.f19089b) && j.a(this.f19090c, tVar.f19090c) && j.a(this.f19091d, tVar.f19091d) && j.a(this.f19092e, tVar.f19092e);
    }

    public final int hashCode() {
        Object obj = this.f19088a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f19089b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l<Throwable, i> lVar = this.f19090c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f19091d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f19092e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return hashCode4 + i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("CompletedContinuation(result=");
        q10.append(this.f19088a);
        q10.append(", cancelHandler=");
        q10.append(this.f19089b);
        q10.append(", onCancellation=");
        q10.append(this.f19090c);
        q10.append(", idempotentResume=");
        q10.append(this.f19091d);
        q10.append(", cancelCause=");
        q10.append(this.f19092e);
        q10.append(')');
        return q10.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, i iVar, l lVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : iVar, (l<? super Throwable, i>) (i10 & 4) != 0 ? null : lVar, (Object) null, (Throwable) (i10 & 16) != 0 ? null : cancellationException);
    }
}

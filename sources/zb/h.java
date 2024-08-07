package zb;

import al.d0;
import i2.e;
import ik.d;
import java.util.LinkedHashMap;
import java.util.Map;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
/* compiled from: SettingsCache.kt */
public final class h extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public i f17942a;

    /* renamed from: b  reason: collision with root package name */
    public int f17943b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f17944c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar, d<? super h> dVar) {
        super(2, dVar);
        this.f17944c = iVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new h(this.f17944c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        i iVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f17943b;
        if (i10 == 0) {
            l0.Q0(obj);
            i iVar2 = this.f17944c;
            dl.e<i2.e> a10 = iVar2.f17950a.a();
            this.f17942a = iVar2;
            this.f17943b = 1;
            Object E = j7.a.E(a10, this);
            if (E == aVar) {
                return aVar;
            }
            iVar = iVar2;
            obj = E;
        } else if (i10 == 1) {
            iVar = this.f17942a;
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map<e.a<?>, Object> a11 = ((i2.e) obj).a();
        j.f(a11, "<this>");
        i.a(iVar, new i2.a((Map<e.a<?>, Object>) new LinkedHashMap(a11), true));
        return ek.i.f20112a;
    }
}

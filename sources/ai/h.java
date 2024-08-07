package ai;

import android.content.Intent;
import android.net.Uri;
import ek.i;
import lf.g;
import rk.l;
import sk.j;
import sk.k;
import v.f;

/* compiled from: TransferPaymentFragment.kt */
public final class h extends k implements l<String, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f18978a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(1);
        this.f18978a = jVar;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        j.f(str, "it");
        j jVar = this.f18978a;
        int i10 = j.f18980n0;
        jVar.getClass();
        try {
            if (str.length() > 5) {
                g.b.a(jVar, new f(28, jVar, new Intent("android.intent.action.VIEW", Uri.parse(str))), 1500);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return i.f20112a;
    }
}

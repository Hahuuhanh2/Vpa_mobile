package com.google.android.play.core.integrity;

import android.os.IBinder;
import android.os.IInterface;
import s8.g0;
import s8.o;
import s8.p;
import s8.q;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final /* synthetic */ class bd implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ bd f7243a = new bd();

    private /* synthetic */ bd() {
    }

    public final Object a(IBinder iBinder) {
        int i10 = p.f14694j;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        if (queryLocalInterface instanceof q) {
            return (q) queryLocalInterface;
        }
        return new o(iBinder);
    }
}

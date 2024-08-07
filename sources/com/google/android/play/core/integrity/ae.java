package com.google.android.play.core.integrity;

import android.os.IBinder;
import android.os.IInterface;
import s8.g0;
import s8.t;
import s8.u;
import s8.v;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final /* synthetic */ class ae implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ ae f7190a = new ae();

    private /* synthetic */ ae() {
    }

    public final Object a(IBinder iBinder) {
        int i10 = u.f14695j;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        if (queryLocalInterface instanceof v) {
            return (v) queryLocalInterface;
        }
        return new t(iBinder);
    }
}

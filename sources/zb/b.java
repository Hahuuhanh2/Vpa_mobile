package zb;

import android.content.Context;
import android.os.Bundle;
import ek.i;
import ik.d;
import p3.l0;
import zk.a;
import zk.c;

/* compiled from: LocalOverrideSettings.kt */
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f17902a;

    public b(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f17902a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public final Boolean a() {
        if (this.f17902a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f17902a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public final a b() {
        if (this.f17902a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new a(l0.R0(this.f17902a.getInt("firebase_sessions_sessions_restart_timeout"), c.SECONDS));
        }
        return null;
    }

    public final Object c(d<? super i> dVar) {
        return i.f20112a;
    }

    public final Double d() {
        if (this.f17902a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f17902a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}

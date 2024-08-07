package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fb.r;
import fb.t;
import java.util.Map;
import p3.l0;
import v0.b;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new t();

    /* renamed from: a  reason: collision with root package name */
    public Bundle f7602a;

    /* renamed from: b  reason: collision with root package name */
    public b f7603b;

    /* renamed from: c  reason: collision with root package name */
    public a f7604c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f7605a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7606b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7607c;

        public a(r rVar) {
            this.f7605a = rVar.i("gcm.n.title");
            rVar.g("gcm.n.title");
            Object[] f10 = rVar.f("gcm.n.title");
            if (f10 != null) {
                String[] strArr = new String[f10.length];
                for (int i10 = 0; i10 < f10.length; i10++) {
                    strArr[i10] = String.valueOf(f10[i10]);
                }
            }
            this.f7606b = rVar.i("gcm.n.body");
            rVar.g("gcm.n.body");
            Object[] f11 = rVar.f("gcm.n.body");
            if (f11 != null) {
                String[] strArr2 = new String[f11.length];
                for (int i11 = 0; i11 < f11.length; i11++) {
                    strArr2[i11] = String.valueOf(f11[i11]);
                }
            }
            rVar.i("gcm.n.icon");
            if (TextUtils.isEmpty(rVar.i("gcm.n.sound2"))) {
                rVar.i("gcm.n.sound");
            }
            rVar.i("gcm.n.tag");
            rVar.i("gcm.n.color");
            this.f7607c = rVar.i("gcm.n.click_action");
            rVar.i("gcm.n.android_channel_id");
            rVar.e();
            rVar.i("gcm.n.image");
            rVar.i("gcm.n.ticker");
            rVar.b("gcm.n.notification_priority");
            rVar.b("gcm.n.visibility");
            rVar.b("gcm.n.notification_count");
            rVar.a("gcm.n.sticky");
            rVar.a("gcm.n.local_only");
            rVar.a("gcm.n.default_sound");
            rVar.a("gcm.n.default_vibrate_timings");
            rVar.a("gcm.n.default_light_settings");
            String i12 = rVar.i("gcm.n.event_time");
            if (!TextUtils.isEmpty(i12)) {
                try {
                    Long.parseLong(i12);
                } catch (NumberFormatException unused) {
                    r.m("gcm.n.event_time");
                }
            }
            rVar.d();
            rVar.j();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f7602a = bundle;
    }

    public final Map<String, String> P0() {
        if (this.f7603b == null) {
            Bundle bundle = this.f7602a;
            b bVar = new b();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        bVar.put(next, str);
                    }
                }
            }
            this.f7603b = bVar;
        }
        return this.f7603b;
    }

    public final a Q0() {
        if (this.f7604c == null && r.k(this.f7602a)) {
            this.f7604c = new a(new r(this.f7602a));
        }
        return this.f7604c;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.Y0(parcel, 2, this.f7602a);
        l0.o1(n12, parcel);
    }
}

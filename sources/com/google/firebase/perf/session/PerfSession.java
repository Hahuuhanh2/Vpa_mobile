package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import lb.b;
import tb.k;

public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f7659a;

    /* renamed from: b  reason: collision with root package name */
    public final Timer f7660b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7661c = false;

    public class a implements Parcelable.Creator<PerfSession> {
        public final Object createFromParcel(Parcel parcel) {
            return new PerfSession(parcel);
        }

        public final Object[] newArray(int i10) {
            return new PerfSession[i10];
        }
    }

    public PerfSession(String str, b bVar) {
        this.f7659a = str;
        this.f7660b = new Timer();
    }

    public static k[] d(List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a10 = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k a11 = list.get(i10).a();
            if (z10 || !list.get(i10).f7661c) {
                kVarArr[i10] = a11;
            } else {
                kVarArr[0] = a11;
                kVarArr[i10] = a10;
                z10 = true;
            }
        }
        if (!z10) {
            kVarArr[0] = a10;
        }
        return kVarArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (jb.a.q(r5) != false) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.perf.session.PerfSession e(java.lang.String r9) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r9 = r9.replace(r0, r1)
            com.google.firebase.perf.session.PerfSession r0 = new com.google.firebase.perf.session.PerfSession
            lb.b r1 = new lb.b
            r2 = 7
            r1.<init>(r2)
            r0.<init>(r9, r1)
            jb.a r9 = jb.a.e()
            boolean r1 = r9.p()
            if (r1 == 0) goto L_0x00e5
            double r1 = java.lang.Math.random()
            java.lang.Class<jb.r> r3 = jb.r.class
            monitor-enter(r3)
            jb.r r4 = jb.r.f11859b     // Catch:{ all -> 0x00e2 }
            if (r4 != 0) goto L_0x002f
            jb.r r4 = new jb.r     // Catch:{ all -> 0x00e2 }
            r4.<init>()     // Catch:{ all -> 0x00e2 }
            jb.r.f11859b = r4     // Catch:{ all -> 0x00e2 }
        L_0x002f:
            jb.r r4 = jb.r.f11859b     // Catch:{ all -> 0x00e2 }
            monitor-exit(r3)
            sb.e r3 = r9.i(r4)
            boolean r5 = r3.b()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r3 = r3.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            boolean r3 = jb.a.q(r5)
            if (r3 == 0) goto L_0x0051
            goto L_0x00dc
        L_0x0051:
            com.google.firebase.perf.config.RemoteConfigManager r3 = r9.f11839a
            java.lang.String r5 = "fpr_vc_session_sampling_rate"
            sb.e r3 = r3.getDouble(r5)
            boolean r5 = r3.b()
            if (r5 == 0) goto L_0x008b
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            boolean r5 = jb.a.q(r5)
            if (r5 == 0) goto L_0x008b
            jb.v r9 = r9.f11841c
            java.lang.String r4 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r9.d(r4, r5)
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto L_0x00dc
        L_0x008b:
            sb.e r3 = r9.b(r4)
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x00b0
            java.lang.Object r4 = r3.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            boolean r4 = jb.a.q(r4)
            if (r4 == 0) goto L_0x00b0
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto L_0x00dc
        L_0x00b0:
            com.google.firebase.perf.config.RemoteConfigManager r9 = r9.f11839a
            boolean r9 = r9.isLastFetchFailed()
            r3 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            if (r9 == 0) goto L_0x00d4
            java.lang.Double r9 = java.lang.Double.valueOf(r3)
            double r3 = r9.doubleValue()
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r5
            java.lang.Double r9 = java.lang.Double.valueOf(r3)
            double r5 = r9.doubleValue()
            goto L_0x00dc
        L_0x00d4:
            java.lang.Double r9 = java.lang.Double.valueOf(r3)
            double r5 = r9.doubleValue()
        L_0x00dc:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x00e5
            r9 = 1
            goto L_0x00e6
        L_0x00e2:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        L_0x00e5:
            r9 = 0
        L_0x00e6:
            r0.f7661c = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.PerfSession.e(java.lang.String):com.google.firebase.perf.session.PerfSession");
    }

    public final k a() {
        k.b K = k.K();
        String str = this.f7659a;
        K.s();
        k.G((k) K.f7906b, str);
        if (this.f7661c) {
            K.s();
            k.H((k) K.f7906b);
        }
        return (k) K.q();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7659a);
        parcel.writeByte(this.f7661c ? (byte) 1 : 0);
        parcel.writeParcelable(this.f7660b, 0);
    }

    public PerfSession(Parcel parcel) {
        boolean z10 = false;
        this.f7659a = parcel.readString();
        this.f7661c = parcel.readByte() != 0 ? true : z10;
        this.f7660b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}

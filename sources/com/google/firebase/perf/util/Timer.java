package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public long f7662a;

    /* renamed from: b  reason: collision with root package name */
    public long f7663b;

    public class a implements Parcelable.Creator<Timer> {
        public final Object createFromParcel(Parcel parcel) {
            return new Timer(parcel.readLong(), parcel.readLong());
        }

        public final Object[] newArray(int i10) {
            return new Timer[i10];
        }
    }

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new Timer().f7663b - this.f7663b;
    }

    public final long d() {
        return this.f7662a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void e() {
        this.f7662a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f7663b = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7662a);
        parcel.writeLong(this.f7663b);
    }

    @VisibleForTesting
    public Timer(long j10, long j11) {
        this.f7662a = j10;
        this.f7663b = j11;
    }
}

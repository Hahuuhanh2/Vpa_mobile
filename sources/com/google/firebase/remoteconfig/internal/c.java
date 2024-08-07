package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* compiled from: ConfigMetadataClient */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final Date f7698e = new Date(-1);

    /* renamed from: f  reason: collision with root package name */
    public static final Date f7699f = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f7700a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7701b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f7702c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Object f7703d = new Object();

    /* compiled from: ConfigMetadataClient */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f7704a;

        /* renamed from: b  reason: collision with root package name */
        public Date f7705b;

        public a(int i10, Date date) {
            this.f7704a = i10;
            this.f7705b = date;
        }
    }

    /* compiled from: ConfigMetadataClient */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f7706a;

        /* renamed from: b  reason: collision with root package name */
        public Date f7707b;

        public b(int i10, Date date) {
            this.f7706a = i10;
            this.f7707b = date;
        }
    }

    public c(SharedPreferences sharedPreferences) {
        this.f7700a = sharedPreferences;
    }

    public final a a() {
        a aVar;
        synchronized (this.f7702c) {
            aVar = new a(this.f7700a.getInt("num_failed_fetches", 0), new Date(this.f7700a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public final b b() {
        b bVar;
        synchronized (this.f7703d) {
            bVar = new b(this.f7700a.getInt("num_failed_realtime_streams", 0), new Date(this.f7700a.getLong("realtime_backoff_end_time_in_millis", -1)));
        }
        return bVar;
    }

    public final void c(int i10, Date date) {
        synchronized (this.f7702c) {
            this.f7700a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(int i10, Date date) {
        synchronized (this.f7703d) {
            this.f7700a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}

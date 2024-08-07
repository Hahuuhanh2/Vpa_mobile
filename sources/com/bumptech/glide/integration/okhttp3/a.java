package com.bumptech.glide.integration.okhttp3;

import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import s4.h;
import y4.f;
import y4.n;
import y4.o;
import y4.r;

/* compiled from: OkHttpUrlLoader */
public final class a implements n<f, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Call.Factory f4937a;

    /* renamed from: com.bumptech.glide.integration.okhttp3.a$a  reason: collision with other inner class name */
    /* compiled from: OkHttpUrlLoader */
    public static class C0054a implements o<f, InputStream> {

        /* renamed from: b  reason: collision with root package name */
        public static volatile OkHttpClient f4938b;

        /* renamed from: a  reason: collision with root package name */
        public final Call.Factory f4939a;

        public C0054a() {
            if (f4938b == null) {
                synchronized (C0054a.class) {
                    if (f4938b == null) {
                        f4938b = new OkHttpClient();
                    }
                }
            }
            this.f4939a = f4938b;
        }

        public final n<f, InputStream> a(r rVar) {
            return new a(this.f4939a);
        }

        public final void b() {
        }
    }

    public a(Call.Factory factory) {
        this.f4937a = factory;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        f fVar = (f) obj;
        return true;
    }

    public final n.a b(Object obj, int i10, int i11, h hVar) {
        f fVar = (f) obj;
        return new n.a(fVar, new r4.a(this.f4937a, fVar));
    }
}

package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import s4.a;

/* compiled from: AssetPathFetcher */
public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f4966a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f4967b;

    /* renamed from: c  reason: collision with root package name */
    public T f4968c;

    public b(AssetManager assetManager, String str) {
        this.f4967b = assetManager;
        this.f4966a = str;
    }

    public final void b() {
        T t10 = this.f4968c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t10);

    public final void cancel() {
    }

    public final a d() {
        return a.LOCAL;
    }

    public final void e(j jVar, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f4967b, this.f4966a);
            this.f4968c = f10;
            aVar.f(f10);
        } catch (IOException e10) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.c(e10);
        }
    }

    public abstract T f(AssetManager assetManager, String str);
}

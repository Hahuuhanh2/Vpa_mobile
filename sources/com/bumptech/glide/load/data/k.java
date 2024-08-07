package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import s4.a;

/* compiled from: LocalUriFetcher */
public abstract class k<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4987a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f4988b;

    /* renamed from: c  reason: collision with root package name */
    public T f4989c;

    public k(ContentResolver contentResolver, Uri uri) {
        this.f4988b = contentResolver;
        this.f4987a = uri;
    }

    public final void b() {
        T t10 = this.f4989c;
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
            T f10 = f(this.f4988b, this.f4987a);
            this.f4989c = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.c(e10);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}

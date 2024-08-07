package com.bumptech.glide.load.data;

import com.bumptech.glide.j;

/* compiled from: DataFetcher */
public interface d<T> {

    /* compiled from: DataFetcher */
    public interface a<T> {
        void c(Exception exc);

        void f(T t10);
    }

    Class<T> a();

    void b();

    void cancel();

    s4.a d();

    void e(j jVar, a<? super T> aVar);
}

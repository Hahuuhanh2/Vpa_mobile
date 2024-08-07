package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;
import u6.d;
import y6.j;
import y6.x;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public abstract class RemoteCreator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f5522a = "com.google.android.gms.common.ui.SignInButtonCreatorImpl";

    /* renamed from: b  reason: collision with root package name */
    public x f5523b;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException() {
            super("Could not get remote context.");
        }

        public RemoteCreatorException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public abstract x a(IBinder iBinder);

    public final T b(Context context) {
        Context context2;
        if (this.f5523b == null) {
            j.f(context);
            AtomicBoolean atomicBoolean = d.f15292a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 != null) {
                try {
                    this.f5523b = a((IBinder) context2.getClassLoader().loadClass(this.f5522a).newInstance());
                } catch (ClassNotFoundException e10) {
                    throw new RemoteCreatorException("Could not load creator class.", e10);
                } catch (InstantiationException e11) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e11);
                } catch (IllegalAccessException e12) {
                    throw new RemoteCreatorException("Could not access creator.", e12);
                }
            } else {
                throw new RemoteCreatorException();
            }
        }
        return this.f5523b;
    }
}

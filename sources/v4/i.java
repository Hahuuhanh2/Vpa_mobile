package v4;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import o5.l;

/* compiled from: LruBitmapPool */
public final class i implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config f16050f = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final j f16051a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f16052b;

    /* renamed from: c  reason: collision with root package name */
    public final a f16053c;

    /* renamed from: d  reason: collision with root package name */
    public long f16054d;

    /* renamed from: e  reason: collision with root package name */
    public long f16055e;

    /* compiled from: LruBitmapPool */
    public static final class a {
    }

    public i(long j10) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f16054d = j10;
        this.f16051a = lVar;
        this.f16052b = unmodifiableSet;
        this.f16053c = new a();
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i10) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            g(this.f16054d / 2);
        }
    }

    public final void b() {
        Log.isLoggable("LruBitmapPool", 3);
        g(0);
    }

    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap f10 = f(i10, i11, config);
        if (f10 != null) {
            return f10;
        }
        if (config == null) {
            config = f16050f;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final synchronized void d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((l) this.f16051a).getClass();
                        if (((long) l.c(bitmap)) <= this.f16054d) {
                            if (this.f16052b.contains(bitmap.getConfig())) {
                                ((l) this.f16051a).getClass();
                                int c10 = l.c(bitmap);
                                ((l) this.f16051a).f(bitmap);
                                this.f16053c.getClass();
                                this.f16055e += (long) c10;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    ((l) this.f16051a).e(bitmap);
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Objects.toString(this.f16051a);
                                }
                                g(this.f16054d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((l) this.f16051a).e(bitmap);
                        bitmap.isMutable();
                        this.f16052b.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap f10 = f(i10, i11, config);
        if (f10 != null) {
            f10.eraseColor(0);
            return f10;
        }
        if (config == null) {
            config = f16050f;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final synchronized Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b10;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (config == Bitmap.Config.HARDWARE) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            j jVar = this.f16051a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f16050f;
            }
            b10 = ((l) jVar).b(i10, i11, config2);
            if (b10 != null) {
                long j10 = this.f16055e;
                ((l) this.f16051a).getClass();
                this.f16055e = j10 - ((long) l.c(b10));
                this.f16053c.getClass();
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                ((l) this.f16051a).getClass();
                l.c(l.d(config) * i10 * i11, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((l) this.f16051a).getClass();
                l.c(l.d(config) * i10 * i11, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f16051a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b10;
    }

    public final synchronized void g(long j10) {
        while (this.f16055e > j10) {
            l lVar = (l) this.f16051a;
            Bitmap c10 = lVar.f16062b.c();
            if (c10 != null) {
                lVar.a(Integer.valueOf(l.c(c10)), c10);
            }
            if (c10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f16051a);
                }
                this.f16055e = 0;
                return;
            }
            this.f16053c.getClass();
            long j11 = this.f16055e;
            ((l) this.f16051a).getClass();
            this.f16055e = j11 - ((long) l.c(c10));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((l) this.f16051a).e(c10);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f16051a);
            }
            c10.recycle();
        }
    }
}

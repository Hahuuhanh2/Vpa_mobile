package f5;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import f5.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import o5.l;
import q4.d;
import q4.e;
import s4.h;
import s4.j;
import u4.u;
import v4.c;

/* compiled from: ByteBufferGifDecoder */
public final class a implements j<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0105a f9915f = new C0105a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f9916g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f9917a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f9918b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9919c;

    /* renamed from: d  reason: collision with root package name */
    public final C0105a f9920d;

    /* renamed from: e  reason: collision with root package name */
    public final b f9921e;

    /* renamed from: f5.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferGifDecoder */
    public static class C0105a {
    }

    /* compiled from: ByteBufferGifDecoder */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f9922a = new ArrayDeque(0);

        public b() {
            char[] cArr = l.f13754a;
        }
    }

    public a(Context context, List<ImageHeaderParser> list, c cVar, v4.b bVar) {
        b bVar2 = f9916g;
        C0105a aVar = f9915f;
        this.f9917a = context.getApplicationContext();
        this.f9918b = list;
        this.f9920d = aVar;
        this.f9921e = new b(cVar, bVar);
        this.f9919c = bVar2;
    }

    public final u a(Object obj, int i10, int i11, h hVar) {
        d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.f9919c;
        synchronized (bVar) {
            d dVar2 = (d) bVar.f9922a.poll();
            if (dVar2 == null) {
                dVar2 = new d();
            }
            dVar = dVar2;
            dVar.f14341b = null;
            Arrays.fill(dVar.f14340a, (byte) 0);
            dVar.f14342c = new q4.c();
            dVar.f14343d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f14341b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f14341b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            d c10 = c(byteBuffer, i10, i11, dVar, hVar);
            b bVar2 = this.f9919c;
            synchronized (bVar2) {
                dVar.f14341b = null;
                dVar.f14342c = null;
                bVar2.f9922a.offer(dVar);
            }
            return c10;
        } catch (Throwable th2) {
            b bVar3 = this.f9919c;
            synchronized (bVar3) {
                dVar.f14341b = null;
                dVar.f14342c = null;
                bVar3.f9922a.offer(dVar);
                throw th2;
            }
        }
    }

    public final boolean b(Object obj, h hVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) hVar.c(g.f9960b)).booleanValue() || com.bumptech.glide.load.a.b(this.f9918b, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    public final d c(ByteBuffer byteBuffer, int i10, int i11, d dVar, h hVar) {
        Bitmap.Config config;
        int i12;
        int i13 = o5.h.f13744a;
        SystemClock.elapsedRealtimeNanos();
        try {
            q4.c b10 = dVar.b();
            if (b10.f14331c > 0) {
                if (b10.f14330b == 0) {
                    if (hVar.c(g.f9959a) == s4.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int min = Math.min(b10.f14335g / i11, b10.f14334f / i10);
                    if (min == 0) {
                        i12 = 0;
                    } else {
                        i12 = Integer.highestOneBit(min);
                    }
                    int max = Math.max(1, i12);
                    Log.isLoggable("BufferGifDecoder", 2);
                    C0105a aVar = this.f9920d;
                    b bVar = this.f9921e;
                    aVar.getClass();
                    ByteBuffer byteBuffer2 = byteBuffer;
                    e eVar = new e(bVar, b10, byteBuffer, max);
                    eVar.i(config);
                    eVar.c();
                    Bitmap b11 = eVar.b();
                    if (b11 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            SystemClock.elapsedRealtimeNanos();
                        }
                        return null;
                    }
                    d dVar2 = new d(new c(new c.a(new f(com.bumptech.glide.b.b(this.f9917a), eVar, i10, i11, a5.b.f103b, b11))));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return dVar2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}

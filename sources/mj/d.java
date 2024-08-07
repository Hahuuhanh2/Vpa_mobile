package mj;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import c0.b0;
import c0.v0;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import ea.c;
import ek.g;
import ek.i;
import java.nio.ByteBuffer;
import oc.a;
import rk.l;
import sk.j;

/* compiled from: QRCodeAnalyzer.kt */
public final class d implements b0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f21550a;

    /* renamed from: b  reason: collision with root package name */
    public final l<a, i> f21551b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Exception, i> f21552c;

    /* renamed from: d  reason: collision with root package name */
    public final l<Boolean, i> f21553d;

    /* renamed from: e  reason: collision with root package name */
    public final g f21554e = j7.a.b0(new c(this));

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f21555f;

    /* renamed from: g  reason: collision with root package name */
    public long f21556g;

    public d(int[] iArr, j jVar, k kVar, l lVar) {
        j.f(iArr, "barcodeFormats");
        this.f21550a = iArr;
        this.f21551b = jVar;
        this.f21552c = kVar;
        this.f21553d = lVar;
    }

    public final /* synthetic */ void a() {
    }

    public final void b(v0 v0Var) {
        boolean z10;
        int i10;
        rc.a aVar;
        boolean z11;
        Bitmap bitmap;
        v0 v0Var2 = v0Var;
        if (v0Var.r0() != null) {
            if (!this.f21555f || System.currentTimeMillis() - this.f21556g >= 1000) {
                this.f21555f = false;
                nc.a aVar2 = (nc.a) this.f21554e.getValue();
                if (aVar2 != null) {
                    Image r02 = v0Var.r0();
                    j.c(r02);
                    int d10 = v0Var2.f4361e.d();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    rc.a.b(d10);
                    if (r02.getFormat() == 256 || r02.getFormat() == 35) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y6.j.a("Only JPEG and YUV_420_888 are supported now", z10);
                    Image.Plane[] planes = r02.getPlanes();
                    if (r02.getFormat() == 256) {
                        int limit = r02.getPlanes()[0].getBuffer().limit();
                        if (r02.getFormat() == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        y6.j.a("Only JPEG is supported now", z11);
                        Image.Plane[] planes2 = r02.getPlanes();
                        if (planes2 == null || planes2.length != 1) {
                            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
                        }
                        ByteBuffer buffer = planes2[0].getBuffer();
                        buffer.rewind();
                        int remaining = buffer.remaining();
                        byte[] bArr = new byte[remaining];
                        buffer.get(bArr);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
                        int width = decodeByteArray.getWidth();
                        int height = decodeByteArray.getHeight();
                        if (d10 == 0) {
                            bitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height);
                        } else {
                            Matrix matrix = new Matrix();
                            matrix.postRotate((float) d10);
                            bitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, width, height, matrix, true);
                        }
                        aVar = new rc.a(bitmap);
                        i10 = limit;
                    } else {
                        for (Image.Plane plane : planes) {
                            if (plane.getBuffer() != null) {
                                plane.getBuffer().rewind();
                            }
                        }
                        aVar = new rc.a(r02, r02.getWidth(), r02.getHeight(), d10);
                        i10 = (r02.getPlanes()[0].getBuffer().limit() * 3) / 2;
                    }
                    zzmu.zza(zzms.zzb("vision-common"), r02.getFormat(), 5, elapsedRealtime, r02.getHeight(), r02.getWidth(), i10, d10);
                    aVar2.D(aVar).addOnSuccessListener(new ca.a(new b(this), 22)).addOnFailureListener(new c(this, 28)).addOnCompleteListener(new a(this, v0Var2));
                    return;
                }
                return;
            }
            v0Var.close();
        }
    }
}

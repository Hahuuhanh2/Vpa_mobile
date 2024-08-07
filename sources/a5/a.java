package a5;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import b5.k;
import b5.l;
import b5.q;
import s4.b;
import s4.g;
import s4.h;
import s4.i;

/* compiled from: DefaultOnHeaderDecodedListener */
public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final q f96a;

    /* renamed from: b  reason: collision with root package name */
    public final int f97b;

    /* renamed from: c  reason: collision with root package name */
    public final int f98c;

    /* renamed from: d  reason: collision with root package name */
    public final b f99d;

    /* renamed from: e  reason: collision with root package name */
    public final k f100e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f101f;

    /* renamed from: g  reason: collision with root package name */
    public final i f102g;

    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* compiled from: DefaultOnHeaderDecodedListener */
    public class C0002a implements ImageDecoder.OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i10, int i11, h hVar) {
        boolean z10;
        if (q.f4051j == null) {
            synchronized (q.class) {
                if (q.f4051j == null) {
                    q.f4051j = new q();
                }
            }
        }
        this.f96a = q.f4051j;
        this.f97b = i10;
        this.f98c = i11;
        this.f99d = (b) hVar.c(l.f4032f);
        this.f100e = (k) hVar.c(k.f4030f);
        g gVar = l.f4035i;
        if (hVar.c(gVar) == null || !((Boolean) hVar.c(gVar)).booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f101f = z10;
        this.f102g = (i) hVar.c(l.f4033g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        boolean z10 = false;
        if (this.f96a.a(this.f97b, this.f98c, this.f101f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f99d == b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0002a());
        Size size = imageInfo.getSize();
        int i10 = this.f97b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f98c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f100e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(((float) size.getWidth()) * b10);
        int round2 = Math.round(b10 * ((float) size.getHeight()));
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        i iVar = this.f102g;
        if (iVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z10 = true;
                }
                if (z10) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i12 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}

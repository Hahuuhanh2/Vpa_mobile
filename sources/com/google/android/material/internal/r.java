package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.o;
import i8.d;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f6494a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f6495b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f6496c;

    /* renamed from: d  reason: collision with root package name */
    public float f6497d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6498e = true;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<b> f6499f = new WeakReference<>((Object) null);

    /* renamed from: g  reason: collision with root package name */
    public d f6500g;

    /* compiled from: TextDrawableHelper */
    public class a extends o {
        public a() {
        }

        public final void D(int i10) {
            r rVar = r.this;
            rVar.f6498e = true;
            b bVar = rVar.f6499f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public final void E(Typeface typeface, boolean z10) {
            if (!z10) {
                r rVar = r.this;
                rVar.f6498e = true;
                b bVar = rVar.f6499f.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: TextDrawableHelper */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public r(b bVar) {
        this.f6499f = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.f6498e) {
            return this.f6496c;
        }
        b(str);
        return this.f6496c;
    }

    public final void b(String str) {
        float f10;
        float f11 = 0.0f;
        if (str == null) {
            f10 = 0.0f;
        } else {
            f10 = this.f6494a.measureText(str, 0, str.length());
        }
        this.f6496c = f10;
        if (str != null) {
            f11 = Math.abs(this.f6494a.getFontMetrics().ascent);
        }
        this.f6497d = f11;
        this.f6498e = false;
    }

    public final void c(d dVar, Context context) {
        if (this.f6500g != dVar) {
            this.f6500g = dVar;
            if (dVar != null) {
                dVar.f(context, this.f6494a, this.f6495b);
                b bVar = this.f6499f.get();
                if (bVar != null) {
                    this.f6494a.drawableState = bVar.getState();
                }
                dVar.e(context, this.f6494a, this.f6495b);
                this.f6498e = true;
            }
            b bVar2 = this.f6499f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}

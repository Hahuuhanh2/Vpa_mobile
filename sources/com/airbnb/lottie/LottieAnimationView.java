package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.c0;
import f0.b0;
import g4.e;
import j4.c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n4.d;
import n4.g;
import p3.p;
import z.k;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: y  reason: collision with root package name */
    public static final g f4737y = new g();

    /* renamed from: d  reason: collision with root package name */
    public final e0<i> f4738d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4739e;

    /* renamed from: f  reason: collision with root package name */
    public e0<Throwable> f4740f;

    /* renamed from: n  reason: collision with root package name */
    public int f4741n;

    /* renamed from: o  reason: collision with root package name */
    public final c0 f4742o;

    /* renamed from: p  reason: collision with root package name */
    public String f4743p;

    /* renamed from: q  reason: collision with root package name */
    public int f4744q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4745r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4746s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4747t;

    /* renamed from: u  reason: collision with root package name */
    public final HashSet f4748u;

    /* renamed from: v  reason: collision with root package name */
    public final HashSet f4749v;

    /* renamed from: w  reason: collision with root package name */
    public i0<i> f4750w;

    /* renamed from: x  reason: collision with root package name */
    public i f4751x;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f4752a;

        /* renamed from: b  reason: collision with root package name */
        public int f4753b;

        /* renamed from: c  reason: collision with root package name */
        public float f4754c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4755d;

        /* renamed from: e  reason: collision with root package name */
        public String f4756e;

        /* renamed from: f  reason: collision with root package name */
        public int f4757f;

        /* renamed from: n  reason: collision with root package name */
        public int f4758n;

        public class a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f4752a);
            parcel.writeFloat(this.f4754c);
            parcel.writeInt(this.f4755d ? 1 : 0);
            parcel.writeString(this.f4756e);
            parcel.writeInt(this.f4757f);
            parcel.writeInt(this.f4758n);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4752a = parcel.readString();
            this.f4754c = parcel.readFloat();
            this.f4755d = parcel.readInt() != 1 ? false : true;
            this.f4756e = parcel.readString();
            this.f4757f = parcel.readInt();
            this.f4758n = parcel.readInt();
        }
    }

    public class a implements e0<Throwable> {
        public a() {
        }

        public final void onResult(Object obj) {
            Throwable th2 = (Throwable) obj;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i10 = lottieAnimationView.f4741n;
            if (i10 != 0) {
                lottieAnimationView.setImageResource(i10);
            }
            e0 e0Var = LottieAnimationView.this.f4740f;
            if (e0Var == null) {
                e0Var = LottieAnimationView.f4737y;
            }
            e0Var.onResult(th2);
        }
    }

    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    static {
        Class<LottieAnimationView> cls = LottieAnimationView.class;
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f4738d = new e(this, 0);
        this.f4739e = new a();
        this.f4741n = 0;
        this.f4742o = new c0();
        this.f4745r = false;
        this.f4746s = false;
        this.f4747t = true;
        this.f4748u = new HashSet();
        this.f4749v = new HashSet();
        d((AttributeSet) null, R$attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(i0<i> i0Var) {
        Throwable th2;
        V v2;
        this.f4748u.add(b.SET_ANIMATION);
        this.f4751x = null;
        this.f4742o.d();
        c();
        e0<i> e0Var = this.f4738d;
        synchronized (i0Var) {
            h0<T> h0Var = i0Var.f4851d;
            if (!(h0Var == null || (v2 = h0Var.f4830a) == null)) {
                e0Var.onResult(v2);
            }
            i0Var.f4848a.add(e0Var);
        }
        a aVar = this.f4739e;
        synchronized (i0Var) {
            h0<T> h0Var2 = i0Var.f4851d;
            if (!(h0Var2 == null || (th2 = h0Var2.f4831b) == null)) {
                aVar.onResult(th2);
            }
            i0Var.f4849b.add(aVar);
        }
        this.f4750w = i0Var;
    }

    public final void c() {
        i0<i> i0Var = this.f4750w;
        if (i0Var != null) {
            e0<i> e0Var = this.f4738d;
            synchronized (i0Var) {
                i0Var.f4848a.remove(e0Var);
            }
            i0<i> i0Var2 = this.f4750w;
            a aVar = this.f4739e;
            synchronized (i0Var2) {
                i0Var2.f4849b.remove(aVar);
            }
        }
    }

    public final void d(AttributeSet attributeSet, int i10) {
        String string;
        boolean z10 = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView, i10, 0);
        this.f4747t = obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i11 = R$styleable.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        int i12 = R$styleable.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i12);
        int i13 = R$styleable.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i13);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i11, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i12);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i13)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_fallbackRes, 0));
            if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
                this.f4746s = true;
            }
            if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
                this.f4742o.f4773b.setRepeatCount(-1);
            }
            int i14 = R$styleable.LottieAnimationView_lottie_repeatMode;
            if (obtainStyledAttributes.hasValue(i14)) {
                setRepeatMode(obtainStyledAttributes.getInt(i14, 1));
            }
            int i15 = R$styleable.LottieAnimationView_lottie_repeatCount;
            if (obtainStyledAttributes.hasValue(i15)) {
                setRepeatCount(obtainStyledAttributes.getInt(i15, -1));
            }
            int i16 = R$styleable.LottieAnimationView_lottie_speed;
            if (obtainStyledAttributes.hasValue(i16)) {
                setSpeed(obtainStyledAttributes.getFloat(i16, 1.0f));
            }
            int i17 = R$styleable.LottieAnimationView_lottie_clipToCompositionBounds;
            if (obtainStyledAttributes.hasValue(i17)) {
                setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i17, true));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
            setProgress(obtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_progress, 0.0f));
            boolean z11 = obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false);
            c0 c0Var = this.f4742o;
            if (c0Var.f4782r != z11) {
                c0Var.f4782r = z11;
                if (c0Var.f4772a != null) {
                    c0Var.c();
                }
            }
            int i18 = R$styleable.LottieAnimationView_lottie_colorFilter;
            if (obtainStyledAttributes.hasValue(i18)) {
                l0 l0Var = new l0(k1.a.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i18, -1)).getDefaultColor());
                this.f4742o.a(new e("**"), g0.K, new k(l0Var));
            }
            int i19 = R$styleable.LottieAnimationView_lottie_renderMode;
            if (obtainStyledAttributes.hasValue(i19)) {
                int i20 = obtainStyledAttributes.getInt(i19, 0);
                if (i20 >= k0.values().length) {
                    i20 = 0;
                }
                setRenderMode(k0.values()[i20]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
            obtainStyledAttributes.recycle();
            c0 c0Var2 = this.f4742o;
            Context context = getContext();
            g.a aVar = g.f13513a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            c0Var2.getClass();
            c0Var2.f4774c = valueOf.booleanValue();
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    public boolean getClipToCompositionBounds() {
        return this.f4742o.f4784t;
    }

    public i getComposition() {
        return this.f4751x;
    }

    public long getDuration() {
        i iVar = this.f4751x;
        if (iVar != null) {
            return (long) iVar.b();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.f4742o.f4773b.f13505f;
    }

    public String getImageAssetsFolder() {
        return this.f4742o.f4780p;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f4742o.f4783s;
    }

    public float getMaxFrame() {
        return this.f4742o.f4773b.c();
    }

    public float getMinFrame() {
        return this.f4742o.f4773b.e();
    }

    public j0 getPerformanceTracker() {
        i iVar = this.f4742o.f4772a;
        if (iVar != null) {
            return iVar.f4832a;
        }
        return null;
    }

    public float getProgress() {
        d dVar = this.f4742o.f4773b;
        i iVar = dVar.f13509q;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = dVar.f13505f;
        float f11 = iVar.f4842k;
        return (f10 - f11) / (iVar.f4843l - f11);
    }

    public k0 getRenderMode() {
        if (this.f4742o.A) {
            return k0.SOFTWARE;
        }
        return k0.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f4742o.f4773b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f4742o.f4773b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f4742o.f4773b.f13502c;
    }

    public final void invalidate() {
        k0 k0Var;
        k0 k0Var2 = k0.SOFTWARE;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof c0) {
            if (((c0) drawable).A) {
                k0Var = k0Var2;
            } else {
                k0Var = k0.HARDWARE;
            }
            if (k0Var == k0Var2) {
                this.f4742o.invalidateSelf();
            }
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        c0 c0Var = this.f4742o;
        if (drawable2 == c0Var) {
            super.invalidateDrawable(c0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f4746s) {
            this.f4742o.i();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4743p = savedState.f4752a;
        HashSet hashSet = this.f4748u;
        b bVar = b.SET_ANIMATION;
        if (!hashSet.contains(bVar) && !TextUtils.isEmpty(this.f4743p)) {
            setAnimation(this.f4743p);
        }
        this.f4744q = savedState.f4753b;
        if (!this.f4748u.contains(bVar) && (i10 = this.f4744q) != 0) {
            setAnimation(i10);
        }
        if (!this.f4748u.contains(b.SET_PROGRESS)) {
            setProgress(savedState.f4754c);
        }
        HashSet hashSet2 = this.f4748u;
        b bVar2 = b.PLAY_OPTION;
        if (!hashSet2.contains(bVar2) && savedState.f4755d) {
            this.f4748u.add(bVar2);
            this.f4742o.i();
        }
        if (!this.f4748u.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f4756e);
        }
        if (!this.f4748u.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f4757f);
        }
        if (!this.f4748u.contains(b.SET_REPEAT_COUNT)) {
            setRepeatCount(savedState.f4758n);
        }
    }

    public final Parcelable onSaveInstanceState() {
        float f10;
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4752a = this.f4743p;
        savedState.f4753b = this.f4744q;
        c0 c0Var = this.f4742o;
        d dVar = c0Var.f4773b;
        i iVar = dVar.f13509q;
        if (iVar == null) {
            f10 = 0.0f;
        } else {
            float f11 = dVar.f13505f;
            float f12 = iVar.f4842k;
            f10 = (f11 - f12) / (iVar.f4843l - f12);
        }
        savedState.f4754c = f10;
        if (c0Var.isVisible()) {
            z10 = c0Var.f4773b.f13510r;
        } else {
            int i10 = c0Var.f4777f;
            if (i10 == 2 || i10 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        savedState.f4755d = z10;
        c0 c0Var2 = this.f4742o;
        savedState.f4756e = c0Var2.f4780p;
        savedState.f4757f = c0Var2.f4773b.getRepeatMode();
        savedState.f4758n = this.f4742o.f4773b.getRepeatCount();
        return savedState;
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(p.a(str, new j(0, inputStream, str)));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        i0<i> i0Var;
        if (this.f4747t) {
            Context context = getContext();
            HashMap hashMap = p.f4876a;
            String r10 = b0.r("url_", str);
            i0Var = p.a(r10, new p(context, str, r10));
        } else {
            i0Var = p.a((String) null, new p(getContext(), str, (String) null));
        }
        setCompositionTask(i0Var);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f4742o.f4789y = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.f4747t = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        c0 c0Var = this.f4742o;
        if (z10 != c0Var.f4784t) {
            c0Var.f4784t = z10;
            c cVar = c0Var.f4785u;
            if (cVar != null) {
                cVar.H = z10;
            }
            c0Var.invalidateSelf();
        }
    }

    public void setComposition(i iVar) {
        boolean z10;
        this.f4742o.setCallback(this);
        this.f4751x = iVar;
        boolean z11 = true;
        this.f4745r = true;
        c0 c0Var = this.f4742o;
        boolean z12 = false;
        if (c0Var.f4772a == iVar) {
            z11 = false;
        } else {
            c0Var.N = true;
            c0Var.d();
            c0Var.f4772a = iVar;
            c0Var.c();
            d dVar = c0Var.f4773b;
            if (dVar.f13509q == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            dVar.f13509q = iVar;
            if (z10) {
                dVar.k(Math.max(dVar.f13507o, iVar.f4842k), Math.min(dVar.f13508p, iVar.f4843l));
            } else {
                dVar.k((float) ((int) iVar.f4842k), (float) ((int) iVar.f4843l));
            }
            float f10 = dVar.f13505f;
            dVar.f13505f = 0.0f;
            dVar.j((float) ((int) f10));
            dVar.b();
            c0Var.w(c0Var.f4773b.getAnimatedFraction());
            Iterator it = new ArrayList(c0Var.f4778n).iterator();
            while (it.hasNext()) {
                c0.b bVar = (c0.b) it.next();
                if (bVar != null) {
                    bVar.run();
                }
                it.remove();
            }
            c0Var.f4778n.clear();
            iVar.f4832a.f4856a = c0Var.f4787w;
            c0Var.e();
            Drawable.Callback callback = c0Var.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(c0Var);
            }
        }
        this.f4745r = false;
        Drawable drawable = getDrawable();
        c0 c0Var2 = this.f4742o;
        if (drawable != c0Var2 || z11) {
            if (!z11) {
                d dVar2 = c0Var2.f4773b;
                if (dVar2 != null) {
                    z12 = dVar2.f13510r;
                }
                setImageDrawable((Drawable) null);
                setImageDrawable(this.f4742o);
                if (z12) {
                    this.f4742o.k();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f4749v.iterator();
            while (it2.hasNext()) {
                ((f0) it2.next()).a();
            }
        }
    }

    public void setFailureListener(e0<Throwable> e0Var) {
        this.f4740f = e0Var;
    }

    public void setFallbackResource(int i10) {
        this.f4741n = i10;
    }

    public void setFontAssetDelegate(a aVar) {
        f4.a aVar2 = this.f4742o.f4781q;
    }

    public void setFrame(int i10) {
        this.f4742o.l(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f4742o.f4775d = z10;
    }

    public void setImageAssetDelegate(b bVar) {
        c0 c0Var = this.f4742o;
        c0Var.getClass();
        f4.b bVar2 = c0Var.f4779o;
        if (bVar2 != null) {
            bVar2.getClass();
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f4742o.f4780p = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i10) {
        c();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f4742o.f4783s = z10;
    }

    public void setMaxFrame(int i10) {
        this.f4742o.m(i10);
    }

    public void setMaxProgress(float f10) {
        this.f4742o.o(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f4742o.q(str);
    }

    public void setMinAndMaxProgress(float f10, float f11) {
        this.f4742o.s(f10, f11);
    }

    public void setMinFrame(int i10) {
        this.f4742o.t(i10);
    }

    public void setMinProgress(float f10) {
        this.f4742o.v(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        c0 c0Var = this.f4742o;
        if (c0Var.f4788x != z10) {
            c0Var.f4788x = z10;
            c cVar = c0Var.f4785u;
            if (cVar != null) {
                cVar.s(z10);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        c0 c0Var = this.f4742o;
        c0Var.f4787w = z10;
        i iVar = c0Var.f4772a;
        if (iVar != null) {
            iVar.f4832a.f4856a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f4748u.add(b.SET_PROGRESS);
        this.f4742o.w(f10);
    }

    public void setRenderMode(k0 k0Var) {
        c0 c0Var = this.f4742o;
        c0Var.f4790z = k0Var;
        c0Var.e();
    }

    public void setRepeatCount(int i10) {
        this.f4748u.add(b.SET_REPEAT_COUNT);
        this.f4742o.f4773b.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f4748u.add(b.SET_REPEAT_MODE);
        this.f4742o.f4773b.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f4742o.f4776e = z10;
    }

    public void setSpeed(float f10) {
        this.f4742o.f4773b.f13502c = f10;
    }

    public void setTextDelegate(m0 m0Var) {
        this.f4742o.getClass();
    }

    public final void unscheduleDrawable(Drawable drawable) {
        c0 c0Var;
        boolean z10;
        boolean z11 = this.f4745r;
        boolean z12 = false;
        if (!z11 && drawable == (c0Var = this.f4742o)) {
            d dVar = c0Var.f4773b;
            if (dVar == null) {
                z10 = false;
            } else {
                z10 = dVar.f13510r;
            }
            if (z10) {
                this.f4746s = false;
                c0Var.h();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z11 && (drawable instanceof c0)) {
            c0 c0Var2 = (c0) drawable;
            d dVar2 = c0Var2.f4773b;
            if (dVar2 != null) {
                z12 = dVar2.f13510r;
            }
            if (z12) {
                c0Var2.h();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f4742o.n(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z10) {
        this.f4742o.r(str, str2, z10);
    }

    public void setMinFrame(String str) {
        this.f4742o.u(str);
    }

    public void setAnimation(int i10) {
        i0<i> i0Var;
        i0<i> i0Var2;
        this.f4744q = i10;
        this.f4743p = null;
        if (isInEditMode()) {
            i0Var = new i0<>(new d(this, i10), true);
        } else {
            if (this.f4747t) {
                Context context = getContext();
                String h10 = p.h(context, i10);
                i0Var2 = p.a(h10, new o(new WeakReference(context), context.getApplicationContext(), i10, h10));
            } else {
                Context context2 = getContext();
                HashMap hashMap = p.f4876a;
                i0Var2 = p.a((String) null, new o(new WeakReference(context2), context2.getApplicationContext(), i10, (String) null));
            }
            i0Var = i0Var2;
        }
        setCompositionTask(i0Var);
    }

    public void setMinAndMaxFrame(int i10, int i11) {
        this.f4742o.p(i10, i11);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4738d = new f(this);
        this.f4739e = new a();
        this.f4741n = 0;
        this.f4742o = new c0();
        this.f4745r = false;
        this.f4746s = false;
        this.f4747t = true;
        this.f4748u = new HashSet();
        this.f4749v = new HashSet();
        d(attributeSet, R$attr.lottieAnimationViewStyle);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(p.a(str2, new p(getContext(), str, str2)));
    }

    public void setAnimation(String str) {
        i0<i> i0Var;
        i0<i> i0Var2;
        this.f4743p = str;
        this.f4744q = 0;
        if (isInEditMode()) {
            i0Var = new i0<>(new h(0, this, str), true);
        } else {
            if (this.f4747t) {
                Context context = getContext();
                HashMap hashMap = p.f4876a;
                String r10 = b0.r("asset_", str);
                i0Var2 = p.a(r10, new n(context.getApplicationContext(), str, r10));
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = p.f4876a;
                i0Var2 = p.a((String) null, new n(context2.getApplicationContext(), str, (String) null));
            }
            i0Var = i0Var2;
        }
        setCompositionTask(i0Var);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4738d = new e(this, 1);
        this.f4739e = new a();
        this.f4741n = 0;
        this.f4742o = new c0();
        this.f4745r = false;
        this.f4746s = false;
        this.f4747t = true;
        this.f4748u = new HashSet();
        this.f4749v = new HashSet();
        d(attributeSet, i10);
    }
}

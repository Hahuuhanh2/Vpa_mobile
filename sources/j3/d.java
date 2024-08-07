package j3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import o1.a;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AnimatedVectorDrawableCompat */
public final class d extends h implements Animatable {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f11554n = 0;

    /* renamed from: b  reason: collision with root package name */
    public b f11555b;

    /* renamed from: c  reason: collision with root package name */
    public Context f11556c;

    /* renamed from: d  reason: collision with root package name */
    public e f11557d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<c> f11558e;

    /* renamed from: f  reason: collision with root package name */
    public final a f11559f;

    /* compiled from: AnimatedVectorDrawableCompat */
    public class a implements Drawable.Callback {
        public a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            d.this.scheduleSelf(runnable, j10);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f11561a;

        /* renamed from: b  reason: collision with root package name */
        public AnimatorSet f11562b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Animator> f11563c;

        /* renamed from: d  reason: collision with root package name */
        public v0.b<Animator, String> f11564d;

        public b(a aVar) {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public d() {
        this((Context) null);
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f11555b.f11561a.draw(canvas);
        if (this.f11555b.f11562b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return a.C0166a.a(drawable);
        }
        return this.f11555b.f11561a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f11555b.getClass();
        return changingConfigurations | 0;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f11555b.f11561a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f11569a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f11569a.getConstantState());
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f11555b.f11561a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f11555b.f11561a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f11555b.f11561a.getOpacity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ IOException | XmlPullParserException -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0083 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            r3 = r24
            android.graphics.drawable.Drawable r4 = r1.f11569a
            if (r4 == 0) goto L_0x0012
            r5 = r22
            o1.a.b.d(r4, r0, r5, r2, r3)
            return
        L_0x0012:
            r5 = r22
            int r4 = r22.getEventType()
            int r6 = r22.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001e:
            if (r4 == r7) goto L_0x017e
            int r8 = r22.getDepth()
            if (r8 >= r6) goto L_0x0029
            r8 = 3
            if (r4 == r8) goto L_0x017e
        L_0x0029:
            r8 = 2
            if (r4 != r8) goto L_0x0178
            java.lang.String r4 = r22.getName()
            java.lang.String r9 = "animated-vector"
            boolean r9 = r9.equals(r4)
            r10 = 24
            r11 = 0
            r12 = 0
            if (r9 == 0) goto L_0x00a5
            int[] r4 = j3.a.f11545e
            android.content.res.TypedArray r4 = m1.i.f(r0, r3, r2, r4)
            int r9 = r4.getResourceId(r11, r11)
            if (r9 == 0) goto L_0x00a0
            android.graphics.PorterDuff$Mode r13 = j3.i.f11570q
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L_0x0067
            j3.i r8 = new j3.i
            r8.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r10 = m1.e.f13062a
            android.graphics.drawable.Drawable r9 = m1.e.a.a(r0, r9, r3)
            r8.f11569a = r9
            j3.i$h r9 = new j3.i$h
            android.graphics.drawable.Drawable r10 = r8.f11569a
            android.graphics.drawable.Drawable$ConstantState r10 = r10.getConstantState()
            r9.<init>(r10)
            goto L_0x008c
        L_0x0067:
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
        L_0x006f:
            int r13 = r9.next()     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            if (r13 == r8) goto L_0x0078
            if (r13 == r7) goto L_0x0078
            goto L_0x006f
        L_0x0078:
            if (r13 != r8) goto L_0x0083
            j3.i r8 = new j3.i     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            r8.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            r8.inflate(r0, r9, r10, r3)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            goto L_0x008c
        L_0x0083:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            java.lang.String r9 = "No start tag found"
            r8.<init>(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            throw r8     // Catch:{ IOException | XmlPullParserException -> 0x008b }
        L_0x008b:
            r8 = r12
        L_0x008c:
            r8.f11575f = r11
            j3.d$a r9 = r1.f11559f
            r8.setCallback(r9)
            j3.d$b r9 = r1.f11555b
            j3.i r9 = r9.f11561a
            if (r9 == 0) goto L_0x009c
            r9.setCallback(r12)
        L_0x009c:
            j3.d$b r9 = r1.f11555b
            r9.f11561a = r8
        L_0x00a0:
            r4.recycle()
            goto L_0x0178
        L_0x00a5:
            java.lang.String r8 = "target"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0178
            int[] r4 = j3.a.f11546f
            android.content.res.TypedArray r4 = r0.obtainAttributes(r2, r4)
            java.lang.String r8 = r4.getString(r11)
            int r9 = r4.getResourceId(r7, r11)
            if (r9 == 0) goto L_0x0175
            android.content.Context r13 = r1.f11556c
            if (r13 == 0) goto L_0x016a
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r10) goto L_0x00ca
            android.animation.Animator r9 = android.animation.AnimatorInflater.loadAnimator(r13, r9)
            goto L_0x00e9
        L_0x00ca:
            android.content.res.Resources r14 = r13.getResources()
            android.content.res.Resources$Theme r15 = r13.getTheme()
            java.lang.String r10 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r11 = r14.getAnimation(r9)     // Catch:{ XmlPullParserException -> 0x0147, IOException -> 0x012a }
            android.util.AttributeSet r17 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0125, IOException -> 0x0122, all -> 0x011f }
            r18 = 0
            r19 = 0
            r16 = r11
            android.animation.Animator r9 = j3.f.a(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ XmlPullParserException -> 0x0125, IOException -> 0x0122, all -> 0x011f }
            r11.close()
        L_0x00e9:
            j3.d$b r10 = r1.f11555b
            j3.i r10 = r10.f11561a
            j3.i$g r10 = r10.f11571b
            j3.i$f r10 = r10.f11623b
            v0.b<java.lang.String, java.lang.Object> r10 = r10.f11621o
            java.lang.Object r10 = r10.getOrDefault(r8, r12)
            r9.setTarget(r10)
            j3.d$b r10 = r1.f11555b
            java.util.ArrayList<android.animation.Animator> r11 = r10.f11563c
            if (r11 != 0) goto L_0x0110
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f11563c = r11
            j3.d$b r10 = r1.f11555b
            v0.b r11 = new v0.b
            r11.<init>()
            r10.f11564d = r11
        L_0x0110:
            j3.d$b r10 = r1.f11555b
            java.util.ArrayList<android.animation.Animator> r10 = r10.f11563c
            r10.add(r9)
            j3.d$b r10 = r1.f11555b
            v0.b<android.animation.Animator, java.lang.String> r10 = r10.f11564d
            r10.put(r9, r8)
            goto L_0x0175
        L_0x011f:
            r0 = move-exception
            r12 = r11
            goto L_0x0164
        L_0x0122:
            r0 = move-exception
            r12 = r11
            goto L_0x012b
        L_0x0125:
            r0 = move-exception
            r12 = r11
            goto L_0x0148
        L_0x0128:
            r0 = move-exception
            goto L_0x0164
        L_0x012a:
            r0 = move-exception
        L_0x012b:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r3.<init>()     // Catch:{ all -> 0x0128 }
            r3.append(r10)     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0128 }
            r3.append(r4)     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0128 }
            r2.<init>(r3)     // Catch:{ all -> 0x0128 }
            r2.initCause(r0)     // Catch:{ all -> 0x0128 }
            throw r2     // Catch:{ all -> 0x0128 }
        L_0x0147:
            r0 = move-exception
        L_0x0148:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r3.<init>()     // Catch:{ all -> 0x0128 }
            r3.append(r10)     // Catch:{ all -> 0x0128 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0128 }
            r3.append(r4)     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0128 }
            r2.<init>(r3)     // Catch:{ all -> 0x0128 }
            r2.initCause(r0)     // Catch:{ all -> 0x0128 }
            throw r2     // Catch:{ all -> 0x0128 }
        L_0x0164:
            if (r12 == 0) goto L_0x0169
            r12.close()
        L_0x0169:
            throw r0
        L_0x016a:
            r4.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0175:
            r4.recycle()
        L_0x0178:
            int r4 = r22.next()
            goto L_0x001e
        L_0x017e:
            j3.d$b r0 = r1.f11555b
            android.animation.AnimatorSet r2 = r0.f11562b
            if (r2 != 0) goto L_0x018b
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f11562b = r2
        L_0x018b:
            android.animation.AnimatorSet r2 = r0.f11562b
            java.util.ArrayList<android.animation.Animator> r0 = r0.f11563c
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return a.C0166a.d(drawable);
        }
        return this.f11555b.f11561a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f11555b.f11562b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f11555b.f11561a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f11555b.f11561a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f11555b.f11561a.setLevel(i10);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f11555b.f11561a.setState(iArr);
    }

    public final void setAlpha(int i10) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f11555b.f11561a.setAlpha(i10);
        }
    }

    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            a.C0166a.e(drawable, z10);
        } else {
            this.f11555b.f11561a.setAutoMirrored(z10);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11555b.f11561a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i10) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            o1.a.a(drawable, i10);
        } else {
            this.f11555b.f11561a.setTint(i10);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            o1.a.b(drawable, colorStateList);
        } else {
            this.f11555b.f11561a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            o1.a.c(drawable, mode);
        } else {
            this.f11555b.f11561a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f11555b.f11561a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    public final void start() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f11555b.f11562b.isStarted()) {
            this.f11555b.f11562b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f11569a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f11555b.f11562b.end();
        }
    }

    public d(Context context) {
        this.f11557d = null;
        this.f11558e = null;
        a aVar = new a();
        this.f11559f = aVar;
        this.f11556c = context;
        this.f11555b = new b(aVar);
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f11565a;

        public c(Drawable.ConstantState constantState) {
            this.f11565a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f11565a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f11565a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable newDrawable = this.f11565a.newDrawable();
            dVar.f11569a = newDrawable;
            newDrawable.setCallback(dVar.f11559f);
            return dVar;
        }

        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable newDrawable = this.f11565a.newDrawable(resources);
            dVar.f11569a = newDrawable;
            newDrawable.setCallback(dVar.f11559f);
            return dVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable newDrawable = this.f11565a.newDrawable(resources, theme);
            dVar.f11569a = newDrawable;
            newDrawable.setCallback(dVar.f11559f);
            return dVar;
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}

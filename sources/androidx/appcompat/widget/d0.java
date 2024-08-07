package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$drawable;
import androidx.appcompat.widget.g;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import v0.h;
import v0.i;

/* compiled from: ResourceManagerInternal */
public final class d0 {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1073h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    public static d0 f1074i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f1075j = new c();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, i<ColorStateList>> f1076a;

    /* renamed from: b  reason: collision with root package name */
    public h<String, e> f1077b;

    /* renamed from: c  reason: collision with root package name */
    public i<String> f1078c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, v0.e<WeakReference<Drawable.ConstantState>>> f1079d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1080e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1081f;

    /* renamed from: g  reason: collision with root package name */
    public f f1082g;

    /* compiled from: ResourceManagerInternal */
    public static class a implements e {
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.a.g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    public static class b implements e {
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                j3.d dVar = new j3.d(context);
                dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return dVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    public static class c extends v0.f<Integer, PorterDuffColorFilter> {
        public c() {
            super(6);
        }
    }

    /* compiled from: ResourceManagerInternal */
    public static class d implements e {
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                j.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                return drawable;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    public interface e {
        Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal */
    public interface f {
    }

    /* compiled from: ResourceManagerInternal */
    public static class g implements e {
        public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                j3.i iVar = new j3.i();
                iVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                return iVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static synchronized d0 d() {
        d0 d0Var;
        synchronized (d0.class) {
            if (f1074i == null) {
                d0 d0Var2 = new d0();
                f1074i = d0Var2;
                j(d0Var2);
            }
            d0Var = f1074i;
        }
        return d0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (d0.class) {
            c cVar = f1075j;
            cVar.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.get(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                cVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(d0 d0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            d0Var.a("vector", new g());
            d0Var.a("animated-vector", new b());
            d0Var.a("animated-selector", new a());
            d0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1077b == null) {
            this.f1077b = new h<>();
        }
        this.f1077b.put(str, eVar);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            v0.e eVar = this.f1079d.get(context);
            if (eVar == null) {
                eVar = new v0.e();
                this.f1079d.put(context, eVar);
            }
            eVar.j(new WeakReference(constantState), j10);
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.f1080e == null) {
            this.f1080e = new TypedValue();
        }
        TypedValue typedValue = this.f1080e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f1082g != null) {
            if (i10 == R$drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R$drawable.abc_cab_background_internal_bg), f(context, R$drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R$drawable.abc_ratingbar_material) {
                layerDrawable = g.a.c(this, context, R$dimen.abc_star_big);
            } else if (i10 == R$drawable.abc_ratingbar_indicator_material) {
                layerDrawable = g.a.c(this, context, R$dimen.abc_star_medium);
            } else if (i10 == R$drawable.abc_ratingbar_small_material) {
                layerDrawable = g.a.c(this, context, R$dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, v0.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1079d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            v0.e r0 = (v0.e) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.f(r1, r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.k(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0 == false) goto L_0x0196;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e1 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ed A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0183 A[Catch:{ all -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0191 A[Catch:{ all -> 0x00cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r13, int r14, boolean r15) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f1081f     // Catch:{ all -> 0x00cb }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            goto L_0x002c
        L_0x0008:
            r12.f1081f = r2     // Catch:{ all -> 0x00cb }
            int r0 = androidx.appcompat.resources.R$drawable.abc_vector_test     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r0 = r12.f(r13, r0)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0196
            boolean r3 = r0 instanceof j3.i     // Catch:{ all -> 0x00cb }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00cb }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 == 0) goto L_0x0196
        L_0x002c:
            v0.h<java.lang.String, androidx.appcompat.widget.d0$e> r0 = r12.f1077b     // Catch:{ all -> 0x00cb }
            r3 = 0
            if (r0 == 0) goto L_0x00de
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x00de
            v0.i<java.lang.String> r0 = r12.f1078c     // Catch:{ all -> 0x00cb }
            java.lang.String r4 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r0.c(r14, r3)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00cb }
            boolean r5 = r4.equals(r0)     // Catch:{ all -> 0x00cb }
            if (r5 != 0) goto L_0x00de
            if (r0 == 0) goto L_0x005c
            v0.h<java.lang.String, androidx.appcompat.widget.d0$e> r5 = r12.f1077b     // Catch:{ all -> 0x00cb }
            java.lang.Object r0 = r5.getOrDefault(r0, r3)     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x005c
            goto L_0x00de
        L_0x0055:
            v0.i r0 = new v0.i     // Catch:{ all -> 0x00cb }
            r0.<init>()     // Catch:{ all -> 0x00cb }
            r12.f1078c = r0     // Catch:{ all -> 0x00cb }
        L_0x005c:
            android.util.TypedValue r0 = r12.f1080e     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x0067
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x00cb }
            r0.<init>()     // Catch:{ all -> 0x00cb }
            r12.f1080e = r0     // Catch:{ all -> 0x00cb }
        L_0x0067:
            android.util.TypedValue r0 = r12.f1080e     // Catch:{ all -> 0x00cb }
            android.content.res.Resources r5 = r13.getResources()     // Catch:{ all -> 0x00cb }
            r5.getValue(r14, r0, r2)     // Catch:{ all -> 0x00cb }
            int r6 = r0.assetCookie     // Catch:{ all -> 0x00cb }
            long r6 = (long) r6     // Catch:{ all -> 0x00cb }
            r8 = 32
            long r6 = r6 << r8
            int r8 = r0.data     // Catch:{ all -> 0x00cb }
            long r8 = (long) r8     // Catch:{ all -> 0x00cb }
            long r6 = r6 | r8
            android.graphics.drawable.Drawable r8 = r12.e(r13, r6)     // Catch:{ all -> 0x00cb }
            if (r8 == 0) goto L_0x0081
            goto L_0x00df
        L_0x0081:
            java.lang.CharSequence r9 = r0.string     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00d6
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = ".xml"
            boolean r9 = r9.endsWith(r10)     // Catch:{ all -> 0x00cb }
            if (r9 == 0) goto L_0x00d6
            android.content.res.XmlResourceParser r5 = r5.getXml(r14)     // Catch:{ Exception -> 0x00d6 }
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r5)     // Catch:{ Exception -> 0x00d6 }
        L_0x0099:
            int r10 = r5.next()     // Catch:{ Exception -> 0x00d6 }
            r11 = 2
            if (r10 == r11) goto L_0x00a3
            if (r10 == r2) goto L_0x00a3
            goto L_0x0099
        L_0x00a3:
            if (r10 != r11) goto L_0x00ce
            java.lang.String r10 = r5.getName()     // Catch:{ Exception -> 0x00d6 }
            v0.i<java.lang.String> r11 = r12.f1078c     // Catch:{ Exception -> 0x00d6 }
            r11.a(r14, r10)     // Catch:{ Exception -> 0x00d6 }
            v0.h<java.lang.String, androidx.appcompat.widget.d0$e> r11 = r12.f1077b     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r10 = r11.getOrDefault(r10, r3)     // Catch:{ Exception -> 0x00d6 }
            androidx.appcompat.widget.d0$e r10 = (androidx.appcompat.widget.d0.e) r10     // Catch:{ Exception -> 0x00d6 }
            if (r10 == 0) goto L_0x00c0
            android.content.res.Resources$Theme r11 = r13.getTheme()     // Catch:{ Exception -> 0x00d6 }
            android.graphics.drawable.Drawable r8 = r10.a(r13, r5, r9, r11)     // Catch:{ Exception -> 0x00d6 }
        L_0x00c0:
            if (r8 == 0) goto L_0x00d6
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00d6 }
            r8.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00d6 }
            r12.b(r13, r6, r8)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00d6
        L_0x00cb:
            r13 = move-exception
            goto L_0x01a0
        L_0x00ce:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r5 = "No start tag found"
            r0.<init>(r5)     // Catch:{ Exception -> 0x00d6 }
            throw r0     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            if (r8 != 0) goto L_0x00df
            v0.i<java.lang.String> r0 = r12.f1078c     // Catch:{ all -> 0x00cb }
            r0.a(r14, r4)     // Catch:{ all -> 0x00cb }
            goto L_0x00df
        L_0x00de:
            r8 = r3
        L_0x00df:
            if (r8 != 0) goto L_0x00e5
            android.graphics.drawable.Drawable r8 = r12.c(r13, r14)     // Catch:{ all -> 0x00cb }
        L_0x00e5:
            if (r8 != 0) goto L_0x00eb
            android.graphics.drawable.Drawable r8 = k1.a.getDrawable(r13, r14)     // Catch:{ all -> 0x00cb }
        L_0x00eb:
            if (r8 == 0) goto L_0x018f
            android.content.res.ColorStateList r0 = r12.i(r13, r14)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x010f
            int[] r13 = androidx.appcompat.widget.x.f1237a     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r13 = r8.mutate()     // Catch:{ all -> 0x00cb }
            o1.a.b.h(r13, r0)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.d0$f r15 = r12.f1082g     // Catch:{ all -> 0x00cb }
            if (r15 != 0) goto L_0x0101
            goto L_0x0107
        L_0x0101:
            int r15 = androidx.appcompat.R$drawable.abc_switch_thumb_material     // Catch:{ all -> 0x00cb }
            if (r14 != r15) goto L_0x0107
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x00cb }
        L_0x0107:
            if (r3 == 0) goto L_0x010c
            o1.a.b.i(r13, r3)     // Catch:{ all -> 0x00cb }
        L_0x010c:
            r3 = r13
            goto L_0x018e
        L_0x010f:
            androidx.appcompat.widget.d0$f r0 = r12.f1082g     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0184
            int r0 = androidx.appcompat.R$drawable.abc_seekbar_track_material     // Catch:{ all -> 0x00cb }
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r14 != r0) goto L_0x014a
            r0 = r8
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r1 = r0.findDrawableByLayerId(r6)     // Catch:{ all -> 0x00cb }
            int r6 = androidx.appcompat.R$attr.colorControlNormal     // Catch:{ all -> 0x00cb }
            int r7 = androidx.appcompat.widget.i0.c(r13, r6)     // Catch:{ all -> 0x00cb }
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.g.f1103b     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.g.a.e(r1, r7, r9)     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r1 = r0.findDrawableByLayerId(r5)     // Catch:{ all -> 0x00cb }
            int r5 = androidx.appcompat.widget.i0.c(r13, r6)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.g.a.e(r1, r5, r9)     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r4)     // Catch:{ all -> 0x00cb }
            int r1 = androidx.appcompat.R$attr.colorControlActivated     // Catch:{ all -> 0x00cb }
            int r1 = androidx.appcompat.widget.i0.c(r13, r1)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.g.a.e(r0, r1, r9)     // Catch:{ all -> 0x00cb }
            goto L_0x0180
        L_0x014a:
            int r0 = androidx.appcompat.R$drawable.abc_ratingbar_material     // Catch:{ all -> 0x00cb }
            if (r14 == r0) goto L_0x0156
            int r0 = androidx.appcompat.R$drawable.abc_ratingbar_indicator_material     // Catch:{ all -> 0x00cb }
            if (r14 == r0) goto L_0x0156
            int r0 = androidx.appcompat.R$drawable.abc_ratingbar_small_material     // Catch:{ all -> 0x00cb }
            if (r14 != r0) goto L_0x0181
        L_0x0156:
            r0 = r8
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r1 = r0.findDrawableByLayerId(r6)     // Catch:{ all -> 0x00cb }
            int r6 = androidx.appcompat.R$attr.colorControlNormal     // Catch:{ all -> 0x00cb }
            int r6 = androidx.appcompat.widget.i0.b(r13, r6)     // Catch:{ all -> 0x00cb }
            android.graphics.PorterDuff$Mode r7 = androidx.appcompat.widget.g.f1103b     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.g.a.e(r1, r6, r7)     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r1 = r0.findDrawableByLayerId(r5)     // Catch:{ all -> 0x00cb }
            int r5 = androidx.appcompat.R$attr.colorControlActivated     // Catch:{ all -> 0x00cb }
            int r6 = androidx.appcompat.widget.i0.c(r13, r5)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.g.a.e(r1, r6, r7)     // Catch:{ all -> 0x00cb }
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r4)     // Catch:{ all -> 0x00cb }
            int r1 = androidx.appcompat.widget.i0.c(r13, r5)     // Catch:{ all -> 0x00cb }
            androidx.appcompat.widget.g.a.e(r0, r1, r7)     // Catch:{ all -> 0x00cb }
        L_0x0180:
            r1 = r2
        L_0x0181:
            if (r1 == 0) goto L_0x0184
            goto L_0x018d
        L_0x0184:
            boolean r13 = r12.k(r13, r14, r8)     // Catch:{ all -> 0x00cb }
            if (r13 != 0) goto L_0x018d
            if (r15 == 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r3 = r8
        L_0x018e:
            r8 = r3
        L_0x018f:
            if (r8 == 0) goto L_0x0194
            androidx.appcompat.widget.x.a(r8)     // Catch:{ all -> 0x00cb }
        L_0x0194:
            monitor-exit(r12)
            return r8
        L_0x0196:
            r12.f1081f = r1     // Catch:{ all -> 0x00cb }
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00cb }
            java.lang.String r14 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r13.<init>(r14)     // Catch:{ all -> 0x00cb }
            throw r13     // Catch:{ all -> 0x00cb }
        L_0x01a0:
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        i iVar;
        try {
            WeakHashMap<Context, i<ColorStateList>> weakHashMap = this.f1076a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
                colorStateList = null;
            } else {
                colorStateList = (ColorStateList) iVar.c(i10, (Integer) null);
            }
            if (colorStateList == null) {
                f fVar = this.f1082g;
                if (fVar != null) {
                    colorStateList2 = ((g.a) fVar).d(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.f1076a == null) {
                        this.f1076a = new WeakHashMap<>();
                    }
                    i iVar2 = this.f1076a.get(context);
                    if (iVar2 == null) {
                        iVar2 = new i();
                        this.f1076a.put(context, iVar2);
                    }
                    iVar2.a(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.d0$f r0 = r7.f1082g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0067
            androidx.appcompat.widget.g$a r0 = (androidx.appcompat.widget.g.a) r0
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.g.f1103b
            int[] r4 = r0.f1106a
            boolean r4 = androidx.appcompat.widget.g.a.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x0019
            int r5 = androidx.appcompat.R$attr.colorControlNormal
            goto L_0x0042
        L_0x0019:
            int[] r4 = r0.f1108c
            boolean r4 = androidx.appcompat.widget.g.a.a(r4, r9)
            if (r4 == 0) goto L_0x0024
            int r5 = androidx.appcompat.R$attr.colorControlActivated
            goto L_0x0042
        L_0x0024:
            int[] r0 = r0.f1109d
            boolean r0 = androidx.appcompat.widget.g.a.a(r0, r9)
            if (r0 == 0) goto L_0x002f
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0042
        L_0x002f:
            int r0 = androidx.appcompat.R$drawable.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L_0x003e
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x0044
        L_0x003e:
            int r0 = androidx.appcompat.R$drawable.abc_dialog_material_background
            if (r9 != r0) goto L_0x0046
        L_0x0042:
            r9 = r5
            r0 = r6
        L_0x0044:
            r4 = r1
            goto L_0x0049
        L_0x0046:
            r9 = r2
            r4 = r9
            r0 = r6
        L_0x0049:
            if (r4 == 0) goto L_0x0063
            int[] r4 = androidx.appcompat.widget.x.f1237a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = androidx.appcompat.widget.i0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.g.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0061
            r10.setAlpha(r0)
        L_0x0061:
            r8 = r1
            goto L_0x0064
        L_0x0063:
            r8 = r2
        L_0x0064:
            if (r8 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r1 = r2
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}

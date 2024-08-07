package f1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import e1.c;
import f0.b0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import v.v;

/* compiled from: KeyTrigger */
public final class k extends d {

    /* renamed from: e  reason: collision with root package name */
    public String f9690e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f9691f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f9692g = null;

    /* renamed from: h  reason: collision with root package name */
    public String f9693h = null;

    /* renamed from: i  reason: collision with root package name */
    public int f9694i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f9695j = -1;

    /* renamed from: k  reason: collision with root package name */
    public View f9696k = null;

    /* renamed from: l  reason: collision with root package name */
    public float f9697l = 0.1f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9698m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9699n = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9700o = true;

    /* renamed from: p  reason: collision with root package name */
    public float f9701p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f9702q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9703r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f9704s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f9705t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f9706u = -1;

    /* renamed from: v  reason: collision with root package name */
    public RectF f9707v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    public RectF f9708w = new RectF();

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, Method> f9709x = new HashMap<>();

    /* compiled from: KeyTrigger */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f9710a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f9710a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyTrigger_framePosition, 8);
            f9710a.append(R$styleable.KeyTrigger_onCross, 4);
            f9710a.append(R$styleable.KeyTrigger_onNegativeCross, 1);
            f9710a.append(R$styleable.KeyTrigger_onPositiveCross, 2);
            f9710a.append(R$styleable.KeyTrigger_motionTarget, 7);
            f9710a.append(R$styleable.KeyTrigger_triggerId, 6);
            f9710a.append(R$styleable.KeyTrigger_triggerSlack, 5);
            f9710a.append(R$styleable.KeyTrigger_motion_triggerOnCollision, 9);
            f9710a.append(R$styleable.KeyTrigger_motion_postLayoutCollision, 10);
            f9710a.append(R$styleable.KeyTrigger_triggerReceiver, 11);
            f9710a.append(R$styleable.KeyTrigger_viewTransitionOnCross, 12);
            f9710a.append(R$styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f9710a.append(R$styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }
    }

    public k() {
        this.f9622d = new HashMap<>();
    }

    public static void j(RectF rectF, View view, boolean z10) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    public final void a(HashMap<String, c> hashMap) {
    }

    /* renamed from: b */
    public final d clone() {
        k kVar = new k();
        super.c(this);
        kVar.f9690e = this.f9690e;
        kVar.f9691f = this.f9691f;
        kVar.f9692g = this.f9692g;
        kVar.f9693h = this.f9693h;
        kVar.f9694i = this.f9694i;
        kVar.f9695j = this.f9695j;
        kVar.f9696k = this.f9696k;
        kVar.f9697l = this.f9697l;
        kVar.f9698m = this.f9698m;
        kVar.f9699n = this.f9699n;
        kVar.f9700o = this.f9700o;
        kVar.f9701p = this.f9701p;
        kVar.f9702q = this.f9702q;
        kVar.f9703r = this.f9703r;
        kVar.f9707v = this.f9707v;
        kVar.f9708w = this.f9708w;
        kVar.f9709x = this.f9709x;
        return kVar;
    }

    public final void d(HashSet<String> hashSet) {
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyTrigger);
        SparseIntArray sparseIntArray = a.f9710a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f9710a.get(index)) {
                case 1:
                    this.f9692g = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f9693h = obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f9690e = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f9697l = obtainStyledAttributes.getFloat(index, this.f9697l);
                    break;
                case 6:
                    this.f9694i = obtainStyledAttributes.getResourceId(index, this.f9694i);
                    break;
                case 7:
                    if (!MotionLayout.M0) {
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f9620b = obtainStyledAttributes.getResourceId(index, this.f9620b);
                            break;
                        } else {
                            this.f9621c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f9620b);
                        this.f9620b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f9621c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.f9619a);
                    this.f9619a = integer;
                    this.f9701p = (((float) integer) + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f9695j = obtainStyledAttributes.getResourceId(index, this.f9695j);
                    break;
                case 10:
                    this.f9703r = obtainStyledAttributes.getBoolean(index, this.f9703r);
                    break;
                case 11:
                    this.f9691f = obtainStyledAttributes.getResourceId(index, this.f9691f);
                    break;
                case 12:
                    this.f9706u = obtainStyledAttributes.getResourceId(index, this.f9706u);
                    break;
                case 13:
                    this.f9704s = obtainStyledAttributes.getResourceId(index, this.f9704s);
                    break;
                case 14:
                    this.f9705t = obtainStyledAttributes.getResourceId(index, this.f9705t);
                    break;
                default:
                    Integer.toHexString(index);
                    a.f9710a.get(index);
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.view.View r10, float r11) {
        /*
            r9 = this;
            int r0 = r9.f9695j
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0060
            android.view.View r0 = r9.f9696k
            if (r0 != 0) goto L_0x0019
            android.view.ViewParent r0 = r10.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r4 = r9.f9695j
            android.view.View r0 = r0.findViewById(r4)
            r9.f9696k = r0
        L_0x0019:
            android.graphics.RectF r0 = r9.f9707v
            android.view.View r4 = r9.f9696k
            boolean r5 = r9.f9703r
            j(r0, r4, r5)
            android.graphics.RectF r0 = r9.f9708w
            boolean r4 = r9.f9703r
            j(r0, r10, r4)
            android.graphics.RectF r0 = r9.f9707v
            android.graphics.RectF r4 = r9.f9708w
            boolean r0 = r0.intersect(r4)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r9.f9698m
            if (r0 == 0) goto L_0x003b
            r9.f9698m = r2
            r0 = r3
            goto L_0x003c
        L_0x003b:
            r0 = r2
        L_0x003c:
            boolean r4 = r9.f9700o
            if (r4 == 0) goto L_0x0044
            r9.f9700o = r2
            r4 = r3
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            r9.f9699n = r3
            r5 = r2
            goto L_0x00da
        L_0x004a:
            boolean r0 = r9.f9698m
            if (r0 != 0) goto L_0x0052
            r9.f9698m = r3
            r0 = r3
            goto L_0x0053
        L_0x0052:
            r0 = r2
        L_0x0053:
            boolean r4 = r9.f9699n
            if (r4 == 0) goto L_0x005b
            r9.f9699n = r2
            r4 = r3
            goto L_0x005c
        L_0x005b:
            r4 = r2
        L_0x005c:
            r9.f9700o = r3
            goto L_0x00d8
        L_0x0060:
            boolean r0 = r9.f9698m
            r4 = 0
            if (r0 == 0) goto L_0x0075
            float r0 = r9.f9701p
            float r5 = r11 - r0
            float r6 = r9.f9702q
            float r6 = r6 - r0
            float r6 = r6 * r5
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0085
            r9.f9698m = r2
            r0 = r3
            goto L_0x0086
        L_0x0075:
            float r0 = r9.f9701p
            float r0 = r11 - r0
            float r0 = java.lang.Math.abs(r0)
            float r5 = r9.f9697l
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0085
            r9.f9698m = r3
        L_0x0085:
            r0 = r2
        L_0x0086:
            boolean r5 = r9.f9699n
            if (r5 == 0) goto L_0x009e
            float r5 = r9.f9701p
            float r6 = r11 - r5
            float r7 = r9.f9702q
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ae
            int r5 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ae
            r9.f9699n = r2
            r5 = r3
            goto L_0x00af
        L_0x009e:
            float r5 = r9.f9701p
            float r5 = r11 - r5
            float r5 = java.lang.Math.abs(r5)
            float r6 = r9.f9697l
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ae
            r9.f9699n = r3
        L_0x00ae:
            r5 = r2
        L_0x00af:
            boolean r6 = r9.f9700o
            if (r6 == 0) goto L_0x00c7
            float r6 = r9.f9701p
            float r7 = r11 - r6
            float r8 = r9.f9702q
            float r8 = r8 - r6
            float r8 = r8 * r7
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00d9
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d9
            r9.f9700o = r2
            r4 = r3
            goto L_0x00da
        L_0x00c7:
            float r4 = r9.f9701p
            float r4 = r11 - r4
            float r4 = java.lang.Math.abs(r4)
            float r6 = r9.f9697l
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d7
            r9.f9700o = r3
        L_0x00d7:
            r4 = r5
        L_0x00d8:
            r5 = r4
        L_0x00d9:
            r4 = r2
        L_0x00da:
            r9.f9702q = r11
            if (r5 != 0) goto L_0x00e2
            if (r0 != 0) goto L_0x00e2
            if (r4 == 0) goto L_0x0107
        L_0x00e2:
            android.view.ViewParent r11 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            androidx.constraintlayout.motion.widget.MotionLayout$h r6 = r11.Q
            if (r6 == 0) goto L_0x00ef
            r6.d()
        L_0x00ef:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$h> r11 = r11.f1583l0
            if (r11 == 0) goto L_0x0107
            java.util.Iterator r11 = r11.iterator()
        L_0x00f7:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0107
            java.lang.Object r6 = r11.next()
            androidx.constraintlayout.motion.widget.MotionLayout$h r6 = (androidx.constraintlayout.motion.widget.MotionLayout.h) r6
            r6.d()
            goto L_0x00f7
        L_0x0107:
            int r11 = r9.f9691f
            if (r11 != r1) goto L_0x010d
            r11 = r10
            goto L_0x0119
        L_0x010d:
            android.view.ViewParent r11 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r6 = r9.f9691f
            android.view.View r11 = r11.findViewById(r6)
        L_0x0119:
            if (r5 == 0) goto L_0x0135
            java.lang.String r5 = r9.f9692g
            if (r5 == 0) goto L_0x0122
            r9.i(r11, r5)
        L_0x0122:
            int r5 = r9.f9704s
            if (r5 == r1) goto L_0x0135
            android.view.ViewParent r5 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.f9704s
            android.view.View[] r7 = new android.view.View[r3]
            r7[r2] = r11
            r5.G(r6, r7)
        L_0x0135:
            if (r4 == 0) goto L_0x0151
            java.lang.String r4 = r9.f9693h
            if (r4 == 0) goto L_0x013e
            r9.i(r11, r4)
        L_0x013e:
            int r4 = r9.f9705t
            if (r4 == r1) goto L_0x0151
            android.view.ViewParent r4 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r5 = r9.f9705t
            android.view.View[] r6 = new android.view.View[r3]
            r6[r2] = r11
            r4.G(r5, r6)
        L_0x0151:
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = r9.f9690e
            if (r0 == 0) goto L_0x015a
            r9.i(r11, r0)
        L_0x015a:
            int r0 = r9.f9706u
            if (r0 == r1) goto L_0x016d
            android.view.ViewParent r10 = r10.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r0 = r9.f9706u
            android.view.View[] r1 = new android.view.View[r3]
            r1[r2] = r11
            r10.G(r0, r1)
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.k.h(android.view.View, float):void");
    }

    public final void i(View view, String str) {
        Method method;
        boolean z10;
        g1.a aVar;
        if (str != null) {
            if (str.startsWith(".")) {
                if (str.length() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    str = str.substring(1).toLowerCase(Locale.ROOT);
                }
                for (String next : this.f9622d.keySet()) {
                    String lowerCase = next.toLowerCase(Locale.ROOT);
                    if ((z10 || lowerCase.matches(str)) && (aVar = this.f9622d.get(next)) != null) {
                        Class<?> cls = view.getClass();
                        String str2 = aVar.f10265b;
                        if (!aVar.f10264a) {
                            str2 = b0.r("set", str2);
                        }
                        try {
                            switch (v.g(aVar.f10266c)) {
                                case 0:
                                case 7:
                                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f10267d)});
                                    break;
                                case 1:
                                    cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f10268e)});
                                    break;
                                case 2:
                                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f10271h)});
                                    break;
                                case 3:
                                    Method method2 = cls.getMethod(str2, new Class[]{Drawable.class});
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(aVar.f10271h);
                                    method2.invoke(view, new Object[]{colorDrawable});
                                    break;
                                case 4:
                                    cls.getMethod(str2, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f10269f});
                                    break;
                                case 5:
                                    cls.getMethod(str2, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f10270g)});
                                    break;
                                case 6:
                                    cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f10268e)});
                                    break;
                            }
                        } catch (NoSuchMethodException e10) {
                            e10.getMessage();
                        } catch (IllegalAccessException e11) {
                            e11.printStackTrace();
                        } catch (InvocationTargetException e12) {
                            e12.printStackTrace();
                        }
                    }
                }
                return;
            }
            if (this.f9709x.containsKey(str)) {
                method = this.f9709x.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f9709x.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f9709x.put(str, (Object) null);
                    view.getClass();
                    a.d(view);
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                view.getClass();
                a.d(view);
            }
        }
    }
}

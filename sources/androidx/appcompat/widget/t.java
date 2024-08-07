package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: AppCompatTextViewAutoSizeHelper */
public final class t {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f1221l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1222m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f1223a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1224b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f1225c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1226d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1227e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1228f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1229g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1230h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1231i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1232j;

    /* renamed from: k  reason: collision with root package name */
    public final d f1233k;

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class d extends f {
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(android.text.StaticLayout.Builder r4, android.widget.TextView r5) {
            /*
                r3 = this;
                android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                java.lang.String r1 = "getTextDirectionHeuristic"
                java.lang.reflect.Method r1 = androidx.appcompat.widget.t.d(r1)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                java.lang.Object r0 = r1.invoke(r5, r2)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                goto L_0x0012
            L_0x0010:
                r4 = move-exception
                throw r4
            L_0x0012:
                android.text.TextDirectionHeuristic r0 = (android.text.TextDirectionHeuristic) r0
                r4.setTextDirection(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t.d.a(android.text.StaticLayout$Builder, android.widget.TextView):void");
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class e extends d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(android.widget.TextView r4) {
            /*
                r3 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.lang.String r1 = "getHorizontallyScrolling"
                java.lang.reflect.Method r1 = androidx.appcompat.widget.t.d(r1)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                java.lang.Object r0 = r1.invoke(r4, r2)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
                goto L_0x0012
            L_0x0010:
                r4 = move-exception
                throw r4
            L_0x0012:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r4 = r0.booleanValue()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t.f.b(android.widget.TextView):boolean");
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public t(TextView textView) {
        this.f1231i = textView;
        this.f1232j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1233k = new e();
        } else {
            this.f1233k = new d();
        }
    }

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            Method method = f1222m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1222m.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        boolean z10;
        int i10;
        if (!h() || this.f1223a == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (this.f1224b) {
                if (this.f1231i.getMeasuredHeight() > 0 && this.f1231i.getMeasuredWidth() > 0) {
                    if (this.f1233k.b(this.f1231i)) {
                        i10 = 1048576;
                    } else {
                        i10 = (this.f1231i.getMeasuredWidth() - this.f1231i.getTotalPaddingLeft()) - this.f1231i.getTotalPaddingRight();
                    }
                    int height = (this.f1231i.getHeight() - this.f1231i.getCompoundPaddingBottom()) - this.f1231i.getCompoundPaddingTop();
                    if (i10 > 0 && height > 0) {
                        RectF rectF = f1221l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i10;
                            rectF.bottom = (float) height;
                            float c10 = (float) c(rectF);
                            if (c10 != this.f1231i.getTextSize()) {
                                e(0, c10);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1224b = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r10 = android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(android.graphics.RectF r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            int[] r2 = r1.f1228f
            int r2 = r2.length
            if (r2 == 0) goto L_0x00bb
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = r3
            r6 = r4
        L_0x000e:
            if (r5 > r2) goto L_0x00b6
            int r6 = r5 + r2
            int r6 = r6 / 2
            int[] r7 = r1.f1228f
            r7 = r7[r6]
            android.widget.TextView r8 = r1.f1231i
            java.lang.CharSequence r8 = r8.getText()
            android.widget.TextView r9 = r1.f1231i
            android.text.method.TransformationMethod r9 = r9.getTransformationMethod()
            if (r9 == 0) goto L_0x002f
            android.widget.TextView r10 = r1.f1231i
            java.lang.CharSequence r9 = r9.getTransformation(r8, r10)
            if (r9 == 0) goto L_0x002f
            r8 = r9
        L_0x002f:
            android.widget.TextView r9 = r1.f1231i
            int r9 = androidx.appcompat.widget.t.a.b(r9)
            android.text.TextPaint r10 = r1.f1230h
            if (r10 != 0) goto L_0x0041
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>()
            r1.f1230h = r10
            goto L_0x0044
        L_0x0041:
            r10.reset()
        L_0x0044:
            android.text.TextPaint r10 = r1.f1230h
            android.widget.TextView r11 = r1.f1231i
            android.text.TextPaint r11 = r11.getPaint()
            r10.set(r11)
            android.text.TextPaint r10 = r1.f1230h
            float r7 = (float) r7
            r10.setTextSize(r7)
            android.widget.TextView r7 = r1.f1231i
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r11 = "getLayoutAlignment"
            java.lang.reflect.Method r11 = d(r11)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.lang.Object r10 = r11.invoke(r7, r12)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            goto L_0x0068
        L_0x0066:
            r0 = move-exception
            throw r0
        L_0x0068:
            r11 = r10
            android.text.Layout$Alignment r11 = (android.text.Layout.Alignment) r11
            float r7 = r0.right
            int r12 = java.lang.Math.round(r7)
            android.widget.TextView r14 = r1.f1231i
            android.text.TextPaint r15 = r1.f1230h
            androidx.appcompat.widget.t$d r7 = r1.f1233k
            r10 = r8
            r13 = r9
            r16 = r7
            android.text.StaticLayout r7 = androidx.appcompat.widget.t.c.a(r10, r11, r12, r13, r14, r15, r16)
            r10 = -1
            if (r9 == r10) goto L_0x0098
            int r10 = r7.getLineCount()
            if (r10 > r9) goto L_0x00a3
            int r9 = r7.getLineCount()
            int r9 = r9 - r3
            int r9 = r7.getLineEnd(r9)
            int r8 = r8.length()
            if (r9 == r8) goto L_0x0098
            goto L_0x00a3
        L_0x0098:
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r8 = r0.bottom
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a5
        L_0x00a3:
            r7 = r4
            goto L_0x00a6
        L_0x00a5:
            r7 = r3
        L_0x00a6:
            if (r7 == 0) goto L_0x00b1
            int r6 = r6 + 1
            r17 = r6
            r6 = r5
            r5 = r17
            goto L_0x000e
        L_0x00b1:
            int r6 = r6 + -1
            r2 = r6
            goto L_0x000e
        L_0x00b6:
            int[] r0 = r1.f1228f
            r0 = r0[r6]
            return r0
        L_0x00bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t.c(android.graphics.RectF):int");
    }

    public final void e(int i10, float f10) {
        Resources resources;
        Context context = this.f1232j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        if (applyDimension != this.f1231i.getPaint().getTextSize()) {
            this.f1231i.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(this.f1231i);
            if (this.f1231i.getLayout() != null) {
                this.f1224b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(this.f1231i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!a10) {
                    this.f1231i.requestLayout();
                } else {
                    this.f1231i.forceLayout();
                }
                this.f1231i.invalidate();
            }
        }
    }

    public final boolean f() {
        if (!h() || this.f1223a != 1) {
            this.f1224b = false;
        } else {
            if (!this.f1229g || this.f1228f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1227e - this.f1226d) / this.f1225c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((((float) i10) * this.f1225c) + this.f1226d);
                }
                this.f1228f = b(iArr);
            }
            this.f1224b = true;
        }
        return this.f1224b;
    }

    public final boolean g() {
        boolean z10;
        int[] iArr = this.f1228f;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1229g = z10;
        if (z10) {
            this.f1223a = 1;
            this.f1226d = (float) iArr[0];
            this.f1227e = (float) iArr[length - 1];
            this.f1225c = -1.0f;
        }
        return z10;
    }

    public final boolean h() {
        return !(this.f1231i instanceof AppCompatEditText);
    }

    public final void i(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f1223a = 1;
            this.f1226d = f10;
            this.f1227e = f11;
            this.f1225c = f12;
            this.f1229g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }
}

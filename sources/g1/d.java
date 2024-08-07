package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;

/* compiled from: StateSet */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f10287a = -1;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<a> f10288b = new SparseArray<>();

    /* compiled from: StateSet */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10289a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f10290b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f10291c = -1;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.State_android_id) {
                    this.f10289a = obtainStyledAttributes.getResourceId(index, this.f10289a);
                } else if (index == R$styleable.State_constraints) {
                    this.f10291c = obtainStyledAttributes.getResourceId(index, this.f10291c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f10291c);
                    context.getResources().getResourceName(this.f10291c);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f10290b.size(); i10++) {
                if (this.f10290b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* compiled from: StateSet */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f10292a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f10293b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f10294c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f10295d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public int f10296e = -1;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.Variant_constraints) {
                    this.f10296e = obtainStyledAttributes.getResourceId(index, this.f10296e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f10296e);
                    context.getResources().getResourceName(this.f10296e);
                    "layout".equals(resourceTypeName);
                } else if (index == R$styleable.Variant_region_heightLessThan) {
                    this.f10295d = obtainStyledAttributes.getDimension(index, this.f10295d);
                } else if (index == R$styleable.Variant_region_heightMoreThan) {
                    this.f10293b = obtainStyledAttributes.getDimension(index, this.f10293b);
                } else if (index == R$styleable.Variant_region_widthLessThan) {
                    this.f10294c = obtainStyledAttributes.getDimension(index, this.f10294c);
                } else if (index == R$styleable.Variant_region_widthMoreThan) {
                    this.f10292a = obtainStyledAttributes.getDimension(index, this.f10292a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f10292a) && f10 < this.f10292a) {
                return false;
            }
            if (!Float.isNaN(this.f10293b) && f11 < this.f10293b) {
                return false;
            }
            if (!Float.isNaN(this.f10294c) && f10 > this.f10294c) {
                return false;
            }
            if (Float.isNaN(this.f10295d) || f11 <= this.f10295d) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f10287a = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r9.f10288b = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)
            int[] r2 = androidx.constraintlayout.widget.R$styleable.StateSet
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r2)
            int r2 = r1.getIndexCount()
            r3 = 0
            r4 = r3
        L_0x0022:
            if (r4 >= r2) goto L_0x0037
            int r5 = r1.getIndex(r4)
            int r6 = androidx.constraintlayout.widget.R$styleable.StateSet_defaultState
            if (r5 != r6) goto L_0x0034
            int r6 = r9.f10287a
            int r5 = r1.getResourceId(r5, r6)
            r9.f10287a = r5
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0037:
            r1.recycle()
            r1 = 0
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
        L_0x003f:
            r4 = 1
            if (r2 == r4) goto L_0x00bc
            if (r2 == 0) goto L_0x00ab
            java.lang.String r5 = "StateSet"
            r6 = 3
            r7 = 2
            if (r2 == r7) goto L_0x005a
            if (r2 == r6) goto L_0x004e
            goto L_0x00ae
        L_0x004e:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            boolean r2 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x00ae
            goto L_0x00bc
        L_0x005a:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            int r8 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            switch(r8) {
                case 80204913: goto L_0x0081;
                case 1301459538: goto L_0x0077;
                case 1382829617: goto L_0x0070;
                case 1901439077: goto L_0x0066;
                default: goto L_0x0065;
            }     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
        L_0x0065:
            goto L_0x008b
        L_0x0066:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            r4 = r6
            goto L_0x008c
        L_0x0070:
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            goto L_0x008c
        L_0x0077:
            java.lang.String r4 = "LayoutDescription"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            r4 = r3
            goto L_0x008c
        L_0x0081:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            r4 = r7
            goto L_0x008c
        L_0x008b:
            r4 = r0
        L_0x008c:
            if (r4 == r7) goto L_0x009e
            if (r4 == r6) goto L_0x0091
            goto L_0x00ae
        L_0x0091:
            g1.d$b r2 = new g1.d$b     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r1 == 0) goto L_0x00ae
            java.util.ArrayList<g1.d$b> r4 = r1.f10290b     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            goto L_0x00ae
        L_0x009e:
            g1.d$a r1 = new g1.d$a     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            r1.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            android.util.SparseArray<g1.d$a> r2 = r9.f10288b     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            int r4 = r1.f10289a     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            r2.put(r4, r1)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            goto L_0x00ae
        L_0x00ab:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
        L_0x00ae:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            goto L_0x003f
        L_0x00b3:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00bc
        L_0x00b8:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.d.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final int a(int i10) {
        int i11;
        a aVar;
        int a10;
        float f10 = (float) -1;
        if (-1 == i10) {
            if (i10 == -1) {
                aVar = this.f10288b.valueAt(0);
            } else {
                aVar = this.f10288b.get(-1);
            }
            if (aVar == null || -1 == (a10 = aVar.a(f10, f10))) {
                return -1;
            }
            if (a10 == -1) {
                i11 = aVar.f10291c;
            } else {
                i11 = aVar.f10290b.get(a10).f10296e;
            }
        } else {
            a aVar2 = this.f10288b.get(i10);
            if (aVar2 == null) {
                return -1;
            }
            int a11 = aVar2.a(f10, f10);
            if (a11 == -1) {
                i11 = aVar2.f10291c;
            } else {
                i11 = aVar2.f10290b.get(a11).f10296e;
            }
        }
        return i11;
    }
}

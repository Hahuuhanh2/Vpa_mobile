package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import java.util.ArrayList;

/* compiled from: ConstraintLayoutStates */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f10272a;

    /* renamed from: b  reason: collision with root package name */
    public int f10273b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f10274c = -1;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<a> f10275d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.a> f10276e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10277a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<C0111b> f10278b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f10279c = -1;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.a f10280d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.State_android_id) {
                    this.f10277a = obtainStyledAttributes.getResourceId(index, this.f10277a);
                } else if (index == R$styleable.State_constraints) {
                    this.f10279c = obtainStyledAttributes.getResourceId(index, this.f10279c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f10279c);
                    context.getResources().getResourceName(this.f10279c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f10280d = aVar;
                        aVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(this.f10279c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int a(float f10, float f11) {
            for (int i10 = 0; i10 < this.f10278b.size(); i10++) {
                if (this.f10278b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* renamed from: g1.b$b  reason: collision with other inner class name */
    /* compiled from: ConstraintLayoutStates */
    public static class C0111b {

        /* renamed from: a  reason: collision with root package name */
        public float f10281a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f10282b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f10283c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f10284d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public int f10285e = -1;

        /* renamed from: f  reason: collision with root package name */
        public androidx.constraintlayout.widget.a f10286f;

        public C0111b(Context context, XmlResourceParser xmlResourceParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.Variant_constraints) {
                    this.f10285e = obtainStyledAttributes.getResourceId(index, this.f10285e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f10285e);
                    context.getResources().getResourceName(this.f10285e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f10286f = aVar;
                        aVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(this.f10285e, (ViewGroup) null));
                    }
                } else if (index == R$styleable.Variant_region_heightLessThan) {
                    this.f10284d = obtainStyledAttributes.getDimension(index, this.f10284d);
                } else if (index == R$styleable.Variant_region_heightMoreThan) {
                    this.f10282b = obtainStyledAttributes.getDimension(index, this.f10282b);
                } else if (index == R$styleable.Variant_region_widthLessThan) {
                    this.f10283c = obtainStyledAttributes.getDimension(index, this.f10283c);
                } else if (index == R$styleable.Variant_region_widthMoreThan) {
                    this.f10281a = obtainStyledAttributes.getDimension(index, this.f10281a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f10281a) && f10 < this.f10281a) {
                return false;
            }
            if (!Float.isNaN(this.f10282b) && f11 < this.f10282b) {
                return false;
            }
            if (!Float.isNaN(this.f10283c) && f10 > this.f10283c) {
                return false;
            }
            if (Float.isNaN(this.f10284d) || f11 <= this.f10284d) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f10273b = r0
            r7.f10274c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f10275d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f10276e = r1
            r7.f10272a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = 0
        L_0x0025:
            r2 = 1
            if (r10 == r2) goto L_0x00a6
            if (r10 == 0) goto L_0x0095
            r3 = 2
            if (r10 == r3) goto L_0x002f
            goto L_0x0098
        L_0x002f:
            java.lang.String r10 = r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r4 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0064;
                case 80204913: goto L_0x005a;
                case 1382829617: goto L_0x0051;
                case 1657696882: goto L_0x0047;
                case 1901439077: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x003c:
            goto L_0x006e
        L_0x003d:
            java.lang.String r2 = "Variant"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r6
            goto L_0x006f
        L_0x0047:
            java.lang.String r2 = "layoutDescription"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 0
            goto L_0x006f
        L_0x0051:
            java.lang.String r4 = "StateSet"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            goto L_0x006f
        L_0x005a:
            java.lang.String r2 = "State"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r3
            goto L_0x006f
        L_0x0064:
            java.lang.String r2 = "ConstraintSet"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = r5
            goto L_0x006f
        L_0x006e:
            r2 = r0
        L_0x006f:
            if (r2 == r3) goto L_0x0087
            if (r2 == r6) goto L_0x007a
            if (r2 == r5) goto L_0x0076
            goto L_0x0098
        L_0x0076:
            r7.a(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x007a:
            g1.b$b r10 = new g1.b$b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r1 == 0) goto L_0x0098
            java.util.ArrayList<g1.b$b> r2 = r1.f10278b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r2.add(r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x0087:
            g1.b$a r10 = new g1.b$a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            android.util.SparseArray<g1.b$a> r1 = r7.f10275d     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r2 = r10.f10277a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1.put(r2, r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = r10
            goto L_0x0098
        L_0x0095:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x0098:
            int r10 = r9.next()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0025
        L_0x009d:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00a6
        L_0x00a2:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.b.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        int i10;
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i11++;
            } else {
                if (attributeValue.contains("/")) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1 && attributeValue.length() > 1) {
                    i10 = Integer.parseInt(attributeValue.substring(1));
                }
                aVar.k(context, xmlResourceParser);
                this.f10276e.put(i10, aVar);
                return;
            }
        }
    }

    public final void b(float f10, float f11, int i10) {
        androidx.constraintlayout.widget.a aVar;
        a aVar2;
        int a10;
        androidx.constraintlayout.widget.a aVar3;
        int i11 = this.f10273b;
        if (i11 == i10) {
            if (i10 == -1) {
                aVar2 = this.f10275d.valueAt(0);
            } else {
                aVar2 = this.f10275d.get(i11);
            }
            int i12 = this.f10274c;
            if ((i12 == -1 || !aVar2.f10278b.get(i12).a(f10, f11)) && this.f10274c != (a10 = aVar2.a(f10, f11))) {
                if (a10 == -1) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2.f10278b.get(a10).f10286f;
                }
                if (a10 != -1) {
                    int i13 = aVar2.f10278b.get(a10).f10285e;
                }
                if (aVar3 != null) {
                    this.f10274c = a10;
                    aVar3.b(this.f10272a);
                    return;
                }
                return;
            }
            return;
        }
        this.f10273b = i10;
        a aVar4 = this.f10275d.get(i10);
        int a11 = aVar4.a(f10, f11);
        if (a11 == -1) {
            aVar = aVar4.f10280d;
        } else {
            aVar = aVar4.f10278b.get(a11).f10286f;
        }
        if (a11 != -1) {
            int i14 = aVar4.f10278b.get(a11).f10285e;
        }
        if (aVar != null) {
            this.f10274c = a11;
            aVar.b(this.f10272a);
        }
    }
}

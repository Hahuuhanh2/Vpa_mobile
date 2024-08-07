package f1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import f0.b0;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: KeyAttributes */
public final class e extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f9623e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f9624f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f9625g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f9626h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f9627i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f9628j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f9629k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f9630l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f9631m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f9632n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f9633o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f9634p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f9635q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f9636r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f9637s = Float.NaN;

    /* compiled from: KeyAttributes */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f9638a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f9638a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyAttribute_android_alpha, 1);
            f9638a.append(R$styleable.KeyAttribute_android_elevation, 2);
            f9638a.append(R$styleable.KeyAttribute_android_rotation, 4);
            f9638a.append(R$styleable.KeyAttribute_android_rotationX, 5);
            f9638a.append(R$styleable.KeyAttribute_android_rotationY, 6);
            f9638a.append(R$styleable.KeyAttribute_android_transformPivotX, 19);
            f9638a.append(R$styleable.KeyAttribute_android_transformPivotY, 20);
            f9638a.append(R$styleable.KeyAttribute_android_scaleX, 7);
            f9638a.append(R$styleable.KeyAttribute_transitionPathRotate, 8);
            f9638a.append(R$styleable.KeyAttribute_transitionEasing, 9);
            f9638a.append(R$styleable.KeyAttribute_motionTarget, 10);
            f9638a.append(R$styleable.KeyAttribute_framePosition, 12);
            f9638a.append(R$styleable.KeyAttribute_curveFit, 13);
            f9638a.append(R$styleable.KeyAttribute_android_scaleY, 14);
            f9638a.append(R$styleable.KeyAttribute_android_translationX, 15);
            f9638a.append(R$styleable.KeyAttribute_android_translationY, 16);
            f9638a.append(R$styleable.KeyAttribute_android_translationZ, 17);
            f9638a.append(R$styleable.KeyAttribute_motionProgress, 18);
        }
    }

    public e() {
        this.f9622d = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.HashMap<java.lang.String, e1.c> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            b1.j r2 = (b1.j) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003e
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, g1.a> r3 = r6.f9622d
            java.lang.Object r1 = r3.get(r1)
            g1.a r1 = (g1.a) r1
            if (r1 == 0) goto L_0x0008
            e1.c$b r2 = (e1.c.b) r2
            int r3 = r6.f9619a
            android.util.SparseArray<g1.a> r2 = r2.f9078f
            r2.append(r3, r1)
            goto L_0x0008
        L_0x003e:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00e4;
                case -1249320805: goto L_0x00d8;
                case -1225497657: goto L_0x00cc;
                case -1225497656: goto L_0x00c0;
                case -1225497655: goto L_0x00b5;
                case -1001078227: goto L_0x00aa;
                case -908189618: goto L_0x009f;
                case -908189617: goto L_0x0096;
                case -760884510: goto L_0x008a;
                case -760884509: goto L_0x007d;
                case -40300674: goto L_0x0070;
                case -4379043: goto L_0x0063;
                case 37232917: goto L_0x0056;
                case 92909918: goto L_0x0049;
                default: goto L_0x0046;
            }
        L_0x0046:
            r4 = r3
            goto L_0x00ef
        L_0x0049:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0052
            goto L_0x0046
        L_0x0052:
            r4 = 13
            goto L_0x00ef
        L_0x0056:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005f
            goto L_0x0046
        L_0x005f:
            r4 = 12
            goto L_0x00ef
        L_0x0063:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x006c
            goto L_0x0046
        L_0x006c:
            r4 = 11
            goto L_0x00ef
        L_0x0070:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0079
            goto L_0x0046
        L_0x0079:
            r4 = 10
            goto L_0x00ef
        L_0x007d:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0086
            goto L_0x0046
        L_0x0086:
            r4 = 9
            goto L_0x00ef
        L_0x008a:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0093
            goto L_0x0046
        L_0x0093:
            r4 = 8
            goto L_0x00ef
        L_0x0096:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00ef
            goto L_0x0046
        L_0x009f:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a8
            goto L_0x0046
        L_0x00a8:
            r4 = 6
            goto L_0x00ef
        L_0x00aa:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b3
            goto L_0x0046
        L_0x00b3:
            r4 = 5
            goto L_0x00ef
        L_0x00b5:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00be
            goto L_0x0046
        L_0x00be:
            r4 = 4
            goto L_0x00ef
        L_0x00c0:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ca
            goto L_0x0046
        L_0x00ca:
            r4 = 3
            goto L_0x00ef
        L_0x00cc:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d6
            goto L_0x0046
        L_0x00d6:
            r4 = 2
            goto L_0x00ef
        L_0x00d8:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e2
            goto L_0x0046
        L_0x00e2:
            r4 = 1
            goto L_0x00ef
        L_0x00e4:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ee
            goto L_0x0046
        L_0x00ee:
            r4 = 0
        L_0x00ef:
            switch(r4) {
                case 0: goto L_0x01d1;
                case 1: goto L_0x01c0;
                case 2: goto L_0x01af;
                case 3: goto L_0x019e;
                case 4: goto L_0x018d;
                case 5: goto L_0x017c;
                case 6: goto L_0x016b;
                case 7: goto L_0x015a;
                case 8: goto L_0x0149;
                case 9: goto L_0x0138;
                case 10: goto L_0x0127;
                case 11: goto L_0x0116;
                case 12: goto L_0x0105;
                case 13: goto L_0x00f4;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            goto L_0x0008
        L_0x00f4:
            float r1 = r6.f9624f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9624f
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0105:
            float r1 = r6.f9631m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9631m
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0116:
            float r1 = r6.f9625g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9625g
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0127:
            float r1 = r6.f9626h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9626h
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0138:
            float r1 = r6.f9628j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9630l
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0149:
            float r1 = r6.f9627i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9629k
            r2.b(r1, r3)
            goto L_0x0008
        L_0x015a:
            float r1 = r6.f9633o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9633o
            r2.b(r1, r3)
            goto L_0x0008
        L_0x016b:
            float r1 = r6.f9632n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9632n
            r2.b(r1, r3)
            goto L_0x0008
        L_0x017c:
            float r1 = r6.f9637s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9637s
            r2.b(r1, r3)
            goto L_0x0008
        L_0x018d:
            float r1 = r6.f9636r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9636r
            r2.b(r1, r3)
            goto L_0x0008
        L_0x019e:
            float r1 = r6.f9635q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9635q
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01af:
            float r1 = r6.f9634p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9634p
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01c0:
            float r1 = r6.f9628j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9628j
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01d1:
            float r1 = r6.f9627i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f9619a
            float r3 = r6.f9627i
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public final d clone() {
        e eVar = new e();
        super.c(this);
        eVar.f9623e = this.f9623e;
        eVar.f9624f = this.f9624f;
        eVar.f9625g = this.f9625g;
        eVar.f9626h = this.f9626h;
        eVar.f9627i = this.f9627i;
        eVar.f9628j = this.f9628j;
        eVar.f9629k = this.f9629k;
        eVar.f9630l = this.f9630l;
        eVar.f9631m = this.f9631m;
        eVar.f9632n = this.f9632n;
        eVar.f9633o = this.f9633o;
        eVar.f9634p = this.f9634p;
        eVar.f9635q = this.f9635q;
        eVar.f9636r = this.f9636r;
        eVar.f9637s = this.f9637s;
        return eVar;
    }

    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f9624f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f9625g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f9626h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f9627i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f9628j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f9629k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f9630l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f9634p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f9635q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f9636r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f9631m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f9632n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f9633o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f9637s)) {
            hashSet.add("progress");
        }
        if (this.f9622d.size() > 0) {
            for (String str : this.f9622d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyAttribute);
        SparseIntArray sparseIntArray = a.f9638a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f9638a.get(index)) {
                case 1:
                    this.f9624f = obtainStyledAttributes.getFloat(index, this.f9624f);
                    break;
                case 2:
                    this.f9625g = obtainStyledAttributes.getDimension(index, this.f9625g);
                    break;
                case 4:
                    this.f9626h = obtainStyledAttributes.getFloat(index, this.f9626h);
                    break;
                case 5:
                    this.f9627i = obtainStyledAttributes.getFloat(index, this.f9627i);
                    break;
                case 6:
                    this.f9628j = obtainStyledAttributes.getFloat(index, this.f9628j);
                    break;
                case 7:
                    this.f9632n = obtainStyledAttributes.getFloat(index, this.f9632n);
                    break;
                case 8:
                    this.f9631m = obtainStyledAttributes.getFloat(index, this.f9631m);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f9619a = obtainStyledAttributes.getInt(index, this.f9619a);
                    break;
                case 13:
                    this.f9623e = obtainStyledAttributes.getInteger(index, this.f9623e);
                    break;
                case 14:
                    this.f9633o = obtainStyledAttributes.getFloat(index, this.f9633o);
                    break;
                case 15:
                    this.f9634p = obtainStyledAttributes.getDimension(index, this.f9634p);
                    break;
                case 16:
                    this.f9635q = obtainStyledAttributes.getDimension(index, this.f9635q);
                    break;
                case 17:
                    this.f9636r = obtainStyledAttributes.getDimension(index, this.f9636r);
                    break;
                case 18:
                    this.f9637s = obtainStyledAttributes.getFloat(index, this.f9637s);
                    break;
                case 19:
                    this.f9629k = obtainStyledAttributes.getDimension(index, this.f9629k);
                    break;
                case 20:
                    this.f9630l = obtainStyledAttributes.getDimension(index, this.f9630l);
                    break;
                default:
                    Integer.toHexString(index);
                    a.f9638a.get(index);
                    break;
            }
        }
    }

    public final void f(HashMap<String, Integer> hashMap) {
        if (this.f9623e != -1) {
            if (!Float.isNaN(this.f9624f)) {
                hashMap.put("alpha", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9625g)) {
                hashMap.put("elevation", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9626h)) {
                hashMap.put("rotation", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9627i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9628j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9629k)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9630l)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9634p)) {
                hashMap.put("translationX", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9635q)) {
                hashMap.put("translationY", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9636r)) {
                hashMap.put("translationZ", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9631m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9632n)) {
                hashMap.put("scaleX", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9633o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f9623e));
            }
            if (!Float.isNaN(this.f9637s)) {
                hashMap.put("progress", Integer.valueOf(this.f9623e));
            }
            if (this.f9622d.size() > 0) {
                for (String r10 : this.f9622d.keySet()) {
                    hashMap.put(b0.r("CUSTOM,", r10), Integer.valueOf(this.f9623e));
                }
            }
        }
    }

    public final void h(Object obj, String str) {
        int i10;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c10 = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c10 = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c10 = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c10 = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c10 = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c10 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c10 = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c10 = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c10 = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f9637s = d.g((Number) obj);
                return;
            case 1:
                obj.toString();
                return;
            case 2:
                this.f9627i = d.g((Number) obj);
                return;
            case 3:
                this.f9628j = d.g((Number) obj);
                return;
            case 4:
                this.f9634p = d.g((Number) obj);
                return;
            case 5:
                this.f9635q = d.g((Number) obj);
                return;
            case 6:
                this.f9636r = d.g((Number) obj);
                return;
            case 7:
                this.f9632n = d.g((Number) obj);
                return;
            case 8:
                this.f9633o = d.g((Number) obj);
                return;
            case 9:
                this.f9629k = d.g((Number) obj);
                return;
            case 10:
                this.f9630l = d.g((Number) obj);
                return;
            case 11:
                this.f9626h = d.g((Number) obj);
                return;
            case 12:
                this.f9625g = d.g((Number) obj);
                return;
            case 13:
                this.f9631m = d.g((Number) obj);
                return;
            case 14:
                this.f9624f = d.g((Number) obj);
                return;
            case 15:
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    i10 = ((Integer) number).intValue();
                } else {
                    i10 = Integer.parseInt(number.toString());
                }
                this.f9623e = i10;
                return;
            case 16:
                if (obj instanceof Boolean) {
                    ((Boolean) obj).booleanValue();
                    return;
                } else {
                    Boolean.parseBoolean(obj.toString());
                    return;
                }
            default:
                return;
        }
    }
}

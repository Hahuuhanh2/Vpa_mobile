package f1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import e1.c;
import f0.b0;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: KeyTimeCycle */
public final class j extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f9673e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f9674f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f9675g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f9676h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f9677i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f9678j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f9679k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f9680l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f9681m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f9682n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f9683o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f9684p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f9685q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public int f9686r = 0;

    /* renamed from: s  reason: collision with root package name */
    public float f9687s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f9688t = 0.0f;

    /* compiled from: KeyTimeCycle */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f9689a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f9689a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyTimeCycle_android_alpha, 1);
            f9689a.append(R$styleable.KeyTimeCycle_android_elevation, 2);
            f9689a.append(R$styleable.KeyTimeCycle_android_rotation, 4);
            f9689a.append(R$styleable.KeyTimeCycle_android_rotationX, 5);
            f9689a.append(R$styleable.KeyTimeCycle_android_rotationY, 6);
            f9689a.append(R$styleable.KeyTimeCycle_android_scaleX, 7);
            f9689a.append(R$styleable.KeyTimeCycle_transitionPathRotate, 8);
            f9689a.append(R$styleable.KeyTimeCycle_transitionEasing, 9);
            f9689a.append(R$styleable.KeyTimeCycle_motionTarget, 10);
            f9689a.append(R$styleable.KeyTimeCycle_framePosition, 12);
            f9689a.append(R$styleable.KeyTimeCycle_curveFit, 13);
            f9689a.append(R$styleable.KeyTimeCycle_android_scaleY, 14);
            f9689a.append(R$styleable.KeyTimeCycle_android_translationX, 15);
            f9689a.append(R$styleable.KeyTimeCycle_android_translationY, 16);
            f9689a.append(R$styleable.KeyTimeCycle_android_translationZ, 17);
            f9689a.append(R$styleable.KeyTimeCycle_motionProgress, 18);
            f9689a.append(R$styleable.KeyTimeCycle_wavePeriod, 20);
            f9689a.append(R$styleable.KeyTimeCycle_waveOffset, 21);
            f9689a.append(R$styleable.KeyTimeCycle_waveShape, 19);
        }
    }

    public j() {
        this.f9622d = new HashMap<>();
    }

    public final void a(HashMap<String, c> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public final d clone() {
        j jVar = new j();
        super.c(this);
        jVar.f9673e = this.f9673e;
        jVar.f9686r = this.f9686r;
        jVar.f9687s = this.f9687s;
        jVar.f9688t = this.f9688t;
        jVar.f9685q = this.f9685q;
        jVar.f9674f = this.f9674f;
        jVar.f9675g = this.f9675g;
        jVar.f9676h = this.f9676h;
        jVar.f9679k = this.f9679k;
        jVar.f9677i = this.f9677i;
        jVar.f9678j = this.f9678j;
        jVar.f9680l = this.f9680l;
        jVar.f9681m = this.f9681m;
        jVar.f9682n = this.f9682n;
        jVar.f9683o = this.f9683o;
        jVar.f9684p = this.f9684p;
        return jVar;
    }

    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f9674f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f9675g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f9676h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f9677i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f9678j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f9682n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f9683o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f9684p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f9679k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f9680l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f9681m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f9685q)) {
            hashSet.add("progress");
        }
        if (this.f9622d.size() > 0) {
            for (String str : this.f9622d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyTimeCycle);
        SparseIntArray sparseIntArray = a.f9689a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f9689a.get(index)) {
                case 1:
                    this.f9674f = obtainStyledAttributes.getFloat(index, this.f9674f);
                    break;
                case 2:
                    this.f9675g = obtainStyledAttributes.getDimension(index, this.f9675g);
                    break;
                case 4:
                    this.f9676h = obtainStyledAttributes.getFloat(index, this.f9676h);
                    break;
                case 5:
                    this.f9677i = obtainStyledAttributes.getFloat(index, this.f9677i);
                    break;
                case 6:
                    this.f9678j = obtainStyledAttributes.getFloat(index, this.f9678j);
                    break;
                case 7:
                    this.f9680l = obtainStyledAttributes.getFloat(index, this.f9680l);
                    break;
                case 8:
                    this.f9679k = obtainStyledAttributes.getFloat(index, this.f9679k);
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
                    this.f9673e = obtainStyledAttributes.getInteger(index, this.f9673e);
                    break;
                case 14:
                    this.f9681m = obtainStyledAttributes.getFloat(index, this.f9681m);
                    break;
                case 15:
                    this.f9682n = obtainStyledAttributes.getDimension(index, this.f9682n);
                    break;
                case 16:
                    this.f9683o = obtainStyledAttributes.getDimension(index, this.f9683o);
                    break;
                case 17:
                    this.f9684p = obtainStyledAttributes.getDimension(index, this.f9684p);
                    break;
                case 18:
                    this.f9685q = obtainStyledAttributes.getFloat(index, this.f9685q);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f9686r = obtainStyledAttributes.getInt(index, this.f9686r);
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        this.f9686r = 7;
                        break;
                    }
                case 20:
                    this.f9687s = obtainStyledAttributes.getFloat(index, this.f9687s);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.f9688t = obtainStyledAttributes.getFloat(index, this.f9688t);
                        break;
                    } else {
                        this.f9688t = obtainStyledAttributes.getDimension(index, this.f9688t);
                        break;
                    }
                default:
                    Integer.toHexString(index);
                    a.f9689a.get(index);
                    break;
            }
        }
    }

    public final void f(HashMap<String, Integer> hashMap) {
        if (this.f9673e != -1) {
            if (!Float.isNaN(this.f9674f)) {
                hashMap.put("alpha", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9675g)) {
                hashMap.put("elevation", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9676h)) {
                hashMap.put("rotation", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9677i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9678j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9682n)) {
                hashMap.put("translationX", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9683o)) {
                hashMap.put("translationY", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9684p)) {
                hashMap.put("translationZ", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9679k)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9680l)) {
                hashMap.put("scaleX", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9680l)) {
                hashMap.put("scaleY", Integer.valueOf(this.f9673e));
            }
            if (!Float.isNaN(this.f9685q)) {
                hashMap.put("progress", Integer.valueOf(this.f9673e));
            }
            if (this.f9622d.size() > 0) {
                for (String r10 : this.f9622d.keySet()) {
                    hashMap.put(b0.r("CUSTOM,", r10), Integer.valueOf(this.f9673e));
                }
            }
        }
    }
}

package f1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import b1.j;
import e1.c;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: KeyCycle */
public final class f extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f9639e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f9640f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f9641g = null;

    /* renamed from: h  reason: collision with root package name */
    public float f9642h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f9643i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f9644j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f9645k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public int f9646l = -1;

    /* renamed from: m  reason: collision with root package name */
    public float f9647m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f9648n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f9649o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f9650p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f9651q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f9652r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f9653s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f9654t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    public float f9655u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    public float f9656v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f9657w = Float.NaN;

    /* compiled from: KeyCycle */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f9658a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f9658a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyCycle_motionTarget, 1);
            f9658a.append(R$styleable.KeyCycle_framePosition, 2);
            f9658a.append(R$styleable.KeyCycle_transitionEasing, 3);
            f9658a.append(R$styleable.KeyCycle_curveFit, 4);
            f9658a.append(R$styleable.KeyCycle_waveShape, 5);
            f9658a.append(R$styleable.KeyCycle_wavePeriod, 6);
            f9658a.append(R$styleable.KeyCycle_waveOffset, 7);
            f9658a.append(R$styleable.KeyCycle_waveVariesBy, 8);
            f9658a.append(R$styleable.KeyCycle_android_alpha, 9);
            f9658a.append(R$styleable.KeyCycle_android_elevation, 10);
            f9658a.append(R$styleable.KeyCycle_android_rotation, 11);
            f9658a.append(R$styleable.KeyCycle_android_rotationX, 12);
            f9658a.append(R$styleable.KeyCycle_android_rotationY, 13);
            f9658a.append(R$styleable.KeyCycle_transitionPathRotate, 14);
            f9658a.append(R$styleable.KeyCycle_android_scaleX, 15);
            f9658a.append(R$styleable.KeyCycle_android_scaleY, 16);
            f9658a.append(R$styleable.KeyCycle_android_translationX, 17);
            f9658a.append(R$styleable.KeyCycle_android_translationY, 18);
            f9658a.append(R$styleable.KeyCycle_android_translationZ, 19);
            f9658a.append(R$styleable.KeyCycle_motionProgress, 20);
            f9658a.append(R$styleable.KeyCycle_wavePhase, 21);
        }
    }

    public f() {
        this.f9622d = new HashMap<>();
    }

    public final void a(HashMap<String, c> hashMap) {
        hashMap.size();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i10 = 1; i10 <= min; i10++) {
            stackTrace[i10].getFileName();
            stackTrace[i10].getLineNumber();
            stackTrace[i10].getMethodName();
            str = str + " ";
        }
        for (String next : hashMap.keySet()) {
            j jVar = hashMap.get(next);
            if (jVar != null) {
                next.getClass();
                char c10 = 65535;
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (next.equals("progress")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (next.equals("rotation")) {
                            c10 = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c10 = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c10 = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c10 = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c10 = 13;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        jVar.b(this.f9619a, this.f9651q);
                        break;
                    case 1:
                        jVar.b(this.f9619a, this.f9652r);
                        break;
                    case 2:
                        jVar.b(this.f9619a, this.f9655u);
                        break;
                    case 3:
                        jVar.b(this.f9619a, this.f9656v);
                        break;
                    case 4:
                        jVar.b(this.f9619a, this.f9657w);
                        break;
                    case 5:
                        jVar.b(this.f9619a, this.f9645k);
                        break;
                    case 6:
                        jVar.b(this.f9619a, this.f9653s);
                        break;
                    case 7:
                        jVar.b(this.f9619a, this.f9654t);
                        break;
                    case 8:
                        jVar.b(this.f9619a, this.f9649o);
                        break;
                    case 9:
                        jVar.b(this.f9619a, this.f9648n);
                        break;
                    case 10:
                        jVar.b(this.f9619a, this.f9650p);
                        break;
                    case 11:
                        jVar.b(this.f9619a, this.f9647m);
                        break;
                    case 12:
                        jVar.b(this.f9619a, this.f9643i);
                        break;
                    case 13:
                        jVar.b(this.f9619a, this.f9644j);
                        break;
                    default:
                        next.startsWith("CUSTOM");
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    public final d clone() {
        f fVar = new f();
        super.c(this);
        fVar.f9639e = this.f9639e;
        fVar.f9640f = this.f9640f;
        fVar.f9641g = this.f9641g;
        fVar.f9642h = this.f9642h;
        fVar.f9643i = this.f9643i;
        fVar.f9644j = this.f9644j;
        fVar.f9645k = this.f9645k;
        fVar.f9646l = this.f9646l;
        fVar.f9647m = this.f9647m;
        fVar.f9648n = this.f9648n;
        fVar.f9649o = this.f9649o;
        fVar.f9650p = this.f9650p;
        fVar.f9651q = this.f9651q;
        fVar.f9652r = this.f9652r;
        fVar.f9653s = this.f9653s;
        fVar.f9654t = this.f9654t;
        fVar.f9655u = this.f9655u;
        fVar.f9656v = this.f9656v;
        fVar.f9657w = this.f9657w;
        return fVar;
    }

    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f9647m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f9648n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f9649o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f9651q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f9652r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f9653s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f9654t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f9650p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f9655u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f9656v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f9657w)) {
            hashSet.add("translationZ");
        }
        if (this.f9622d.size() > 0) {
            for (String str : this.f9622d.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyCycle);
        SparseIntArray sparseIntArray = a.f9658a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f9658a.get(index)) {
                case 1:
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
                case 2:
                    this.f9619a = obtainStyledAttributes.getInt(index, this.f9619a);
                    break;
                case 3:
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f9639e = obtainStyledAttributes.getInteger(index, this.f9639e);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f9640f = obtainStyledAttributes.getInt(index, this.f9640f);
                        break;
                    } else {
                        this.f9641g = obtainStyledAttributes.getString(index);
                        this.f9640f = 7;
                        break;
                    }
                case 6:
                    this.f9642h = obtainStyledAttributes.getFloat(index, this.f9642h);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.f9643i = obtainStyledAttributes.getFloat(index, this.f9643i);
                        break;
                    } else {
                        this.f9643i = obtainStyledAttributes.getDimension(index, this.f9643i);
                        break;
                    }
                case 8:
                    this.f9646l = obtainStyledAttributes.getInt(index, this.f9646l);
                    break;
                case 9:
                    this.f9647m = obtainStyledAttributes.getFloat(index, this.f9647m);
                    break;
                case 10:
                    this.f9648n = obtainStyledAttributes.getDimension(index, this.f9648n);
                    break;
                case 11:
                    this.f9649o = obtainStyledAttributes.getFloat(index, this.f9649o);
                    break;
                case 12:
                    this.f9651q = obtainStyledAttributes.getFloat(index, this.f9651q);
                    break;
                case 13:
                    this.f9652r = obtainStyledAttributes.getFloat(index, this.f9652r);
                    break;
                case 14:
                    this.f9650p = obtainStyledAttributes.getFloat(index, this.f9650p);
                    break;
                case 15:
                    this.f9653s = obtainStyledAttributes.getFloat(index, this.f9653s);
                    break;
                case 16:
                    this.f9654t = obtainStyledAttributes.getFloat(index, this.f9654t);
                    break;
                case 17:
                    this.f9655u = obtainStyledAttributes.getDimension(index, this.f9655u);
                    break;
                case 18:
                    this.f9656v = obtainStyledAttributes.getDimension(index, this.f9656v);
                    break;
                case 19:
                    this.f9657w = obtainStyledAttributes.getDimension(index, this.f9657w);
                    break;
                case 20:
                    this.f9645k = obtainStyledAttributes.getFloat(index, this.f9645k);
                    break;
                case 21:
                    this.f9644j = obtainStyledAttributes.getFloat(index, this.f9644j) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    a.f9658a.get(index);
                    break;
            }
        }
    }
}

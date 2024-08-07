package f1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;
import e1.c;
import java.util.HashMap;

/* compiled from: KeyPosition */
public final class h extends i {

    /* renamed from: f  reason: collision with root package name */
    public String f9661f = null;

    /* renamed from: g  reason: collision with root package name */
    public int f9662g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f9663h = 0;

    /* renamed from: i  reason: collision with root package name */
    public float f9664i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f9665j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f9666k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f9667l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f9668m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f9669n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public int f9670o = 0;

    /* compiled from: KeyPosition */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SparseIntArray f9671a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f9671a = sparseIntArray;
            sparseIntArray.append(R$styleable.KeyPosition_motionTarget, 1);
            f9671a.append(R$styleable.KeyPosition_framePosition, 2);
            f9671a.append(R$styleable.KeyPosition_transitionEasing, 3);
            f9671a.append(R$styleable.KeyPosition_curveFit, 4);
            f9671a.append(R$styleable.KeyPosition_drawPath, 5);
            f9671a.append(R$styleable.KeyPosition_percentX, 6);
            f9671a.append(R$styleable.KeyPosition_percentY, 7);
            f9671a.append(R$styleable.KeyPosition_keyPositionType, 9);
            f9671a.append(R$styleable.KeyPosition_sizePercent, 8);
            f9671a.append(R$styleable.KeyPosition_percentWidth, 11);
            f9671a.append(R$styleable.KeyPosition_percentHeight, 12);
            f9671a.append(R$styleable.KeyPosition_pathMotionArc, 10);
        }
    }

    public final void a(HashMap<String, c> hashMap) {
    }

    public final d b() {
        h hVar = new h();
        super.c(this);
        hVar.f9661f = this.f9661f;
        hVar.f9662g = this.f9662g;
        hVar.f9663h = this.f9663h;
        hVar.f9664i = this.f9664i;
        hVar.f9665j = Float.NaN;
        hVar.f9666k = this.f9666k;
        hVar.f9667l = this.f9667l;
        hVar.f9668m = this.f9668m;
        hVar.f9669n = this.f9669n;
        return hVar;
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyPosition);
        SparseIntArray sparseIntArray = a.f9671a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (a.f9671a.get(index)) {
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
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f9661f = b1.c.f3899c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        this.f9661f = obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    this.f9672e = obtainStyledAttributes.getInteger(index, this.f9672e);
                    break;
                case 5:
                    this.f9663h = obtainStyledAttributes.getInt(index, this.f9663h);
                    break;
                case 6:
                    this.f9666k = obtainStyledAttributes.getFloat(index, this.f9666k);
                    break;
                case 7:
                    this.f9667l = obtainStyledAttributes.getFloat(index, this.f9667l);
                    break;
                case 8:
                    float f10 = obtainStyledAttributes.getFloat(index, this.f9665j);
                    this.f9664i = f10;
                    this.f9665j = f10;
                    break;
                case 9:
                    this.f9670o = obtainStyledAttributes.getInt(index, this.f9670o);
                    break;
                case 10:
                    this.f9662g = obtainStyledAttributes.getInt(index, this.f9662g);
                    break;
                case 11:
                    this.f9664i = obtainStyledAttributes.getFloat(index, this.f9664i);
                    break;
                case 12:
                    this.f9665j = obtainStyledAttributes.getFloat(index, this.f9665j);
                    break;
                default:
                    Integer.toHexString(index);
                    a.f9671a.get(index);
                    break;
            }
        }
    }

    public final void h(Object obj, String str) {
        int i10;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c10 = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c10 = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c10 = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c10 = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f9661f = obj.toString();
                return;
            case 1:
                this.f9664i = d.g((Number) obj);
                return;
            case 2:
                this.f9665j = d.g((Number) obj);
                return;
            case 3:
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    i10 = ((Integer) number).intValue();
                } else {
                    i10 = Integer.parseInt(number.toString());
                }
                this.f9663h = i10;
                return;
            case 4:
                float g2 = d.g((Number) obj);
                this.f9664i = g2;
                this.f9665j = g2;
                return;
            case 5:
                this.f9666k = d.g((Number) obj);
                return;
            case 6:
                this.f9667l = d.g((Number) obj);
                return;
            default:
                return;
        }
    }
}

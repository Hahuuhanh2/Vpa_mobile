package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

public class CircularFlow extends VirtualLayout {
    public static int B;
    public static float C;
    public Integer A;

    /* renamed from: r  reason: collision with root package name */
    public ConstraintLayout f1540r;

    /* renamed from: s  reason: collision with root package name */
    public int f1541s;

    /* renamed from: t  reason: collision with root package name */
    public float[] f1542t;

    /* renamed from: u  reason: collision with root package name */
    public int[] f1543u;

    /* renamed from: v  reason: collision with root package name */
    public int f1544v;

    /* renamed from: w  reason: collision with root package name */
    public int f1545w;

    /* renamed from: x  reason: collision with root package name */
    public String f1546x;

    /* renamed from: y  reason: collision with root package name */
    public String f1547y;

    /* renamed from: z  reason: collision with root package name */
    public Float f1548z;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str != null) {
            int i10 = 0;
            this.f1545w = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    v(str.substring(i10).trim());
                    return;
                } else {
                    v(str.substring(i10, indexOf).trim());
                    i10 = indexOf + 1;
                }
            }
        }
    }

    private void setRadius(String str) {
        if (str != null) {
            int i10 = 0;
            this.f1544v = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    w(str.substring(i10).trim());
                    return;
                } else {
                    w(str.substring(i10, indexOf).trim());
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f1542t, this.f1545w);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f1543u, this.f1544v);
    }

    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f1541s = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1546x = string;
                    setAngles(string);
                } else if (index == R$styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1547y = string2;
                    setRadius(string2);
                } else if (index == R$styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, C));
                    this.f1548z = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == R$styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, B));
                    this.A = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1546x;
        if (str != null) {
            this.f1542t = new float[1];
            setAngles(str);
        }
        String str2 = this.f1547y;
        if (str2 != null) {
            this.f1543u = new int[1];
            setRadius(str2);
        }
        Float f10 = this.f1548z;
        if (f10 != null) {
            setDefaultAngle(f10.floatValue());
        }
        Integer num = this.A;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f1540r = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.f1843b; i10++) {
            View c10 = this.f1540r.c(this.f1842a[i10]);
            if (c10 != null) {
                int i11 = B;
                float f11 = C;
                int[] iArr = this.f1543u;
                if (iArr == null || i10 >= iArr.length) {
                    Integer num2 = this.A;
                    if (num2 == null || num2.intValue() == -1) {
                        String str3 = this.f1849o.get(Integer.valueOf(c10.getId()));
                    } else {
                        this.f1544v++;
                        if (this.f1543u == null) {
                            this.f1543u = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f1543u = radius;
                        radius[this.f1544v - 1] = i11;
                    }
                } else {
                    i11 = iArr[i10];
                }
                float[] fArr = this.f1542t;
                if (fArr == null || i10 >= fArr.length) {
                    Float f12 = this.f1548z;
                    if (f12 == null || f12.floatValue() == -1.0f) {
                        String str4 = this.f1849o.get(Integer.valueOf(c10.getId()));
                    } else {
                        this.f1545w++;
                        if (this.f1542t == null) {
                            this.f1542t = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f1542t = angles;
                        angles[this.f1545w - 1] = f11;
                    }
                } else {
                    f11 = fArr[i10];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) c10.getLayoutParams();
                layoutParams.f1900r = f11;
                layoutParams.f1896p = this.f1541s;
                layoutParams.f1898q = i11;
                c10.setLayoutParams(layoutParams);
            }
        }
        h();
    }

    public void setDefaultAngle(float f10) {
        C = f10;
    }

    public void setDefaultRadius(int i10) {
        B = i10;
    }

    public final void v(String str) {
        float[] fArr;
        if (str != null && str.length() != 0 && this.f1844c != null && (fArr = this.f1542t) != null) {
            if (this.f1545w + 1 > fArr.length) {
                this.f1542t = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.f1542t[this.f1545w] = (float) Integer.parseInt(str);
            this.f1545w++;
        }
    }

    public final void w(String str) {
        int[] iArr;
        if (str != null && str.length() != 0 && this.f1844c != null && (iArr = this.f1543u) != null) {
            if (this.f1544v + 1 > iArr.length) {
                this.f1543u = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.f1543u[this.f1544v] = (int) (((float) Integer.parseInt(str)) * this.f1844c.getResources().getDisplayMetrics().density);
            this.f1544v++;
        }
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}

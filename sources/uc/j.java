package uc;

/* compiled from: ResultPoint */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final float f15488a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15489b;

    public j(float f10, float f11) {
        this.f15488a = f10;
        this.f15489b = f11;
    }

    public static float a(j jVar, j jVar2) {
        float f10 = jVar.f15488a;
        float f11 = jVar.f15489b;
        double d10 = (double) (f10 - jVar2.f15488a);
        double d11 = (double) (f11 - jVar2.f15489b);
        return (float) Math.sqrt((d11 * d11) + (d10 * d10));
    }

    public static void b(j[] jVarArr) {
        j jVar;
        j jVar2;
        j jVar3;
        float a10 = a(jVarArr[0], jVarArr[1]);
        float a11 = a(jVarArr[1], jVarArr[2]);
        float a12 = a(jVarArr[0], jVarArr[2]);
        if (a11 >= a10 && a11 >= a12) {
            jVar3 = jVarArr[0];
            jVar2 = jVarArr[1];
            jVar = jVarArr[2];
        } else if (a12 < a11 || a12 < a10) {
            jVar3 = jVarArr[2];
            jVar2 = jVarArr[0];
            jVar = jVarArr[1];
        } else {
            jVar3 = jVarArr[1];
            jVar2 = jVarArr[0];
            jVar = jVarArr[2];
        }
        float f10 = jVar3.f15488a;
        float f11 = jVar3.f15489b;
        if (((jVar2.f15489b - f11) * (jVar.f15488a - f10)) - ((jVar2.f15488a - f10) * (jVar.f15489b - f11)) < 0.0f) {
            j jVar4 = jVar;
            jVar = jVar2;
            jVar2 = jVar4;
        }
        jVarArr[0] = jVar2;
        jVarArr[1] = jVar3;
        jVarArr[2] = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f15488a == jVar.f15488a && this.f15489b == jVar.f15489b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15489b) + (Float.floatToIntBits(this.f15488a) * 31);
    }

    public final String toString() {
        return "(" + this.f15488a + ',' + this.f15489b + ')';
    }
}

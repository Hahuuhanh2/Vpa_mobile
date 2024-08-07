package l4;

import android.graphics.Color;
import android.graphics.PointF;
import android.support.v4.media.a;
import f0.b0;
import java.util.ArrayList;
import m4.c;
import v.v;

/* compiled from: JsonUtils */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f12678a = c.a.a("x", "y");

    public static int a(c cVar) {
        cVar.d();
        int z10 = (int) (cVar.z() * 255.0d);
        int z11 = (int) (cVar.z() * 255.0d);
        int z12 = (int) (cVar.z() * 255.0d);
        while (cVar.v()) {
            cVar.S();
        }
        cVar.i();
        return Color.argb(255, z10, z11, z12);
    }

    public static PointF b(c cVar, float f10) {
        int g2 = v.g(cVar.K());
        if (g2 == 0) {
            cVar.d();
            float z10 = (float) cVar.z();
            float z11 = (float) cVar.z();
            while (cVar.K() != 2) {
                cVar.S();
            }
            cVar.i();
            return new PointF(z10 * f10, z11 * f10);
        } else if (g2 == 2) {
            cVar.h();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (cVar.v()) {
                int N = cVar.N(f12678a);
                if (N == 0) {
                    f11 = d(cVar);
                } else if (N != 1) {
                    cVar.R();
                    cVar.S();
                } else {
                    f12 = d(cVar);
                }
            }
            cVar.q();
            return new PointF(f11 * f10, f12 * f10);
        } else if (g2 == 6) {
            float z12 = (float) cVar.z();
            float z13 = (float) cVar.z();
            while (cVar.v()) {
                cVar.S();
            }
            return new PointF(z12 * f10, z13 * f10);
        } else {
            StringBuilder q10 = a.q("Unknown point starts with ");
            q10.append(b0.I(cVar.K()));
            throw new IllegalArgumentException(q10.toString());
        }
    }

    public static ArrayList c(c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.d();
        while (cVar.K() == 1) {
            cVar.d();
            arrayList.add(b(cVar, f10));
            cVar.i();
        }
        cVar.i();
        return arrayList;
    }

    public static float d(c cVar) {
        int K = cVar.K();
        int g2 = v.g(K);
        if (g2 == 0) {
            cVar.d();
            float z10 = (float) cVar.z();
            while (cVar.v()) {
                cVar.S();
            }
            cVar.i();
            return z10;
        } else if (g2 == 6) {
            return (float) cVar.z();
        } else {
            StringBuilder q10 = a.q("Unknown value for token of type ");
            q10.append(b0.I(K));
            throw new IllegalArgumentException(q10.toString());
        }
    }
}

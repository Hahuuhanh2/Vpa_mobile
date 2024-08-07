package e0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.h;
import c0.j0;
import f0.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import v8.a;
import z0.b;

/* compiled from: ProcessingRequest */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f9051a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9052b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9053c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f9054d;

    /* renamed from: e  reason: collision with root package name */
    public final f0 f9055e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9056f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f9057g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final a<Void> f9058h;

    public w(v vVar, j0.f fVar, Rect rect, int i10, int i11, Matrix matrix, x xVar, b.d dVar) {
        this.f9053c = i11;
        this.f9052b = i10;
        this.f9051a = rect;
        this.f9054d = matrix;
        this.f9055e = xVar;
        this.f9056f = String.valueOf(vVar.hashCode());
        List<h> a10 = vVar.a();
        Objects.requireNonNull(a10);
        for (h id2 : a10) {
            ArrayList arrayList = this.f9057g;
            id2.getId();
            arrayList.add(0);
        }
        this.f9058h = dVar;
    }
}

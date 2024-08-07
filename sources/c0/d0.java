package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.d;
import androidx.core.os.OperationCanceledException;
import c0.b0;
import f0.u0;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e0 f4205a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f4206b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f4207c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f4208d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Rect f4209e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b0.a f4210f;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ b.a f4211n;

    public /* synthetic */ d0(e0 e0Var, d dVar, Matrix matrix, d dVar2, Rect rect, b0.a aVar, b.a aVar2) {
        this.f4205a = e0Var;
        this.f4206b = dVar;
        this.f4207c = matrix;
        this.f4208d = dVar2;
        this.f4209e = rect;
        this.f4210f = aVar;
        this.f4211n = aVar2;
    }

    public final void run() {
        int i10;
        e0 e0Var = this.f4205a;
        d dVar = this.f4206b;
        Matrix matrix = this.f4207c;
        d dVar2 = this.f4208d;
        Rect rect = this.f4209e;
        b0.a aVar = this.f4210f;
        b.a aVar2 = this.f4211n;
        if (e0Var.f4247z) {
            u0 a10 = dVar.f0().a();
            long c10 = dVar.f0().c();
            if (e0Var.f4233e) {
                i10 = 0;
            } else {
                i10 = e0Var.f4230b;
            }
            v0 v0Var = new v0(dVar2, (Size) null, new f(a10, c10, i10, matrix));
            if (!rect.isEmpty()) {
                v0Var.h(rect);
            }
            aVar.b(v0Var);
            aVar2.a(null);
            return;
        }
        aVar2.b(new OperationCanceledException("ImageAnalysis is detached"));
    }
}

package c0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.d;
import c0.b0;
import java.util.concurrent.Executor;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c0 implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e0 f4193a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f4194b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f4195c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f4196d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f4197e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Rect f4198f;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ b0.a f4199n;

    public /* synthetic */ c0(e0 e0Var, Executor executor, d dVar, Matrix matrix, d dVar2, Rect rect, b0.a aVar) {
        this.f4193a = e0Var;
        this.f4194b = executor;
        this.f4195c = dVar;
        this.f4196d = matrix;
        this.f4197e = dVar2;
        this.f4198f = rect;
        this.f4199n = aVar;
    }

    public final String e(b.a aVar) {
        e0 e0Var = this.f4193a;
        Executor executor = this.f4194b;
        d dVar = this.f4195c;
        Matrix matrix = this.f4196d;
        d dVar2 = this.f4197e;
        Rect rect = this.f4198f;
        b0.a aVar2 = this.f4199n;
        e0Var.getClass();
        executor.execute(new d0(e0Var, dVar, matrix, dVar2, rect, aVar2, aVar));
        return "analyzeImage";
    }
}

package mj;

import androidx.camera.core.d;
import c0.v0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f21546a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f21547b;

    public /* synthetic */ a(d dVar, v0 v0Var) {
        this.f21546a = dVar;
        this.f21547b = v0Var;
    }

    public final void onComplete(Task task) {
        d dVar = this.f21546a;
        d dVar2 = this.f21547b;
        j.f(dVar, "this$0");
        j.f(dVar2, "$imageProxy");
        j.f(task, "it");
        dVar.f21553d.invoke(Boolean.valueOf(dVar.f21555f));
        dVar2.close();
    }
}

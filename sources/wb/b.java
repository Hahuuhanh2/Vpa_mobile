package wb;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f16755a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f16756b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f16757c;

    public /* synthetic */ b(c cVar, d dVar) {
        this.f16755a = cVar;
        this.f16757c = dVar;
    }

    public final Task then(Object obj) {
        c cVar = this.f16755a;
        boolean z10 = this.f16756b;
        d dVar = this.f16757c;
        Void voidR = (Void) obj;
        if (z10) {
            synchronized (cVar) {
                cVar.f16762c = Tasks.forResult(dVar);
            }
        } else {
            cVar.getClass();
        }
        return Tasks.forResult(dVar);
    }
}

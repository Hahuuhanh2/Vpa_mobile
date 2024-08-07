package ab;

import cb.a;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetIdListener */
public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource<String> f158a;

    public e(TaskCompletionSource<String> taskCompletionSource) {
        this.f158a = taskCompletionSource;
    }

    public final boolean a(a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (aVar.f() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (aVar.f() == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (aVar.f() == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return false;
                }
            }
        }
        this.f158a.trySetResult(aVar.f4667b);
        return true;
    }

    public final boolean b(Exception exc) {
        return false;
    }
}

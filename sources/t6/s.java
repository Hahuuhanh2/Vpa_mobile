package t6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class s implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f14881a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14882b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f14883c;

    public /* synthetic */ s(a aVar, String str, ScheduledFuture scheduledFuture) {
        this.f14881a = aVar;
        this.f14882b = str;
        this.f14883c = scheduledFuture;
    }

    public final void onComplete(Task task) {
        a aVar = this.f14881a;
        String str = this.f14882b;
        ScheduledFuture scheduledFuture = this.f14883c;
        synchronized (aVar.f14838a) {
            aVar.f14838a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}

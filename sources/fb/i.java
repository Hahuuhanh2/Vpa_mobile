package fb;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import h7.g;
import v.g0;
import w2.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f10138a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f10139b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f10140c;

    public /* synthetic */ i(Context context, Intent intent, boolean z10) {
        this.f10138a = context;
        this.f10139b = intent;
        this.f10140c = z10;
    }

    public final Object then(Task task) {
        Context context = this.f10138a;
        Intent intent = this.f10139b;
        boolean z10 = this.f10140c;
        if (!g.a() || ((Integer) task.getResult()).intValue() != 402) {
            return task;
        }
        return j.a(context, intent, z10).continueWith(new b(4), new g0(25));
    }
}

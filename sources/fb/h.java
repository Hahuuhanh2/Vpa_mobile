package fb;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EnhancedIntentService f10136a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f10137b;

    public /* synthetic */ h(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.f10136a = enhancedIntentService;
        this.f10137b = intent;
    }

    public final void onComplete(Task task) {
        EnhancedIntentService enhancedIntentService = this.f10136a;
        Intent intent = this.f10137b;
        int i10 = EnhancedIntentService.f7575f;
        enhancedIntentService.a(intent);
    }
}

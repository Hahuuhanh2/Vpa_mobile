package g;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import sk.j;

/* compiled from: ActivityResultContracts.kt */
public final class d extends a<Intent, ActivityResult> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        j.f(componentActivity, "context");
        j.f(intent, "input");
        return intent;
    }

    public final Object c(Intent intent, int i10) {
        return new ActivityResult(intent, i10);
    }
}

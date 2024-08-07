package t6;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class n extends o<Void> {
    public n(int i10, Bundle bundle) {
        super(i10, 2, bundle);
    }

    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d((Bundle) null);
        } else {
            c(new zzq("Invalid response to one way request", (SecurityException) null));
        }
    }

    public final boolean b() {
        return true;
    }
}

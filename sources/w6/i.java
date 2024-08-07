package w6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import java.util.Collections;
import java.util.Set;
import y6.a;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class i implements a.f, ServiceConnection {
    static {
        Class<i> cls = i.class;
    }

    public final void connect(a.c cVar) {
        Thread.currentThread();
        throw null;
    }

    public final void disconnect(String str) {
        Thread.currentThread();
        throw null;
    }

    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    public final String getEndpointPackageName() {
        j.f((Object) null);
        throw null;
    }

    public final String getLastDisconnectMessage() {
        return null;
    }

    public final int getMinApkVersion() {
        return 0;
    }

    public final void getRemoteService(b bVar, Set<Scope> set) {
    }

    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    public final boolean isConnected() {
        Thread.currentThread();
        throw null;
    }

    public final boolean isConnecting() {
        Thread.currentThread();
        throw null;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw null;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        throw null;
    }

    public final void onUserSignOut(a.e eVar) {
    }

    public final boolean requiresGooglePlayServices() {
        return false;
    }

    public final boolean requiresSignIn() {
        return false;
    }
}

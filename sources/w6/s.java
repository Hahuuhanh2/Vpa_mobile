package w6;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map f16654a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map f16655b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final void a(Status status, boolean z10) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f16654a) {
            hashMap = new HashMap(this.f16654a);
        }
        synchronized (this.f16655b) {
            hashMap2 = new HashMap(this.f16655b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }
}

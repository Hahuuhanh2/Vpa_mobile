package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.BasePendingResult;
import v6.e;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class a<R extends e, A extends a.b> extends BasePendingResult<R> {
    private final com.google.android.gms.common.api.a<?> mApi;
    private final a.c<A> mClientKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public a(a.c<A> cVar, c cVar2) {
        super(cVar2);
        if (cVar2 != null) {
            j.f(cVar);
            this.mClientKey = cVar;
            this.mApi = null;
            return;
        }
        throw new NullPointerException("GoogleApiClient must not be null");
    }

    private void setFailedResult(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null, (ConnectionResult) null));
    }

    public abstract void doExecute(A a10);

    public final com.google.android.gms.common.api.a<?> getApi() {
        return this.mApi;
    }

    public final a.c<A> getClientKey() {
        return this.mClientKey;
    }

    public void onSetFailedResult(R r10) {
    }

    public final void run(A a10) {
        try {
            doExecute(a10);
        } catch (DeadObjectException e10) {
            setFailedResult((RemoteException) e10);
            throw e10;
        } catch (RemoteException e11) {
            setFailedResult(e11);
        }
    }

    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((e) obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.google.android.gms.common.api.a<?> aVar, c cVar) {
        super(cVar);
        if (cVar != null) {
            if (aVar != null) {
                this.mClientKey = aVar.f5351b;
                this.mApi = aVar;
                return;
            }
            throw new NullPointerException("Api must not be null");
        }
        throw new NullPointerException("GoogleApiClient must not be null");
    }

    public final void setFailedResult(Status status) {
        j.a("Failed result must not be success", !status.P0());
        e createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    public a(BasePendingResult.a<R> aVar) {
        super(aVar);
        this.mClientKey = new a.c<>();
        this.mApi = null;
    }
}

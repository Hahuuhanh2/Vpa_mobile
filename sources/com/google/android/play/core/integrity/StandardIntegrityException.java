package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.b;
import java.util.Locale;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public class StandardIntegrityException extends ApiException {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f7184a;

    public StandardIntegrityException(int i10, Throwable th2) {
        super(new Status(i10, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", new Object[]{Integer.valueOf(i10), b.a(i10)}), (PendingIntent) null, (ConnectionResult) null));
        if (i10 != 0) {
            this.f7184a = th2;
            return;
        }
        throw new IllegalArgumentException("ErrorCode should not be 0.");
    }

    public final synchronized Throwable getCause() {
        return this.f7184a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}

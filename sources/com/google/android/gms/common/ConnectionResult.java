package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p3.l0;
import u6.h;
import v.v;
import y6.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new h();

    /* renamed from: e  reason: collision with root package name */
    public static final ConnectionResult f5319e = new ConnectionResult(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f5320a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5321b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f5322c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5323d;

    public ConnectionResult() {
        throw null;
    }

    public ConnectionResult(int i10) {
        this(1, i10, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f5320a = i10;
        this.f5321b = i11;
        this.f5322c = pendingIntent;
        this.f5323d = str;
    }

    public static String P0(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return v.d("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f5321b != connectionResult.f5321b || !i.a(this.f5322c, connectionResult.f5322c) || !i.a(this.f5323d, connectionResult.f5323d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5321b), this.f5322c, this.f5323d});
    }

    public final String toString() {
        i.a aVar = new i.a(this);
        aVar.a(P0(this.f5321b), "statusCode");
        aVar.a(this.f5322c, "resolution");
        aVar.a(this.f5323d, "message");
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f5320a;
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, i11);
        l0.b1(parcel, 2, this.f5321b);
        l0.e1(parcel, 3, this.f5322c, i10);
        l0.f1(parcel, 4, this.f5323d);
        l0.o1(n12, parcel);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, (String) null);
    }
}

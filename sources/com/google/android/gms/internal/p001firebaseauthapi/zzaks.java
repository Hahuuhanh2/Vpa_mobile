package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaks  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class zzaks extends IOException {
    private zzalp zza = null;
    private boolean zzb;

    public zzaks(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzakr zza() {
        return new zzakr("Protocol message tag had invalid wire type.");
    }

    public static zzaks zzb() {
        return new zzaks("Protocol message end-group tag did not match expected tag.");
    }

    public static zzaks zzc() {
        return new zzaks("Protocol message contained an invalid tag (zero).");
    }

    public static zzaks zzd() {
        return new zzaks("Protocol message had invalid UTF-8.");
    }

    public static zzaks zze() {
        return new zzaks("CodedInputStream encountered a malformed varint.");
    }

    public static zzaks zzf() {
        return new zzaks("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzaks zzg() {
        return new zzaks("Failed to parse the message.");
    }

    public static zzaks zzi() {
        return new zzaks("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzaks zzj() {
        return new zzaks("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzaks zzh(zzalp zzalp) {
        this.zza = zzalp;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzaks(String str) {
        super(str);
    }
}

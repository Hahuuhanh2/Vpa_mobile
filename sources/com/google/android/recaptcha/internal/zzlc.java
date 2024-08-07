package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public class zzlc extends IOException {
    private boolean zza;

    public zzlc(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzlb zza() {
        return new zzlb("Protocol message tag had invalid wire type.");
    }

    public static zzlc zzb() {
        return new zzlc("Protocol message end-group tag did not match expected tag.");
    }

    public static zzlc zzc() {
        return new zzlc("Protocol message contained an invalid tag (zero).");
    }

    public static zzlc zzd() {
        return new zzlc("Protocol message had invalid UTF-8.");
    }

    public static zzlc zze() {
        return new zzlc("CodedInputStream encountered a malformed varint.");
    }

    public static zzlc zzf() {
        return new zzlc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzlc zzg() {
        return new zzlc("Failed to parse the message.");
    }

    public static zzlc zzh() {
        return new zzlc("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzlc zzi() {
        return new zzlc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void zzj() {
        this.zza = true;
    }

    public final boolean zzk() {
        return this.zza;
    }

    public zzlc(String str) {
        super(str);
    }
}

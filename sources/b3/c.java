package b3;

import android.security.keystore.KeyGenParameterSpec;

@Deprecated
/* compiled from: MasterKeys */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3999a = new Object();

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
    }
}

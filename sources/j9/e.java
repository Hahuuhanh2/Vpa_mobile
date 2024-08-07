package j9;

/* compiled from: ExtensionRegistryFactory */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f11752a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f11752a = cls;
    }
}

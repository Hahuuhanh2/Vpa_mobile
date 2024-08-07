package y6;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f17554a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17555b;

    public e(String str, String str2) {
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f17554a = str;
            this.f17555b = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }
}

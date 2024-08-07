package fb;

import f0.b0;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: TopicOperation */
public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f10181d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f10182a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10183b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10184c;

    public y(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str});
            str3 = str2.substring(8);
        }
        if (str3 == null || !f10181d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f10182a = str3;
        this.f10183b = str;
        this.f10184c = b0.s(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!this.f10182a.equals(yVar.f10182a) || !this.f10183b.equals(yVar.f10183b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10183b, this.f10182a});
    }
}

package yk;

import java.io.Serializable;
import java.util.regex.Pattern;
import sk.j;

/* compiled from: Regex.kt */
public final class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f23595a;

    public c(String str) {
        Pattern compile = Pattern.compile(str);
        j.e(compile, "compile(pattern)");
        this.f23595a = compile;
    }

    public final String a(String str) {
        String replaceAll = this.f23595a.matcher(str).replaceAll(" ");
        j.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f23595a.toString();
        j.e(pattern, "nativePattern.toString()");
        return pattern;
    }
}

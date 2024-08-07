package androidx.constraintlayout.core.parser;

import android.support.v4.media.a;

public class CLParsingException extends Exception {
    public final String toString() {
        StringBuilder q10 = a.q("CLParsingException (");
        q10.append(hashCode());
        q10.append(") : ");
        q10.append("null (null at line 0)");
        return q10.toString();
    }
}

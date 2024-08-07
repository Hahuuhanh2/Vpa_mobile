package bc;

import com.google.gson.internal.bind.TypeAdapters;
import hc.b;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement */
public abstract class l {
    public final n g() {
        if (this instanceof n) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final o i() {
        if (this instanceof o) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            b bVar = new b(stringWriter);
            bVar.f10734f = true;
            TypeAdapters.f7804z.b(bVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}

package dc;

import com.google.gson.JsonIOException;

/* compiled from: ConstructorConstructor */
public final class k implements q<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8907a;

    public k(String str) {
        this.f8907a = str;
    }

    public final Object p() {
        throw new JsonIOException(this.f8907a);
    }
}

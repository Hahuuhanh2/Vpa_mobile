package va;

import android.support.v4.media.a;
import com.google.firebase.encoders.EncodingException;
import sa.c;
import sa.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements c {
    public final void encode(Object obj, Object obj2) {
        d dVar = (d) obj2;
        StringBuilder q10 = a.q("Couldn't find encoder for type ");
        q10.append(obj.getClass().getCanonicalName());
        throw new EncodingException(q10.toString());
    }
}
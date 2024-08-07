package ta;

import sa.c;
import ta.b;

/* compiled from: EncoderConfig */
public interface b<T extends b<T>> {
    <U> T registerEncoder(Class<U> cls, c<? super U> cVar);
}

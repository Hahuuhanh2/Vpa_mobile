package va;

import com.google.firebase.encoders.EncodingException;
import sa.b;
import sa.f;

/* compiled from: ProtobufValueEncoderContext */
public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16136a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16137b = false;

    /* renamed from: c  reason: collision with root package name */
    public b f16138c;

    /* renamed from: d  reason: collision with root package name */
    public final f f16139d;

    public i(f fVar) {
        this.f16139d = fVar;
    }

    public final f add(String str) {
        if (!this.f16136a) {
            this.f16136a = true;
            this.f16139d.a(this.f16138c, str, this.f16137b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final f add(boolean z10) {
        if (!this.f16136a) {
            this.f16136a = true;
            this.f16139d.c(this.f16138c, z10 ? 1 : 0, this.f16137b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}

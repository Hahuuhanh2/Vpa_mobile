package y6;

import android.content.Intent;
import w6.g;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class s extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f17587a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f17588b;

    public s(Intent intent, g gVar) {
        this.f17587a = intent;
        this.f17588b = gVar;
    }

    public final void a() {
        Intent intent = this.f17587a;
        if (intent != null) {
            this.f17588b.startActivityForResult(intent, 2);
        }
    }
}

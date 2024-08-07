package h2;

import android.content.Context;
import java.io.File;
import rk.a;
import sk.j;
import sk.k;

/* compiled from: PreferenceDataStoreDelegate.kt */
public final class b extends k implements a<File> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f10534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f10535b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar) {
        super(0);
        this.f10534a = context;
        this.f10535b = cVar;
    }

    public final Object invoke() {
        Context context = this.f10534a;
        j.e(context, "applicationContext");
        String str = this.f10535b.f10536a;
        j.f(str, "name");
        String k10 = j.k(".preferences_pb", str);
        j.f(k10, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), j.k(k10, "datastore/"));
    }
}

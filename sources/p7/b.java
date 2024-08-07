package p7;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import p7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class b extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f14085a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.C0179a f14086b;

    public b(Context context, a.C0179a aVar) {
        this.f14085a = context;
        this.f14086b = aVar;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            a.a(this.f14085a);
            return 0;
        } catch (GooglePlayServicesRepairableException e10) {
            return Integer.valueOf(e10.f5331a);
        } catch (GooglePlayServicesNotAvailableException e11) {
            return Integer.valueOf(e11.f5330a);
        }
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f14086b.s();
            return;
        }
        a.f14081a.a(num.intValue(), this.f14085a, "pi");
        this.f14086b.c(num.intValue());
    }
}

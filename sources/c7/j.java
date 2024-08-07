package c7;

import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.github.g00fy2.quickie.R$id;
import io.github.g00fy2.quickie.R$layout;
import j7.a;
import java.util.concurrent.atomic.AtomicReference;
import w6.m;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class j implements m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4572a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4573b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4574c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4575d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4576e;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f4572a = obj;
        this.f4573b = obj2;
        this.f4574c = obj3;
        this.f4575d = obj4;
        this.f4576e = obj5;
    }

    public static j a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R$layout.quickie_overlay_view, viewGroup);
            int i10 = R$id.close_image_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) a.D(i10, viewGroup);
            if (appCompatImageView != null) {
                i10 = R$id.progress_view;
                LinearLayout linearLayout = (LinearLayout) a.D(i10, viewGroup);
                if (linearLayout != null) {
                    i10 = R$id.title_text_view;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) a.D(i10, viewGroup);
                    if (appCompatTextView != null) {
                        i10 = R$id.torch_image_view;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a.D(i10, viewGroup);
                        if (appCompatImageView2 != null) {
                            return new j(viewGroup, appCompatImageView, linearLayout, appCompatTextView, appCompatImageView2);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i10)));
        }
        throw new NullPointerException("parent");
    }

    public void accept(Object obj, Object obj2) {
        n nVar = new n((p) this.f4572a, (AtomicReference) this.f4573b, (TaskCompletionSource) obj2, (b7.a) this.f4574c);
        h hVar = (h) ((q) obj).getService();
        Parcel zaa = hVar.zaa();
        zac.zae(zaa, nVar);
        zac.zad(zaa, (ApiFeatureRequest) this.f4575d);
        zac.zae(zaa, (c) this.f4576e);
        hVar.zac(2, zaa);
    }
}

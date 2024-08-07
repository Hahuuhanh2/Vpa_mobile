package c7;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f4571a = new d();

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        if (!feature.f5327a.equals(feature2.f5327a)) {
            return feature.f5327a.compareTo(feature2.f5327a);
        }
        return (feature.P0() > feature2.P0() ? 1 : (feature.P0() == feature2.P0() ? 0 : -1));
    }
}

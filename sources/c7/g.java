package c7;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public interface g extends IInterface {
    void i(Status status, ModuleInstallResponse moduleInstallResponse);

    void j(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);
}

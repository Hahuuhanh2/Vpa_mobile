package u6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class f extends g {

    /* renamed from: u0  reason: collision with root package name */
    public Dialog f15295u0;

    /* renamed from: v0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f15296v0;

    /* renamed from: w0  reason: collision with root package name */
    public AlertDialog f15297w0;

    public final Dialog k0() {
        Dialog dialog = this.f15295u0;
        if (dialog != null) {
            return dialog;
        }
        this.f2626l0 = false;
        if (this.f15297w0 == null) {
            Context r10 = r();
            j.f(r10);
            this.f15297w0 = new AlertDialog.Builder(r10).create();
        }
        return this.f15297w0;
    }

    public final void n0(FragmentManager fragmentManager, String str) {
        super.n0(fragmentManager, str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f15296v0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

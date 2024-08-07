package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public Dialog f5324a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnCancelListener f5325b;

    /* renamed from: c  reason: collision with root package name */
    public AlertDialog f5326c;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5325b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f5324a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f5326c == null) {
            Activity activity = getActivity();
            j.f(activity);
            this.f5326c = new AlertDialog.Builder(activity).create();
        }
        return this.f5326c;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

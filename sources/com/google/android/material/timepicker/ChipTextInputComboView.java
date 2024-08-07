package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.t;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f7123a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f7124b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f7125c;

    public class a extends t {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f7123a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            String a10 = ChipTextInputComboView.a(ChipTextInputComboView.this, editable);
            Chip chip = ChipTextInputComboView.this.f7123a;
            if (TextUtils.isEmpty(a10)) {
                a10 = ChipTextInputComboView.a(ChipTextInputComboView.this, "00");
            }
            chip.setText(a10);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final boolean isChecked() {
        return this.f7123a.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7124b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public final void setChecked(boolean z10) {
        int i10;
        int i11;
        this.f7123a.setChecked(z10);
        EditText editText = this.f7124b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        editText.setVisibility(i10);
        Chip chip = this.f7123a;
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        chip.setVisibility(i11);
        if (isChecked()) {
            EditText editText2 = this.f7124b;
            editText2.requestFocus();
            editText2.post(new b0.a(1, editText2, false));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7123a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i10, Object obj) {
        this.f7123a.setTag(i10, obj);
    }

    public final void toggle() {
        this.f7123a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R$layout.material_time_chip, this, false);
        this.f7123a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R$layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f7124b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        this.f7125c = (TextView) findViewById(R$id.material_label);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        editText.setId(d0.e.a());
        d0.e.h(this.f7125c, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}

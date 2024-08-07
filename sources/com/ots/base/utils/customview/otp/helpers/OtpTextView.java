package com.ots.base.utils.customview.otp.helpers;

import al.g0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import cf.b;
import in.aabhasjindal.otptextview.R$styleable;
import java.util.ArrayList;
import sk.j;

/* compiled from: OtpTextView.kt */
public final class OtpTextView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f8325e = 0;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f8326a;

    /* renamed from: b  reason: collision with root package name */
    public OTPChildEditText f8327b;

    /* renamed from: c  reason: collision with root package name */
    public cf.a f8328c;

    /* renamed from: d  reason: collision with root package name */
    public int f8329d;

    /* compiled from: OtpTextView.kt */
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OtpTextView f8330a;

        public a(OtpTextView otpTextView) {
            this.f8330a = otpTextView;
        }

        public final void afterTextChanged(Editable editable) {
            j.f(editable, "s");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            j.f(charSequence, "s");
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            j.f(charSequence, "s");
            cf.a otpListener = this.f8330a.getOtpListener();
            if (otpListener != null) {
                OtpTextView otpTextView = this.f8330a;
                otpListener.a();
                if (charSequence.length() == otpTextView.f8329d) {
                    otpListener.b(charSequence.toString());
                }
            }
            this.f8330a.setOTP(charSequence);
            this.f8330a.setFocus(charSequence.length());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context) {
        super(context);
        j.f(context, "context");
        b((AttributeSet) null);
    }

    private final InputFilter getFilter() {
        return new b();
    }

    /* access modifiers changed from: private */
    public final void setFocus(int i10) {
        ArrayList arrayList = this.f8326a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 == i10) {
                    ((ItemView) arrayList.get(i11)).setViewState(1);
                } else {
                    ((ItemView) arrayList.get(i11)).setViewState(0);
                }
            }
            if (i10 == arrayList.size()) {
                ((ItemView) arrayList.get(arrayList.size() - 1)).setViewState(1);
            }
        }
    }

    private final void setTextWatcher(OTPChildEditText oTPChildEditText) {
        if (oTPChildEditText != null) {
            oTPChildEditText.addTextChangedListener(new a(this));
        }
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.OtpTextView);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f8329d = obtainStyledAttributes.getInt(20, 4);
        this.f8326a = new ArrayList();
        if (this.f8329d > 0) {
            String string = obtainStyledAttributes.getString(21);
            Context context = getContext();
            j.e(context, "getContext(...)");
            Context context2 = getContext();
            j.e(context2, "getContext(...)");
            Context context3 = getContext();
            j.e(context3, "getContext(...)");
            int dimension = (int) obtainStyledAttributes.getDimension(12, (float) g0.Z(context3, -1));
            Context context4 = getContext();
            j.e(context4, "getContext(...)");
            int dimension2 = (int) obtainStyledAttributes.getDimension(14, (float) g0.Z(context4, 4));
            Context context5 = getContext();
            j.e(context5, "getContext(...)");
            int dimension3 = (int) obtainStyledAttributes.getDimension(15, (float) g0.Z(context5, 4));
            Context context6 = getContext();
            j.e(context6, "getContext(...)");
            int dimension4 = (int) obtainStyledAttributes.getDimension(16, (float) g0.Z(context6, 4));
            Context context7 = getContext();
            j.e(context7, "getContext(...)");
            int dimension5 = (int) obtainStyledAttributes.getDimension(13, (float) g0.Z(context7, 4));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) obtainStyledAttributes.getDimension(29, (float) g0.Z(context, 48)), (int) obtainStyledAttributes.getDimension(17, (float) g0.Z(context2, 48)));
            if (dimension > 0) {
                layoutParams.setMargins(dimension, dimension, dimension, dimension);
            } else {
                layoutParams.setMargins(dimension2, dimension4, dimension3, dimension5);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            Context context8 = getContext();
            j.e(context8, "getContext(...)");
            OTPChildEditText oTPChildEditText = new OTPChildEditText(context8);
            this.f8327b = oTPChildEditText;
            oTPChildEditText.setFilters(new InputFilter[]{getFilter(), new InputFilter.LengthFilter(this.f8329d)});
            setTextWatcher(this.f8327b);
            addView(this.f8327b, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 1;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setGravity(1);
            addView(linearLayout, layoutParams3);
            int i10 = this.f8329d;
            for (int i11 = 0; i11 < i10; i11++) {
                Context context9 = getContext();
                j.e(context9, "getContext(...)");
                ItemView itemView = new ItemView(context9, attributeSet);
                itemView.setViewState(0);
                linearLayout.addView(itemView, i11, layoutParams);
                ArrayList arrayList = this.f8326a;
                if (arrayList != null) {
                    arrayList.add(itemView);
                }
            }
            if (string != null) {
                setOTP(string);
            } else {
                setOTP("");
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException("Please specify the length of the otp view");
    }

    public final String getOtp() {
        Editable text;
        OTPChildEditText oTPChildEditText = this.f8327b;
        if (oTPChildEditText == null || (text = oTPChildEditText.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public final OTPChildEditText getOtpEditText() {
        return this.f8327b;
    }

    public final cf.a getOtpListener() {
        return this.f8328c;
    }

    public final void setOTP(CharSequence charSequence) {
        j.f(charSequence, "s");
        ArrayList arrayList = this.f8326a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 < charSequence.length()) {
                    ((ItemView) arrayList.get(i10)).setText(String.valueOf(charSequence.charAt(i10)));
                } else {
                    ((ItemView) arrayList.get(i10)).setText("");
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        j.f(onTouchListener, "l");
        super.setOnTouchListener(onTouchListener);
        OTPChildEditText oTPChildEditText = this.f8327b;
        if (oTPChildEditText != null) {
            oTPChildEditText.setOnTouchListener(onTouchListener);
        }
    }

    public final void setOtp(String str) {
    }

    public final void setOtpListener(cf.a aVar) {
        this.f8328c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        b(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        b(attributeSet);
    }

    public final void setOTP(String str) {
        j.f(str, "otp");
        OTPChildEditText oTPChildEditText = this.f8327b;
        if (oTPChildEditText != null) {
            oTPChildEditText.setText(str);
        }
    }
}

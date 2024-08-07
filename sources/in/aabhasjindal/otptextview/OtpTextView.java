package in.aabhasjindal.otptextview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import sk.j;

/* compiled from: OtpTextView.kt */
public final class OtpTextView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f20695a;

    /* renamed from: b  reason: collision with root package name */
    public OTPChildEditText f20696b;

    /* renamed from: c  reason: collision with root package name */
    public int f20697c;

    /* compiled from: OtpTextView.kt */
    public static final class a implements InputFilter {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20698a = new a();

        public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            while (i10 < i11) {
                if (!Pattern.compile("[1234567890]*").matcher(String.valueOf(charSequence.charAt(i10))).matches()) {
                    return "";
                }
                i10++;
            }
            return null;
        }
    }

    /* compiled from: OtpTextView.kt */
    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OtpTextView f20699a;

        public b(OtpTextView otpTextView) {
            this.f20699a = otpTextView;
        }

        public final void afterTextChanged(Editable editable) {
            j.g(editable, "s");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            j.g(charSequence, "s");
        }

        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            j.g(charSequence, "s");
            this.f20699a.setOTP(charSequence);
            this.f20699a.setFocus(charSequence.length());
            lj.a otpListener = this.f20699a.getOtpListener();
            if (otpListener != null) {
                otpListener.a();
                if (charSequence.length() == this.f20699a.f20697c) {
                    charSequence.toString();
                    otpListener.b();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context) {
        super(context);
        j.g(context, "context");
        b((AttributeSet) null);
    }

    private final InputFilter getFilter() {
        return a.f20698a;
    }

    /* access modifiers changed from: private */
    public final void setFocus(int i10) {
        ArrayList arrayList = this.f20695a;
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
            oTPChildEditText.addTextChangedListener(new b(this));
        }
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.OtpTextView);
        j.b(obtainStyledAttributes, "styles");
        this.f20697c = obtainStyledAttributes.getInt(R$styleable.OtpTextView_length, 4);
        this.f20695a = new ArrayList();
        if (this.f20697c > 0) {
            String string = obtainStyledAttributes.getString(R$styleable.OtpTextView_otp);
            int i10 = R$styleable.OtpTextView_width;
            Context context = getContext();
            j.b(context, "context");
            int i11 = R$styleable.OtpTextView_height;
            Context context2 = getContext();
            j.b(context2, "context");
            int i12 = R$styleable.OtpTextView_box_margin;
            Context context3 = getContext();
            j.b(context3, "context");
            int dimension = (int) obtainStyledAttributes.getDimension(i12, (float) m9.b.C(context3, -1));
            int i13 = R$styleable.OtpTextView_box_margin_left;
            Context context4 = getContext();
            j.b(context4, "context");
            int dimension2 = (int) obtainStyledAttributes.getDimension(i13, (float) m9.b.C(context4, 4));
            int i14 = R$styleable.OtpTextView_box_margin_right;
            Context context5 = getContext();
            j.b(context5, "context");
            int dimension3 = (int) obtainStyledAttributes.getDimension(i14, (float) m9.b.C(context5, 4));
            int i15 = R$styleable.OtpTextView_box_margin_top;
            Context context6 = getContext();
            j.b(context6, "context");
            int dimension4 = (int) obtainStyledAttributes.getDimension(i15, (float) m9.b.C(context6, 4));
            int i16 = R$styleable.OtpTextView_box_margin_bottom;
            Context context7 = getContext();
            j.b(context7, "context");
            int dimension5 = (int) obtainStyledAttributes.getDimension(i16, (float) m9.b.C(context7, 4));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) obtainStyledAttributes.getDimension(i10, (float) m9.b.C(context, 48)), (int) obtainStyledAttributes.getDimension(i11, (float) m9.b.C(context2, 48)));
            if (dimension > 0) {
                layoutParams.setMargins(dimension, dimension, dimension, dimension);
            } else {
                layoutParams.setMargins(dimension2, dimension4, dimension3, dimension5);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            Context context8 = getContext();
            j.b(context8, "context");
            OTPChildEditText oTPChildEditText = new OTPChildEditText(context8);
            this.f20696b = oTPChildEditText;
            oTPChildEditText.setFilters(new InputFilter[]{getFilter(), new InputFilter.LengthFilter(this.f20697c)});
            setTextWatcher(this.f20696b);
            addView(this.f20696b, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = new LinearLayout(getContext());
            addView(linearLayout, layoutParams3);
            int i17 = this.f20697c;
            for (int i18 = 0; i18 < i17; i18++) {
                Context context9 = getContext();
                j.b(context9, "context");
                ItemView itemView = new ItemView(context9, attributeSet);
                itemView.setViewState(0);
                linearLayout.addView(itemView, i18, layoutParams);
                ArrayList arrayList = this.f20695a;
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
        OTPChildEditText oTPChildEditText = this.f20696b;
        if (oTPChildEditText == null || (text = oTPChildEditText.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public final lj.a getOtpListener() {
        return null;
    }

    public final void setOTP(CharSequence charSequence) {
        j.g(charSequence, "s");
        ArrayList arrayList = this.f20695a;
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
        j.g(onTouchListener, "l");
        super.setOnTouchListener(onTouchListener);
        OTPChildEditText oTPChildEditText = this.f20696b;
        if (oTPChildEditText != null) {
            oTPChildEditText.setOnTouchListener(onTouchListener);
        }
    }

    public final void setOtpListener(lj.a aVar) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.g(context, "context");
        b(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OtpTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.g(context, "context");
        b(attributeSet);
    }

    public final void setOTP(String str) {
        j.g(str, "otp");
        OTPChildEditText oTPChildEditText = this.f20696b;
        if (oTPChildEditText != null) {
            oTPChildEditText.setText(str);
        }
    }
}

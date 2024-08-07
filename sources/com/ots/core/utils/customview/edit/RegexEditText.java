package com.ots.core.utils.customview.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.ots.core.R$styleable;
import java.util.regex.Pattern;
import sk.j;

/* compiled from: RegexEditText.kt */
public class RegexEditText extends AppCompatEditText implements InputFilter {

    /* renamed from: n  reason: collision with root package name */
    public Pattern f8397n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RegexEditText(Context context) {
        this(context, (AttributeSet) null, 6, 0);
        j.f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RegexEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RegexEditText(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 16842862 : 0);
    }

    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f8397n == null) {
            return charSequence;
        }
        String substring = String.valueOf(spanned).substring(0, i12);
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = String.valueOf(spanned).substring((i13 - i12) + i12, (String.valueOf(spanned).length() - substring.length()) + i12);
        j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        String str = substring + charSequence + substring2;
        if (i12 > i13 - 1) {
            Pattern pattern = this.f8397n;
            j.c(pattern);
            if (!pattern.matcher(str).matches()) {
                return "";
            }
            return charSequence;
        }
        Pattern pattern2 = this.f8397n;
        j.c(pattern2);
        if (pattern2.matcher(str).matches() || j.a("", str)) {
            return charSequence;
        }
        String substring3 = String.valueOf(spanned).substring(i12, i13);
        j.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring3;
    }

    public final String getInputRegex() {
        Pattern pattern = this.f8397n;
        if (pattern == null) {
            return null;
        }
        j.c(pattern);
        return pattern.pattern();
    }

    public final void setInputRegex(String str) {
        InputFilter[] inputFilterArr;
        boolean z10;
        if (!TextUtils.isEmpty(str)) {
            j.c(str);
            this.f8397n = Pattern.compile(str);
            InputFilter[] filters = getFilters();
            if (filters != null) {
                if (filters.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    inputFilterArr = new InputFilter[(filters.length + 1)];
                    System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                    inputFilterArr[filters.length] = this;
                    super.setFilters(inputFilterArr);
                }
            }
            inputFilterArr = new InputFilter[]{this};
            super.setFilters(inputFilterArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegexEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RegexEditText);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i11 = R$styleable.RegexEditText_inputRegex;
        if (!obtainStyledAttributes.hasValue(i11)) {
            int i12 = R$styleable.RegexEditText_regexType;
            if (obtainStyledAttributes.hasValue(i12)) {
                switch (obtainStyledAttributes.getInt(i12, 0)) {
                    case 1:
                        setInputRegex("\\d{0,11}");
                        break;
                    case 2:
                        setInputRegex("[\\u4e00-\\u9fa5]*");
                        break;
                    case 3:
                        setInputRegex("[[1-9]|[a-zA-Z]|[ ]|[\\u4e00-\\u9fa5]|\\d&&[^\\p{Punct}]]*");
                        break;
                    case 4:
                        setInputRegex("[0-9]\\d*");
                        break;
                    case 5:
                        setInputRegex("[1-9]\\d*");
                        break;
                    case 6:
                        setInputRegex("[[\\u4e00-\\u9fa5]|[a-zA-Z]|\\d]*");
                        break;
                    case 7:
                        setInputRegex("\\S+");
                        break;
                    case 8:
                        setInputRegex("[[1-9]|[a-zA-Z]|[ ]|[\\u4e00-\\u9fa5]|\\d|\\p{L}&&[^\\p{Punct}π|] ]*");
                        break;
                }
            }
        } else {
            setInputRegex(obtainStyledAttributes.getString(i11));
        }
        obtainStyledAttributes.recycle();
    }
}

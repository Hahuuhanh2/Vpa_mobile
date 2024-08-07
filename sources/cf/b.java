package cf;

import android.text.InputFilter;
import android.text.Spanned;
import com.ots.base.utils.customview.otp.helpers.OtpTextView;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements InputFilter {
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        int i14 = OtpTextView.f8325e;
        while (i10 < i11) {
            if (!Pattern.compile("[1234567890]*").matcher(String.valueOf(charSequence.charAt(i10))).matches()) {
                return "";
            }
            i10++;
        }
        return null;
    }
}

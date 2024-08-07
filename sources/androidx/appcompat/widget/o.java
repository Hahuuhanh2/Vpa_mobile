package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public TextView f1159a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f1160b;

    /* compiled from: AppCompatTextClassifierHelper */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public o(TextView textView) {
        textView.getClass();
        this.f1159a = textView;
    }
}

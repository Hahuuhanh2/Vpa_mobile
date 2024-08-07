package n2;

import al.g0;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.d;

/* compiled from: EmojiTextViewHelper */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f13466a;

    /* compiled from: EmojiTextViewHelper */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f13467a;

        /* renamed from: b  reason: collision with root package name */
        public final d f13468b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f13469c = true;

        public a(TextView textView) {
            this.f13467a = textView;
            this.f13468b = new d(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f13469c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            for (d dVar : inputFilterArr) {
                if (dVar == this.f13468b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, r0);
            inputFilterArr3[r0] = this.f13468b;
            return inputFilterArr3;
        }

        public final boolean b() {
            return this.f13469c;
        }

        public final void c(boolean z10) {
            if (z10) {
                this.f13467a.setTransformationMethod(e(this.f13467a.getTransformationMethod()));
            }
        }

        public final void d(boolean z10) {
            this.f13469c = z10;
            this.f13467a.setTransformationMethod(e(this.f13467a.getTransformationMethod()));
            this.f13467a.setFilters(a(this.f13467a.getFilters()));
        }

        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f13469c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    return new h(transformationMethod);
                }
                return transformationMethod;
            } else if (transformationMethod instanceof h) {
                return ((h) transformationMethod).f13476a;
            } else {
                return transformationMethod;
            }
        }
    }

    /* compiled from: EmojiTextViewHelper */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f13470a;

        public c(TextView textView) {
            this.f13470a = new a(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            boolean z10;
            if (d.f2380j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return inputFilterArr;
            }
            return this.f13470a.a(inputFilterArr);
        }

        public final boolean b() {
            return this.f13470a.f13469c;
        }

        public final void c(boolean z10) {
            boolean z11;
            if (d.f2380j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!(!z11)) {
                this.f13470a.c(z10);
            }
        }

        public final void d(boolean z10) {
            boolean z11;
            if (d.f2380j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                this.f13470a.f13469c = z10;
            } else {
                this.f13470a.d(z10);
            }
        }

        public final TransformationMethod e(TransformationMethod transformationMethod) {
            boolean z10;
            if (d.f2380j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return transformationMethod;
            }
            return this.f13470a.e(transformationMethod);
        }
    }

    public f(TextView textView) {
        g0.D(textView, "textView cannot be null");
        this.f13466a = new c(textView);
    }
}

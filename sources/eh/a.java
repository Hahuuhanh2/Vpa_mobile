package eh;

import com.vpa.daugia.module.cart.data.model.Cart;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import n0.l;
import sk.j;

/* compiled from: CartItemState.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Cart f20059a;

    public a(Cart cart) {
        j.f(cart, "item");
        this.f20059a = cart;
    }

    public final String a() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Long paymentDate = this.f20059a.getPaymentDate();
        String str2 = "";
        String str3 = null;
        if (paymentDate != null) {
            str = l.h(paymentDate.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()));
            if (str == null) {
                str = str2;
            }
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(" - ");
        Long paymentDate2 = this.f20059a.getPaymentDate();
        if (paymentDate2 != null) {
            String h10 = l.h(paymentDate2.longValue(), new SimpleDateFormat("HH:mm", Locale.getDefault()));
            if (h10 != null) {
                str2 = h10;
            }
            str3 = str2;
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public final String b() {
        String str;
        String h10;
        StringBuilder sb2 = new StringBuilder();
        Long dueDate = this.f20059a.getDueDate();
        String str2 = "";
        if (dueDate == null || (str = l.h(dueDate.longValue(), new SimpleDateFormat("HH:mm", Locale.getDefault()))) == null) {
            str = str2;
        }
        sb2.append(str);
        sb2.append(" - ");
        Long dueDate2 = this.f20059a.getDueDate();
        if (!(dueDate2 == null || (h10 = l.h(dueDate2.longValue(), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()))) == null)) {
            str2 = h10;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final String c() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        String plateNumber = this.f20059a.getPlateNumber();
        String str3 = null;
        if (plateNumber != null) {
            str = plateNumber.substring(0, 3);
            j.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(" - ");
        String plateNumber2 = this.f20059a.getPlateNumber();
        if (plateNumber2 != null) {
            str2 = plateNumber2.substring(3, 6);
            j.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append('.');
        String plateNumber3 = this.f20059a.getPlateNumber();
        if (plateNumber3 != null) {
            str3 = plateNumber3.substring(6);
            j.e(str3, "this as java.lang.String).substring(startIndex)");
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public final String d() {
        Double totalAmount = this.f20059a.getTotalAmount();
        if (totalAmount == null) {
            return null;
        }
        double doubleValue = totalAmount.doubleValue();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.GERMANY);
        return numberInstance.format(doubleValue) + " đ";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j.a(this.f20059a, ((a) obj).f20059a);
    }

    public final int hashCode() {
        return this.f20059a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("CartItemState(item=");
        q10.append(this.f20059a);
        q10.append(')');
        return q10.toString();
    }
}

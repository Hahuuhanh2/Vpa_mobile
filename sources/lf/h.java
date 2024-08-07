package lf;

import android.util.Patterns;
import java.util.regex.Pattern;
import p3.l0;
import sk.j;
import yk.l;

/* compiled from: Helper.kt */
public final class h {

    /* compiled from: Helper.kt */
    public enum a {
        ;

        /* access modifiers changed from: public */
        static {
            a[] aVarArr;
            l0.K(aVarArr);
        }

        /* access modifiers changed from: public */
        a(String str) {
        }
    }

    public static final String a(String str, String str2) {
        j.f(str, "text");
        j.f(str2, "validateType");
        if (j.a(str2, "") || j.a(str2, "text")) {
            return null;
        }
        boolean z10 = false;
        if (str.length() == 0) {
            z10 = true;
        }
        if (z10) {
            a[] aVarArr = a.f13001a;
            if (l.N0(str2, "lastName")) {
                return "Vui lòng nhập họ (Nguyen)";
            }
            if (l.N0(str2, "firstName")) {
                return "Vui lòng nhập tên đệm và tên (Anh Tuan)";
            }
            if (l.N0(str2, "fullName")) {
                return "Vui lòng nhập họ và tên (vd: Nguyễn Văn A)";
            }
            if (!l.N0(str2, "idNumber")) {
                if (l.N0(str2, "citizenIdentify")) {
                    return "Vui lòng nhập CCCD/Mã số thuế của tổ chức";
                }
                if (l.N0(str2, "password")) {
                    return "Vui lòng nhập mật khẩu";
                }
                if (l.N0(str2, "email")) {
                    return "Vui lòng nhập email";
                }
                if (l.N0(str2, "confirm_password") || l.N0(str2, "passLogin")) {
                    return "Vui lòng nhập lại mật khẩu";
                }
                if (l.N0(str2, "phone")) {
                    return "Vui lòng nhập số điện thoại";
                }
                if (l.N0(str2, "content")) {
                    return "Vui lòng nhập nội dung";
                }
                if (l.N0(str2, "address")) {
                    return "Vui lòng nhập địa điểm";
                }
                if (l.N0(str2, "company_name")) {
                    return "Vui lòng nhập tên tổ chức";
                }
                if (l.N0(str2, "tax_code")) {
                    return "Vui lòng nhập mã số thuế";
                }
                if (l.N0(str2, "contactPersonName")) {
                    return "Vui lòng nhập tên người đại diện";
                }
                if (l.N0(str2, "representativeRole")) {
                    return "Vui lòng nhập chức vụ hiện tại";
                }
                if (l.N0(str2, "location")) {
                    return "Vui lòng nhập nơi thường trú";
                }
                if (l.N0(str2, "bankAccount")) {
                    return "Vui lòng nhập số tài khoản ngân hàng";
                }
                if (l.N0(str2, "bankAccountOwner")) {
                    return "Vui lòng nhập Họ tên chủ tài khoản";
                }
                if (l.N0(str2, "personIssuancePlace")) {
                    return "Vui lòng nhập nơi cấp CCCD";
                }
                if (l.N0(str2, "orgBusinessRegistration")) {
                    return "Vui lòng nhập mã ĐKKD/ĐKHĐ";
                }
                if (l.N0(str2, "orgIssuancePlace")) {
                    return "Vui lòng nhập nơi cấp";
                }
                if (l.N0(str2, "invitationCode")) {
                    return "Vui lòng nhập mã xác thực";
                }
                if (l.N0(str2, "user_name")) {
                    return "Vui lòng nhập tài khoản";
                }
            }
            return "Vui lòng nhập thông tin";
        }
        a[] aVarArr2 = a.f13001a;
        if (l.N0(str2, "contactPersonName")) {
            if (str.length() >= 4) {
                return null;
            }
            return "Tên người đại diện phải có ít nhất 4 ký tự";
        } else if (l.N0(str2, "company_name")) {
            if (str.length() >= 4) {
                return null;
            }
            return "Tên tổ chức phải có ít nhất 4 ký tự";
        } else if (l.N0(str2, "representativeRole")) {
            if (str.length() >= 4) {
                return null;
            }
            return "Chức vụ phải có ít nhất 4 ký tự";
        } else if (l.N0(str2, "email")) {
            if (Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                return null;
            }
            return "Email nhập không đúng định dạng";
        } else if (l.N0(str2, "tax_code")) {
            Pattern compile = Pattern.compile("^\\d{10}(-\\d{3})?$");
            j.e(compile, "compile(pattern)");
            if (compile.matcher(str).matches()) {
                return null;
            }
            return "Mã số thuế không đúng định dạng, vui lòng nhập lại";
        } else if (l.N0(str2, "fullName")) {
            if (str.length() >= 4) {
                return null;
            }
            return "Họ và tên phải có ít nhất 4 ký tự";
        } else if (l.N0(str2, "user_name")) {
            Pattern compile2 = Pattern.compile("^\\d{9,12}$");
            j.e(compile2, "compile(pattern)");
            if (compile2.matcher(str).matches()) {
                return null;
            }
            Pattern compile3 = Pattern.compile("^(0)\\d{9,10}$");
            j.e(compile3, "compile(pattern)");
            if (compile3.matcher(str).matches()) {
                return null;
            }
            Pattern compile4 = Pattern.compile("^\\d{9,12}$");
            j.e(compile4, "compile(pattern)");
            if (compile4.matcher(str).matches()) {
                return null;
            }
            return "Số điện thoại/ Mã số thuế/ CCCD không hợp lệ. Vui lòng nhập lại";
        } else {
            Pattern compile5 = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,50}$");
            j.e(compile5, "compile(pattern)");
            if (!l.N0(str2, "password")) {
                Pattern compile6 = Pattern.compile("[A-Za-z ]+");
                j.e(compile6, "compile(pattern)");
                if (compile6.matcher(str).matches()) {
                    return null;
                }
                if (l.N0(str2, "citizenIdentify")) {
                    Pattern compile7 = Pattern.compile("^\\d{9,12}$");
                    j.e(compile7, "compile(pattern)");
                    if (compile7.matcher(str).matches()) {
                        return null;
                    }
                    return "CCCD/Mã số thuế của tổ chức không hợp lệ";
                } else if (!l.N0(str2, "phone")) {
                    return null;
                } else {
                    Pattern compile8 = Pattern.compile("^(0)\\d{9,10}$");
                    j.e(compile8, "compile(pattern)");
                    if (compile8.matcher(str).matches()) {
                        return null;
                    }
                    return "Số điện thoại không đúng, vui lòng nhập lại";
                }
            } else if (compile5.matcher(str).find()) {
                return null;
            } else {
                return "Mật khẩu phải có độ dài từ 8 đến 50 ký tự và chứa ký tự hoa, chữ thường, ký tự số, ký tự đặc biệt";
            }
        }
    }
}

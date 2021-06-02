package manager;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.lang.reflect.GenericArrayType;
import java.time.Year;

public class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }

    public static void nameException(String name) throws UserException {
        final String NAME_REGEX = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$";
        if (!name.matches(NAME_REGEX)) {
            throw new UserException("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
        }
    }

    public static void emailException(String email) throws UserException {
        final String EMAIL_REGEX = "^[A-Z a-z][A-z a-z 0-9]+\\@[A-Z a-z]+\\.[a-z]+";
        if (!email.matches(EMAIL_REGEX)){
            throw new UserException("Email phải đúng định dạng abc@abc.abc");
        }
    }

    public static void genderException(String gender) throws UserException {
        final String GENDER_REGEX = "([Uu][Nn][Kk][Nn][Oo][Ww][Nn]||[Mm][Aa][Ll][Ee]||[Ff][Aa][Mm][Aa][Ll][Ee])";
        if (!gender.matches(GENDER_REGEX)){
            throw new UserException("Vui lòng nhập lại");
        }
    }

    public static void idCardException(String idCard) throws UserException {
        final String ID_CARD_REGEX = "^[0-9]{3}(\\s[0-9]{3}){2}$";
        if (!idCard.matches(ID_CARD_REGEX)){
            throw new UserException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
        }
    }

    public static void birthdayException(String birthday) throws UserException {
        final String BIRTHDAY_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[0-9]{4}$";
        if (!birthday.matches(BIRTHDAY_REGEX)){
            throw new UserException("Vui lòng nhập đúng định dạng dd/mm/yyyy");
        }else {
            int yearOfBirth = Integer.parseInt(birthday.substring(6));
            int currentYear = Year.now().getValue();
            if (yearOfBirth <= 1990 || (currentYear - yearOfBirth ) < 18){
                throw new UserException("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm");
            }
        }

    }
}

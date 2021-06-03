package common.validate;

import common.exception.CustomerException;

import java.time.Year;

public class ValidateCustomer {

    public static void nameException(String name) throws CustomerException {
        final String NAME_REGEX = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ]" +
                "[a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)" +
                "(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ]" +
                "[a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$";
        if (!name.matches(NAME_REGEX)) {
            throw new CustomerException("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
        }
    }

    public static void emailException(String email) throws CustomerException {
        final String EMAIL_REGEX = "^[a-z][a-z 0-9]+\\@[A-Z a-z]{2,}\\.[a-z]{2,}";
        if (!email.matches(EMAIL_REGEX)) {
            throw new CustomerException("Email phải đúng định dạng abc@abc.abc");
        }
    }

    public static void genderException(String gender) throws CustomerException {
        String newGender = gender.toLowerCase();
        final String GENDER_REGEX = "(unknown|male|famale)";
        if (!newGender.matches(GENDER_REGEX)) {
            throw new CustomerException("Vui lòng nhập lại");
        }
    }

    public static void idCardException(String idCard) throws CustomerException {
        final String ID_CARD_REGEX = "^[0-9]{3}(\\s[0-9]{3}){2}$";
        if (!idCard.matches(ID_CARD_REGEX)) {
            throw new CustomerException("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
        }
    }

    public static void birthdayException(String birthday) throws CustomerException {
        final String BIRTHDAY_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[0-9]{4}$";
        if (!birthday.matches(BIRTHDAY_REGEX)) {
            throw new CustomerException("Vui lòng nhập đúng định dạng dd/mm/yyyy");
        } else {
            int yearOfBirth = Integer.parseInt(birthday.substring(6));
            int currentYear = Year.now().getValue();
            if (yearOfBirth <= 1990 || (currentYear - yearOfBirth) < 18) {
                throw new CustomerException("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm");
            }
        }
    }
}

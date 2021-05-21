package bai_15_xu_ly_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    String errorMessage;
    public IllegalTriangleException(String inErrorMessage) {
        this.errorMessage = inErrorMessage;
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }
}


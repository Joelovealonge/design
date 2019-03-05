package com.alonge;

public class Main {
    public static void main(String[] args) {
        Phone phone = PhoneFactory.createPhone(PhoneType.VIVO);
        phone.desc();
    }
}

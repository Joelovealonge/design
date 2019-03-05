package com.alonge;

/**
 * 生产手机的工厂
 */
public class PhoneFactory {
    public static Phone createPhone(PhoneType phoneType) {
        switch (phoneType){
            case IOS :
                return new IosPhone();
            case VIVO:
                return new VivoPhone();
            default:
                return null;
        }
    }
}

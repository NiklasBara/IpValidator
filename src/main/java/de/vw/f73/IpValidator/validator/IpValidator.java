package de.vw.f73.IpValidator.validator;

public class IpValidator {

    public Boolean validateIpv4Adress(String ipAddress) {
        if (ipAddress.split("\\.").length != 4) {
            return false;
        }

        return true;

    }

}
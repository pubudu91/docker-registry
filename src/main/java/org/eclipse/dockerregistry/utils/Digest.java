package org.eclipse.dockerregistry.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class Digest {

    private Digest() {}

    public static String getDigest(String msg, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(algorithm);
        Formatter formatter = new Formatter();
        byte buf[];

        md.update(msg.getBytes());
        buf = md.digest();

        for (byte b : buf) {
            formatter.format("%02x", b);
        }

        return formatter.toString();
    }
}

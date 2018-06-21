package com.zbjk.authentication.entrance;

import com.zbjk.authentication.function.SampleFunction;

/**
 * @Author: liukun
 * @Description:
 * @Date: 2018/6/21.9:02
 */
public class AuthMain {

    public String authRequest() {
        SampleFunction sf = new SampleFunction();
        System.out.println(sf.getMachineInfo());
        return "";
    }

    public static void main(String[] args) {
        AuthMain am = new AuthMain();
        am.authRequest();
    }
}

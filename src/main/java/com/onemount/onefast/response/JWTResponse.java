package com.onemount.onefast.response;

import com.onemount.onefast.model.Role;

import java.io.Serializable;

public class JWTResponse implements Serializable {
    private String accessToken;
    private String tokenType;

    public JWTResponse(String accessToken, String tokenType) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}

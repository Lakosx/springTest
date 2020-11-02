package com.example.sweater.domain.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptchaResponseDto {
    private boolean succsess;
    @JsonAlias("error-codes")
    private Set<String> errorCodes;

    public boolean isSuccsess() {
        return succsess;
    }

    public void setSuccsess(boolean succsess) {
        this.succsess = succsess;
    }

    public Set<String> getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(Set<String> errorCodes) {
        this.errorCodes = errorCodes;
    }
}

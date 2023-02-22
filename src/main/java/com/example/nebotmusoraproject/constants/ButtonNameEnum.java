package com.example.nebotmusoraproject.constants;

public enum ButtonNameEnum {
    GET_PET_BUTTON("\u0031\u20E3 PET"),
    GET_PP_BUTTON("\u0035\u20E3 PP"),
    GET_AL_BUTTON("\u0034\uDC96\u0031\u20E3 Al"),
    HELP_BUTTON("\2753 Помощь");

    private final String buttonName;

    ButtonNameEnum(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }

}

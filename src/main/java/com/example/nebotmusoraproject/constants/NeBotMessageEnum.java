package com.example.nebotmusoraproject.constants;

public enum NeBotMessageEnum {
    WELCOME_MESSAGE("\uD83D\uDC4B Привет, я помогаю разобраться с сортировкой вторсырья! \n\n" +
            "\u267B Пожалуйста, выберите, какую фракцию хотите сдать на переработку  \n" +
            "Удачи!\n\n" +
            "Воспользуйтесь клавиатурой, чтобы начать работу\uD83D\uDC47"
    ),
    PET_MESSAGE("Мы принимаем пластик с маркировкой PET \u0031\u20E3 \n\n" +
            "Для этой фракции у нас организованы *несколько* отдельных контейнеров: \n" +
            "\uD83C\uDF76 Для бутылок из-под молочных продуктов и растительного масла \n" +
            "\uD83D\uDC49 Для разных бутылок из-под напитков разных цветов: прозрачных, голубых, коричневых, зелёных\n" +
            "\uD83D\uDC40 Для НЕбутылок с маркировкой PET \u0031\u20E3 Это могут быть подложки, коррексы, лотки для продуктов \n\n" +
            "\u2757 Мы *не принимаем грязную фракцию*, всё вторсырьё должно быть *чистым и сухим* \n"
    ),
    PP_MESSAGE("Мы принимаем пластик с маркировкой PP \u0035\u20E3 \n\n"  +
            "Для этой фракции у нас организованы два контейнера: \n" +
            "\uD83D\uDC49 Для мягкого пластика  \n"  +
            "\uD83D\uDC49 Для твердого пластика - свой контейнер \n" +
            "\u261D Обратите внимание! Если на упаковку с маркировкой PP нанесен серебряный слой "  +
            "- для такой фракции есть отдельный контейнер для фольгированных \uD83C\uDF6B \n\n" +
            "\u2757 Мы *не принимаем грязную фракцию*, всё вторсырьё должно быть *чистым и сухим* \n"
    ),
    AL_MESSAGE("Мы на переработку алюминий \u0034\u20E3\u0031\u20E3 \n\n"  +
            "\uD83D\uDC49 Это может быть алюминивая тара и банки \n" +
            "\uD83C\uDF6B Фольга \n"  +
            "\uD83D\uDC40 Фольгированные крышечки от сметаны или от линз \n" +
            "\uD83D\uDC8A Блистеры от таблеток \n\n "  +
            "\u261D Мы *не принимаем алюминиевую композитную упаковку с C\\* \n" +
            "\u2757 Мы *не принимаем грязную фракцию*, всё вторсырьё должно быть *чистым и сухим* \n"
    ),
    HELP_MESSAGE("\u2753  Всё еще остались вопросы? \uD83D\uDDFF Не нашли нужную информацию? \n" +
            "Обратитесь к нашему консультанту"
    ),
    NON_COMMAND_MESSAGE("Пожалуйста, воспользуйтесь клавиатурой\uD83D\uDC47"),
    EXCEPTION_ILLEGAL_MESSAGE("Пожалуйста, воспользуйтесь клавиатурой"),
    EXCEPTION_WHAT_IS_THIS("Что-то пошло не так. Обратитесь к программисту")
    ;

    private final String message;

    NeBotMessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

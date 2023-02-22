package com.example.nebotmusoraproject.handlers;

import com.example.nebotmusoraproject.constants.ButtonNameEnum;
import com.example.nebotmusoraproject.constants.NeBotMessageEnum;
import com.example.nebotmusoraproject.service.ReplyKeyboardMaker;
import com.example.nebotmusoraproject.service.TelegramApiClient;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Component
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class MessageHandler {

    TelegramApiClient telegramApiClient;
    ReplyKeyboardMaker replyKeyboardMaker;

    public BotApiMethod<?> answerMessage(Message message) {
        String chatId = message.getChatId().toString();

        String inputText = message.getText();

        if (inputText == null) {
            throw new IllegalArgumentException();
        } else if (inputText.equals("/start")) {
            return getStartMessage(chatId);
        } else if (inputText.equals(ButtonNameEnum.GET_PET_BUTTON.getButtonName())) {
            return new SendMessage(chatId, NeBotMessageEnum.PET_MESSAGE.getMessage());
        } else if (inputText.equals(ButtonNameEnum.GET_PP_BUTTON.getButtonName())) {
            return new SendMessage(chatId, NeBotMessageEnum.PP_MESSAGE.getMessage());
        } else if (inputText.equals(ButtonNameEnum.GET_AL_BUTTON.getButtonName())) {
            return new SendMessage(chatId, NeBotMessageEnum.AL_MESSAGE.getMessage());
        } else if (inputText.equals(ButtonNameEnum.HELP_BUTTON.getButtonName())) {
            SendMessage sendMessage = new SendMessage(chatId, NeBotMessageEnum.HELP_MESSAGE.getMessage());
            sendMessage.enableMarkdown(true);
            return sendMessage;
        } else {
            return new SendMessage(chatId, NeBotMessageEnum.NON_COMMAND_MESSAGE.getMessage());
        }
    }

    private SendMessage getStartMessage(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, NeBotMessageEnum.WELCOME_MESSAGE.getMessage());
        sendMessage.enableMarkdown(true);
        sendMessage.setReplyMarkup(replyKeyboardMaker.getMainMenuKeyboard());
        return sendMessage;
    }
}




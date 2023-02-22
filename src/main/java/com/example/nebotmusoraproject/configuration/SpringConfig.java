package com.example.nebotmusoraproject.configuration;

import com.example.nebotmusoraproject.handlers.CallbackQueryHandler;
import com.example.nebotmusoraproject.handlers.MessageHandler;
import com.example.nebotmusoraproject.model.NeBot;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;


@Configuration
@AllArgsConstructor
public class SpringConfig {

    private final TelegramConfig telegramConfig;

    @Bean
    public SetWebhook setWebhookInstance() {
        return SetWebhook.builder().url(telegramConfig.getWebhookPath()).build();
    }

    @Bean
    public NeBot springWebhookBot(SetWebhook setWebhook,
                                  MessageHandler messageHandler,
                                  CallbackQueryHandler callbackQueryHandler) {
        NeBot bot = new NeBot(setWebhook, messageHandler, callbackQueryHandler);

        bot.setBotPath(telegramConfig.getWebhookPath());
        bot.setBotUsername(telegramConfig.getBotName());
        bot.setBotToken(telegramConfig.getBotToken());

        return bot;
    }
}

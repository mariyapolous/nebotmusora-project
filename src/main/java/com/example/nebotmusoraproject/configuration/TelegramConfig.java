package com.example.nebotmusoraproject.configuration;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults; //что еще за эксперимент???
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@Getter
@Setter
@PropertySource("application.properties")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TelegramConfig {

    @Value("${bot.name}")
    String botName;

    @Value("${bot.token}")
    String botToken;

    @Value("${bot.webhook-path}")
    String webhookPath;
}

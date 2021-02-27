package me.techmxster.jdabot;

import me.duncte123.botcommons.messaging.EmbedUtils;
import me.duncte123.botcommons.web.WebUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot {

    private Bot() throws LoginException {

        WebUtils.setUserAgent("Mozilla/5.0 Java Bot#9053 / Tech!#0620");
        EmbedUtils.setEmbedBuilder(
                () -> new EmbedBuilder()
                .setColor(0x00FFFF)
                .setFooter("Java bot")
        );

         JDABuilder.createDefault(Config.get("token"))
                .addEventListeners(new Listener())
                .setActivity(Activity.watching("For commands"))
                .build();

    }

    public static void main(String[] args) throws LoginException {
        new Bot();
    }

}

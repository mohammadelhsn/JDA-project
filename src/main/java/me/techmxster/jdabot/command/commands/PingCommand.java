package me.techmxster.jdabot.command.commands;

import me.techmxster.jdabot.command.CommandContext;
import me.techmxster.jdabot.command.ICommand;
import net.dv8tion.jda.api.JDA;

public class PingCommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        JDA jda = ctx.getJDA();

        jda.getRestPing().queue(
                (ping) -> ctx.getChannel()
                .sendMessageFormat("Rest Ping: %sms\nWS ping: %sms", ping, jda.getGatewayPing()).queue()
        );
    }

    @Override
    public String getHelp() {
        return "Shows the bots current ping";
    }

    @Override
    public String getName() { return "ping"; }

    }


package suzuya.structures;

import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import suzuya.SuzuyaClient;

public class HandlerArgs {
    public final SuzuyaClient suzuya;
    public Message msg;
    public Guild guild;
    public User author;
    public Member member;
    public TextChannel channel;
    public SelfUser me;

    public HandlerArgs(SuzuyaClient _suzuya, GuildMessageReceivedEvent event) {
        suzuya = _suzuya;
        build(event);
    }

    private void build(GuildMessageReceivedEvent event) {
        msg = event.getMessage();
        guild = event.getGuild();
        author = event.getAuthor();
        member = event.getMember();
        channel = event.getChannel();
        me = suzuya.client.getSelfUser();
    }
}

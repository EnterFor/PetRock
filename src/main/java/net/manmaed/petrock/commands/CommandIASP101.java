package net.manmaed.petrock.commands;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.manmaed.petrock.hats.PRHats;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TextComponent;

/**
 * Created by manmaed on 29/11/2019.
 */
public class CommandIASP101 {
    public static ArgumentBuilder<CommandSourceStack, ?> register() {
        return Commands.literal("iamslowpoke101")
                .requires(cs -> cs.hasPermission(0))
                .executes(ctx -> run(ctx.getSource()));
    }

    private static int run(CommandSourceStack source) throws CommandSyntaxException {
        PRHats.iamslowpoke101();
        source.getEntity().sendMessage(new TextComponent("Slowpoke101 Hat Enabled!"), source.getPlayerOrException().getUUID());
        return 0;
    }
}
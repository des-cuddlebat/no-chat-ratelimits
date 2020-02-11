package net.cuddlebat.nochatratelimits.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import net.minecraft.server.network.ServerPlayNetworkHandler;

@Mixin(ServerPlayNetworkHandler.class)
public class ServerPlayNetworkHandlerMixin
{
	@ModifyConstant(
		method = "onChatMessage(Lnet/minecraft/server/network/packet/ChatMessageC2SPacket;)V",
		constant = @Constant(intValue = 20))
	private int onChatMessageMixin(int twenty)
	{
		return 0;
	}
}

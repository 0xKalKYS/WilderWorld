
package me.kaloyankys.wilderworld.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Environment(EnvType.CLIENT)
@Mixin(LightmapTextureManager.class)
public abstract class LightmapTextureManagerMixin {

    @Shadow @Final private MinecraftClient client;

    @Inject(method = "getBrightness", at = @At("RETURN"), cancellable = true)
    private void getBrightness(World world, int lightLevel, CallbackInfoReturnable<Float> cir) {
        float light = cir.getReturnValueF() / 2;
        if (this.client.player != null && this.client.player.world.getRegistryKey() == World.OVERWORLD) {
            cir.setReturnValue((float) (light + this.client.player.getY() / 2000));
        }
    }
}
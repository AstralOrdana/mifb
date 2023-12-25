package com.ordana.mifb.mixins;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.block.SoundType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Zombie.class)
public class BabyZombieMixin {

  @Inject(method = "getSpawnAsBabyOdds", at = @At("TAIL"), cancellable = true)
  private static void removeBaby(RandomSource randomSource, CallbackInfoReturnable<Boolean> cir){
    cir.setReturnValue(false);
  }
}

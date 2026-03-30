package com.mega.revelationfix.mixin.enigmaticlegacy;

import com.aizistral.enigmaticlegacy.items.CursedScroll;
import com.aizistral.enigmaticlegacy.items.generic.ItemBaseCurio;
import com.mega.endinglib.util.annotation.ModDependsMixin;
import com.mega.revelationfix.util.entity.ATAHelper2;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import top.theillusivec4.curios.api.SlotContext;

@Mixin(CursedScroll.class)
@ModDependsMixin("enigmaticlegacy")
public abstract class CursedScrollMixin extends ItemBaseCurio {
    @Inject(method = "canEquip", at = @At("HEAD"), cancellable = true, remap = false)
    private void canEquip(SlotContext context, ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        // 取消互斥条件，允许诅咒卷轴与祝福卷轴同时装备
        // 原检查逻辑已移除，直接继承父类行为
        // if (super.canEquip(context, stack)) {
        //     LivingEntity var4 = context.entity();
        //     if (var4 instanceof Player player) {
        //         if (ATAHelper2.hasBlessingScroll(player)) {
        //             cir.setReturnValue(false);
        //         }
        //     }
        // }
    }
}

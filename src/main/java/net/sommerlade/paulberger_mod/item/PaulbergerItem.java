package net.sommerlade.paulberger_mod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import org.jetbrains.annotations.NotNull;

public class PaulbergerItem  extends Item {

    public PaulbergerItem(Item.Properties pProperties) {
        super(pProperties);
    }
    public @NotNull SoundEvent getEatingSound() {
        return SoundEvents.HONEY_DRINK;
    }
    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack pStack) {
        return UseAnim.DRINK;
    }
    public int getUseDuration(@NotNull ItemStack pStack) {
        return 40;
    }
}

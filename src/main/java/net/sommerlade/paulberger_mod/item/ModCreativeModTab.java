package net.sommerlade.paulberger_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.sommerlade.paulberger_mod.Paulberger_mod.MODID;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> PAULBERGER_TAB =
                CREATIVE_MOD_TABS.register("paulberger_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItemInit.PAULBERGER_PEACH.get()))
                    .title(Component.translatable("creativeTab.paulberger_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItemInit.PAULBERGER_PEACH.get());
                        output.accept(ModItemInit.PAULBERGER_BUBBLE_KISTE.get());
                        output.accept(ModItemInit.PAULBERGER_LEMON.get());
                        output.accept(ModItemInit.PAULBERGER_BUBBLE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}

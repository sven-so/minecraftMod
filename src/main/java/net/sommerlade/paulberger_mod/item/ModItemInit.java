package net.sommerlade.paulberger_mod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.sommerlade.paulberger_mod.Paulberger_mod.MODID;

public class ModItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> PAULBERGER_PEACH = ITEMS.register("paulberger_peach", () -> {
        Item.Properties properties = new Item.Properties();
        return new PaulbergerItem(properties
                .food(new FoodProperties.Builder()
                        .alwaysEat()
                        .nutrition(5)
                        .saturationMod(2)
                        .build())
                .rarity(Rarity.EPIC)
                .stacksTo(16)
                .fireResistant()
        );
    });


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        eventBus.addListener(ModItemInit::addCreative);
    }

    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
        event.accept(PAULBERGER_PEACH);
    }
}

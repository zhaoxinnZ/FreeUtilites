package net.zxzinn.freeutilities;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zxzinn.freeutilities.items.EnderTorchItem;

public class ModEventSubscriber {
    // Create the DeferredRegister object for Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "freeutilities");

    // Register the ender_torch item
    public static final RegistryObject<Item> ENDER_TORCH = ITEMS.register("ender_torch", EnderTorchItem::new);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
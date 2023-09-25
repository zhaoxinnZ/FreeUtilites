package net.zxzinn.freeutilities.events;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zxzinn.freeutilities.FreeUtilities;
import net.zxzinn.freeutilities.blocks.EnderTorch;
import net.zxzinn.freeutilities.items.EnderTorchItem;

public class ModEventRegistration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FreeUtilities.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FreeUtilities.MODID);

    public static final RegistryObject<Block> ENDER_TORCH = BLOCKS.register("ender_torch", () -> new EnderTorch());
    public static final RegistryObject<Item> ENDER_TORCH_ITEM = ITEMS.register("ender_torch", EnderTorchItem::new);

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}

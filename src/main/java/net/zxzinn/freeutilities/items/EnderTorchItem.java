package net.zxzinn.freeutilities.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.zxzinn.freeutilities.FreeUtilities;
import net.zxzinn.freeutilities.events.ModEventRegistration;

public class EnderTorchItem extends BlockItem {

    public EnderTorchItem() {
        super(ModEventRegistration.ENDER_TORCH.get(), new Item.Properties().tab(FreeUtilities.tab));
    }
}




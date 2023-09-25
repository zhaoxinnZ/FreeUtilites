package net.zxzinn.freeutilities.group;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.zxzinn.freeutilities.blocks.EnderTorch;

public class CreativeTab extends CreativeModeTab {
    public CreativeTab() {
        super("freeutilities");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(new EnderTorch());
    }
}

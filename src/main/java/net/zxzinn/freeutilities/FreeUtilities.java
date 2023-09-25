package net.zxzinn.freeutilities;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.zxzinn.freeutilities.blocks.EnderTorch;
import net.zxzinn.freeutilities.events.ModEventRegistration;
import net.zxzinn.freeutilities.events.TeleportPrevention;
import net.zxzinn.freeutilities.items.EnderTorchItem;

@Mod(FreeUtilities.MODID)
public class FreeUtilities {
    public static final String MODID = "freeutilities";
    public static CreativeModeTab tab = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(new ModEventRegistration().ENDER_TORCH_ITEM.get());
        }
    }
    ;
    public FreeUtilities() {

        IEventBus ModEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEventBus.addListener(this::setup);
        ModEventBus.addListener(this::doClientStuff);

        ModEventRegistration.register(ModEventBus);

        TeleportPrevention.register();



    }

    private void setup(final FMLCommonSetupEvent event) {
        // Some common setup code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Some client-specific code
    }
}


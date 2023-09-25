package net.zxzinn.freeutilities.events;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.zxzinn.freeutilities.FreeUtilities;
import net.zxzinn.freeutilities.blocks.EnderTorch;
import net.minecraftforge.event.entity.EntityTeleportEvent;

@Mod.EventBusSubscriber(modid = FreeUtilities.MODID)
public class TeleportPrevention {

    @SubscribeEvent
    public static void onEndermanTeleport(EntityTeleportEvent event) {
        if (event.getEntity() instanceof EnderMan) {
            Level world = event.getEntity().level;
            BlockPos pos = event.getEntity().blockPosition();

            // Check for nearby EnderTorch
            for (BlockPos nearbyPos : BlockPos.betweenClosed(pos.offset(-3, -3, -3), pos.offset(3, 3, 3))) {
                Block block = world.getBlockState(nearbyPos).getBlock();
                if (block instanceof EnderTorch) {
                    event.setCanceled(true);
                    return;
                }
            }
        }
    }

    public static void register() {
        MinecraftForge.EVENT_BUS.register(TeleportPrevention.class);
    }
}

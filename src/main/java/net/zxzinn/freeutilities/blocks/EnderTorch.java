package net.zxzinn.freeutilities.blocks;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.material.Material;

public class EnderTorch extends TorchBlock {
    public EnderTorch() {
        super(Properties.of(Material.DECORATION)
                        .strength(0.5f) // Hardness and resistance
                        .noOcclusion()  // Does not block any light
                        .lightLevel((state) -> 15)  // Maximum light level of 15
                        .sound(SoundType.WOOL)  // Sound it makes when placed, broken, etc.
                        .noCollission()  // Entities can move through it
                        .instabreak(), ParticleTypes.FLAME);  // Breaks instantly when hit
        // Constructor - you can initialize things here.
    }



    // Override methods or add new methods to introduce custom behaviors.
}

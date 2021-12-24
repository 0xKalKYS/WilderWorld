package me.kaloyankys.wilderworld.block;

import me.kaloyankys.wilderworld.world.AspenSaplingGenerator;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class AspenBirchSaplingBlock extends SaplingBlock {

    private final AspenSaplingGenerator aspenSaplingGenerator;

    public AspenBirchSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
        aspenSaplingGenerator = (AspenSaplingGenerator) generator;
    }

    @Override
    public void generate(ServerWorld world, BlockPos pos, BlockState state, Random random) {
        aspenSaplingGenerator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
    }
}

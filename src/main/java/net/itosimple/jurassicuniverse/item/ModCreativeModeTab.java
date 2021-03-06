package net.itosimple.jurassicuniverse.item;

import net.itosimple.jurassicuniverse.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab JURASSIC_ITEMS = new CreativeModeTab("jurassicitems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.INGEN_FIELD_GUIDE.get());
        }
    };
    public static final CreativeModeTab JURASSI_BLOCKS = new CreativeModeTab("jurassicblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.AMBER_ORE.get());
        }
    };
    public static final CreativeModeTab JURASSIC_MACHINES = new CreativeModeTab("jurassicmachines") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FOSSIL_CLEANER.get());
        }
    };
}

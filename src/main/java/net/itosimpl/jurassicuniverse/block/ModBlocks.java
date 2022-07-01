package net.itosimpl.jurassicuniverse.block;

import net.itosimpl.jurassicuniverse.JurassicUniverse;
import net.itosimpl.jurassicuniverse.item.ModCreativeModeTab;
import net.itosimpl.jurassicuniverse.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JurassicUniverse.MOD_ID);

    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.JURASSI_BLOCKS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
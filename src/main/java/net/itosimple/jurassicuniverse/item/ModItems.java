package net.itosimple.jurassicuniverse.item;

import net.itosimple.jurassicuniverse.JurassicUniverse;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JurassicUniverse.MOD_ID);

    public static final RegistryObject<Item> MOSQUITO_AMBER = ITEMS.register("mosquito_amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> INGEN_FIELD_GUIDE = ITEMS.register("ingen_field_guide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> EMPTY_SYRINGE = ITEMS.register("empty_syringe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> EMPTY_TEST_TUBE = ITEMS.register("empty_test_tube",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> KEYBOARD = ITEMS.register("keyboard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> OSTRICH_EGG = ITEMS.register("ostrich_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> MONITOR = ITEMS.register("monitor",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> UNUSABLE_DNA_TEST_TUBE = ITEMS.register("unusable_dna_test_tube",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> TRACKING_CHIP = ITEMS.register("tracking_chip",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));

    public static final RegistryObject<Item> UNIDENTIFIED_FOSSIL = ITEMS.register("unidentified_fossil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JURASSIC_ITEMS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

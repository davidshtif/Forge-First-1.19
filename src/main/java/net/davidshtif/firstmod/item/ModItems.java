package net.davidshtif.firstmod.item;

import net.davidshtif.firstmod.FirstMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));



    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(ToolTiers.SILVER,5, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ToolTiers.SILVER,2, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ToolTiers.SILVER,3, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ToolTiers.SILVER,1, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));



    public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

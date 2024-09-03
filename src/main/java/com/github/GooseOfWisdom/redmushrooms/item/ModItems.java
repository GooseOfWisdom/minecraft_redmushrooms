package com.github.GooseOfWisdom.redmushrooms.item;

import com.github.GooseOfWisdom.redmushrooms.Redmushrooms;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Redmushrooms.MOD_ID);


    //BASIC ITEMS
    public static final RegistryObject<Item> MYSTERIOUS_MUSHROOM = ITEMS.register("mysterious_mushroom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MUSHROOM_TAB)));


    //TOOLS
    public static final RegistryObject<Item> MUSHROOM_SWORD = ITEMS.register("mushroom_sword",
            () -> new SwordItem(ModTiers.MUSHROOM, 2, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.MUSHROOM_TAB)));
    public static final RegistryObject<Item> MUSHROOM_PICKAXE = ITEMS.register("mushroom_pickaxe",
            () -> new PickaxeItem(ModTiers.MUSHROOM, 1, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MUSHROOM_TAB)));
    public static final RegistryObject<Item> MUSHROOM_SHOVEL = ITEMS.register("mushroom_shovel",
            () -> new ShovelItem(ModTiers.MUSHROOM, 0, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MUSHROOM_TAB)));
    public static final RegistryObject<Item> MUSHROOM_AXE = ITEMS.register("mushroom_axe",
            () -> new AxeItem(ModTiers.MUSHROOM, 4, -2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.MUSHROOM_TAB)));
    public static final RegistryObject<Item> MUSHROOM_HOE = ITEMS.register("mushroom_hoe",
            () -> new HoeItem(ModTiers.MUSHROOM, 0, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.MUSHROOM_TAB)));

    //Registers the created items to the eventBus
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

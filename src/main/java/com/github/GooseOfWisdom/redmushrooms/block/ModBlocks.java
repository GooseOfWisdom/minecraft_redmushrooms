package com.github.GooseOfWisdom.redmushrooms.block;

import com.github.GooseOfWisdom.redmushrooms.Redmushrooms;
import com.github.GooseOfWisdom.redmushrooms.block.custom.MysteriousMushrooms;
import com.github.GooseOfWisdom.redmushrooms.item.ModCreativeModeTab;
import com.github.GooseOfWisdom.redmushrooms.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Redmushrooms.MOD_ID);


    public static final RegistryObject<Block> MYSTERIOUS_MUSHROOMS = registerBlock("mysterious_mushrooms",
            () -> new MysteriousMushrooms(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)
                    .lightLevel((state) -> 5)
                    .noOcclusion()), ModCreativeModeTab.MUSHROOM_TAB);

    public static final RegistryObject<Block> MYSTERIOUS_MUSHROOM_BLOCK = registerBlock("mysterious_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM)
                    .lightLevel((state) -> 5)), ModCreativeModeTab.MUSHROOM_TAB);


    //Registers the block as a registry object as well as registering the block as an item registry object
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    //Works as part of registerBlock (the part that takes the block, converts it to an item and registers it to the ITEMS register)
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }



    //Registers the created blocks to the eventBus
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

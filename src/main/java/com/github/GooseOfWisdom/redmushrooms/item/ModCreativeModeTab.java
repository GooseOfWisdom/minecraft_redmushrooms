package com.github.GooseOfWisdom.redmushrooms.item;

import com.github.GooseOfWisdom.redmushrooms.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MUSHROOM_TAB = new CreativeModeTab("mushroomtab") {

        //Overrides the icon with the Enderlite Ingot sprite
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MYSTERIOUS_MUSHROOMS.get());
        }
    };

}

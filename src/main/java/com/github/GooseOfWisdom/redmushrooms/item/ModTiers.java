package com.github.GooseOfWisdom.redmushrooms.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier MUSHROOM = new ForgeTier(2, 1400, 5.5f, 2f,
            22, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.MYSTERIOUS_MUSHROOM.get()));
}

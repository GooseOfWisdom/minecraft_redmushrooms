package com.github.GooseOfWisdom.redmushrooms.entity.client;

import com.github.GooseOfWisdom.redmushrooms.Redmushrooms;
import com.github.GooseOfWisdom.redmushrooms.entity.custom.MushfolkEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MushfolkModel extends AnimatedGeoModel<MushfolkEntity> {
    @Override
    public ResourceLocation getModelLocation(MushfolkEntity mushfolkEntity) {
        return new ResourceLocation(Redmushrooms.MOD_ID, "geo/mushfolk.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MushfolkEntity mushfolkEntity) {
        return new ResourceLocation(Redmushrooms.MOD_ID, "textures/entity/mushfolk/mushfolk.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MushfolkEntity mushfolkEntity) {
        return new ResourceLocation(Redmushrooms.MOD_ID, "animations/mushfolk.animation.json");
    }
}

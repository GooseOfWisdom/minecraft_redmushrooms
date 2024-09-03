package com.github.GooseOfWisdom.redmushrooms.entity.client;

import com.github.GooseOfWisdom.redmushrooms.Redmushrooms;
import com.github.GooseOfWisdom.redmushrooms.entity.custom.MushfolkEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MushfolkRenderer extends GeoEntityRenderer<MushfolkEntity> {
    public MushfolkRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MushfolkModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(MushfolkEntity animatable) {
        return new ResourceLocation(Redmushrooms.MOD_ID, "textures/entity/mushfolk/mushfolk.png");
    }

    @Override
    public RenderType getRenderType(MushfolkEntity animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        poseStack.scale(1f,1f,1f);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}

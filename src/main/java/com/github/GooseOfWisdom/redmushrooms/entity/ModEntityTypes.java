package com.github.GooseOfWisdom.redmushrooms.entity;

import com.github.GooseOfWisdom.redmushrooms.Redmushrooms;
import com.github.GooseOfWisdom.redmushrooms.entity.custom.MushfolkEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

import javax.swing.*;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Redmushrooms.MOD_ID);


    public static final RegistryObject<EntityType<MushfolkEntity>> MUSHFOLK =
            ENTITY_TYPES.register("mushfolk", () -> EntityType.Builder.of(MushfolkEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 1f)
                    .build(new ResourceLocation(Redmushrooms.MOD_ID, "mushfolk").toString()));



    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}

package com.github.GooseOfWisdom.redmushrooms.event;

import com.github.GooseOfWisdom.redmushrooms.Redmushrooms;
import com.github.GooseOfWisdom.redmushrooms.entity.ModEntityTypes;
import com.github.GooseOfWisdom.redmushrooms.entity.custom.MushfolkEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.swing.text.html.parser.Entity;

@Mod.EventBusSubscriber(modid = Redmushrooms.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {


    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntityTypes.MUSHFOLK.get(), MushfolkEntity.setAttributes());
    }
}

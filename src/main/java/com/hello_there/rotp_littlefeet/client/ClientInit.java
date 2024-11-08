package com.hello_there.rotp_littlefeet.client;

import com.hello_there.rotp_littlefeet.LittleFeetAddon;
import com.hello_there.rotp_littlefeet.init.InitStands;
import com.hello_there.rotp_littlefeet.client.render.entity.renderer.stand.LittleFeetRenderer;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = LittleFeetAddon.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {
    
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(
                InitStands.LITTLE_FEET_STAND.getEntityType(), LittleFeetRenderer::new);
    }
}
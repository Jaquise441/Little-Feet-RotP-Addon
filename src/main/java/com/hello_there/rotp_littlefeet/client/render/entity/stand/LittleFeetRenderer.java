package com.hello_there.rotp_littlefeet.client.render.entity.stand;

import com.github.standobyte.jojo.client.render.entity.model.stand.StandEntityModel;
import com.github.standobyte.jojo.client.render.entity.model.stand.StandModelRegistry;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;
import com.hello_there.rotp_littlefeet.LittleFeetAddon;
import com.hello_there.rotp_littlefeet.entity.LittleFeetEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class LittleFeetRenderer extends StandEntityRenderer<LittleFeetEntity, StandEntityModel<LittleFeetEntity>> {
    
    public LittleFeetRenderer(EntityRendererManager renderManager) {
        super(renderManager, 
                StandModelRegistry.registerModel(new ResourceLocation(LittleFeetAddon.MOD_ID, "little_feet"), LittleFeetModel::new),
                new ResourceLocation(LittleFeetAddon.MOD_ID, "textures/entity/stand/little_feet.png"), 0);
    }
}
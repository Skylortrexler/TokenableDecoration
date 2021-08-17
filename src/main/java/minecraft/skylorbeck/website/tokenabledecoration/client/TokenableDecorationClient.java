package minecraft.skylorbeck.website.tokenabledecoration.client;

import minecraft.skylorbeck.website.tokenabledecoration.Declarar;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.client.render.RenderLayer;

@Environment(net.fabricmc.api.EnvType.CLIENT)
public class TokenableDecorationClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMapImpl.INSTANCE.putBlock(Declarar.chandelier, RenderLayer.getCutout());
        BlockRenderLayerMapImpl.INSTANCE.putBlock(Declarar.hardenedglass, RenderLayer.getTranslucent());
        BlockRenderLayerMapImpl.INSTANCE.putBlock(Declarar.glowingglass, RenderLayer.getTranslucent());
        BlockRenderLayerMapImpl.INSTANCE.putBlock(Declarar.glowingglasspane, RenderLayer.getTranslucent());
        BlockRenderLayerMapImpl.INSTANCE.putBlock(Declarar.squareglass, RenderLayer.getTranslucent());
        BlockRenderLayerMapImpl.INSTANCE.putBlock(Declarar.glassbrick, RenderLayer.getTranslucent());
        BlockRenderLayerMapImpl.INSTANCE.putBlock(Declarar.obsidianglass , RenderLayer.getTranslucent());
    }
}

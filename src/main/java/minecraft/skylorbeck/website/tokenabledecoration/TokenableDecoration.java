package minecraft.skylorbeck.website.tokenabledecoration;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.DyeColor;

public class TokenableDecoration implements ModInitializer {
    @Override
    public void onInitialize() {
        Registrar.Register();
    }
}

//todo
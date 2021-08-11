package minecraft.skylorbeck.website.tokenabledecoration;

import net.fabricmc.api.ModInitializer;

public class TokenableDecoration implements ModInitializer {
    @Override
    public void onInitialize() {
        Registrar.Register();
    }
}

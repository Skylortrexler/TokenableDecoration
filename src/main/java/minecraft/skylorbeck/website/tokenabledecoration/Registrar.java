package minecraft.skylorbeck.website.tokenabledecoration;

import website.skylorbeck.minecraft.skylorlib.SkylorLib;

import static website.skylorbeck.minecraft.skylorlib.Registrar.*;

public class Registrar {
    public static final String MODID = "tokenabledecoration";
    public static void Register(){
        regBlock("marrowlessbone",Declarar.marrowlessbone,MODID);
        regItem("marrowlessbone",Declarar.marrowlessboneitem,MODID);
    }

}

package minecraft.skylorbeck.website.tokenabledecoration;

import website.skylorbeck.minecraft.skylorlib.SkylorLib;

import static website.skylorbeck.minecraft.skylorlib.Registrar.*;

public class Registrar {
    public static final String MODID = "tokenabledecoration";
    public static void Register(){

        regBlock("marrowlessbone",Declarar.marrowlessbone,MODID);
        regItem("marrowlessbone",Declarar.marrowlessboneitem,MODID);

        regBlock("burntquartz",Declarar.burntquartz,MODID);
        regItem("burntquartz",Declarar.burntquartzitem,MODID);

        regBlock("glowingobsidian",Declarar.glowingobsidian,MODID);
        regItem("glowingobsidian",Declarar.glowingobsidianitem,MODID);

        regBlock("mossyplank",Declarar.mossyplank,MODID);
        regItem("mossyplank",Declarar.mossyplankitem,MODID);

        regBlock("chandelier",Declarar.chandelier,MODID);
        regItem("chandelier",Declarar.chandelieritem,MODID);

        regBlock("bedrockium",Declarar.bedrockium,MODID);
        regItem("bedrockium",Declarar.bedrockiumitem,MODID);
        regBlock("bedrockiumbrick",Declarar.bedrockiumbrick,MODID);
        regItem("bedrockiumbrick",Declarar.bedrockiumbrickitem,MODID);
        regBlock("chiseledbedrockium",Declarar.chiseledbedrockium,MODID);
        regItem("chiseledbedrockium",Declarar.chiseledbedrockiumitem,MODID);
        regItem("bedrockiumingot",Declarar.bedrockiumingotitem,MODID);

        regBlock("hardenedglass",Declarar.hardenedglass,MODID);
        regItem("hardenedglass",Declarar.hardenedglassitem,MODID);
        regBlock("sandyglass",Declarar.sandyglass,MODID);
        regItem("sandyglass",Declarar.sandyglassitem,MODID);
        regBlock("glowingglass",Declarar.glowingglass,MODID);
        regItem("glowingglass",Declarar.glowingglassitem,MODID);
        regBlock("glowingglasspane",Declarar.glowingglasspane,MODID);
        regItem("glowingglasspane",Declarar.glowingglasspaneitem,MODID);
        regBlock("squareglass",Declarar.squareglass,MODID);
        regItem("squareglass",Declarar.squareglassitem,MODID);
        regBlock("glassbrick",Declarar.glassbrick,MODID);
        regItem("glassbrick",Declarar.glassbrickitem,MODID);
        regBlock("obsidianglass",Declarar.obsidianglass,MODID);
        regItem("obsidianglass",Declarar.obsidianglassitem,MODID);
        
        regBlock("whiteglowstone",Declarar.whiteglowstone,MODID);
        regItem("whiteglowstone",Declarar.whiteglowstoneitem,MODID);
        regBlock("orangeglowstone",Declarar.orangeglowstone,MODID);
        regItem("orangeglowstone",Declarar.orangeglowstoneitem,MODID);
        regBlock("magentaglowstone",Declarar.magentaglowstone,MODID);
        regItem("magentaglowstone",Declarar.magentaglowstoneitem,MODID);
        regBlock("lightblueglowstone",Declarar.lightblueglowstone,MODID);
        regItem("lightblueglowstone",Declarar.lightblueglowstoneitem,MODID);
        regBlock("yellowglowstone",Declarar.yellowglowstone,MODID);
        regItem("yellowglowstone",Declarar.yellowglowstoneitem,MODID);
        regBlock("limeglowstone",Declarar.limeglowstone,MODID);
        regItem("limeglowstone",Declarar.limeglowstoneitem,MODID);
        regBlock("pinkglowstone",Declarar.pinkglowstone,MODID);
        regItem("pinkglowstone",Declarar.pinkglowstoneitem,MODID);
        regBlock("grayglowstone",Declarar.grayglowstone,MODID);
        regItem("grayglowstone",Declarar.grayglowstoneitem,MODID);
        regBlock("lightgrayglowstone",Declarar.lightgrayglowstone,MODID);
        regItem("lightgrayglowstone",Declarar.lightgrayglowstoneitem,MODID);
        regBlock("cyanglowstone",Declarar.cyanglowstone,MODID);
        regItem("cyanglowstone",Declarar.cyanglowstoneitem,MODID);
        regBlock("purpleglowstone",Declarar.purpleglowstone,MODID);
        regItem("purpleglowstone",Declarar.purpleglowstoneitem,MODID);
        regBlock("blueglowstone",Declarar.blueglowstone,MODID);
        regItem("blueglowstone",Declarar.blueglowstoneitem,MODID);
        regBlock("brownglowstone",Declarar.brownglowstone,MODID);
        regItem("brownglowstone",Declarar.brownglowstoneitem,MODID);
        regBlock("greenglowstone",Declarar.greenglowstone,MODID);
        regItem("greenglowstone",Declarar.greenglowstoneitem,MODID);
        regBlock("redglowstone",Declarar.redglowstone,MODID);
        regItem("redglowstone",Declarar.redglowstoneitem,MODID);
        regBlock("blackglowstone",Declarar.blackglowstone,MODID);
        regItem("blackglowstone",Declarar.blackglowstoneitem,MODID);
        
        regBlock("whiteredstonelamp",Declarar.whiteredstonelamp,MODID);
        regItem("whiteredstonelamp",Declarar.whiteredstonelampitem,MODID);
        regBlock("orangeredstonelamp",Declarar.orangeredstonelamp,MODID);
        regItem("orangeredstonelamp",Declarar.orangeredstonelampitem,MODID);
        regBlock("magentaredstonelamp",Declarar.magentaredstonelamp,MODID);
        regItem("magentaredstonelamp",Declarar.magentaredstonelampitem,MODID);
        regBlock("lightblueredstonelamp",Declarar.lightblueredstonelamp,MODID);
        regItem("lightblueredstonelamp",Declarar.lightblueredstonelampitem,MODID);
        regBlock("yellowredstonelamp",Declarar.yellowredstonelamp,MODID);
        regItem("yellowredstonelamp",Declarar.yellowredstonelampitem,MODID);
        regBlock("limeredstonelamp",Declarar.limeredstonelamp,MODID);
        regItem("limeredstonelamp",Declarar.limeredstonelampitem,MODID);
        regBlock("pinkredstonelamp",Declarar.pinkredstonelamp,MODID);
        regItem("pinkredstonelamp",Declarar.pinkredstonelampitem,MODID);
        regBlock("grayredstonelamp",Declarar.grayredstonelamp,MODID);
        regItem("grayredstonelamp",Declarar.grayredstonelampitem,MODID);
        regBlock("lightgrayredstonelamp",Declarar.lightgrayredstonelamp,MODID);
        regItem("lightgrayredstonelamp",Declarar.lightgrayredstonelampitem,MODID);
        regBlock("cyanredstonelamp",Declarar.cyanredstonelamp,MODID);
        regItem("cyanredstonelamp",Declarar.cyanredstonelampitem,MODID);
        regBlock("purpleredstonelamp",Declarar.purpleredstonelamp,MODID);
        regItem("purpleredstonelamp",Declarar.purpleredstonelampitem,MODID);
        regBlock("blueredstonelamp",Declarar.blueredstonelamp,MODID);
        regItem("blueredstonelamp",Declarar.blueredstonelampitem,MODID);
        regBlock("brownredstonelamp",Declarar.brownredstonelamp,MODID);
        regItem("brownredstonelamp",Declarar.brownredstonelampitem,MODID);
        regBlock("greenredstonelamp",Declarar.greenredstonelamp,MODID);
        regItem("greenredstonelamp",Declarar.greenredstonelampitem,MODID);
        regBlock("redredstonelamp",Declarar.redredstonelamp,MODID);
        regItem("redredstonelamp",Declarar.redredstonelampitem,MODID);
        regBlock("blackredstonelamp",Declarar.blackredstonelamp,MODID);
        regItem("blackredstonelamp",Declarar.blackredstonelampitem,MODID);

        regBlock("whitebricks",Declarar.whitebricks,MODID);
        regItem("whitebricks",Declarar.whitebricksitem,MODID);
        regBlock("orangebricks",Declarar.orangebricks,MODID);
        regItem("orangebricks",Declarar.orangebricksitem,MODID);
        regBlock("magentabricks",Declarar.magentabricks,MODID);
        regItem("magentabricks",Declarar.magentabricksitem,MODID);
        regBlock("lightbluebricks",Declarar.lightbluebricks,MODID);
        regItem("lightbluebricks",Declarar.lightbluebricksitem,MODID);
        regBlock("yellowbricks",Declarar.yellowbricks,MODID);
        regItem("yellowbricks",Declarar.yellowbricksitem,MODID);
        regBlock("limebricks",Declarar.limebricks,MODID);
        regItem("limebricks",Declarar.limebricksitem,MODID);
        regBlock("pinkbricks",Declarar.pinkbricks,MODID);
        regItem("pinkbricks",Declarar.pinkbricksitem,MODID);
        regBlock("graybricks",Declarar.graybricks,MODID);
        regItem("graybricks",Declarar.graybricksitem,MODID);
        regBlock("lightgraybricks",Declarar.lightgraybricks,MODID);
        regItem("lightgraybricks",Declarar.lightgraybricksitem,MODID);
        regBlock("cyanbricks",Declarar.cyanbricks,MODID);
        regItem("cyanbricks",Declarar.cyanbricksitem,MODID);
        regBlock("purplebricks",Declarar.purplebricks,MODID);
        regItem("purplebricks",Declarar.purplebricksitem,MODID);
        regBlock("bluebricks",Declarar.bluebricks,MODID);
        regItem("bluebricks",Declarar.bluebricksitem,MODID);
        regBlock("brownbricks",Declarar.brownbricks,MODID);
        regItem("brownbricks",Declarar.brownbricksitem,MODID);
        regBlock("greenbricks",Declarar.greenbricks,MODID);
        regItem("greenbricks",Declarar.greenbricksitem,MODID);
        regBlock("redbricks",Declarar.redbricks,MODID);
        regItem("redbricks",Declarar.redbricksitem,MODID);
        regBlock("blackbricks",Declarar.blackbricks,MODID);
        regItem("blackbricks",Declarar.blackbricksitem,MODID);

        regBlock("monuplecompressedcobblestone", Declarar.monuplecompressedcobblestone,MODID);
        regItem("monuplecompressedcobblestone", Declarar.monuplecompressedcobblestoneitem,MODID);
        regBlock("couplecompressedcobblestone", Declarar.couplecompressedcobblestone,MODID);
        regItem("couplecompressedcobblestone", Declarar.couplecompressedcobblestoneitem,MODID);
        regBlock("triplecompressedcobblestone", Declarar.triplecompressedcobblestone,MODID);
        regItem("triplecompressedcobblestone", Declarar.triplecompressedcobblestoneitem,MODID);
        regBlock("quadruplecompressedcobblestone", Declarar.quadruplecompressedcobblestone,MODID);
        regItem("quadruplecompressedcobblestone", Declarar.quadruplecompressedcobblestoneitem,MODID);
        regBlock("quintuplecompressedcobblestone", Declarar.quintuplecompressedcobblestone,MODID);
        regItem("quintuplecompressedcobblestone", Declarar.quintuplecompressedcobblestoneitem,MODID);
        regBlock("sextuplecompressedcobblestone", Declarar.sextuplecompressedcobblestone,MODID);
        regItem("sextuplecompressedcobblestone", Declarar.sextuplecompressedcobblestoneitem,MODID);
        regBlock("septuplecompressedcobblestone", Declarar.septuplecompressedcobblestone,MODID);
        regItem("septuplecompressedcobblestone", Declarar.septuplecompressedcobblestoneitem,MODID);
        regBlock("octuplecompressedcobblestone", Declarar.octuplecompressedcobblestone,MODID);
        regItem("octuplecompressedcobblestone", Declarar.octuplecompressedcobblestoneitem,MODID);
        regBlock("nonuplecompressedcobblestone", Declarar.nonuplecompressedcobblestone,MODID);
        regItem("nonuplecompressedcobblestone", Declarar.nonuplecompressedcobblestoneitem,MODID);
    }

}

package minecraft.skylorbeck.website.tokenabledecoration;

import minecraft.skylorbeck.website.tokenabledecoration.blocks.ChandelierBlock;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.client.option.AttackIndicator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import website.skylorbeck.minecraft.skylorlib.misc.CompressedBlock;
import website.skylorbeck.minecraft.skylorlib.misc.ExtraPaneBlock;

public class Declarar {
    public static final ItemGroup tokenableDecor = FabricItemGroupBuilder.build(
            new Identifier("tokenabledecoration", "decoration"),
            () -> new ItemStack(Declarar.chandelier));

    public static final Block marrowlessbone = new PillarBlock(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK));
    public static final Item marrowlessboneitem = new BlockItem(marrowlessbone,new FabricItemSettings().group(tokenableDecor));

    public static final Block burntquartz = new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK));
    public static final Item burntquartzitem = new BlockItem(burntquartz,new FabricItemSettings().group(tokenableDecor));

    public static final Block glowingobsidian = new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).luminance((state) -> 14));
    public static final Item glowingobsidianitem = new BlockItem(glowingobsidian,new FabricItemSettings().group(tokenableDecor));

    public static final Block mossyplank = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));
    public static final Item mossyplankitem = new BlockItem(mossyplank,new FabricItemSettings().group(tokenableDecor));

    public static final Block chandelier = new ChandelierBlock(FabricBlockSettings.copyOf(Blocks.TORCH));
    public static final Item chandelieritem = new BlockItem(chandelier,new FabricItemSettings().group(tokenableDecor));

    public static final Block bedrockium = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Item bedrockiumitem = new BlockItem(bedrockium,new FabricItemSettings().group(tokenableDecor));
    public static final Block bedrockiumbrick = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Item bedrockiumbrickitem = new BlockItem(bedrockiumbrick,new FabricItemSettings().group(tokenableDecor));
    public static final Block chiseledbedrockium = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Item chiseledbedrockiumitem = new BlockItem(chiseledbedrockium,new FabricItemSettings().group(tokenableDecor));
    public static final Item bedrockiumingotitem = new Item(new FabricItemSettings().group(tokenableDecor));

    public static final Block hardenedglass = new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque());
    public static final Item hardenedglassitem = new BlockItem(hardenedglass,new FabricItemSettings().group(tokenableDecor));
    public static final Block sandyglass = new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS));
    public static final Item sandyglassitem = new BlockItem(sandyglass,new FabricItemSettings().group(tokenableDecor));
    public static final Block glowingglass = new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).luminance((state) -> 14).nonOpaque());
    public static final Item glowingglassitem = new BlockItem(glowingglass,new FabricItemSettings().group(tokenableDecor));
    public static final Block glowingglasspane = new ExtraPaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).luminance((state) -> 14).nonOpaque());
    public static final Item glowingglasspaneitem = new BlockItem(glowingglasspane,new FabricItemSettings().group(tokenableDecor));
    public static final Block squareglass = new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque());
    public static final Item squareglassitem = new BlockItem(squareglass,new FabricItemSettings().group(tokenableDecor));
    public static final Block glassbrick = new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque());
    public static final Item glassbrickitem = new BlockItem(glassbrick,new FabricItemSettings().group(tokenableDecor));
    public static final Block obsidianglass = new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).resistance(1200F).nonOpaque());
    public static final Item obsidianglassitem = new BlockItem(obsidianglass,new FabricItemSettings().group(tokenableDecor));

    public static final Block whiteglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item whiteglowstoneitem = new BlockItem(whiteglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block orangeglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item orangeglowstoneitem = new BlockItem(orangeglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block magentaglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item magentaglowstoneitem = new BlockItem(magentaglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block lightblueglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item lightblueglowstoneitem = new BlockItem(lightblueglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block yellowglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item yellowglowstoneitem = new BlockItem(yellowglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block limeglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item limeglowstoneitem = new BlockItem(limeglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block pinkglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item pinkglowstoneitem = new BlockItem(pinkglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block grayglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item grayglowstoneitem = new BlockItem(grayglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block lightgrayglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item lightgrayglowstoneitem = new BlockItem(lightgrayglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block cyanglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item cyanglowstoneitem = new BlockItem(cyanglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block purpleglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item purpleglowstoneitem = new BlockItem(purpleglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block blueglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item blueglowstoneitem = new BlockItem(blueglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block brownglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item brownglowstoneitem = new BlockItem(brownglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block greenglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item greenglowstoneitem = new BlockItem(greenglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block redglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item redglowstoneitem = new BlockItem(redglowstone,new FabricItemSettings().group(tokenableDecor));
    public static final Block blackglowstone = new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE));
    public static final Item blackglowstoneitem = new BlockItem(blackglowstone,new FabricItemSettings().group(tokenableDecor));

    public static final Block whiteredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item whiteredstonelampitem = new BlockItem(whiteredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block orangeredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item orangeredstonelampitem = new BlockItem(orangeredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block magentaredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item magentaredstonelampitem = new BlockItem(magentaredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block lightblueredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item lightblueredstonelampitem = new BlockItem(lightblueredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block yellowredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item yellowredstonelampitem = new BlockItem(yellowredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block limeredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item limeredstonelampitem = new BlockItem(limeredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block pinkredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item pinkredstonelampitem = new BlockItem(pinkredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block grayredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item grayredstonelampitem = new BlockItem(grayredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block lightgrayredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item lightgrayredstonelampitem = new BlockItem(lightgrayredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block cyanredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item cyanredstonelampitem = new BlockItem(cyanredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block purpleredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item purpleredstonelampitem = new BlockItem(purpleredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block blueredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item blueredstonelampitem = new BlockItem(blueredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block brownredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item brownredstonelampitem = new BlockItem(brownredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block greenredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item greenredstonelampitem = new BlockItem(greenredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block redredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item redredstonelampitem = new BlockItem(redredstonelamp,new FabricItemSettings().group(tokenableDecor));
    public static final Block blackredstonelamp = new RedstoneLampBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_LAMP));
    public static final Item blackredstonelampitem = new BlockItem(blackredstonelamp,new FabricItemSettings().group(tokenableDecor));

    public static final Block whitebricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item whitebricksitem = new BlockItem(whitebricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block orangebricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item orangebricksitem = new BlockItem(orangebricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block magentabricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item magentabricksitem = new BlockItem(magentabricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block lightbluebricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item lightbluebricksitem = new BlockItem(lightbluebricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block yellowbricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item yellowbricksitem = new BlockItem(yellowbricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block limebricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item limebricksitem = new BlockItem(limebricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block pinkbricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item pinkbricksitem = new BlockItem(pinkbricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block graybricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item graybricksitem = new BlockItem(graybricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block lightgraybricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item lightgraybricksitem = new BlockItem(lightgraybricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block cyanbricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item cyanbricksitem = new BlockItem(cyanbricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block purplebricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item purplebricksitem = new BlockItem(purplebricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block bluebricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item bluebricksitem = new BlockItem(bluebricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block brownbricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item brownbricksitem = new BlockItem(brownbricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block greenbricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item greenbricksitem = new BlockItem(greenbricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block redbricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item redbricksitem = new BlockItem(redbricks,new FabricItemSettings().group(tokenableDecor));
    public static final Block blackbricks = new Block(FabricBlockSettings.copyOf(Blocks.BRICKS));
    public static final Item blackbricksitem = new BlockItem(blackbricks,new FabricItemSettings().group(tokenableDecor));

    public static final Block monuplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 1);
    public static final BlockItem monuplecompressedcobblestoneitem = new BlockItem(monuplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
    public static final Block couplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 2);
    public static final BlockItem couplecompressedcobblestoneitem = new BlockItem(couplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
    public static final Block triplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 3);
    public static final BlockItem triplecompressedcobblestoneitem = new BlockItem(triplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
    public static final Block quadruplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 4);
    public static final BlockItem quadruplecompressedcobblestoneitem = new BlockItem(quadruplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
    public static final Block quintuplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 5);
    public static final BlockItem quintuplecompressedcobblestoneitem = new BlockItem(quintuplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
    public static final Block sextuplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 6);
    public static final BlockItem sextuplecompressedcobblestoneitem = new BlockItem(sextuplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
    public static final Block septuplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 7);
    public static final BlockItem septuplecompressedcobblestoneitem = new BlockItem(septuplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
    public static final Block octuplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 8);
    public static final BlockItem octuplecompressedcobblestoneitem = new BlockItem(octuplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
    public static final Block nonuplecompressedcobblestone = new CompressedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).breakByTool(FabricToolTags.PICKAXES), 9);
    public static final BlockItem nonuplecompressedcobblestoneitem = new BlockItem(nonuplecompressedcobblestone, new FabricItemSettings().group(tokenableDecor));
}

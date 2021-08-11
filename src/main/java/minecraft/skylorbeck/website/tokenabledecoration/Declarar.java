package minecraft.skylorbeck.website.tokenabledecoration;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Declarar {
    public static final Block marrowlessbone = new Block(FabricBlockSettings.copyOf(Blocks.BONE_BLOCK));
    public static final Item marrowlessboneitem = new BlockItem(marrowlessbone,new FabricItemSettings().group(ItemGroup.MISC));

}

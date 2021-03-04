package net.stone_labs.copperalloys.registry;

import net.stone_labs.copperalloys.CopperAlloys;
import net.stone_labs.copperalloys.materials.CoFeniumToolMaterial;
import net.stone_labs.copperalloys.tools.ModAxe;
import net.stone_labs.copperalloys.tools.ModPickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static Item COFENIUM_BLEND;
    public static Item COFENIUM_ALLOY;
    public static Item COFENIUM_PICKAXE;
    public static Item COFENIUM_AXE;

    public static Item register(String path, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(CopperAlloys.MOD_ID, path), item);
    }

    public static void registerItems()
    {
        COFENIUM_BLEND = register("cofenium_blend", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        COFENIUM_ALLOY = register("cofenium_alloy", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        COFENIUM_PICKAXE = register("cofenium_pickaxe", new ModPickaxe(new CoFeniumToolMaterial()));
        COFENIUM_AXE = register("cofenium_axe", new ModAxe(new CoFeniumToolMaterial(), 6, -3.1f));
    }
}

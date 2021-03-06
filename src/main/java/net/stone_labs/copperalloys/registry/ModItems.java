package net.stone_labs.copperalloys.registry;

import net.stone_labs.copperalloys.CopperAlloys;
import net.stone_labs.copperalloys.materials.*;
import net.stone_labs.copperalloys.tools.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static Item COFENIUM_BLEND;
    public static Item COFENIUM_ALLOY;
    public static Item COFENIUM_SWORD;
    public static Item COFENIUM_SHOVEL;
    public static Item COFENIUM_PICKAXE;
    public static Item COFENIUM_AXE;
    public static Item COFENIUM_HOE;

    public static Item COAUNIUM_BLEND;
    public static Item COAUNIUM_ALLOY;
    public static Item COAUNIUM_SWORD;
    public static Item COAUNIUM_SHOVEL;
    public static Item COAUNIUM_PICKAXE;
    public static Item COAUNIUM_AXE;
    public static Item COAUNIUM_HOE;

    public static Item CONETNIUM_BLEND;
    public static Item CONETNIUM_ALLOY;
    public static Item CONETNIUM_SWORD;
    public static Item CONETNIUM_SHOVEL;
    public static Item CONETNIUM_PICKAXE;
    public static Item CONETNIUM_AXE;
    public static Item CONETNIUM_HOE;

    public static Item register(String path, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(CopperAlloys.MOD_ID, path), item);
    }

    public static void registerItems()
    {
        COFENIUM_BLEND = register("cofenium_blend", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        COFENIUM_ALLOY = register("cofenium_alloy", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        COFENIUM_SWORD = register("cofenium_sword", new ModSword(new CoFeniumToolMaterial()));
        COFENIUM_SHOVEL = register("cofenium_shovel", new ModShovel(new CoFeniumToolMaterial()));
        COFENIUM_PICKAXE = register("cofenium_pickaxe", new ModPickaxe(new CoFeniumToolMaterial()));
        COFENIUM_AXE = register("cofenium_axe", new ModAxe(new CoFeniumToolMaterial(), 6, -3.1f));
        COFENIUM_HOE = register("cofenium_hoe", new ModHoe(new CoFeniumToolMaterial(), -2, -1));

        COAUNIUM_BLEND = register("coaunium_blend", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        COAUNIUM_ALLOY = register("coaunium_alloy", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        COAUNIUM_SWORD = register("coaunium_sword", new ModSword(new CoAuniumToolMaterial()));
        COAUNIUM_SHOVEL = register("coaunium_shovel", new ModShovel(new CoAuniumToolMaterial()));
        COAUNIUM_PICKAXE = register("coaunium_pickaxe", new ModPickaxe(new CoAuniumToolMaterial()));
        COAUNIUM_AXE = register("coaunium_axe", new ModAxe(new CoAuniumToolMaterial(), 6, -3.1f));
        COAUNIUM_HOE = register("coaunium_hoe", new ModHoe(new CoAuniumToolMaterial(), -2, -1));

        CONETNIUM_BLEND = register("conetnium_blend", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        CONETNIUM_ALLOY = register("conetnium_alloy", new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        CONETNIUM_SWORD = register("conetnium_sword", new ModSword(new CoNetniumToolMaterial()));
        CONETNIUM_SHOVEL = register("conetnium_shovel", new ModShovel(new CoNetniumToolMaterial()));
        CONETNIUM_PICKAXE = register("conetnium_pickaxe", new ModPickaxe(new CoNetniumToolMaterial()));
        CONETNIUM_AXE = register("conetnium_axe", new ModAxe(new CoNetniumToolMaterial(), 5, -2.9f));
        CONETNIUM_HOE = register("conetnium_hoe", new ModHoe(new CoNetniumToolMaterial(), -6, 0));
    }
}

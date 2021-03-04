package com.lct.copperalloys.registry;

import com.lct.copperalloys.CopperAlloys;
import com.lct.copperalloys.materials.CoFeniumToolMaterial;
import com.lct.copperalloys.tools.ModAxe;
import com.lct.copperalloys.tools.ModPickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COFENIUM_BLEND = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item COFENIUM_ALLOY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item COFENIUM_PICKAXE = new ModPickaxe(new CoFeniumToolMaterial());
    public static final Item COFENIUM_AXE = new ModAxe(new CoFeniumToolMaterial(), 6, -3.1f);

    public static void registerItem(Item item, String path){
        Registry.register(Registry.ITEM, new Identifier(CopperAlloys.MOD_ID, path), item);
    }

    public static void registerItems () {
        registerItem(COFENIUM_BLEND, "cofenium_blend");
        registerItem(COFENIUM_ALLOY, "cofenium_alloy");
        registerItem(COFENIUM_PICKAXE, "cofenium_pickaxe");
        registerItem(COFENIUM_AXE, "cofenium_axe");
    }
}

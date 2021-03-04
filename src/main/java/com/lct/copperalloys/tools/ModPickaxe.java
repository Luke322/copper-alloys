package com.lct.copperalloys.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxe extends PickaxeItem
{
    public ModPickaxe(ToolMaterial material)
    {
        super(material, 1, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}

package net.stone_labs.copperalloys.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ModShovel extends ShovelItem
{
    public ModShovel(ToolMaterial material)
    {
        super(material, 1.5f, -3, new Item.Settings().group(ItemGroup.TOOLS));
    }
}

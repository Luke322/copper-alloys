package net.stone_labs.copperalloys.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModSword extends SwordItem
{
    public ModSword(ToolMaterial toolMaterial)
    {
        super(toolMaterial, 3, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}

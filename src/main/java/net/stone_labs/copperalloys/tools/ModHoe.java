package net.stone_labs.copperalloys.tools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ModHoe extends HoeItem
{
    public ModHoe(ToolMaterial material, int attackDamage, float attackSpeed)
    {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.TOOLS));
    }
}

package com.lct.copperalloys.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ModAxe extends AxeItem
{
    public ModAxe(ToolMaterial material, int attackDamage, float attackSpeed)
    {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroup.TOOLS));
    }
}

package net.stone_labs.copperalloys.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.stone_labs.copperalloys.registry.ModItems;

public class CoNetniumToolMaterial implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 19;
    }

    @Override
    public float getAttackDamage()
    {
        return 6;
    }

    @Override
    public int getMiningLevel()
    {
        return 4;
    }

    @Override
    public int getEnchantability()
    {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModItems.CONETNIUM_ALLOY);
    }
}

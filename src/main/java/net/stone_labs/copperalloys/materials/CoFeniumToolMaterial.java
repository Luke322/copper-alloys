package net.stone_labs.copperalloys.materials;

import net.stone_labs.copperalloys.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CoFeniumToolMaterial implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 7;
    }

    @Override
    public float getAttackDamage()
    {
        return 2;
    }

    @Override
    public int getMiningLevel()
    {
        return 2;
    }

    @Override
    public int getEnchantability()
    {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModItems.COFENIUM_ALLOY);
    }
}

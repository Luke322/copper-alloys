package net.stone_labs.copperalloys.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.stone_labs.copperalloys.registry.ModItems;

public class CoAuniumToolMaterial implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 10;
    }

    @Override
    public float getAttackDamage()
    {
        return 2.5f;
    }

    @Override
    public int getMiningLevel()
    {
        return 2;
    }

    @Override
    public int getEnchantability()
    {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModItems.COAUNIUM_ALLOY);
    }
}

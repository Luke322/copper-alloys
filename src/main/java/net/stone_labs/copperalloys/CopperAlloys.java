package net.stone_labs.copperalloys;

import net.fabricmc.api.ModInitializer;
import net.stone_labs.copperalloys.registry.ModItems;

public class CopperAlloys implements ModInitializer
{
    public static final String MOD_ID = "copperalloys";

    @Override
    public void onInitialize()
    {
        ModItems.registerItems();
    }
}

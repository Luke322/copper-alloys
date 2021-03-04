package com.lct.copperalloys;

import com.lct.copperalloys.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class CopperAlloys implements ModInitializer {

    public static final String MOD_ID = "lct-ca";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}

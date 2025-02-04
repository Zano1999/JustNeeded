package com.imjustdoom.justneeded.item.food;

import com.imjustdoom.justneeded.JustNeeded;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CookedEgg extends Item {

    public CookedEgg() {
        super(new Item.Properties()
                .arch$tab(JustNeeded.JUSTNEEDED_TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationMod(5)
                        .build())
        );
    }
}
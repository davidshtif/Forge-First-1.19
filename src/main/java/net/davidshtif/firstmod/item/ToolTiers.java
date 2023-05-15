package net.davidshtif.firstmod.item;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolTiers {
    public static final Tier SILVER = new ForgeTier(
            2,
            300,
            5f,
            3,
            350,
            null, () -> Ingredient.EMPTY
    );
}

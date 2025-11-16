package net.phoenixcrew2025.FreeStyleV2.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.phoenixcrew2025.FreeStyleV2.util.ModTags;

public class ModToolTiers {
    public static final Tier EMERALD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            1600, 4f, 4f, 28, () -> Ingredient.of(Items.EMERALD));


}

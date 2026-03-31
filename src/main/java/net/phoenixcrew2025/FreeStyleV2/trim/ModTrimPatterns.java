package net.phoenixcrew2025.FreeStyleV2.trim;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.minecraft.core.HolderGetter;
import net.phoenixcrew2025.FreeStyleV2.FreeStyleV2;
import net.phoenixcrew2025.FreeStyleV2.item.ModItems;

public class ModTrimPatterns {
    public static final ResourceKey<TrimPattern> KAUPEN = ResourceKey.create(Registries.TRIM_PATTERN,
            ResourceLocation.fromNamespaceAndPath(FreeStyleV2.MOD_ID, "kaupen"));

    public static void bootstrap(BootstrapContext<TrimPattern> context) {
        register(context, KAUPEN, ModItems.KAUPEN_SMITHING_TEMPLATE.getId());
    }

    private static void register(BootstrapContext<TrimPattern> context, ResourceKey<TrimPattern> key, ResourceLocation templateItemId) {
        HolderGetter<Item> items = context.lookup(Registries.ITEM);
        TrimPattern trimPattern = new TrimPattern(
                key.location(),
                items.getOrThrow(ResourceKey.create(Registries.ITEM, templateItemId)),
                Component.translatable(Util.makeDescriptionId("trim_pattern", key.location())),
                false
        );
        context.register(key, trimPattern);
    }
}

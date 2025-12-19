package net.phoenixcrew2025.FreeStyleV2.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.FreeStyleV2.FreeStyleV2;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FreeStyleV2.MOD_ID);


    public static final Supplier<CreativeModeTab> FREESTYLEV2_DISC_TAB = CREATIVE_MODE_TAB.register("freestylev2_disc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COBBLEMON_BATTLE_MUSIC_DISC.get()))
                    .title(Component.translatable("creativetab.freestylev2.freestylev2_disc"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COBBLEMON_BATTLE_MUSIC_DISC);
                        output.accept(ModItems.PINK_FLUFFY_UNICORN_DISC);
                        output.accept(ModItems.ACDC_BIG_BALLS_DISC);
                        output.accept(ModItems.ACDC_BACK_IN_BLACK_DISC);
                        output.accept(ModItems.ACDC_HELLS_BELLS_DISC);
                        output.accept(ModItems.ACDC_HIGHWAY_TO_HELL_DISC);
                        output.accept(ModItems.DEMONS_SONG_DISC);
                        output.accept(ModItems.OCEAN_DRIVE_DISC);
                        output.accept(ModItems.SICKNESS_DISC);
                        output.accept(ModItems.ALLSTARS_DISC);
                        output.accept(ModItems.GODS_THEME_DISC);
                        output.accept(ModItems.SLEEP_TOKEN_DISC);
                        output.accept(ModItems.UNIVERSAL_COLLAPSE_DISC);
                        output.accept(ModItems.LAVA_CHICKEN_MUSIC_DISC);
                        output.accept(ModItems.TEARS_MUSIC_DISC);
                        output.accept(ModItems.BLACK_CATCHER_DISC);
                        output.accept(ModItems.EVERYTHING_I_GOT_DISC);
                        output.accept(ModItems.DONT_FORGET_DELTARUNE_DISC);
                        output.accept(ModItems.YOU_SPIN_ME_RIGHT_ROUND_DISC);
                        output.accept(ModItems.CHICKEN_FRIED_DISC);
                        output.accept(ModItems.DAYDREAMIN_DISC);
                        output.accept(ModItems.I_LOVE_THIS_BAR_DISC);
                        output.accept(ModItems.ITS_FIVE_O_CLOCK_SOMEWHERE_DISC);
                        output.accept(ModItems.MARGARITAVILLE_DISC);
                        output.accept(ModItems.OLD_CROW_MEDICINE_SHOW_DISC);
                    }).build());

    public static final Supplier<CreativeModeTab> FREESTYLEV2_MONEY_TAB = CREATIVE_MODE_TAB.register("freestylev2_money_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ONE_HUNDRED_DOLLAR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleV2.MOD_ID, "freestylev2_disc_tab"))
                    .title(Component.translatable("creativetab.freestylev2.freestylev2_money"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ONE_DOLLAR);
                        output.accept(ModItems.FIVE_DOLLAR);
                        output.accept(ModItems.TEN_DOLLAR);
                        output.accept(ModItems.FIFTY_DOLLAR);
                        output.accept(ModItems.ONE_HUNDRED_DOLLAR);
                        output.accept(ModItems.ONE_THOUSAND_DOLLAR);
                        output.accept(ModItems.TEN_THOUSAND_DOLLARS);
                        output.accept(ModItems.ONE_HUNDRED_THOUSAND_DOLLARS);
                        output.accept(ModItems.ONE_MILLION_DOLLARS);
                    }).build());




    public static final Supplier<CreativeModeTab> FREESTYLEV2_KEYS_TAB = CREATIVE_MODE_TAB.register("freestylev2_key_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_KEY.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleV2.MOD_ID, "freestylev2_money_tab"))
                    .title(Component.translatable("creativetab.freestylev2.freestylev2_key"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RED_KEY);
                        output.accept(ModItems.BLUE_KEY);
                        output.accept(ModItems.GREEN_KEY);
                        output.accept(ModItems.ORANGE_KEY);
                        output.accept(ModItems.YELLOW_KEY);
                        output.accept(ModItems.PURPLE_KEY);
                    }).build());


    public static final Supplier<CreativeModeTab> FREESTYLEV2_TOOLS_AND_ARMOR_TAB = CREATIVE_MODE_TAB.register("freestylev2_tools_and_armor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EMERALD_CHESTPLATE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleV2.MOD_ID, "freestylev2_key_tab"))
                    .title(Component.translatable("creativetab.freestylev2.freestylev2_tools_and_armor"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.EMERALD_SWORD);
                        output.accept(ModItems.EMERALD_PICKAXE);
                        output.accept(ModItems.EMERALD_AXE);
                        output.accept(ModItems.EMERALD_SHOVEL);
                        output.accept(ModItems.EMERALD_HOE);

                        output.accept(ModItems.EMERALD_HELMET);
                        output.accept(ModItems.EMERALD_CHESTPLATE);
                        output.accept(ModItems.EMERALD_LEGGINGS);
                        output.accept(ModItems.EMERALD_BOOTS);
                    }).build());



    public static final Supplier<CreativeModeTab> FREESTYLEV2_ITEMS_TAB = CREATIVE_MODE_TAB.register("freestylev2_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EMERALD_TEMPLATE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleV2.MOD_ID, "freestylev2_tools_and_armor_tab"))
                    .title(Component.translatable("creativetab.freestylev2.freestylev2_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.EMERALD_TEMPLATE);
                        output.accept(ModItems.JUST_A_BOOK_DISC);
                    }).build());

    public static final Supplier<CreativeModeTab> FREESTYLEV2_GYM_BADGE_TAB = CREATIVE_MODE_TAB.register("freestylev2_gym_badge_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOD_KILLER_BADGE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FreeStyleV2.MOD_ID, "freestylev2_items_tab"))
                    .title(Component.translatable("creativetab.freestylev2.freestylev2_gym_badge"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KAMIKOS_GYM_BADGE);
                        output.accept(ModItems.GOD_KILLER_BADGE);
                        output.accept(ModItems.NIGHTMARE_GYM_BADGE);
                        output.accept(ModItems.KING_M_GYM_BADGE);
                        output.accept(ModItems.WULIKESTEA_GYM_BADGE);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}


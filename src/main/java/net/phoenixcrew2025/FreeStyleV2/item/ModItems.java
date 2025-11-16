package net.phoenixcrew2025.FreeStyleV2.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.FreeStyleV2.FreeStyleV2;
import net.phoenixcrew2025.FreeStyleV2.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FreeStyleV2.MOD_ID);


    public static final DeferredItem<Item> ONE_DOLLAR = ITEMS.register("one_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIVE_DOLLAR = ITEMS.register("five_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TEN_DOLLAR = ITEMS.register("ten_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIFTY_DOLLAR = ITEMS.register("fifty_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONE_HUNDRED_DOLLAR = ITEMS.register("one_hundred_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONE_THOUSAND_DOLLAR = ITEMS.register("one_thousand_dollar",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TEN_THOUSAND_DOLLARS = ITEMS.register("ten_thousand_dollars",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONE_HUNDRED_THOUSAND_DOLLARS = ITEMS.register("one_hundred_thousand_dollars",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONE_MILLION_DOLLARS = ITEMS.register("one_million_dollars",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> COBBLEMON_BATTLE_MUSIC_DISC = ITEMS.register("cobblemon_battle_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.COBBLEMON_BATTLE_SONG_KEY).stacksTo(1)));
    public static final DeferredItem<Item> PINK_FLUFFY_UNICORN_DISC = ITEMS.register("pink_fluffy_unicorn_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.PINK_FLUFFY_UNICORN_SONG_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ACDC_BACK_IN_BLACK_DISC = ITEMS.register("acdc_back_in_black_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ACDC_BACK_IN_BLACK_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ACDC_BIG_BALLS_DISC = ITEMS.register("acdc_big_balls_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ACDC_BIG_BALLS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ACDC_HELLS_BELLS_DISC = ITEMS.register("acdc_hells_bells_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ACDC_HELLS_BELLS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ACDC_HIGHWAY_TO_HELL_DISC = ITEMS.register("acdc_highway_to_hell_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ACDC_HIGHWAY_TO_HELL_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DEMONS_SONG_DISC = ITEMS.register("demons_song_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DEMONS_SONG_KEY).stacksTo(1)));
    public static final DeferredItem<Item> OCEAN_DRIVE_DISC = ITEMS.register("ocean_drive_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.OCEAN_DRIVE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> SICKNESS_DISC = ITEMS.register("sickness_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SICKNESS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> ALLSTARS_DISC = ITEMS.register("allstars_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.ALLSTARS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> JUST_A_BOOK_DISC = ITEMS.register("just_a_book_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.JUST_A_BOOK_KEY).stacksTo(1)));
    public static final DeferredItem<Item> GODS_THEME_DISC = ITEMS.register("gods_theme_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.GODS_THEME_KEY).stacksTo(1)));
    public static final DeferredItem<Item> SLEEP_TOKEN_DISC = ITEMS.register("sleep_token_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SLEEP_TOKEN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> UNIVERSAL_COLLAPSE_DISC = ITEMS.register("universal_collapse_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.UNIVERSAL_COLLAPSE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> TEARS_MUSIC_DISC = ITEMS.register("tears_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.TEARS_KEY).stacksTo(1)));
    public static final DeferredItem<Item> LAVA_CHICKEN_MUSIC_DISC = ITEMS.register("lava_chicken_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.LAVA_CHICKEN_KEY).stacksTo(1)));
    public static final DeferredItem<Item> BLACK_CATCHER_DISC = ITEMS.register("black_catcher_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.BLACK_CATCHER_KEY).stacksTo(1)));
    public static final DeferredItem<Item> EVERYTHING_I_GOT_DISC = ITEMS.register("everything_i_got_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.EVERYTHING_I_GOT_KEY).stacksTo(1)));
    public static final DeferredItem<Item> DONT_FORGET_DELTARUNE_DISC = ITEMS.register("dont_forget_deltarune_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.DONT_FORGET_DELTARUNE_KEY).stacksTo(1)));
    public static final DeferredItem<Item> YOU_SPIN_ME_RIGHT_ROUND_DISC = ITEMS.register("you_spin_me_right_round_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.YOU_SPIN_ME_RIGHT_ROUND_KEY).stacksTo(1)));



    public static final DeferredItem<Item> BLUE_KEY = ITEMS.register("blue_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_KEY = ITEMS.register("green_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_KEY = ITEMS.register("orange_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RED_KEY = ITEMS.register("red_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_KEY = ITEMS.register("purple_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_KEY = ITEMS.register("yellow_key",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

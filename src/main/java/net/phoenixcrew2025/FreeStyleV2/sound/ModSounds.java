package net.phoenixcrew2025.FreeStyleV2.sound;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.phoenixcrew2025.FreeStyleV2.FreeStyleV2;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, FreeStyleV2.MOD_ID);

    public static final Supplier<SoundEvent> COBBLEMON_BATTLE_SONG = registerSoundEvent("cobblemon_battle_song");
    public static final ResourceKey<JukeboxSong> COBBLEMON_BATTLE_SONG_KEY = createSong("cobblemon_battle_song");

    public static final Supplier<SoundEvent> PINK_FLUFFY_UNICORN_SONG = registerSoundEvent("pink_fluffy_unicorn_song");
    public static final ResourceKey<JukeboxSong> PINK_FLUFFY_UNICORN_SONG_KEY = createSong("pink_fluffy_unicorn_song");

    public static final Supplier<SoundEvent> ACDC_BACK_IN_BLACK = registerSoundEvent("acdc_back_in_black");
    public static final ResourceKey<JukeboxSong> ACDC_BACK_IN_BLACK_KEY = createSong("acdc_back_in_black");

    public static final Supplier<SoundEvent> ACDC_BIG_BALLS = registerSoundEvent("acdc_big_balls");
    public static final ResourceKey<JukeboxSong> ACDC_BIG_BALLS_KEY = createSong("acdc_big_balls");

    public static final Supplier<SoundEvent> ACDC_HELLS_BELLS = registerSoundEvent("acdc_hells_bells");
    public static final ResourceKey<JukeboxSong> ACDC_HELLS_BELLS_KEY = createSong("acdc_hells_bells");

    public static final Supplier<SoundEvent> ACDC_HIGHWAY_TO_HELL = registerSoundEvent("acdc_highway_to_hell");
    public static final ResourceKey<JukeboxSong> ACDC_HIGHWAY_TO_HELL_KEY = createSong("acdc_highway_to_hell");

    public static final Supplier<SoundEvent> DEMONS_SONG = registerSoundEvent("demons_song");
    public static final ResourceKey<JukeboxSong> DEMONS_SONG_KEY = createSong("demons_song");

    public static final Supplier<SoundEvent> OCEAN_DRIVE = registerSoundEvent("ocean_drive");
    public static final ResourceKey<JukeboxSong> OCEAN_DRIVE_KEY = createSong("ocean_drive");

    public static final Supplier<SoundEvent> SICKNESS = registerSoundEvent("sickness");
    public static final ResourceKey<JukeboxSong> SICKNESS_KEY = createSong("sickness");

    public static final Supplier<SoundEvent> ALLSTARS = registerSoundEvent("allstars");
    public static final ResourceKey<JukeboxSong> ALLSTARS_KEY = createSong("allstars");

    public static final Supplier<SoundEvent> JUST_A_BOOK = registerSoundEvent("just_a_book");
    public static final ResourceKey<JukeboxSong> JUST_A_BOOK_KEY = createSong("just_a_book");

    public static final Supplier<SoundEvent> GODS_THEME = registerSoundEvent("gods_theme");
    public static final ResourceKey<JukeboxSong> GODS_THEME_KEY = createSong("gods_theme");

    public static final Supplier<SoundEvent> SLEEP_TOKEN = registerSoundEvent("sleep_token");
    public static final ResourceKey<JukeboxSong> SLEEP_TOKEN_KEY = createSong("sleep_token");

    public static final Supplier<SoundEvent> UNIVERSAL_COLLAPSE = registerSoundEvent("universal_collapse");
    public static final ResourceKey<JukeboxSong> UNIVERSAL_COLLAPSE_KEY = createSong("universal_collapse");

    public static final Supplier<SoundEvent> LAVA_CHICKEN = registerSoundEvent("lava_chicken");
    public static final ResourceKey<JukeboxSong> LAVA_CHICKEN_KEY = createSong("lava_chicken");

    public static final Supplier<SoundEvent> TEARS = registerSoundEvent("tears");
    public static final ResourceKey<JukeboxSong> TEARS_KEY = createSong("tears");

    public static final Supplier<SoundEvent> BLACK_CATCHER = registerSoundEvent("black_catcher");
    public static final ResourceKey<JukeboxSong> BLACK_CATCHER_KEY = createSong("black_catcher");

    public static final Supplier<SoundEvent> EVERYTHING_I_GOT = registerSoundEvent("everything_i_got");
    public static final ResourceKey<JukeboxSong> EVERYTHING_I_GOT_KEY = createSong("everything_i_got");

    public static final Supplier<SoundEvent> DONT_FORGET_DELTARUNE = registerSoundEvent("dont_forget_deltarune");
    public static final ResourceKey<JukeboxSong> DONT_FORGET_DELTARUNE_KEY = createSong("dont_forget_deltarune");

    public static final Supplier<SoundEvent> YOU_SPIN_ME_RIGHT_ROUND = registerSoundEvent("you_spin_me_right_round");
    public static final ResourceKey<JukeboxSong> YOU_SPIN_ME_RIGHT_ROUND_KEY = createSong("you_spin_me_right_round");




    public static final Supplier<SoundEvent> CHICKEN_FRIED = registerSoundEvent("chicken_fried");
    public static final ResourceKey<JukeboxSong> CHICKEN_FRIED_KEY = createSong("chicken_fried");

    public static final Supplier<SoundEvent> DAYDREAMIN = registerSoundEvent("daydreamin");
    public static final ResourceKey<JukeboxSong> DAYDREAMIN_KEY = createSong("daydreamin");

    public static final Supplier<SoundEvent> I_LOVE_THIS_BAR = registerSoundEvent("i_love_this_bar");
    public static final ResourceKey<JukeboxSong> I_LOVE_THIS_BAR_KEY = createSong("i_love_this_bar");

    public static final Supplier<SoundEvent> ITS_FIVE_O_CLOCK_SOMEWHERE = registerSoundEvent("its_five_o_clock_somewhere");
    public static final ResourceKey<JukeboxSong> ITS_FIVE_O_CLOCK_SOMEWHERE_KEY = createSong("its_five_o_clock_somewhere");

    public static final Supplier<SoundEvent> MARGARITAVILLE = registerSoundEvent("margaritaville");
    public static final ResourceKey<JukeboxSong> MARGARITAVILLE_KEY = createSong("margaritaville");

    public static final Supplier<SoundEvent> OLD_CROW_MEDICINE_SHOW = registerSoundEvent("old_crow_medicine_show");
    public static final ResourceKey<JukeboxSong> OLD_CROW_MEDICINE_SHOW_KEY = createSong("old_crow_medicine_show");



    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(FreeStyleV2.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(FreeStyleV2.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}

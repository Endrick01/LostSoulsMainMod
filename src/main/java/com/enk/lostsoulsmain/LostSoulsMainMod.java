package com.enk.lostsoulsmain;

import com.enk.lostsoulsmain.effect.NewEffect;
import com.enk.lostsoulsmain.item.ModItem;
import net.fabricmc.api.ModInitializer;

import static com.mojang.text2speech.Narrator.LOGGER;

public class LostSoulsMainMod implements ModInitializer {
    public static final String MOD_ID = "lostsoulsmain";

    @Override
    public void onInitialize() {
        NewEffect.register();
        ModItem.register();

        LOGGER.info("Сюжет успешно загружен!");
    }
}

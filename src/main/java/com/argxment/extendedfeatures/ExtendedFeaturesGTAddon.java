package com.argxment.extendedfeatures;

import com.argxment.extendedfeatures.init.recipes.ItemRecipes;
import com.argxment.extendedfeatures.client.greenhouse.GreenhouseRecipes;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

import com.tterrag.registrate.providers.ProviderType;

import com.argxment.extendedfeatures.client.LangHandler;
import com.argxment.extendedfeatures.init.recipes.MultiblocksRecipes;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@SuppressWarnings("unused")
@GTAddon
public class ExtendedFeaturesGTAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return ExtendedFeaturesCore.ExtraFeaturesRegister;
    }

    @Override
    public void initializeAddon() {
        ExtendedFeaturesCore.ExtraFeaturesRegister.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }

    @Override
    public String addonModId() {
        return ExtendedFeaturesCore.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {
        // CustomTagPrefixes.init();
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        MultiblocksRecipes.init(provider);
        ItemRecipes.init(provider);
        GreenhouseRecipes.init(provider);
    }

    @Override
    public void registerElements() {
        // CustomElements.init();
    }
}

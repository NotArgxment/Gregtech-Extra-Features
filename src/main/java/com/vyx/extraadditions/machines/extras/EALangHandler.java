package com.vyx.extraadditions.machines.extras;

import com.tterrag.registrate.providers.RegistrateLangProvider;

import static com.gregtechceu.gtceu.data.lang.LangHandler.replace;

public class EALangHandler {

    public static void init(RegistrateLangProvider provider) {
        initControllerNames(provider);
        initControllerTooltips(provider);
    }

    private static void initControllerNames(RegistrateLangProvider provider) {
        replace(provider, "block.extraadditions.robust_alloy_materializer", "Robust Alloy Materializer [RAM]");
        replace(provider, "block.extraadditions.advanced_cracking_unit", "Advanced Cracking Unit [ACU]");
        replace(provider, "block.extraadditions.enlarged_reaction_chamber", "Enlarged Reaction Chamber [ERC]");
        replace(provider, "block.extraadditions.large_pyrolysis_unit", "Large Pyrolysis Unit [LPU]");
        replace(provider, "block.extraadditions.compact_assembly_line", "Compact Assembly Line [CAL]");
    }

    private static void initControllerTooltips(RegistrateLangProvider provider) {
        provider.add("extraadditions.machine.compact_assembly_line.tooltip.0", "§7Can perform 4 recipes in parallel without increasing the EU");
    }
}
package com.vyx.extraadditions.machines.extras;

import com.gregtechceu.gtceu.client.util.TooltipHelper;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.function.BiConsumer;

import static com.gregtechceu.gtceu.data.lang.LangHandler.replace;

public class EALangHandler {

    public static void init(RegistrateLangProvider provider) {
        initControllerNames(provider);
        initControllerTooltips(provider);
    }
    // color code references
    /*
        §0	black
        §1	dark_blue
        §2	dark_green
        §3	dark_aqua
        §4	dark_red
        §5	dark_purple
        §6	gold
        §7	gray
        §8	dark_gray
        §9	blue
        §a	green
        §b	aqua
        §c	red
        §d	light_purple
        §e	yellow
        §f	white
        §g	minecoin_gold
        §h	material_quartz
        §i	material_iron
        §j	material_netherite
        §m	material_redstone
        §n	material_copper
        §p	material_gold
        §q	material_emerald
        §s	material_diamond
        §t	material_lapis
        §u	material_amethyst
        §v	material_resin
        §k	obfuscated
        §l	bold
        §m	strikethrough
        §n	underline
        §o	italic
        §r	reset
        §r§f  reset + add any color
       */

    private static void initControllerNames(RegistrateLangProvider provider) {
        replace(provider, "block.extraadditions.robust_alloy_materializer", "Robust Alloy Materializer [RAM]");
        replace(provider, "block.extraadditions.advanced_cracking_unit", "Advanced Cracking Unit [ACU]");
        replace(provider, "block.extraadditions.enlarged_reaction_chamber", "Enlarged Reaction Chamber [ERC]");
        replace(provider, "block.extraadditions.large_pyrolysis_unit", "Large Pyrolysis Unit [LPU]");
        replace(provider, "block.extraadditions.compact_assembly_line", "Compact Assembly Line [CAL]");
        // note: fusion reactor lang entries aren't required here at all, only tooltips
    }

    private static void initControllerTooltips(RegistrateLangProvider provider) {
        provider.add("extraadditions.machine.compact_assembly_line.tooltip.0", "§7This machine is able to perform the work of a regular Assembly Line without §6Ordered Inputs");
        provider.add("extraadditions.machine.compact_assembly_line.tooltip.1", "§fOnly allows §bone energy hatch");
        provider.add("extraadditions.machine.robust_alloy_materializer.tooltip.0", "§7Allows");
        provider.add("extraadditions.machine.robust_alloy_materializer.tooltip.1", " Laser Hatches ");
        provider.add("extraadditions.machine.robust_alloy_materializer.tooltip.2", "§7and");
        provider.add("extraadditions.machine.robust_alloy_materializer.tooltip.3", " Parallel Hatches");
    }
}
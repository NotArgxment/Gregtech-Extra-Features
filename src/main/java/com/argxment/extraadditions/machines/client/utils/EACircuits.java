package com.argxment.extraadditions.machines.client.utils;

import com.argxment.extraadditions.ExtraAdditionsCore;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EACircuits {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtraAdditionsCore.MOD_ID);

    public static final RegistryObject<Item> ULV_UNIVERSAL_CIRCUIT = ITEMS.register("ulv_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LV_UNIVERSAL_CIRCUIT = ITEMS.register("lv_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MV_UNIVERSAL_CIRCUIT = ITEMS.register("mv_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HV_UNIVERSAL_CIRCUIT = ITEMS.register("hv_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EV_UNIVERSAL_CIRCUIT = ITEMS.register("ev_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IV_UNIVERSAL_CIRCUIT = ITEMS.register("iv_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LUV_UNIVERSAL_CIRCUIT = ITEMS.register("luv_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ZPM_UNIVERSAL_CIRCUIT = ITEMS.register("zpm_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UV_UNIVERSAL_CIRCUIT = ITEMS.register("uv_universal_circuit",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
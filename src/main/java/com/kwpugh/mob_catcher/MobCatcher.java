package com.kwpugh.mob_catcher;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MobCatcher implements ModInitializer
{
    public static final String MOD_ID = "mob_catcher";
    public Item MOB_CATCHER = new ItemMobCatcher(new Item.Settings().group(ItemGroup.MISC));
    public static final ModConfig CONFIG = AutoConfig.register(ModConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new)).getConfig();

    @Override
    public void onInitialize()
    {
        ItemInit.init();
    }
}
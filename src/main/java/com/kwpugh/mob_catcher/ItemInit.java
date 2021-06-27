package com.kwpugh.mob_catcher;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit
{
    public static final Item MOB_CATCHER = Registry.register(Registry.ITEM, new Identifier(MobCatcher.MOD_ID, "mob_catcher"), new ItemMobCatcher(new Item.Settings().group(ItemGroup.MISC)));

    public static void init()
    {

    }
}
package com.omega.testmod.items;

import com.omega.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase(){
        super(new Item.Properties().group(TestMod.TAB));

    }
}

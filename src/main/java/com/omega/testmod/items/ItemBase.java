package com.omega.testmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public Item(){
        super(new Item.Properties().group(ItemGroup.MISC));
    }
}

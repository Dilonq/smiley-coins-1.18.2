package net.djh.smileycoins.item;

import net.djh.smileycoins.SmileyCoins;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup COINGROUP = FabricItemGroupBuilder.build(new Identifier(SmileyCoins.MODID,"coingroup"), () -> new ItemStack(ModItems.SILVER_COIN));
}

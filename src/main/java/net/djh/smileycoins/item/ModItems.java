package net.djh.smileycoins.item;

import net.djh.smileycoins.SmileyCoins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COPPER_COIN = registerItem("copper_coin",new Item(new FabricItemSettings().group(ModItemGroup.COINGROUP)));
    public static final Item SILVER_COIN = registerItem("silver_coin",new Item(new FabricItemSettings().group(ModItemGroup.COINGROUP)));
    public static final Item GOLD_COIN = registerItem("gold_coin",new Item(new FabricItemSettings().group(ModItemGroup.COINGROUP)));
    public static final Item PLATINUM_COIN = registerItem("platinum_coin",new Item(new FabricItemSettings().group(ModItemGroup.COINGROUP)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SmileyCoins.MODID, name), item);
    }

    public static void registerModItems(){
        SmileyCoins.LOGGER.info("registering mod items for "+SmileyCoins.MODID);
    }

}

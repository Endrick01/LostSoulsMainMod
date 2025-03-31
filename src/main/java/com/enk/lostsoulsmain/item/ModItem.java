package com.enk.lostsoulsmain.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class ModItem {

    public static final Item LOSTS = new Item(new FabricItemSettings().rarity(Rarity.RARE)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("item.lostsoulsmain.losts.tooltip").formatted(Formatting.GRAY));
            tooltip.add(Text.translatable("item.lostsoulsmain.losts.tooltip2").formatted(Formatting.GRAY));
        }
    };


    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("lostsoulsmain", "losts"), LOSTS);
    }
}

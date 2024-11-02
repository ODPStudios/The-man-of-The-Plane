
package net.themanofplane.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DDDDItem extends Item {
	public DDDDItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

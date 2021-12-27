package me.maanex.schmude.content.items.hammers;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.inventory.RecipeChoice.MaterialChoice;

import me.maanex.schmude.Main;
import me.maanex.schmude.core.customcontent.CustomContent;
import me.maanex.schmude.core.customcontent.structs.CustomItem;

public class NetheriteHammer extends CustomItem {
  
  public NetheriteHammer() {
    super(100, "netherite_hammer", Material.NETHERITE_PICKAXE, "Netherithammer");

    addRecipes(
      new SmithingRecipe(
        new NamespacedKey(Main.instance, "netherite_hammer.1"),
        asItemStack(),
        CustomContent.getCustomItemInstance(DiamondHammer.class).asRecipeChoice(),
        new MaterialChoice(Material.NETHERITE_INGOT)
      )
    );
  }
  
}

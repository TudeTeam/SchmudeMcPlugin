package me.maanex.schmude.content.items.hammers;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import me.maanex.schmude.Main;
import me.maanex.schmude.core.customcontent.structs.CustomItem;

public class GoldenHammer extends CustomItem {
  
  public GoldenHammer() {
    super(100, "golden_hammer", Material.GOLDEN_PICKAXE, "Goldhammer");

    addRecipes(
      new ShapedRecipe(
        new NamespacedKey(Main.instance, "golden_hammer.1"),
        asItemStack())
        .shape("III", "0S0", "0S0")
        .setIngredient('S', Material.STICK)
        .setIngredient('I', Material.GOLD_BLOCK)
    );
  }
  
}
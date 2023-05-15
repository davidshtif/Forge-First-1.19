package net.davidshtif.firstmod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorTiers {

    public static final ArmorMaterial SILVER = new ArmorMaterial(

    ) {
        @Override
        public int getDurabilityForSlot(EquipmentSlot p_40410_) {
            return 500;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlot p_40411_) {
            return 20;
        }

        @Override
        public int getEnchantmentValue() {
            return 40;
        }

        @Override
        public SoundEvent getEquipSound() {
            return null;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public float getToughness() {
            return 50;
        }

        @Override
        public float getKnockbackResistance() {
            return 10;
        }
    };
}

package mod.grimmauld.armhead.mixin;

import com.simibubi.create.content.logistics.block.mechanicalArm.ArmItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeItem;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Interface;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Mixin;

import javax.annotation.Nullable;

@Mixin(ArmItem.class)
@Implements(@Interface(iface = IForgeItem.class, prefix = "ifi$"))
public class ArmIsEquipabbleMixin {
	@Nullable
	@Intrinsic
	public EquipmentSlotType ifi$getEquipmentSlot(ItemStack stack) {
		return EquipmentSlotType.HEAD;
	}
}

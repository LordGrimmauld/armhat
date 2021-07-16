package mod.grimmauld.armhead.mixin;

import com.simibubi.create.content.contraptions.components.structureMovement.AbstractContraptionEntity;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class ContraptionsDontCalculateWaterMixin {
	@Inject(at = @At("HEAD"), cancellable = true, method = "func_233566_aG_")
	public void onUpdateWaterState(CallbackInfoReturnable<Boolean> cir) {
		if (((Object) this) instanceof AbstractContraptionEntity)
			cir.setReturnValue(false);
	}
}

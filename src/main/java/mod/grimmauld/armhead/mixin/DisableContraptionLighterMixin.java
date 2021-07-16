package mod.grimmauld.armhead.mixin;

import com.simibubi.create.content.contraptions.components.structureMovement.NonStationaryLighter;
import com.simibubi.create.content.contraptions.components.structureMovement.render.RenderedContraption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NonStationaryLighter.class)
public class DisableContraptionLighterMixin {
	@Inject(at = @At("HEAD"), method = "tick", remap = false, cancellable = true)
	private void tick(RenderedContraption owner, CallbackInfo ci) {
		ci.cancel();
	}
}
